package br.com.everis.ProjetoClimaTempo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;
	//protected WebDriverWait aguardar = new WebDriverWait(driver, 5);
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

}
