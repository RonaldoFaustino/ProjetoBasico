package br.ce.waquino.pages;

import org.openqa.selenium.By;

import br.ce.waquino.core.BasePage;
import javafx.beans.binding.ObjectExpression;

public class ContasPage extends BasePage {
	
	public void setNome(String nome){
		
		escrever("nome", nome);
	}
	
	public void salvar(){
		
		clicarBotao(By.xpath("/html/body/div[2]/form/div[2]/button"));
		
	}
	
	public String obterMesagemSucesso(){
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}
	
	public String obterMesagemErro(){
		return obterTexto(By.xpath("//div[@class='alert alert-danger']"));
	}

	public void clicarAlterarConta(String string) {
		obterCelula("Conta", string, "Ações", "tabelaContas")
		.findElement(By.xpath(".//span[@class='glyphicon glyphicon-edit']")).click();
	}
	
	

}
