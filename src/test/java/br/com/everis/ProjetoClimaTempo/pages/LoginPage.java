package br.com.everis.ProjetoClimaTempo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public LoginPage typeEmail(String email) {
		driver.findElement(By.id("i0116")).sendKeys(email);
		
		return this;
	}
	
	public LoginPage clickBtnNext() {
		driver.findElement(By.id("idSIButton9")).click();
		
		return this;
	}
	
	public LoginPage typePassword(String password) throws InterruptedException {
		Thread.sleep(2000);
		WebElement pswBox = driver.findElement(By.id("i0118"));
		//aguardar.until(ExpectedConditions.elementToBeClickable(pswBox));
		pswBox.sendKeys(password);
		
		return this;
	}
	
	public EmailPage clickEnterEmail() throws InterruptedException {
		Thread.sleep(2000);
		WebElement btnEnter = driver.findElement(By.id("idSIButton9"));
		//aguardar.until(ExpectedConditions.elementToBeClickable(btnEnter));
		btnEnter.click();
		
		return new EmailPage(driver);
	}
	
	public EmailPage login(String email, String password) throws InterruptedException {
		typeEmail(email);
		clickBtnNext();
		typePassword(password);
		clickEnterEmail();
		
		return new EmailPage(driver);
	}

}
