package Coordinador;

import Modelo.Modelo1;
import Vista.Ventana1;

public class Controlador1 {

	//instanciar Modelo1 y Ventana1
	public Modelo1 modelo1;
	public Ventana1 ventana1;
	
	//instanciar controladores de las ventanas
	private ControladorBienvenida controladorbienvenida;
	private ControladorMenuPrincipal controladormenuprincipal;
	private ControladorBorrarCliente controladorborrarcliente;
	private ControladorBorrarReserva controladorborrarreserva;
	private ControladorMenuOpcion controladormenuopcion;
	private ControladorHabitaciones controladorhabitciones;
	private ControladorLogin controladorlogin;
	private ControladorHabitacionesNoHotel controladorhabitacionesnohotel;
	private ControladorRegistro controladorregistro;
	private ControladorBasesLegales controladorbaseslegales;
	private ControladorPago controladorpago;
	private ControladorTicket controladorticket;
	

	

	public Controlador1(Ventana1 ventana1,Modelo1 model1) {
		this.modelo1=modelo1;
		this.ventana1=ventana1;
		
		this.setControladorbienvenida(new ControladorBienvenida(ventana1,model1));
		this.setControladormenuprincipal(new ControladorMenuPrincipal(ventana1,model1));
		this.setControladorborrarcliente(new ControladorBorrarCliente(ventana1,model1));
		this.setControladorborrarreserva(new ControladorBorrarReserva(ventana1,model1));
		this.setControladormenuopcion(new ControladorMenuOpcion(ventana1,model1));
		this.setControladorhabitciones(new ControladorHabitaciones(ventana1,model1));
		this.setControladorlogin(new ControladorLogin(ventana1,model1));
		this.setControladorhabitacionesnohotel(new ControladorHabitacionesNoHotel(ventana1,model1));
		this.setControladorregistro(new ControladorRegistro(ventana1,model1));
		this.setControladorbaseslegales(new ControladorBasesLegales(ventana1,model1));
		this.setControladorpago(new ControladorPago(ventana1,model1));
		this.setControladorticket(new ControladorTicket(ventana1,model1));
	}
	
	//getter y setter-------------------panel bienvenida
	public ControladorBienvenida getControladorbienvenida() {
		return controladorbienvenida;
	}

	public void setControladorbienvenida(ControladorBienvenida controladorbienvenida) {
		this.controladorbienvenida = controladorbienvenida;
	}
	//getter y setter-------------------panel menuprincipal
	public ControladorMenuPrincipal getControladormenuprincipal() {
		return controladormenuprincipal;
	}
	public void setControladormenuprincipal(ControladorMenuPrincipal controladormenuprincipal) {
		this.controladormenuprincipal = controladormenuprincipal;
	}
	//getter y setter-------------------panel borrarcliente
	public ControladorBorrarCliente getControladorborrarcliente() {
		return controladorborrarcliente;
	}
	public void setControladorborrarcliente(ControladorBorrarCliente controladorborrarcliente) {
		this.controladorborrarcliente = controladorborrarcliente;
	}
	//getter y setter-----------------panel borrar reserva
	public ControladorBorrarReserva getControladorborrarreserva() {
		return controladorborrarreserva;
	}
	public void setControladorborrarreserva(ControladorBorrarReserva controladorborrarreserva) {
		this.controladorborrarreserva = controladorborrarreserva;
	}
	//getter y setter-----------------panel menu opcion
	public ControladorMenuOpcion getControladormenuopcion() {
		return controladormenuopcion;
	}
	public void setControladormenuopcion(ControladorMenuOpcion controladormenuopcion) {
		this.controladormenuopcion = controladormenuopcion;
	}

	public ControladorHabitaciones getControladorhabitciones() {
		return controladorhabitciones;
	}

	public void setControladorhabitciones(ControladorHabitaciones controladorhabitciones) {
		this.controladorhabitciones = controladorhabitciones;
	}
	public ControladorLogin getControladorlogin() {
		return controladorlogin;
	}

	public void setControladorlogin(ControladorLogin controladorlogin) {
		this.controladorlogin = controladorlogin;
	}

	public ControladorHabitacionesNoHotel getControladorhabitacionesnohotel() {
		return controladorhabitacionesnohotel;
	}

	public void setControladorhabitacionesnohotel(ControladorHabitacionesNoHotel controladorhabitacionesnohotel) {
		this.controladorhabitacionesnohotel = controladorhabitacionesnohotel;
	}

	public ControladorRegistro getControladorregistro() {
		return controladorregistro;
	}

	public void setControladorregistro(ControladorRegistro controladorregistro) {
		this.controladorregistro = controladorregistro;
	}

	public ControladorBasesLegales getControladorbaseslegales() {
		return controladorbaseslegales;
	}

	public void setControladorbaseslegales(ControladorBasesLegales controladorbaseslegales) {
		this.controladorbaseslegales = controladorbaseslegales;
	}

	public ControladorPago getControladorpago() {
		return controladorpago;
	}

	public void setControladorpago(ControladorPago controladorpago) {
		this.controladorpago = controladorpago;
	}

	public ControladorTicket getControladorticket() {
		return controladorticket;
	}

	public void setControladorticket(ControladorTicket controladorticket) {
		this.controladorticket = controladorticket;
	}
	
	
	
}
