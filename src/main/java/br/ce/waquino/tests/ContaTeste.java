package br.ce.waquino.tests;

import org.junit.Assert;
import org.junit.Test;

import br.ce.waquino.core.BaseTeste;
import br.ce.waquino.pages.ContasPage;
import br.ce.waquino.pages.MenuPage;


public class ContaTeste extends BaseTeste {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contaPage = new ContasPage();
	
	@Test
	public void testInserirConta(){
		menuPage.acessarTelaInserirConta();
		
		contaPage.setNome("Conta do Teste");
		contaPage.salvar();
		Assert.assertEquals("Conta adicionada com sucesso", contaPage.obterMesagemSucesso());
	}
	
	@Test
	
	public void testAlterarConta(){
		menuPage.acessarTelaListarConta();
		
		contaPage.clicarAlterarConta("Conta do Teste");
		contaPage.setNome("Conta do Teste 2");
		contaPage.salvar();
		Assert.assertEquals("Conta alterada com sucesso!", contaPage.obterMesagemSucesso());
	}
	
	@Test
	public void testInserirContaMesmoNome(){
		menuPage.acessarTelaInserirConta();
		
		contaPage.setNome("Conta do Teste 2");
		contaPage.salvar();
		Assert.assertEquals("Já existe uma conta com esse nome!", contaPage.obterMesagemErro());
	}
}
