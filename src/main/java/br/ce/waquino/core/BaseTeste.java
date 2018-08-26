package br.ce.waquino.core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.ce.waquino.pages.LoginPage;


public class BaseTeste {
	
	private LoginPage page = new LoginPage();

	@Rule
	public TestName testname =  new TestName();
	
	@Before
	public void inicializa(){
		page.acessarTelaInicia();
		
		page.setEmail("ohnirucse@outlook.com");
		page.setSenha("123456");
		page.entrar();
	}
	
	@After
	public void finaliza() throws IOException{
		TakesScreenshot ss = (TakesScreenshot)DriverFactory.getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo,new File("target"+ File.separator +
				"screenshots" + File.separator + testname.getMethodName() +"jpg"));
		
		if(Propriedades.FECHAR_BROWSER){
		DriverFactory.KillDriver();
		}
	}
	
}

