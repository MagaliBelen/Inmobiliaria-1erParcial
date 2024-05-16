package ar.edu.unlam.pb2;

public class Campo extends Propiedad{
	private Integer hectareas;
	
	
	public Campo(String codigo, String calle, Integer numero, String localidad, double precio, boolean estaDisponible,
			TipoDeOperacion tipo, Integer hectareas) {
		super(codigo, calle, numero, localidad, precio, estaDisponible, tipo);
		this.hectareas=hectareas;
	}

	public Integer getHectareas() {
		return hectareas;
	}

	public void setHectareas(Integer hectareas) {
		this.hectareas = hectareas;
	}
}
