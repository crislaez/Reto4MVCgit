package Modelo;

public class ReservaHabitacion {
	private static int numeroReservahabitacion=0;
	private int codigoreservahotel;
	private int codigoreserva;
	private int codigohabitacion;
	
	public ReservaHabitacion() {
		numeroReservahabitacion+=1;
	}
	public ReservaHabitacion(int codigoreservahotel,int codigoreserva,int codigohabitacion) {
		this.codigoreservahotel=codigoreservahotel;
		this.codigoreserva=codigoreserva;
		this.codigohabitacion=codigohabitacion;
		numeroReservahabitacion+=1;
	}
	
	public int getCodigoreservahotel() {
		return codigoreservahotel;
	}
	public void setCodigoreservahotel(int codigoreservahotel) {
		this.codigoreservahotel = codigoreservahotel;
	}
	public static int getNumeroReservahabitacion() {
		return numeroReservahabitacion;
	}
	public int getCodigoreserva() {
		return codigoreserva;
	}
	public void setCodigoreserva(int codigoreserva) {
		this.codigoreserva = codigoreserva;
	}
	public int getCodigohabitacion() {
		return codigohabitacion;
	}
	public void setCodigohabitacion(int codigohabitacion) {
		this.codigohabitacion = codigohabitacion;
	}

}
