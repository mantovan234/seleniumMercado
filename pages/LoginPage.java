package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.AbstractPageObject;



public class LoginPage extends AbstractPageObject {
	
	@FindBy(id="user_id")
	private WebElement inputUser;
	
	@FindBy(id="password")
	private WebElement inputPass;
	
	@FindBy(xpath="//INPUT[@type='submit']")
	private WebElement botonContinuar;
	
	@FindBy(id="action-complete")
	private WebElement botonIngresar;
	

	
	
	
	
	public LoginPage(WebDriver driver, WebDriverWait waitDriver) {
		super(driver, waitDriver);
		// TODO Auto-generated constructor stub
	}
	
	public String login(String email, String pass) throws IOException{	
		this.inputUser.sendKeys(email);
		botonContinuar.submit();
		 try {
	        driver.findElement(By.xpath("//DIV[@class='ui-form__message']"));
	        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			FileUtils.copyFile(src, new File("C:/selenium/logueoIncorrecto.png"));
			driver.close();
			return "No logueado";
	    } catch (NoSuchElementException e) {
	    	this.inputPass.sendKeys(pass);
			botonIngresar.submit();	
	        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			FileUtils.copyFile(src, new File("C:/selenium/logueoCorrecto.png"));
			return "logueado";
	    }
		
	}
	

}
