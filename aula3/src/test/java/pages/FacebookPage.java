package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookPage {
	
	static WebDriver driver;

	public FacebookPage(WebDriver driver) {
	this.driver = driver;
		
	}
	
	
	public void preencherXpath(){
		
		WebElement nome = driver.findElement(By.xpath(".//*[@id='u_0_1']"));
		nome.sendKeys("bruno");
		
		WebElement sobrenome = driver.findElement(By.xpath(".//*[@id='u_0_3']"));
		sobrenome.sendKeys("batista");
		
		WebElement email = driver.findElement(By.xpath(".//*[@id='u_0_6']"));
		email.sendKeys("brunobatista@gmail.com");
		
		
		
		
	}
	
	

}
