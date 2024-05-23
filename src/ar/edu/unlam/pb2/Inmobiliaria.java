package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.Scanner;

public class Inmobiliaria {
	private String nombre;
	private String direccion;
	private String email;
	private String telefono;
	private ArrayList<Propiedad> propiedades;
	private ArrayList<Casa> casas;
	private ArrayList<Departamento> departamentos;
	private ArrayList<Cliente> clientes;
	private ArrayList<PH> phs;
	private ArrayList<Terreno> terrenos;
	private ArrayList<Campo> campos;
	
	
	
	public Inmobiliaria(String nombre, String direccion, String email, String telefono) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;
		this.propiedades=new ArrayList<>();
		this.casas = new ArrayList<>();
		this.departamentos = new ArrayList<>();
		this.clientes = new ArrayList<>();
		this.phs = new ArrayList<>();
		this.terrenos = new ArrayList<>();
		this.campos = new ArrayList<>();
	}
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public ArrayList<Casa> getCasas() {
		return casas;
	}
	public void setCasas(ArrayList<Casa> casas) {
		this.casas = casas;
	}
	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(ArrayList<Departamento> departamentos) {
		this.departamentos = departamentos;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	public ArrayList<PH> getPhs() {
		return phs;
	}
	public void setPhs(ArrayList<PH> phs) {
		this.phs = phs;
	}
	public ArrayList<Terreno> getTerrenos() {
		return terrenos;
	}
	public void setTerrenos(ArrayList<Terreno> terrenos) {
		this.terrenos = terrenos;
	}
	public ArrayList<Campo> getCampos() {
		return campos;
	}
	public void setCampos(ArrayList<Campo> campos) {
		this.campos = campos;
	}
	
	public ArrayList<Propiedad> getPropiedades() {
		return propiedades;
	}
	public void setPropiedades(ArrayList<Propiedad> propiedades) {
		this.propiedades = propiedades;
	}
	
	//Metodos

	//Agregar propiedades
	
	public boolean agregarPropiedad(Propiedad nueva) {
		return propiedades.add(nueva);
		
	}
	
	public boolean agregarPropiedad(Casa nueva) {
		return casas.add(nueva);
		
	}
	
	public boolean agregarPropiedad(Departamento nueva) {
		return departamentos.add(nueva);
		
	}
	
	public boolean agregarPropiedad(Campo nueva) {
		return campos.add(nueva);
		
	}
	
	public boolean agregarPropiedad(PH nueva) {
		return phs.add(nueva);
		
	}
	
	public boolean agregarPropiedad(Terreno nueva) {
		return terrenos.add(nueva);
		
	}
	
	//agregar clientes
	
	public boolean agregarCliente(Cliente nuevo) {
		return clientes.add(nuevo);
	}

	//Calcular valor promedio de Casas
	public double calcularValorPromedioDeCasas() {
		double suma = 0;
		if(casas.size() != 0) {
			 for (Casa casa : casas) {
		            suma += casa.getPrecio(); 
		          
		        }
			  return suma /casas.size(); 
		}else {
			return 0.0;
		}
		
		
	}

	//Calcular valor promedio de Departamentos
	public double calcularValorPromedioDeDepartamentos() {
		double suma = 0;
		if(departamentos.size() != 0) {
			 for (Departamento departamento : departamentos) {
		            suma += departamento.getPrecio();
		        }
			  return suma /departamentos.size(); 
		}else {
			return 0.0;
		
	}
	
}
	
	//Buscar Casas por Rango de precios
	public ArrayList<Casa> buscarCasaPorRangoDePrecio(Double precioInferior, Double precioSuperior) {
	
	ArrayList<Casa>  casasTemporal = new ArrayList<Casa>();
	for(Casa actual : casas){
	if(actual.getPrecio() > precioInferior && actual.getPrecio() < precioSuperior){
		casasTemporal.add(actual);
	}
	} 
	return casasTemporal;
	}
	
	
	//Buscar Casa por codigo
	public Casa buscarCasaPorCodigo(String codigo) {
	    for (Casa casa : casas) {
	        if (casa.getCodigo().equals(codigo)) {
	            return casa; // Devuelve la casa si se encuentra el código
	        }
	    }
	    return null; // Devuelve null si no se encuentra ninguna casa con el código especificado
	}
	
	//Buscar depto por codigo
	public Departamento buscarDepartamentoPorCodigo(String codigo) {
		for (Departamento departamento : departamentos) {
	        if (departamento.getCodigo().equals(codigo)) {
	            return departamento; // Devuelve la casa si se encuentra el código
	        }
	    }
		return null;
	}
	
	//Buscar ph por codigo
	public PH buscarPHPorCodigo(String codigo3) {
		for (PH ph : phs) {
	        if (ph.getCodigo().equals(codigo3)) {
	            return ph; // Devuelve la casa si se encuentra el código
	        }
	    }
		return null;
	}


	public Campo buscarCampoPorCodigo(String codigo4) {
		for (Campo campo : campos) {
	        if (campo.getCodigo().equals(codigo4)) {
	            return campo; // Devuelve la casa si se encuentra el código
	        }
	    }
		return null;
	}



	public Terreno buscarTerrenoPorCodigo(String codigo5) {
		for (Terreno terreno : terrenos) {
	        if (terreno.getCodigo().equals(codigo5)) {
	            return terreno; // Devuelve la casa si se encuentra el código
	        }
	    }
		return null;
	}


	
	//Buscar propiedad por codigo
	public Propiedad buscarPropiedadPorCodigo(String codigo) {
	    for (Propiedad propiedad : propiedades) {
	        if (propiedad.getCodigo().equals(codigo)) {
	            return propiedad; // Devuelve la casa si se encuentra el código
	        }
	    }
	    return null; // Devuelve null si no se encuentra ninguna casa con el código especificado
	}

	//Buscar propiedades en venta
	public ArrayList<Propiedad> buscarPropiedadesPorOperacion(TipoDeOperacion venta) {
		ArrayList<Propiedad>  propiedadesEnVenta = new ArrayList<Propiedad>();
		for(Propiedad propiedad : propiedades) {
			if(propiedad.getTipo().equals(venta)) {
				propiedadesEnVenta.add(propiedad);
			}
		}
		return propiedadesEnVenta;
	}

		
	
	//Ordenar propiedades por precio
	public void ordenamientoBurbujaPorPrecio() {
        for (int i = 0; i < propiedades.size(); i++) {
            for (int j = 0; j < propiedades.size() - 1; j++) {
                if (propiedades.get(j).getPrecio() > propiedades.get(j + 1).getPrecio()) {
                   
                    Propiedad temp = propiedades.get(j);
                    propiedades.set(j, propiedades.get(j + 1));
                    propiedades.set(j + 1, temp);
                }
            }
        }
    }
	
	//Ordenar propiedades por ubicacion
	public void ordenamientoBurbujaPorUbicacion() {
		for (int i = 0; i < propiedades.size(); i++) {
            for (int j = 0; j < propiedades.size() - 1; j++) {
                if (propiedades.get(j).getLocalidad().compareTo(propiedades.get(j + 1).getLocalidad()) > 0 ) {
                  
                    Propiedad temp = propiedades.get(j);
                    propiedades.set(j, propiedades.get(j + 1));
                    propiedades.set(j + 1, temp);
                }
            }
        }
	}
	
	//Buscar propiedades por precio
	public ArrayList<Propiedad> buscarPropiedadesPorPrecio(Double precio) {
		ArrayList<Propiedad> propiedadesTemporal = new ArrayList<Propiedad>();
		for(Propiedad actual : propiedades) {
			if(actual.getPrecio() == precio) {
				propiedadesTemporal.add(actual);
			}
		}
		return propiedadesTemporal;
		
		
	}
	//Buscar propiedades por ubicacion
	public ArrayList<Propiedad> buscarPropiedadesPorUbicacion(String localidad) {
		ArrayList<Propiedad> propiedadesTemporal = new ArrayList<Propiedad>();
		for(Propiedad actual : propiedades) {
			if(actual.getLocalidad() == localidad) {
				propiedadesTemporal.add(actual);
			}
		}
		return propiedadesTemporal;
	}
	//Buscar propiedades por venta o alquiler
	public ArrayList<Propiedad> buscarPropiedadesPorVentaOAlquiler(TipoDeOperacion ventaOAlquiler) {
		ArrayList<Propiedad> propiedadesTemporal= new ArrayList<Propiedad>();
	
		for(Propiedad actual : propiedades) {
			if(ventaOAlquiler == actual.getTipo().VENTA) {
				propiedadesTemporal.add(actual);
			}else if(ventaOAlquiler == actual.getTipo().ALQUILER) {
				propiedadesTemporal.add(actual);
			}
		}
		return propiedadesTemporal;
	}


	//Vender propiedad
	public void venderPropiedad(String codigo, ArrayList<Propiedad> propiedadesVendidas) {
		for(Propiedad propiedad : propiedades) {
			if(propiedad.getCodigo() == codigo) {
				propiedadesVendidas.add(propiedad);
			}
		}
		
	}

	//Alquilar propiedad
	public void alquilarPropiedad(String codigo2, ArrayList<Propiedad> propiedadesAlquiladas) {
		for(Propiedad propiedad : propiedades) {
			if(propiedad.getCodigo() == codigo2) {
				propiedadesAlquiladas.add(propiedad);
			}
		}
		
	}


	
}
