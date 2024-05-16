package ar.edu.unlam.pb2;

public class PH extends Propiedad{
	private String depto;
	private Integer cantPisos;
	
		
	public PH(String codigo, String calle, Integer numero, String localidad, double precio, boolean estaDisponible,
			TipoDeOperacion tipo, String depto, Integer cantPisos) {
		super(codigo, calle, numero, localidad, precio, estaDisponible, tipo);
		this.depto=depto;
		this.cantPisos=cantPisos;
	}
	public String getDepto() {
		return depto;
	}
	public void setDepto(String depto) {
		this.depto = depto;
	}
	public Integer getCantPisos() {
		return cantPisos;
	}
	public void setCantPisos(Integer cantPisos) {
		this.cantPisos = cantPisos;
	}
}
