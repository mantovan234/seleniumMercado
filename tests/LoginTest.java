package tests;

import pages.BarraNavegacionPage;
import pages.LoginPage;

public class LoginTest extends BaseTest  {
	
	public LoginTest() {
		super.setup();
		
	}
	
	
	public String loguearse(String usuario, String pass) {
		LoginPage loginMercado = new LoginPage(driver, driverWait);
		BarraNavegacionPage barraNavegacion = new BarraNavegacionPage(driver, driverWait);
		barraNavegacion.ingresar(); //hacemos click en el boton ingresar para poder loguearnos
		
		return loginMercado.login(usuario, pass); //nos logueamos en el sitio
		
	}
	
	public String validarLogueo() {
		BarraNavegacionPage barraNavegacion2 = new BarraNavegacionPage(driver, driverWait);
		return barraNavegacion2.confirmarPantallaInicio();  //Verificamos que nos hayamos logueado correctamente
	}
	
	public void cerrarSesion() {
		BarraNavegacionPage barraNavegacion3 = new BarraNavegacionPage(driver, driverWait);
		barraNavegacion3.salir();
		driver.close();
	}
	
	
}
