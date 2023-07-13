package com.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

import unlam.pb2.UserNotFound;

public class test {

	@Test
	public void queSePuedaCrearUnUsuarioBasico() {
		Usuario nuevo = new Basico("bmerlo", "123");
		
		assertNotNull(nuevo);
	}

	@Test
	public void queSePuedaCrearUnUsuarioAdministrador() {
		Usuario nuevo2 = new Administrador("jalegre", "87.9");
		
		assertNotNull(nuevo2);
	}
	
	@Test
	public void queSePuedaAgregarAunUsuarioEnElSistema() {
		 //preparacion
		final Integer cantidadDeUsuarioEsperada = 1;
		Sistema actual = new Sistema();
		Usuario nuevo = new Basico("bmerlo", "123");
		
		//ejecucion
		actual.ingresarUsuario(nuevo);
		
		
		//validacion
		
		assertEquals(cantidadDeUsuarioEsperada, actual.GetCantidadDeUsuarios());
	}
	
	@Test
	public void queSiElUsuarioBasicoIngresaLaContraseñaCorrectaPuedaIngresar() throws UserNotFound {
		 //preparacion
		
		Sistema actual = new Sistema();
		Usuario nuevo = new Basico("bmerlo", "123");
		
		//ejecucion
		actual.ingresarUsuario(nuevo);
		
		
		
		//validacion
		
		assertTrue(actual.ingresarAlSistema("bmerlo", "123"));
	}
	
	@Test (expected = unlam.pb2.UserNotFound.class)
	public void queSiQuiereIgresarUnUsuarioQueNoExistaLanceUnaExcepcion() throws unlam.pb2.UserNotFound{
		 //preparacion
		
		Sistema actual = new Sistema();
		Usuario nuevo = new Basico("bmerlo", "123");
		
		//ejecucion
		actual.ingresarUsuario(nuevo);
		
		
		
		//validacion
		
		assertFalse(actual.ingresarAlSistema("jalegre", "87.9"));
	}
	
	@Test (expected = java.lang.ClassCastException.class)
	public void queSiSeQuiereEliminarAunUsuarioAdministradorLanceUnaExcepcion() throws java.lang.ClassCastException{
		 //preparacion
		
		Sistema actual = new Sistema();
		Usuario nuevo2 = new Administrador("jalegre", "87.9");
		
		//ejecucion
		actual.ingresarUsuario(nuevo2);
		
		
		
		//validacion
		
		assertFalse(actual.elminarUsuario(new Administrador("jalegre", "87.9")));
	}
	
}
