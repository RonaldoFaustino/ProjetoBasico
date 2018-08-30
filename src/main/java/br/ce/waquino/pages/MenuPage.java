package br.ce.waquino.pages;

import br.ce.waquino.core.BasePage;

public class MenuPage extends BasePage{
	
	public void acessarTelaInserirConta(){
		clicarLink("Contas");
		clicarLink("Adicionar");
	}

	public void acessarTelaListarConta(){
		clicarLink("Contas");
		clicarLink("Listar");
	}
	
	public void acessarTelaInserirMovimentacao(){
		clicarLink("Criar Movimentação");
		
	}
	
	
}
