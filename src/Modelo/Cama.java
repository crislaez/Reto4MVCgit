package Modelo;

public class Cama {
	private static int numeroCama=0;
	private int codigocama;
	private int codigohotel;
	private String tipocama;
	
	
	public Cama() {
		numeroCama+=1;
	}
	public Cama(int codigocama,int codigohotel,String tipocama) {
		this.codigocama=codigocama;
		this.codigohotel=codigohotel;
		this.tipocama=tipocama;
		numeroCama+=1;
		
	}
	public static int getNumeroCama() {
		return numeroCama;
	}

	public int getCodigocama() {
		return codigocama;
	}
	public void setCodigocama(int codigocama) {
		this.codigocama = codigocama;
	}
	
	public int getCodigohotel() {
		return codigohotel;
	}
	public void setCodigohotel(int codigohotel) {
		this.codigohotel = codigohotel;
	}
	public String getTipocama() {
		return tipocama;
	}
	public void setTipocama(String tipocama) {
		this.tipocama = tipocama;
	}
	@Override
	public String toString() {
	 return "Codigo Cama: "+ this.getCodigocama()+ "\n"+"Tipo Hotel: "+ this.getCodigohotel()+ "\n"+"Tipo de Cama: "+ this.getTipocama();
	}
	
}
