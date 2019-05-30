package Modelo;

import java.util.Date;

public class Reserva2 {
	private static int numeroReserva2=0;
	private int codigoreserva;
	private int codigohotel;
	private int codigocasa;
	private int codigoapatamento;

	private String dni;
	private double precio;
	private String nombreAlojamiento;
	private String ubicacion;
	private int numeropresonas;
	private String fechainicio;
	private String fechafin;

	
	public Reserva2() {
		 numeroReserva2+=1;
	}
	public Reserva2(int codigoreserva,int codigohotel,int codigocasa,int codigoapatamento,String dni,double precio,String nombreAlojamiento,String ubicacion,int numeropresonas,String fechainicio,String fechafin) {
		this.codigoreserva=codigoreserva;
		this.codigohotel=codigohotel;
		this.codigocasa=codigocasa;
		this.codigoapatamento=codigoapatamento;
	
		this.dni=dni;
		this.precio=precio;
		this.nombreAlojamiento=nombreAlojamiento;
		this.ubicacion=ubicacion;
		this.numeropresonas=numeropresonas;
		this.fechainicio=fechainicio;
		this.fechafin=fechafin;
		numeroReserva2+=1;
	}

	public int getCodigoreserva() {
		return codigoreserva;
	}
	public void setCodigoreserva(int codigoreserva) {
		this.codigoreserva = codigoreserva;
	}
	public static int getNumeroReserva2() {
		return numeroReserva2;
	}

	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNombreAlojamiento() {
		return nombreAlojamiento;
	}
	public void setNombreAlojamiento(String nombreAlojamiento) {
		this.nombreAlojamiento = nombreAlojamiento;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public int getNumeropresonas() {
		return numeropresonas;
	}
	public void setNumeropresonas(int numeropresonas) {
		this.numeropresonas = numeropresonas;
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
	public int getCodigoapatamento() {
		return codigoapatamento;
	}
	public void setCodigoapatamento(int codigoapatamento) {
		this.codigoapatamento = codigoapatamento;
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFechainicio() {
		return fechainicio;
	}
	public void setFechainicio(String fechainicio) {
		this.fechainicio = fechainicio;
	}
	public String getFechafin() {
		return fechafin;
	}
	public void setFechafin(String fechafin) {
		this.fechafin = fechafin;
	}
	@Override
	public String toString() {
	 return "Codigo de Reserva: "+ this.getCodigoreserva()+ "\n"+"Codigo Hotel: "+ this.getCodigohotel()+ "\n"+"Codigo de Casa: "+ this.getCodigocasa()+ "\n"+"Codigo de Apartamento: "+ this.getCodigoapatamento()+ "\n"+ "DNI cliente: "+ this.getDni()+ "\n"+ "\n"+"Precio de Reserva: "+ this.getPrecio()+ "\n"+"Nombre del Alojamiento: "+ this.getNombreAlojamiento()+ "\n"+"Ubicacion: "+this.getUbicacion()+ "\n"+"Numero de Personas: "+this.getNumeropresonas()+ "\n"+"Fecha Inicio: "+this.getFechainicio()+ "\n"+"Fecha Fin: "+this.getFechafin();
	}
}