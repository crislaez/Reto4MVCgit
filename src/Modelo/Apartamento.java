package Modelo;

public class Apartamento extends Casa{
	private static int numeroApartamento=0;
	private int piso;
	
	public Apartamento() {
		super();
		numeroApartamento+=1;
		
	}
	public Apartamento(String nombreAlojamiento, String ubicacion, int habitacionesDisponibles,int codigocasa,double precio,int numeroreservas,double mcuadrados,int piso,boolean wifi,boolean piscina,boolean spa,boolean parking,boolean aireacondicionado,boolean restaurante,boolean bar,boolean gym) {
		super(nombreAlojamiento,ubicacion,habitacionesDisponibles,codigocasa,precio,numeroreservas,mcuadrados,wifi,piscina,spa,parking,aireacondicionado,restaurante,bar,gym);
		this.piso=piso;
		numeroApartamento+=1;
	}
	public static int getNumeroApartamento() {
		return numeroApartamento;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	@Override
	public String toString() {
        return super.toString();
    }

}
