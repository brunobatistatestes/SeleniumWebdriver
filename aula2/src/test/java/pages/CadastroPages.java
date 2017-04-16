package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPages {
	
	static WebDriver driver;

	public CadastroPages(WebDriver driver) {
		this.driver = driver;

	}

	public void preencherCampos() {

		WebElement nome = driver.findElement(By.id("FirstName"));
		nome.sendKeys("bruno");

		WebElement sobrenome = driver.findElement(By.name("LastName"));
		sobrenome.sendKeys("batista");

		WebElement email = driver.findElement(By.id("GmailAddress"));
		email.sendKeys("Fulano22@gmail.com");
		
		WebElement senha = driver.findElement(By.name("Passwd"));
		senha.sendKeys("Fulano22@");
		
		WebElement confirmarsenha = driver.findElement(By.id("PasswdAgain"));
		confirmarsenha.sendKeys("Fulano22@");
		
		WebElement dia = driver.findElement(By.id("BirthDay"));
		dia.sendKeys("22");
		
		WebElement mes = driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]"));
		mes.click();
		
		WebElement mesdezembro = driver.findElement(By.xpath(".//*[@id=':c']/div"));
		mesdezembro.click();
		
		WebElement ano = driver.findElement(By.name("BirthYear"));
		ano.sendKeys("1989");
		
		WebElement sexo = driver.findElement(By.xpath(".//*[@id='Gender']/div"));
		sexo.click();
		
		WebElement sexom = driver.findElement(By.xpath(".//*[@id=':f']/div"));
		sexom.click();
		
		WebElement celular = driver.findElement(By.name("RecoveryPhoneNumber"));
		celular.sendKeys("21 971948456");
		
		WebElement email2 = driver.findElement(By.name("RecoveryEmailAddress"));
		email2.sendKeys("brunobatistatestes@gmail.com");
		
		WebElement gravar = driver.findElement(By.id("submitbutton"));
		gravar.click();

	}

}
