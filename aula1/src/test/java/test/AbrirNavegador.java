package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirNavegador {

	static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com.br");
		
	}

	@Test
	public void test() {
		
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//ele fecha apenas a aba que ele usou
		//driver.close();
		//ele fecha o browser inteiro
		//driver.quit();
	}

}
