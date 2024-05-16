package ar.edu.unlam.pb2;

public class Departamento extends Propiedad{

	private String depto;
	

	public Departamento(String codigo, String calle, Integer numero, String localidad, double precio,
			boolean estaDisponible, TipoDeOperacion tipo,String depto) {
		super(codigo, calle, numero, localidad, precio, estaDisponible, tipo);
		this.depto=depto;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}
	
	
}
