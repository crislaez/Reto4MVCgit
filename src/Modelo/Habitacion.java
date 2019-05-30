package Modelo;

public class Habitacion {
	
	private static int numeroHabitacion=0;
	private int codigohabitacion;
	private int codigohotel;
	private int codigocasa;
	private int codigoapartamento;
	private int numerocamas;
	private String tipoabitacion;
	private double mcuadrado;
	private double precio;
	
	public Habitacion() {
		numeroHabitacion+=1;
	}
	public Habitacion(int codigohabitacion,int codigohotel,int codigocasa,int codigoapartamento,int numerocamas,String tipoabitacion,double mcuadrado,double precio) {
		this.codigohabitacion=codigohabitacion;
		this.codigohotel=codigohotel;
		this.codigocasa=codigocasa;
		this.codigoapartamento=codigoapartamento;
		this.numerocamas=numerocamas;
		this.tipoabitacion=tipoabitacion;
		this.mcuadrado=mcuadrado;
		this.precio=precio;
	}
	public static int getNumeroHabitacion() {
		return numeroHabitacion;
	}
	public int getCodigohabitacion() {
		return codigohabitacion;
	}
	public void setCodigohabitacion(int codigohabitacion) {
		this.codigohabitacion = codigohabitacion;
	}
	public int getCodigohotel() {
		return codigohotel;
	}
	public void setCodigohotel(int codigohotel) {
		this.codigohotel = codigohotel;
	}
	public int getCodigocasa() {
		return codigocasa;
	}
	public void setCodigocasa(int codigocasa) {
		this.codigocasa = codigocasa;
	}
	public int getCodigoapartamento() {
		return codigoapartamento;
	}
	public void setCodigoapartamento(int codigoapartamento) {
		this.codigoapartamento = codigoapartamento;
	}
	public int getNumerocamas() {
		return numerocamas;
	}
	public void setNumerocamas(int numerocamas) {
		this.numerocamas = numerocamas;
	}
	public String getTipoabitacion() {
		return tipoabitacion;
	}
	public void setTipoabitacion(String tipoabitacion) {
		this.tipoabitacion = tipoabitacion;
	}
	public double getMcuadrado() {
		return mcuadrado;
	}
	public void setMcuadrado(double mcuadrado) {
		this.mcuadrado = mcuadrado;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
