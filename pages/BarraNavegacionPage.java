package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.AbstractPageObject;

public class BarraNavegacionPage extends AbstractPageObject {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);

	//encuentro del logo de MercadoLibre
	
	private WebElement logoMercado = driver.findElement(By.partialLinkText("Mercado Libre Argentina - Donde comprar y vender de todo"));
		
	public BarraNavegacionPage(WebDriver driver, WebDriverWait waitDriver) {
		super(driver, waitDriver);
		// TODO Auto-generated constructor stub
	}
	
	public void ingresar(){
		
		//encuentro el boton ingresar
		WebElement barraElement = driver.findElement(By.xpath("//NAV[@id='nav-header-menu']"));
		WebElement botonIngresar = barraElement.findElement(By.linkText("Ingresá"));
		wait.until(ExpectedConditions.visibilityOf(logoMercado));
		botonIngresar.click();
	}
	
	public void salir() {
		//encuentro el boton salir
		WebElement botonUser = driver.findElement(By.xpath("//LABEL[@for='nav-header-user-switch']"));
		botonUser.click();
		WebElement botonSalir = driver.findElement(By.xpath("//*[@id=\"nav-header-menu\"]/div/nav/div[1]/div[2]/a[6]"));
		wait.until(ExpectedConditions.visibilityOf(botonSalir));
		botonSalir.click();
	}
	
	public String confirmarPantallaInicio(){
		
		//encuentro el boton de marcadores
		
		if (driver.findElement(By.xpath("//I[@class='nav-icon-bookmarks']")).isDisplayed()){  //Valido que aparezca el boton de favoritos
			
			return "QActions";
			
		}else {
			return "No logueado";
		}
	}

}
