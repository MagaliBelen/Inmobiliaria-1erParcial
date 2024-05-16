package ar.edu.unlam.pb2;

import java.util.ArrayList;

import java.util.Scanner;

public interface InterfazInmobiliaria {
	
	static Inmobiliaria inmobiliariaActual = new Inmobiliaria("Inmobiliaria Borrello", "Av. Eva Peron 658", "inmborrello@gmail.com", "1158742369");
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer opcionSeleccionada = 0;
		
		do {
			System.out.println("Menu de opciones");
			System.out.println("1. Agregar nuevas propiedades");
			System.out.println("2. Modificar propiedades existentes");
			System.out.println("3. Agregar clientes");
			System.out.println("4. Obtener listado de propiedades ordenado por precio.");
			System.out.println("5. Obtener el listado de propiedades ordenado por ubicación.");
			System.out.println("6. Buscar propiedades por Rango de precios");
			System.out.println("7. Buscar propiedades por Ubicación (Ciudad)");
			System.out.println("8. Buscar propiedades por venta o alquiler");
			System.out.println("9. Realizar la venta de una propiedad");
			System.out.println("10. Realizar el alquiler de una propiedad");
			System.out.println("11. Promedio de Casas");
			System.out.println("12. Salir");
			
			System.out.print("Seleccione una opción: ");
	        opcionSeleccionada = teclado.nextInt();
	        System.out.println("Opción seleccionada: " + opcionSeleccionada);
			
			
			switch(OpcionDeMenu.values()[opcionSeleccionada]) {
			
			case AGREGAR_PROPIEDAD:
				Integer opcionSeleccionada2 = 0;
				opcionSeleccionada2 = teclado.nextInt();
				do {
					System.out.println("Menu de opciones");
					System.out.println("1. Agregar nuevas casas");
					System.out.println("2. Agregar nuevos departamentos");
					System.out.println("3. Agregar nuevos PHS");
					System.out.println("4. Agregar nuevos Campos");
					System.out.println("5. Agregar nuevos Terrenos");
					System.out.println("6. Salir");
					
					System.out.print("Seleccione una opción: ");
			        opcionSeleccionada2 = teclado.nextInt();
			        System.out.println("Opción seleccionada: " + opcionSeleccionada2);

					switch(OpcionDeAgregarPropiedades.values()[opcionSeleccionada2])  {
					case AGREGAR_CASA:
						agregarCasa();
						break;
					case AGREGAR_DEPARTAMENTO:
						agregarDepartamento();
						break;
					case AGREGAR_PH:
						agregarPH();
						break;
					case AGREGAR_CAMPO:
						agregarCampo();
						break;
					case AGREGAR_TERRENO:
						agregarTerreno();
						break;
					case SALIR:
						break;
					}
					
				}while(opcionSeleccionada2!= 6);
				break;
			case MODIFICAR_PROPIEDAD:
				Integer opcionSeleccionada3 = 0;
				opcionSeleccionada3 = teclado.nextInt();
				do {
					System.out.println("Menu de opciones");
					System.out.println("1. Modificar datos de casas");
					System.out.println("2. Modificar datos de departamentos");
					System.out.println("3. Modificar datos de PHS");
					System.out.println("4. Modificar datos de Campos");
					System.out.println("5. Modificar datos de Terrenos");
					System.out.println("6. Salir");
					
					switch(opcionSeleccionada3) {
					case 1:
						System.out.println("Ingrese el codigo de la casa a modificar");
						String codigo = teclado.next();
						Casa CasaAModificar = inmobiliariaActual.buscarCasaPorCodigo(codigo);
						modificarCasa(CasaAModificar);
						break;
					case 2:
						System.out.println("Ingrese el codigo del departamento a modificar");
						String codigo2 = teclado.next();
						Departamento DepartamentoAModificar = inmobiliariaActual.buscarDepartamentoPorCodigo(codigo2);
						modificarDepartamento(DepartamentoAModificar);
						break;
					case 3:
						System.out.println("Ingrese el codigo del ph a modificar");
						String codigo3 = teclado.next();
						PH PHAModificar = inmobiliariaActual.buscarPHPorCodigo(codigo3);
						modificarPH(PHAModificar);
						break;
					case 4:
						System.out.println("Ingrese el codigo del campo a modificar");
						String codigo4 = teclado.next();
						Campo campoAModificar = inmobiliariaActual.buscarCampoPorCodigo(codigo4);
						modificarCampo(campoAModificar);
						break;
					case 5:
						System.out.println("Ingrese el codigo del terreno a modificar");
						String codigo5 = teclado.next();
						Terreno terrenoAModificar = inmobiliariaActual.buscarTerrenoPorCodigo(codigo5);
						modificarTerreno(terrenoAModificar);
						break;
					case 6:
						break;
					}
					
				}while(opcionSeleccionada3!= 6);
				
				
				break;
			case AGREGAR_CLIENTE:
				agregarCliente();
				break;
			case OBTENER_LISTADO_POR_PRECIO:
				 ArrayList<Propiedad> listaPropiedadesPorPrecio = new ArrayList<>();
				   inmobiliariaActual.ordenamientoBurbujaPorPrecio();
			        for (Propiedad propiedad : listaPropiedadesPorPrecio) {
			            System.out.println(propiedad);
			        }
			    
				break;
			case OBTENER_LISTADO_POR_UBICACION:
				ArrayList<Propiedad> listaPropiedadesPorUbicacion = new ArrayList<>();
				   inmobiliariaActual.ordenamientoBurbujaPorUbicacion();
			        for (Propiedad propiedad : listaPropiedadesPorUbicacion) {
			            System.out.println(propiedad);
			        }
			    
				break;
			case BUSCAR_PROPIEDADES_POR_PRECIO:
				System.out.println("Ingrese el precio que busca:  ");
				Double precio = teclado.nextDouble();
				ArrayList<Propiedad>PropiedadesEncontradasPorPrecio = inmobiliariaActual.buscarPropiedadesPorPrecio(precio);
				System.out.println("Las propiedades halladas son:  " + PropiedadesEncontradasPorPrecio);
				break;
			case BUSCAR_PROPIEDADES_POR_UBICACION:
				System.out.println("Ingrese la localidad que busca:  ");
				String localidad = teclado.next();
				ArrayList<Propiedad>PropiedadesEncontradasPorUbicacion = inmobiliariaActual.buscarPropiedadesPorUbicacion(localidad);
				System.out.println("Las propiedades halladas son:  " + PropiedadesEncontradasPorUbicacion);
				break;
			case BUSCAR_PROPIEDADES_POR_VENTA_O_ALQUILER:
				System.out.println("Ingrese si busca por venta o alquiler (VENTA o ALQUILER): ");
		        TipoDeOperacion tipo = TipoDeOperacion.valueOf(teclado.next().toUpperCase());
		        ArrayList<Propiedad> propiedadesEncontradasPorVentaOAlquiler = inmobiliariaActual.buscarPropiedadesPorVentaOAlquiler(tipo);
				System.out.println("Las propiedades halladas son:  " + propiedadesEncontradasPorVentaOAlquiler);
				break;
			case REALIZAR_VENTA:
				System.out.println("Ingrese codigo de la propiedad a vender");
				String codigo = teclado.next();
				ArrayList<Propiedad> propiedadesVendidas = null;
				inmobiliariaActual.venderPropiedad(codigo, propiedadesVendidas);
				break;
			case REALIZAR_ALQUILER:
				System.out.println("Ingrese codigo de la propiedad a alquilar");
				String codigo2 = teclado.next();
				ArrayList<Propiedad> propiedadesAlquiladas = null;
				inmobiliariaActual.alquilarPropiedad(codigo2, propiedadesAlquiladas);
				break;
			case CALCULAR_EL_PRECIO_PROMEDIO_DE_LAS_CASAS:
				Double promedio = inmobiliariaActual.calcularValorPromedioDeCasas();
				System.out.println("el promedio de las casas es: " + promedio);
				break; 
			case SALIR:
				break; 
			default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
			}
			
		}while(opcionSeleccionada!=12);
	}



public static void agregarCasa() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese codigo");
		String codigo = teclado.next();
		System.out.println("Ingrese nombre de la calle");
		String calle = teclado.next();
		System.out.println("Ingrese numero");
		Integer numero = teclado.nextInt();
		System.out.println("Ingrese nombre de la ciudad");
		String localidad = teclado.next();
		System.out.println("Ingrese precio");
		Double precio = teclado.nextDouble();
		System.out.println("La casa está disponible? (true/false):");
	    boolean estaDisponible = teclado.nextBoolean();
	    teclado.nextLine(); 
	    System.out.println("Ingrese el tipo de operación (COMPRA, VENTA, ALQUILER):");
	    String tipoOperacionString = teclado.nextLine();
	    TipoDeOperacion tipo = TipoDeOperacion.valueOf(tipoOperacionString.toUpperCase());

	    Casa casa = new Casa(codigo, calle, numero, localidad, precio, estaDisponible, tipo);
	   
	    inmobiliariaActual.getPropiedades().add(casa);
	    inmobiliariaActual.getCasas().add(casa);
		
	}
	
	public static void agregarDepartamento() {
		Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el código del departamento:");
        String codigo = teclado.nextLine();

        System.out.println("Ingrese la calle:");
        String calle = teclado.nextLine();

        System.out.println("Ingrese el número:");
        Integer numero = teclado.nextInt();
        teclado.nextLine(); 

        System.out.println("Ingrese la localidad:");
        String localidad = teclado.nextLine();

        System.out.println("Ingrese el precio:");
        Double precio = teclado.nextDouble();
        teclado.nextLine(); 

        System.out.println("El departamento está disponible? (true/false):");
        boolean estaDisponible = teclado.nextBoolean();
        teclado.nextLine(); 

        System.out.println("Ingrese el tipo de operación (COMPRA, VENTA, ALQUILER):");
        String tipoOperacionString = teclado.nextLine();
        TipoDeOperacion tipo = TipoDeOperacion.valueOf(tipoOperacionString.toUpperCase());

        System.out.println("Ingrese el número de departamento:");
        String depto = teclado.nextLine();
        
     

        Departamento departamento = new Departamento(codigo, calle, numero, localidad, precio, estaDisponible, tipo, depto);
        inmobiliariaActual.getPropiedades().add(departamento);
        inmobiliariaActual.getDepartamentos().add(departamento);
	}
	

public static void agregarPH() {
	Scanner teclado = new Scanner(System.in);

    System.out.println("Ingrese el código del departamento:");
    String codigo = teclado.nextLine();

    System.out.println("Ingrese la calle:");
    String calle = teclado.nextLine();

    System.out.println("Ingrese el número:");
    Integer numero = teclado.nextInt();
    teclado.nextLine(); 

    System.out.println("Ingrese la localidad:");
    String localidad = teclado.nextLine();

    System.out.println("Ingrese el precio:");
    Double precio = teclado.nextDouble();
    teclado.nextLine(); 

    System.out.println("El departamento está disponible? (true/false):");
    boolean estaDisponible = teclado.nextBoolean();
    teclado.nextLine(); 

    System.out.println("Ingrese el tipo de operación (COMPRA, VENTA, ALQUILER):");
    String tipoOperacionString = teclado.nextLine();
    TipoDeOperacion tipo = TipoDeOperacion.valueOf(tipoOperacionString.toUpperCase());

    System.out.println("Ingrese el número de departamento:");
    String depto = teclado.nextLine();
    
    System.out.println("Ingrese el cantidad de pisos:");
    Integer cantPisos = teclado.nextInt();
    teclado.nextLine(); 
 

    PH ph = new PH(codigo, calle, numero, localidad, precio, estaDisponible, tipo, depto, cantPisos);
    inmobiliariaActual.getPropiedades().add(ph);
    inmobiliariaActual.getPhs().add(ph);
		
	}


public static void agregarCampo() {
	Scanner teclado = new Scanner(System.in);
	System.out.println("Ingrese codigo");
	String codigo = teclado.next();
	System.out.println("Ingrese nombre de la calle");
	String calle = teclado.next();
	System.out.println("Ingrese numero");
	Integer numero = teclado.nextInt();
	System.out.println("Ingrese nombre de la ciudad");
	String localidad = teclado.next();
	System.out.println("Ingrese precio");
	Double precio = teclado.nextDouble();
	System.out.println("La casa está disponible? (true/false):");
    boolean estaDisponible = teclado.nextBoolean();
    teclado.nextLine(); 
    System.out.println("Ingrese el tipo de operación (COMPRA, VENTA, ALQUILER):");
    String tipoOperacionString = teclado.nextLine();
    TipoDeOperacion tipo = TipoDeOperacion.valueOf(tipoOperacionString.toUpperCase());
    System.out.println("Ingrese numero de hectareas");
	Integer hectareas = teclado.nextInt();

    Campo campo = new Campo(codigo, calle, numero, localidad, precio, estaDisponible, tipo, hectareas);
   
    inmobiliariaActual.getPropiedades().add(campo);
    inmobiliariaActual.getCampos().add(campo);
	}



	
	public static void agregarTerreno() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese codigo");
		String codigo = teclado.next();
		System.out.println("Ingrese nombre de la calle");
		String calle = teclado.next();
		System.out.println("Ingrese numero");
		Integer numero = teclado.nextInt();
		System.out.println("Ingrese nombre de la ciudad");
		String localidad = teclado.next();
		System.out.println("Ingrese precio");
		Double precio = teclado.nextDouble();
		System.out.println("La casa está disponible? (true/false):");
	    boolean estaDisponible = teclado.nextBoolean();
	    teclado.nextLine(); 
	    System.out.println("Ingrese el tipo de operación (COMPRA, VENTA, ALQUILER):");
	    String tipoOperacionString = teclado.nextLine();
	    TipoDeOperacion tipo = TipoDeOperacion.valueOf(tipoOperacionString.toUpperCase());
	    System.out.println("Ingrese los metros cuadrados");
		Double metros_cuadrados = teclado.nextDouble();

		Terreno terreno = new Terreno(codigo, calle, numero, localidad, precio, estaDisponible, tipo, metros_cuadrados);
	   
	    inmobiliariaActual.getPropiedades().add( terreno );
	    inmobiliariaActual.getTerrenos().add( terreno );
		
	}



public static void modificarCasa(Casa propiedadAModificar) {
	Scanner teclado = new Scanner(System.in);
	if (propiedadAModificar != null) {
        System.out.println("Ingrese nuevo nombre de la calle:");
        String calle = teclado.next();
        System.out.println("Ingrese nuevo numero:");
        Integer numero = teclado.nextInt();
        System.out.println("Ingrese nuevo nombre de la ciudad:");
        String localidad = teclado.next();
        System.out.println("Ingrese precio:");
        Double precio = teclado.nextDouble();
        System.out.println("La casa está disponible? (true/false):");
        boolean estaDisponible = teclado.nextBoolean();
        teclado.nextLine();
        System.out.println("Ingrese el nuevo tipo de operación (PERMUTA, VENTA, ALQUILER):");
        String tipoOperacionString = teclado.nextLine();
        TipoDeOperacion tipo = TipoDeOperacion.valueOf(tipoOperacionString.toUpperCase());

        // Actualizar la propiedad con los nuevos valores
        propiedadAModificar.setCalle(calle);
        propiedadAModificar.setNumero(numero);
        propiedadAModificar.setLocalidad(localidad);
        propiedadAModificar.setPrecio(precio);
        propiedadAModificar.setEstaDisponible(estaDisponible);
        propiedadAModificar.setTipo(tipo);

        System.out.println("La propiedad ha sido modificada exitosamente.");
    } else {
        System.out.println("No se encontró ninguna propiedad con el código especificado.");
    }
		
	}




public static void modificarDepartamento(Departamento propiedadAModificar) {
	Scanner teclado = new Scanner(System.in);
	if (propiedadAModificar != null) {
        System.out.println("Ingrese nuevo nombre de la calle:");
        String calle = teclado.next();
        System.out.println("Ingrese nuevo numero:");
        Integer numero = teclado.nextInt();
        System.out.println("Ingrese nuevo nombre de la ciudad:");
        String localidad = teclado.next();
        System.out.println("Ingrese precio:");
        Double precio = teclado.nextDouble();
        System.out.println("El departamento está disponible? (true/false):");
        boolean estaDisponible = teclado.nextBoolean();
        teclado.nextLine(); 
        System.out.println("Ingrese el nuevo tipo de operación (PERMUTA, VENTA, ALQUILER):");
        String tipoOperacionString = teclado.nextLine();
        TipoDeOperacion tipo = TipoDeOperacion.valueOf(tipoOperacionString.toUpperCase());
        System.out.println("Ingrese el nuevo número de departamento:");
        String depto = teclado.nextLine();
        
        // Actualizar la propiedad con los nuevos valores
        propiedadAModificar.setCalle(calle);
        propiedadAModificar.setNumero(numero);
        propiedadAModificar.setLocalidad(localidad);
        propiedadAModificar.setPrecio(precio);
        propiedadAModificar.setEstaDisponible(estaDisponible);
        propiedadAModificar.setTipo(tipo);
        propiedadAModificar.setDepto(depto);

        System.out.println("La propiedad ha sido modificada exitosamente.");
    } else {
        System.out.println("No se encontró ninguna propiedad con el código especificado.");
    }
		
		
	}




public static void modificarPH(PH propiedadAModificar) {
	Scanner teclado = new Scanner(System.in);
	if (propiedadAModificar != null) {
        System.out.println("Ingrese nuevo nombre de la calle:");
        String calle = teclado.next();
        System.out.println("Ingrese nuevo numero:");
        Integer numero = teclado.nextInt();
        System.out.println("Ingrese nuevo nombre de la ciudad:");
        String localidad = teclado.next();
        System.out.println("Ingrese precio:");
        Double precio = teclado.nextDouble();
        System.out.println("El ph está disponible? (true/false):");
        boolean estaDisponible = teclado.nextBoolean();
        teclado.nextLine(); 
        System.out.println("Ingrese el nuevo tipo de operación (PERMUTA, VENTA, ALQUILER):");
        String tipoOperacionString = teclado.nextLine();
        TipoDeOperacion tipo = TipoDeOperacion.valueOf(tipoOperacionString.toUpperCase());
        System.out.println("Ingrese el nuevo número de departamento:");
        String depto = teclado.nextLine();
        System.out.println("Ingrese el nuevo número de pisos:");
        Integer cantPisos = teclado.nextInt();
        
        // Actualizar la propiedad con los nuevos valores
        propiedadAModificar.setCalle(calle);
        propiedadAModificar.setNumero(numero);
        propiedadAModificar.setLocalidad(localidad);
        propiedadAModificar.setPrecio(precio);
        propiedadAModificar.setEstaDisponible(estaDisponible);
        propiedadAModificar.setTipo(tipo);
        propiedadAModificar.setDepto(depto);
        propiedadAModificar.setCantPisos(cantPisos);

        System.out.println("La propiedad ha sido modificada exitosamente.");
    } else {
        System.out.println("No se encontró ninguna propiedad con el código especificado.");
    }
		
		
	}





public static void modificarCampo(Campo propiedadAModificar) {
	Scanner teclado = new Scanner(System.in);
	if (propiedadAModificar != null) {
        System.out.println("Ingrese nuevo nombre de la calle:");
        String calle = teclado.next();
        System.out.println("Ingrese nuevo numero:");
        Integer numero = teclado.nextInt();
        System.out.println("Ingrese nuevo nombre de la ciudad:");
        String localidad = teclado.next();
        System.out.println("Ingrese precio:");
        Double precio = teclado.nextDouble();
        System.out.println("El campo está disponible? (true/false):");
        boolean estaDisponible = teclado.nextBoolean();
        teclado.nextLine();
        System.out.println("Ingrese el nuevo tipo de operación (PERMUTA, VENTA, ALQUILER):");
        String tipoOperacionString = teclado.nextLine();
        TipoDeOperacion tipo = TipoDeOperacion.valueOf(tipoOperacionString.toUpperCase());
        System.out.println("Ingrese numero de hectareas");
    	Integer hectareas = teclado.nextInt();
        // Actualizar la propiedad con los nuevos valores
        propiedadAModificar.setCalle(calle);
        propiedadAModificar.setNumero(numero);
        propiedadAModificar.setLocalidad(localidad);
        propiedadAModificar.setPrecio(precio);
        propiedadAModificar.setEstaDisponible(estaDisponible);
        propiedadAModificar.setTipo(tipo);
        propiedadAModificar.setHectareas(hectareas);

        System.out.println("La propiedad ha sido modificada exitosamente.");
    } else {
        System.out.println("No se encontró ninguna propiedad con el código especificado.");
    }
		
		
	}



public static void modificarTerreno(Terreno propiedadAModificar) {
	Scanner teclado = new Scanner(System.in);
	if (propiedadAModificar != null) {
        System.out.println("Ingrese nuevo nombre de la calle:");
        String calle = teclado.next();
        System.out.println("Ingrese nuevo numero:");
        Integer numero = teclado.nextInt();
        System.out.println("Ingrese nuevo nombre de la ciudad:");
        String localidad = teclado.next();
        System.out.println("Ingrese precio:");
        Double precio = teclado.nextDouble();
        System.out.println("El terreno está disponible? (true/false):");
        boolean estaDisponible = teclado.nextBoolean();
        teclado.nextLine();
        System.out.println("Ingrese el nuevo tipo de operación (PERMUTA, VENTA, ALQUILER):");
        String tipoOperacionString = teclado.nextLine();
        TipoDeOperacion tipo = TipoDeOperacion.valueOf(tipoOperacionString.toUpperCase());
        System.out.println("Ingrese numero de hectareas");
    	Integer hectareas = teclado.nextInt();
    	 System.out.println("Ingrese los metros cuadrados");
 		Double metros_cuadrados = teclado.nextDouble();
        // Actualizar la propiedad con los nuevos valores
        propiedadAModificar.setCalle(calle);
        propiedadAModificar.setNumero(numero);
        propiedadAModificar.setLocalidad(localidad);
        propiedadAModificar.setPrecio(precio);
        propiedadAModificar.setEstaDisponible(estaDisponible);
        propiedadAModificar.setTipo(tipo);
        propiedadAModificar.setMetros_cuadrados(metros_cuadrados);

        System.out.println("La propiedad ha sido modificada exitosamente.");
    } else {
        System.out.println("No se encontró ninguna propiedad con el código especificado.");
    }
				
	}


	public static void agregarCliente() {
        Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del cliente:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese el DNI del cliente:");
        Integer dni = scanner.nextInt();
        
        if (clienteExiste(dni)) {
            System.out.println("El cliente con el DNI " + dni + " ya existe. No se puede agregar.");
            return;
        }


        System.out.println("Ingrese la edad del cliente:");
        Integer edad = scanner.nextInt();
      

        System.out.println("Ingrese el teléfono del cliente:");
        String telefono = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, apellido, dni, edad, telefono);
		inmobiliariaActual.getClientes().add(cliente);
		}



	public static boolean clienteExiste(Integer dni) {
		for (Cliente cliente : inmobiliariaActual.getClientes()) {
            if (cliente.getDni().equals(dni)) {
                return true;
            }
        }
        return false;
    }
	
	
}
	




