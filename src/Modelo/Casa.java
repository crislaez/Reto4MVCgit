package Modelo;

public class Casa extends Alojamiento{
	private static int numeroCasa=0;
	private int codigocasa;
	private double mcuadrados;

	
	public Casa() {
		super();
		 numeroCasa+=1;
	}
	
	public Casa(String nombreAlojamiento, String ubicacion, int habitacionesDisponibles,int codigocasa,double precio,int numeroreservas,double mcuadrados,boolean wifi,boolean piscina,boolean spa,boolean parking,boolean aireacondicionado,boolean restaurante,boolean bar,boolean gym) {
		super(nombreAlojamiento,ubicacion,habitacionesDisponibles, precio, numeroreservas,wifi,piscina,spa,parking,aireacondicionado,restaurante,bar,gym);
		this.codigocasa=codigocasa;
		this.mcuadrados=mcuadrados;
		 numeroCasa+=1;
	}

	public static int getNumeroCasa() {
		return numeroCasa;
	}


	public int getCodigocasa() {
		return codigocasa;
	}

	public void setCodigocasa(int codigocasa) {
		this.codigocasa = codigocasa;
	}
	
	public double getMcuadrados() {
		return mcuadrados;
	}

	public void setMcuadrados(double mcuadrados) {
		this.mcuadrados = mcuadrados;
	}

	@Override
	public String toString() {
        return super.toString()+ "Codigo del Casa: "+ this.getCodigocasa();
    }
	
}
