package Modelo;


public class Alojamiento {
	private static int numeroAlojamiento=0;
	private String nombreAlojamiento;
	private String ubicacion;
	private int habitacionesDisponibles;
	private double precio;
	private int numeroreservas;
	private boolean wifi;
	private boolean piscina;
	private boolean spa;
	private boolean parking;
	private boolean aireacondicionado;
	private boolean restaurante;
	private boolean bar;
	private boolean gym;
	
	public Alojamiento() {
		numeroAlojamiento+=1;
	}
	public Alojamiento(String nombreAlojamiento, String ubicacion, int habitacionesDisponibles,double precio,int numeroreservas,boolean wifi,boolean piscina,boolean spa,boolean parking,boolean aireacondicionado,boolean restaurante,boolean bar,boolean gym) {
		this.nombreAlojamiento=nombreAlojamiento;
		this.ubicacion=ubicacion;
		this.habitacionesDisponibles=habitacionesDisponibles;
		this.precio=precio;
		this.numeroreservas=numeroreservas;
		this.wifi=wifi;
		this.piscina=piscina;
		this.spa=spa;
		this.parking=parking;
		this.aireacondicionado=aireacondicionado;
		this.restaurante=restaurante;
		this.bar=bar;
		this.gym=gym;
		numeroAlojamiento+=1;
	}
	public static int getNumeroAlojamiento() {
		return numeroAlojamiento;
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
	public int getHabitacionesDisponibles() {
		return habitacionesDisponibles;
	}
	public void setHabitacionesDisponibles(int habitacionesDisponibles) {
		this.habitacionesDisponibles = habitacionesDisponibles;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	public boolean isPiscina() {
		return piscina;
	}
	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}
	public boolean isSpa() {
		return spa;
	}
	public void setSpa(boolean spa) {
		this.spa = spa;
	}
	public boolean isParking() {
		return parking;
	}
	public void setParking(boolean parking) {
		this.parking = parking;
	}
	public boolean isAireacondicionado() {
		return aireacondicionado;
	}
	public void setAireacondicionado(boolean aireacondicionado) {
		this.aireacondicionado = aireacondicionado;
	}
	public boolean isRestaurante() {
		return restaurante;
	}
	public void setRestaurante(boolean restaurante) {
		this.restaurante = restaurante;
	}
	public boolean isBar() {
		return bar;
	}
	public void setBar(boolean bar) {
		this.bar = bar;
	}
	public boolean isGym() {
		return gym;
	}
	public void setGym(boolean gym) {
		this.gym = gym;
	}
	@Override
	public String toString() {
	 return "Nombre: "+ this.getNombreAlojamiento()+ "\n"+"Ubicacion: "+ this.getUbicacion()+ "\n"+"Habitaciones Disponibles: "+this.getHabitacionesDisponibles()+ "\n";
	}

}
