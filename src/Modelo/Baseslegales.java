package Modelo;

public class Baseslegales {

	private static int numeroBaseslegales=0;
	private int codigobaseslegales;
	private String dni;
	private String fecha;
	
	public Baseslegales() {
		numeroBaseslegales+=1;
	}
	public Baseslegales(int codigobaseslegales,String dni,String fecha) {
		this.codigobaseslegales=codigobaseslegales;
		this.dni=dni;
		this.fecha=fecha;
		numeroBaseslegales+=1;
	}
	public static int getNumeroBaseslegales() {
		return numeroBaseslegales;
	}

	public int getCodigobaseslegales() {
		return codigobaseslegales;
	}
	public void setCodigobaseslegales(int codigobaseslegales) {
		this.codigobaseslegales = codigobaseslegales;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}
