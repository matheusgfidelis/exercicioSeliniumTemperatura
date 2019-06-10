package br.com.everis.ProjetoClimaTempo.suport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Web {
	  public static WebDriver createChrome(){

	        //criando objeto navegador
	        ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
	        WebDriver driver = new ChromeDriver(options);
			
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	        //navegando até a pagina
	        driver.get("https://www.climatempo.com.br/");

	        return driver;

	    }

}
