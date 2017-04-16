package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	static WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;

	}

	public void preencherIdDinamico() {
		
		WebElement dinamico =driver.findElement(By.xpath(".//label[text() = 'Full Name* ']/following-sibling::div[1]/input"));
		dinamico.sendKeys("bruno");

	}
}
