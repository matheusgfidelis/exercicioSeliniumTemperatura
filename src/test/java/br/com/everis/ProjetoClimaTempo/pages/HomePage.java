package br.com.everis.ProjetoClimaTempo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public String catchTemperature(){
		try {
			
			System.out.println(driver.findElement(By.id("momento-temperatura")).getText());
			
		}catch (Exception ex) {
			System.out.println("Deu ruim");
		}
		
		
		return driver.findElement(By.id("momento-temperatura")).getText();
		
	}
	
	public void openPageHotmail() {
		driver.navigate().to("https://outlook.live.com/owa/");
	}
	
	public LoginPage clickEnterEmail(){
		WebElement btnEnter = driver.findElement(By.xpath("/html/body/section/div/div/nav/div/div/div/a"));
		//aguardar.until(ExpectedConditions.elementToBeClickable(btnEnter));
		btnEnter.click();
		
		return new LoginPage(driver);
	}
}
