package ar.edu.unlam.pb2;

public class Terreno extends Propiedad{
	private Double metros_cuadrados;

	
	
	public Terreno(String codigo, String calle, Integer numero, String localidad, double precio, boolean estaDisponible,
			TipoDeOperacion tipo,Double metros_cuadrados) {
		super(codigo, calle, numero, localidad, precio, estaDisponible, tipo);
		this.metros_cuadrados=metros_cuadrados;
	}

	public double getMetros_cuadrados() {
		return metros_cuadrados;
	}

	public void setMetros_cuadrados(double metros_cuadrados) {
		this.metros_cuadrados = metros_cuadrados;
	}
}
