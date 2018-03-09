package tests;

import org.junit.Test;

import utilities.ExcelClass;

import static org.junit.Assert.assertEquals;

import java.io.IOException;



public class Controlador {
	
	private ExcelClass claseExcel = new ExcelClass("C:\\Libro1.xlsx", "Hoja1");
	
	//tests positivos
	@Test
	public void pruebaLogueo() throws IOException {
		LoginTest logueoTest = new LoginTest();
		logueoTest.loguearse("qactionstest","test123");
		String validacion = logueoTest.validarLogueo();
		claseExcel.insertarImagen("C:\\selenium\\logueoCorrecto.png", 2);
		assertEquals("QActions",validacion );
		if (validacion == "QActions") {
			claseExcel.write(2, 6, "OK");	
		}else {
			claseExcel.write(2, 6, "NO OK");
		}
		
		logueoTest.cerrarSesion();
	}
	//tests negativos
	@Test
	public void pruebaLogueoNegativa() throws IOException {
		LoginTest logueoTest = new LoginTest();
		String resultado = logueoTest.loguearse("otrousuario","otracontraseña");
		claseExcel.insertarImagen("C:\\selenium\\logueoIncorrecto.png", 3);
		assertEquals("No logueado", resultado);
		if (resultado == "No logueado") {
			claseExcel.write(3, 6, "OK");	
		}else {
			claseExcel.write(3, 6, "NO OK");
		}
	}

}
