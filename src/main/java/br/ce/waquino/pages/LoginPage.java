package br.ce.waquino.pages;

import org.openqa.selenium.By;

import br.ce.waquino.core.BasePage;
import br.ce.waquino.core.DriverFactory;

public class LoginPage extends BasePage {
	public void acessarTelaInicia(){
		DriverFactory.getDriver().get("http://seubarriga.wcaquino.me");
	}
	
	public void setEmail(String email){
		escrever("email", email);
	}
	
	public void setSenha(String senha){
		escrever("senha", senha);
	}
	
	public void entrar(){
		clicarBotao(By.xpath("/html/body/div[2]/form/button"));		
	}
	
	public void logar(String email, String senha){
		setEmail(email);
		setSenha(senha);
		entrar();
		
	}
}
