package Modelo;

import java.util.ArrayList;

import javax.swing.JButton;

import Coordinador.Controlador1;

public class Modelo1 {
	
	private Controlador1 controlador1;
	//todos los moelos de cada clase las hago publicas
	public gestorBD gestor;
	
	public ModeloBorrarCliente modeloborrarcliente;
	public ModeloBorrarReserva modeloborrarreserva;
	public ModeloMenuOpcion modelomenuopcion;
	public ModeloMenuPrincipal modelomenuprincipal;
	public ModeloHabitaciones modelohabitacion;
	public ModeloLogin modelologin;
	public ModeloHabitacionesNoHotel modelohabitacionesnohotel;
	public ModeloRegistro modeloregistro;
	public ModeloBasesLegales modelobaseslegales;
	public ModeloPago modelopago;
	public ModeloTicket modeloticket;
	
	//valiables estaticas
	public static int opcion;
	public static int contador;
	public static int persona;
	public static double codigodescuento;
	public static String codigo;
	public static String codigo2;
	public static String cadena;
	public static int codigos;
	public static String habitacionconcatenada;
	public static String encriptMD5;
	public static int contador3;
	public static int contador2;
	public static double total_faltante;
	public static double pwifi;
	public static double ppiscina;
	public static double pspa;
	public static double pparking;
	public static double paire;
	public static double prestaurante;
	public static double pbar;
	public static double pgym;
	public static double pension;
	
	public Metodos2 metodos;
	public Reserva2 reserva;
	public Cliente cliente;
	public ReservaHabitacion reservahabitacion;

	
	public Modelo1() {
		this.gestor=new gestorBD();
		this.metodos=new Metodos2();
		this.modeloborrarcliente=new ModeloBorrarCliente(gestor);
		this.modeloborrarreserva=new ModeloBorrarReserva(gestor);
		this.modelomenuopcion=new ModeloMenuOpcion(gestor,metodos);
		this.modelomenuprincipal= new ModeloMenuPrincipal(gestor);
		this.modelohabitacion=new ModeloHabitaciones(gestor,metodos);
		this.modelologin= new ModeloLogin(gestor,metodos);
		this.modelohabitacionesnohotel= new ModeloHabitacionesNoHotel(gestor,metodos);
		this.modeloregistro=new ModeloRegistro(gestor,metodos);
		this.modelobaseslegales=new ModeloBasesLegales(gestor,metodos);
		this.modelopago=new ModeloPago(gestor,metodos);
		this.modeloticket=new ModeloTicket(gestor,metodos);
		
		this.reserva=new Reserva2();
		this.cliente=new Cliente();
		this.reservahabitacion=new ReservaHabitacion();
		//this.contador=contador;
	}
	

	//-------------------------------------------------------------

	public Controlador1 getControlador() {
		return controlador1;
	}

	public void setControlador(Controlador1 controlador1) {
		this.controlador1 = controlador1;
	} 
}
