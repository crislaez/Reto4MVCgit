
package Modelo;
//import BASEDEDATOS.prueba;

public class Cliente {
	private static int numeroCliente=0;
	private String dni;
	private String nombre;
	private String apellido;
	private int edad;
	private String sexo;
	private String contraseña;
	

	public Cliente() {
		numeroCliente+=1;
	

	}
	public Cliente(String dni,String nombre,String apellido,int edad,String sexo,String contraseña) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.sexo=sexo;
		this.contraseña=contraseña;
		numeroCliente+=1;
	}
	public static int getNumeroCliente() {
		return numeroCliente;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	

	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	@Override
	public String toString() {
	 return "DNI: "+ this.getDni()+ "\n"+"Nombre: "+ this.getNombre()+ "\n"+"Apellido: "+this.getApellido()+ "\n"+"Edad: "+this.getEdad()+ "\n"+"Sexo: "+this.getSexo()+ "\n"+"Contraseña: "+this.getContraseña();
	}
}
