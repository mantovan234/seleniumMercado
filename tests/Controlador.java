package tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Controlador {
	

		public  void main(String[] args) {
	
			pruebaLogueo();
			pruebaLogueoNegativa();
			
		}

		//Tests positivos
		@Test
		public void pruebaLogueo() {
			
			LoginTest logueoTest = new LoginTest();
			logueoTest.loguearse("qactionstest","test123");
			assertEquals("QActions", logueoTest.validarLogueo());
			logueoTest.cerrarSesion();
		}
		//Tests negativos
		@Test
		public void pruebaLogueoNegativa() {
			
			LoginTest logueoTest = new LoginTest();
			String resultado = logueoTest.loguearse("otrousuario","otracontraseña");
			assertEquals("No logueado", resultado);
			
			}	



	
		
		   
		      
		
}




