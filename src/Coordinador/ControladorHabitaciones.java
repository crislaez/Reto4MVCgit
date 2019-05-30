package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Modelo.Modelo1;
import Vista.Ventana1;

public class ControladorHabitaciones implements ActionListener, MouseListener{
	
	
	FuncionesControlador funciones = new FuncionesControlador();
	
	private Ventana1 ventana1;
	private Modelo1 model1;
	//Metodos2 metodos= new Metodos2();
	
	public ControladorHabitaciones(Ventana1 ventana1,Modelo1 model1) {
		this.ventana1=ventana1;
		this.model1=model1;
			
		ventana1.panelhabitaciones.btnAtrasHabitacions.addActionListener(this);
		ventana1.panelhabitaciones.btnBuscarReservasHabitaciones.addActionListener(this);
		ventana1.panelhabitaciones.btnContinuarHabitaciones.addActionListener(this);
		ventana1.panelhabitaciones.btnMostrarHabitacion.addActionListener(this);
		
		ventana1.panelhabitaciones.listHabitacion.addMouseListener(this);
	}
	public void resetar() {
		ventana1.panelhabitaciones.modelo2.removeAllElements();
		ventana1.panelhabitaciones.modelo3.removeAllElements();
		ventana1.panelmenuopcion.btnContinuarMenunOpcion.setEnabled(false);
		ventana1.panelhabitaciones.btnMostrarHabitacion.setEnabled(true);
		ventana1.panelhabitaciones.btnContinuarHabitaciones.setEnabled(false);
		ventana1.panelhabitaciones.btnBuscarReservasHabitaciones.setEnabled(false);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource()==ventana1.panelhabitaciones.btnMostrarHabitacion) {
			model1.modelohabitacion.mostrarhabitacion(model1.reserva, ventana1.panelhabitaciones.listHabitacion, ventana1.panelhabitaciones.modelo2);
			ventana1.panelhabitaciones.btnMostrarHabitacion.setEnabled(false);
			
		}
		if (arg0.getSource()==ventana1.panelhabitaciones.btnAtrasHabitacions) {
			funciones.cambiarDePanel(ventana1.panelhabitaciones, ventana1.panelmenuopcion);
			resetar();
			
		}
		if (arg0.getSource()==ventana1.panelhabitaciones.btnBuscarReservasHabitaciones) {
			model1.modelohabitacion.botondisponibilidad(model1.reserva, model1.reservahabitacion, ventana1.panelhabitaciones.modelo3, ventana1.panelhabitaciones.modelo2,ventana1.panelhabitaciones.btnBuscarReservasHabitaciones, ventana1.panelhabitaciones.btnContinuarHabitaciones,ventana1.panelpago.DineroFaltante);
			
			
		}
		if (arg0.getSource()==ventana1.panelhabitaciones.btnContinuarHabitaciones) {
			if(Modelo1.contador2==1) {
				funciones.cambiarDePanel(ventana1.panelhabitaciones, ventana1.panelpago);
				resetar();
			}
			else {
				funciones.cambiarDePanel(ventana1.panelhabitaciones, ventana1.panellogin);
				resetar();
			}
			
			
			
		}
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		ventana1.panelhabitaciones.btnBuscarReservasHabitaciones.setEnabled(true);
		Modelo1.codigo2= (String) ventana1.panelhabitaciones.listHabitacion.getSelectedValue();
		model1.modelohabitacion.buscarcamas(Modelo1.codigo2, model1.reserva, model1.reservahabitacion,ventana1.panelhabitaciones.listCamas,ventana1.panelhabitaciones.modelo3,ventana1.panelmenuopcion.dateFechaIda,ventana1.panelmenuopcion.dateFechaVuelta);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	

}
