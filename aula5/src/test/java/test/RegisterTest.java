package test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.RegisterPage;

public class RegisterTest {

	static WebDriver driver;
	static RegisterPage registerPage;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		registerPage = new RegisterPage(driver);
	}

	@Test
	public void test() {
		
      registerPage.preencherIdDinamico();
      
	}

	
	
}
