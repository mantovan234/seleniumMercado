package tests;

//import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	
	public static final String URL_TECHNETTS = "https://www.mercadolibre.com.ar/";
	public static final String WEB_DRIVER_PATH = "C:\\Users\\DellQActions\\Documents\\Capacitación Selenium\\chromedriver.exe";
	public static final String WEB_DRIVER_CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver"; 
	public static WebDriver driver;
	public static WebDriverWait driverWait;
	
	//@BeforeClass
	public static void setup(){
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		System.setProperty(WEB_DRIVER_CHROME_DRIVER_PROPERTY, WEB_DRIVER_PATH);
		driver = new ChromeDriver(ops);
		driver.navigate().to(URL_TECHNETTS);
		driver.manage().window().maximize();
		driverWait = new WebDriverWait(driver,10);
	}
	
	//@AfterClass
	//public static void cerrar(){
	//	driver.quit();
	//}
	

}
