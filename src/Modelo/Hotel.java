package Modelo;

public class Hotel extends Alojamiento{
	private static int numeroHotel=0;
	private int codigohotel;
	private int numeroEsterllas;


	
	public Hotel() {
		super();
		numeroHotel+=1;
	}
	public Hotel(String nombreAlojamiento, String ubicacion, int habitacionesDisponibles,double precio,int numeroreservas,boolean wifi,boolean piscina,boolean spa,boolean parking,boolean aireacondicionado,boolean restaurante,boolean bar,boolean gym,int codigohotel, int numeroEstrellas) {
		super(nombreAlojamiento,ubicacion,habitacionesDisponibles,precio,numeroreservas,wifi,piscina,spa,parking,aireacondicionado,restaurante,bar,gym);
		this.codigohotel=codigohotel;
		this.numeroEsterllas=numeroEstrellas;

	
		numeroHotel+=1;
	}
	

	public int getCodigohotel() {
		return codigohotel;
	}
	public void setCodigohotel(int codigohotel) {
		this.codigohotel = codigohotel;
	}
	public static int getNumeroHotel() {
		return numeroHotel;
	}

	public int getNumeroEsterllas() {
		return numeroEsterllas;
	}
	public void setNumeroEsterllas(int numeroEsterllas) {
		this.numeroEsterllas = numeroEsterllas;
	}

	@Override
	public String toString() {
        return super.toString()+ "Codigo del Hotel: "+ this.getCodigohotel()+"Numero de Estrellas: "+ this.getNumeroEsterllas();
    }
}
