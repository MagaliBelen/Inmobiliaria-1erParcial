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
			
			opcionSeleccionada = teclado.nextInt();
			
			switch(OpcionDeMenu.values()[opcionSeleccionada]) {
			case AGREGAR_PROPIEDAD:
				Integer opcionSeleccionada2 = 0;
				opcionSeleccionada2 = teclado.nextInt();
				do {
					System.out.println("Menu de opciones");
					System.out.println("1. Agregar nuevas casas");
					System.out.println("2. Agregar nuevos departamentos");
					
					switch(opcionSeleccionada2) {
					case 1:
						agregarCasa();
						break;
					case 2:
						agregarDepartamento();
						break;
					}
					
				}while(opcionSeleccionada2!= 3);
				
				
				break;
			case MODIFICAR_PROPIEDAD:
				Integer opcionSeleccionada3 = 0;
				opcionSeleccionada3 = teclado.nextInt();
				do {
					System.out.println("Menu de opciones");
					System.out.println("1. Agregar nuevas casas");
					System.out.println("2. Agregar nuevos departamentos");
					
					switch(opcionSeleccionada3) {
					case 1:
						System.out.println("Ingrese el codigo de la casa a modificar");
						String codigo = teclado.next();
						modificarCasa(inmobiliariaActual, codigo);
						break;
					case 2:
						System.out.println("Ingrese el codigo del departamento a modificar");
						String codigo2 = teclado.next();
						modificarDepartamento(inmobiliariaActual, codigo2);
						break;
					}
					
				}while(opcionSeleccionada3!= 3);
				
				
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
				break;
			case REALIZAR_ALQUILER:
				break;
			case CALCULAR_EL_PRECIO_PROMEDIO_DE_LAS_CASAS:
				break; 
			case SALIR:
				break;
			
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
		
	}
	
	
	
	public static void modificarCasa(Inmobiliaria inmobiliariaactual, String codigo) {
		Scanner teclado = new Scanner(System.in);
		for(Propiedad propiedad : inmobiliariaActual.getPropiedades()) {
			inmobiliariaActual.buscarPropiedadPorCodigo(codigo);
			if(propiedad.getCodigo().equals(codigo)) {
				System.out.println("Ingrese nuevo nombre de la calle");
				String calle = teclado.next();
				System.out.println("Ingrese nuevo numero");
				Integer numero = teclado.nextInt();
				System.out.println("Ingrese nuevo nombre de la ciudad");
				String localidad = teclado.next();
				System.out.println("Ingrese precio");
				Double precio = teclado.nextDouble();
				System.out.println("La casa está disponible? (true/false):");
			    boolean estaDisponible = teclado.nextBoolean();
			    teclado.nextLine(); 
			    System.out.println("Ingrese el nuevo tipo de operación (COMPRA, VENTA, ALQUILER):");
			    String tipoOperacionString = teclado.nextLine();
			    TipoDeOperacion tipo = TipoDeOperacion.valueOf(tipoOperacionString.toUpperCase());
			    
			}
		}
	}

	
	public static void modificarDepartamento(Inmobiliaria inmobiliariaactual2, String codigo) {
		Scanner teclado = new Scanner(System.in);
		for(Propiedad propiedad : inmobiliariaActual.getPropiedades()) {
			inmobiliariaActual.buscarPropiedadPorCodigo(codigo);
			if(propiedad.getCodigo().equals(codigo)) {
				System.out.println("Ingrese nuevo nombre de la calle");
				String calle = teclado.next();
				System.out.println("Ingrese nuevo numero");
				Integer numero = teclado.nextInt();
				System.out.println("Ingrese nuevo nombre de la ciudad");
				String localidad = teclado.next();
				System.out.println("Ingrese nuevo precio");
				Double precio = teclado.nextDouble();
				System.out.println("La casa está disponible? (true/false):");
			    boolean estaDisponible = teclado.nextBoolean();
			    teclado.nextLine(); 
			    System.out.println("Ingrese el nuevo tipo de operación (COMPRA, VENTA, ALQUILER):");
			    String tipoOperacionString = teclado.nextLine();
			    TipoDeOperacion tipo = TipoDeOperacion.valueOf(tipoOperacionString.toUpperCase());
			    System.out.println("Ingrese el nuevo número de departamento:");
		        String depto = teclado.nextLine();
			}
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
	



