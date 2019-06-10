package br.com.everis.ProjetoClimaTempo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailPage extends BasePage {

	public EmailPage(WebDriver driver) {
		super(driver);
	}
	
	public FormEmailPage clickNewMessage() {
		driver.findElement(By.id("id__3")).click();
		
		return new FormEmailPage(driver);
	}

}
