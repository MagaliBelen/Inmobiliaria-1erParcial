package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.util.ArrayList;


public class Test {

	@Test
	public void queSePuedaDarDeAltaUnaCasaEnLaInmobiliaria() {
		Inmobiliaria inmobiliariaActual = new Inmobiliaria("Inmobiliaria Borrello", "Av. Eva Peron 658", "inmborrello@gmail.com", "1158742369");
		Casa casa1 = new Casa("C5659", "Eva Peron", 5980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA);
		
		//Ejecucion
        boolean altaExitosa = inmobiliariaActual.agregarPropiedad(casa1);
        
     // Verificar si la alta fue exitosa
        assertTrue(altaExitosa);
	}
	
	@Test
	public void queSePuedanDarDeAltaDosCasasEnLaInmobiliaria() {
		Inmobiliaria inmobiliariaActual = new Inmobiliaria("Inmobiliaria Borrello", "Av. Eva Peron 658", "inmborrello@gmail.com", "1158742369");
		Casa casa1 = new Casa("C5659", "Eva Peron", 5980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA);
		Casa casa2 = new Casa("C587", "Dominguez", 590, "Villa Madero", 100000.00, true, TipoDeOperacion.VENTA);
		
		//Ejecucion
        boolean altaExitosa1 = inmobiliariaActual.agregarPropiedad(casa1);
        boolean altaExitosa2 = inmobiliariaActual.agregarPropiedad(casa2);
        
     // Verificar si la alta fue exitosa
        assertTrue(altaExitosa1);
        assertTrue(altaExitosa2);
	}
	
	@Test
	public void queNoSePuedaDarElAltaDosCasasConUnaMismaDireccion() {
		Inmobiliaria inmobiliariaActual = new Inmobiliaria("Inmobiliaria Borrello", "Av. Eva Peron 658", "inmborrello@gmail.com", "1158742369");
		Casa casa1 = new Casa("C5659", "Eva Peron", 5980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA);
		Casa casa2 = new Casa("C587", "Eva Peron", 5980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA);
		
		
        boolean altaExitosa1 = inmobiliariaActual.agregarPropiedad(casa1);
        boolean altaNoExitosa2 = inmobiliariaActual.agregarPropiedad(casa2);
        
    
        assertTrue(altaExitosa1);
        assertFalse(altaNoExitosa2);
       
	}
	
	@Test
	public void queSePuedaDarDeAltaUnDepartamentoEnLaInmobiliaria() {
		Inmobiliaria inmobiliariaActual = new Inmobiliaria("Inmobiliaria Borrello", "Av. Eva Peron 658", "inmborrello@gmail.com", "1158742369");
		Departamento depto1 = new Departamento("D5659", "Eva Peron", 1980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA, "5B");
		
		//Ejecucion
        boolean altaExitosa1 = inmobiliariaActual.agregarPropiedad(depto1);
        
     // Verificar si la alta fue exitosa
        assertTrue(altaExitosa1);
	}
	
	@Test
	public void queSePuedanDarDeAltaDosDepartamentoEnLaInmobiliaria() {
		Inmobiliaria inmobiliariaActual = new Inmobiliaria("Inmobiliaria Borrello", "Av. Eva Peron 658", "inmborrello@gmail.com", "1158742369");
		Departamento depto1 = new Departamento("D5659", "Eva Peron", 1980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA, "5B");
		Departamento depto2 = new Departamento("D5258", "Larazalbal", 1700, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA, "7B");
		
		boolean altaExitosa1 = inmobiliariaActual.agregarPropiedad(depto1);
		boolean altaExitosa2 = inmobiliariaActual.agregarPropiedad(depto2);
		
		assertTrue(altaExitosa1);
		assertTrue(altaExitosa2);
	}
	
	@Test
	public void queNoSePuedanDarDeAltaDosDepartamentoConUnaMismaDireccion() {
		Inmobiliaria inmobiliariaActual = new Inmobiliaria("Inmobiliaria Borrello", "Av. Eva Peron 658", "inmborrello@gmail.com", "1158742369");
		Departamento depto1 = new Departamento("D5659", "Eva Peron", 1980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA, "5B");
		Departamento depto2 = new Departamento("D5679", "Eva Peron", 1980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA, "5B");
		
		
		boolean altaExitosa1 = inmobiliariaActual.agregarPropiedad(depto1);
		boolean altaNoExitosa2 = inmobiliariaActual.agregarPropiedad(depto2);
		
		assertTrue(altaExitosa1);
		assertFalse(altaNoExitosa2);
	}
	
	
	@Test
	public void queSePuedaObtenerElValorPromedioDeLasCasas() {
		Inmobiliaria inmobiliariaActual = new Inmobiliaria("Inmobiliaria Borrello", "Av. Eva Peron 658", "inmborrello@gmail.com", "1158742369");
		Casa casa1 = new Casa("C5659", "Eva Peron", 5980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA);
		Casa casa2 = new Casa("C587", "Dominguez", 590, "Villa Madero", 100000.00, true, TipoDeOperacion.VENTA);
		
		inmobiliariaActual.agregarPropiedad(casa1);
		inmobiliariaActual.agregarPropiedad(casa2);
		
		// Calcular el valor promedio de las casas
        double valorPromedio = inmobiliariaActual.calcularValorPromedioDeCasas();

        // Verificar el resultado
        assertEquals(100000.00, valorPromedio, 0.01); 
		
	}
	
	@Test
	public void queSePuedaObtenerElValorPromedioDeLosDepartamentos() {
		Inmobiliaria inmobiliariaActual = new Inmobiliaria("Inmobiliaria Borrello", "Av. Eva Peron 658", "inmborrello@gmail.com", "1158742369");
		Departamento depto1 = new Departamento("D5659", "Eva Peron", 1980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA, "5B");
		Departamento depto2 = new Departamento("D5258", "Larazalbal", 1700, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA, "7B");
	
		inmobiliariaActual.agregarPropiedad(depto2);
		inmobiliariaActual.agregarPropiedad(depto2);
		
		 double valorPromedio = inmobiliariaActual.calcularValorPromedioDeDepartamentos();
		 
		 assertEquals(100000.00, valorPromedio, 0.01);
	}
	
	
	@Test
	public void queLaBusquedaPorRangoDePrecioDeCasasMeArrojeUnaListaNoNuloSiAplicanResultados() {
		Inmobiliaria inmobiliariaActual = new Inmobiliaria("Inmobiliaria Borrello", "Av. Eva Peron 658", "inmborrello@gmail.com", "1158742369");
		Casa casa1 = new Casa("C5659", "Eva Peron", 5980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA);
		Casa casa2 = new Casa("C587", "Dominguez", 590, "Villa Madero", 100000.00, true, TipoDeOperacion.VENTA);
		
		inmobiliariaActual.agregarPropiedad(casa1);
		inmobiliariaActual.agregarPropiedad(casa2);
		
		ArrayList<Casa> casasEncontradas  = inmobiliariaActual.buscarCasaPorRangoDePrecio(0.0, 200000.0);
		
		assertEquals(2, casasEncontradas.size());
		
	}
	
	@Test
	public void queLaBusquedaPorRangoDePrecioDeCasasMeArrojeUnaListaNuloSiNoAplicanResultados() {
		Inmobiliaria inmobiliariaActual = new Inmobiliaria("Inmobiliaria Borrello", "Av. Eva Peron 658", "inmborrello@gmail.com", "1158742369");
		Casa casa1 = new Casa("C5659", "Eva Peron", 5980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA);
		Casa casa2 = new Casa("C587", "Dominguez", 590, "Villa Madero", 100000.00, true, TipoDeOperacion.VENTA);
		
		inmobiliariaActual.agregarPropiedad(casa1);
		inmobiliariaActual.agregarPropiedad(casa2);
		
		ArrayList<Casa> casasEncontradas  = inmobiliariaActual.buscarCasaPorRangoDePrecio(0.0, 200000.0);
		
		assertEquals(0, casasEncontradas.size());
	}
	
	@Test
	public void queLaBusquedaDePropiedadesPorVentaMeArrojeUnaLista() {
		Inmobiliaria inmobiliariaActual = new Inmobiliaria("Inmobiliaria Borrello", "Av. Eva Peron 658", "inmborrello@gmail.com", "1158742369");
		Casa casa1 = new Casa("C5659", "Eva Peron", 5980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA);
		Casa casa2 = new Casa("C587", "Dominguez", 590, "Villa Madero", 100000.00, true, TipoDeOperacion.VENTA);
		Departamento depto1 = new Departamento("D5659", "Eva Peron", 1980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA, "5B");
		Departamento depto2 = new Departamento("D5258", "Larazalbal", 1700, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA, "7B");
		
		inmobiliariaActual.agregarPropiedad(casa1);
		inmobiliariaActual.agregarPropiedad(casa2);
		inmobiliariaActual.agregarPropiedad(depto1);
		inmobiliariaActual.agregarPropiedad(depto2);
		
		ArrayList<Propiedad> propiedadesVenta = inmobiliariaActual.buscarPropiedadesPorOperacion(TipoDeOperacion.VENTA);
        
        // Verificar si la lista devuelta no es nula
        assertNotNull(propiedadesVenta);

        // Verificar si la lista devuelta contiene al menos una propiedad
        assertFalse(propiedadesVenta.isEmpty());

	}
	
	@Test
	public void queLaBusquedaDePropiedadesPorVentaMeArrojeUnaListaNuloSiNoAplicanResultados(){
		Inmobiliaria inmobiliariaActual = new Inmobiliaria("Inmobiliaria Borrello", "Av. Eva Peron 658", "inmborrello@gmail.com", "1158742369");
		Casa casa1 = new Casa("C5659", "Eva Peron", 5980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA);
		Casa casa2 = new Casa("C587", "Dominguez", 590, "Villa Madero", 100000.00, true, TipoDeOperacion.VENTA);
		Departamento depto1 = new Departamento("D5659", "Eva Peron", 1980, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA, "5B");
		Departamento depto2 = new Departamento("D5258", "Larazalbal", 1700, "Mataderos", 100000.00, true, TipoDeOperacion.VENTA, "7B");
		
		inmobiliariaActual.agregarPropiedad(casa1);
		inmobiliariaActual.agregarPropiedad(casa2);
		inmobiliariaActual.agregarPropiedad(depto1);
		inmobiliariaActual.agregarPropiedad(depto2);
		
		ArrayList<Propiedad> propiedadesVenta = inmobiliariaActual.buscarPropiedadesPorOperacion(TipoDeOperacion.VENTA);
        
		 assertNull(propiedadesVenta);
	}
}
