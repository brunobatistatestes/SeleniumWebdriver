package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalPage {

	static WebDriver driver;

	public ModalPage(WebDriver driver) {
		this.driver = driver;
	}

	public void waitModal() {
		
		WebElement botaoModal = driver.findElement(By.xpath("html/body/section/div[1]/div[1]/div/div[2]/a"));
		botaoModal.click();
		
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='myModal']/div/div/div[3]/button[2]")));
		
		WebElement botaoModal2 = driver.findElement(By.xpath(".//*[@id='myModal']/div/div/div[3]/button[2]"));
		botaoModal2.click();

	}

}
