package br.com.everis.ProjetoClimaTempo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormEmailPage extends BasePage{

	public FormEmailPage(WebDriver driver) {
		super(driver);
	}
	
	public FormEmailPage typeRecipient(String recipient) {
		driver.findElement(By.xpath("//div[@class=\"ms-BasePicker-text pickerText_269bfa71\"]/input")).sendKeys(recipient);
		
		return this;
	}
	
	public FormEmailPage typeSubject(String subject) {
		driver.findElement(By.id("subjectLine0")).sendKeys(subject);
		
		return this;
	}
	
	public FormEmailPage typeEmail(String message) {
		driver.findElement(By.xpath
				("//*[@id=\"app\"]//div[@class="
				+ "\"_2BCZP_W9VLRv-NN3SC1nnS fxwJwkd4_ngPI8kgzfk88"
				+ " _2ILxXltaTo7bBoiok8YXrG _2wpzYRO3pnmdXlwHZmtQtN\"]")).sendKeys(message);
		
		return this;
	}
	
	public FormEmailPage clickSend() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[1]/div[3]/div[2]/div/div[2]/div[1]/div/div/div/div[1]/div[4]/div[2]/div[1]/button[1]")).click();
		
		return this;
	}
	
	public FormEmailPage writeEmail( String recipient, String subject,String message ) {
		typeRecipient(recipient);
		typeSubject(subject);
		typeEmail(message);
		clickSend();
		
		return this;
	}

}
