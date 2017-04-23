package testes;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.ModalPage;

public class ModalTest {
	
	static WebDriver driver;
	static ModalPage modalPage;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver" , "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Modals.html");
		modalPage = new ModalPage(driver);
		
	
	}

	@Test
	public void test() {
	
		modalPage.waitModal();
		
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
