package br.com.everis.ProjetoClimaTempo.tests;

//import org.easetech.easytest.annotation.DataLoader;
//import org.easetech.easytest.annotation.Param;
//import org.easetech.easytest.runner.DataDrivenTestRunner;
//import org.easetech.easytest.io.ResourceLoaderStrategy;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.everis.ProjetoClimaTempo.pages.HomePage;
import br.com.everis.ProjetoClimaTempo.suport.Web;


//@RunWith(DataDrivenTestRunner.class)
//@DataLoader(filePaths = "CapturarTemperaturaTest.csv")
public class CapturarTemperaturaTest {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		driver = Web.createChrome();
	}
	
	@Test
	public void testCapturaInformacoesClimaTempo(/*@Param(name="email")String email,
												 @Param(name="password")String password,
												 @Param(name="recipient")String recipient,
												 @Param(name="subject")String subject,
												 @Param(name="message")String message*/) throws InterruptedException 
	
	{ 
		HomePage homePage = new HomePage(driver);
		String temp = homePage.catchTemperature();
		
		homePage.openPageHotmail();
				
		homePage.clickEnterEmail()
				.login("matheusdegoisfidelis@hotmail.com", "/////")
				.clickNewMessage().writeEmail("matheusdegoisfidelis@hotmail.com", "Teste", "Funcionou, a temperatura atual é: " + temp);
		
		
	}
}
