package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPageObject {
	
	protected WebDriver driver;
	protected WebDriverWait driverWait;
	
	public AbstractPageObject(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public AbstractPageObject(WebDriver driver, WebDriverWait driverWait){
		this.driver = driver;
		this.driverWait = driverWait;
		PageFactory.initElements(driver, this);
	}
	
	
}
