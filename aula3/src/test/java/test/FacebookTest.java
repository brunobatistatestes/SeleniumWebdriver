package test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FacebookPage;

public class FacebookTest {

	static WebDriver driver;
	static FacebookPage facebookPage;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://pt-br.facebook.com/");
		facebookPage = new FacebookPage(driver);
		
	}


	@Test
	public void test() {
		
		facebookPage.preencherXpath();
	}

}
