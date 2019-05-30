package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Modelo1;
import Vista.Ventana1;

public class ControladorHabitacionesNoHotel implements ActionListener{

	FuncionesControlador funciones = new FuncionesControlador();
	
	private Ventana1 ventana1;
	private Modelo1 model1;
	
	
	public ControladorHabitacionesNoHotel(Ventana1 ventana1,Modelo1 model1) {
		this.ventana1=ventana1;
		this.model1=model1;
		
		ventana1.panelhabitacionesnohotel.btnAtrasHabitacionesNoHotel.addActionListener(this);
		ventana1.panelhabitacionesnohotel.btnContinuarHabitacionesNoHotel.addActionListener(this);
		ventana1.panelhabitacionesnohotel.btnVerDisponibilidadNoHotel.addActionListener(this);
		
	}
	public void resetear() {
		ventana1.panelhabitacionesnohotel.btnVerDisponibilidadNoHotel.setEnabled(true);
		ventana1.panelhabitacionesnohotel.btnContinuarHabitacionesNoHotel.setEnabled(false);
		ventana1.panelmenuopcion.btnContinuarMenunOpcion.setEnabled(false);
		ventana1.panelhabitacionesnohotel.modelo2.clear();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==ventana1.panelhabitacionesnohotel.btnAtrasHabitacionesNoHotel) {
			funciones.cambiarDePanel(ventana1.panelhabitacionesnohotel, ventana1.panelmenuopcion);
			resetear();
			
		}
		if (e.getSource()==ventana1.panelhabitacionesnohotel.btnVerDisponibilidadNoHotel) {
			//ventana1.panelhabitacionesnohotel.btnContinuarHabitacionesNoHotel.setEnabled(true);
			model1.modelohabitacionesnohotel.botonbuscarhabitacionnohotel(model1.reserva, ventana1.panelhabitacionesnohotel.btnContinuarHabitacionesNoHotel, ventana1.panelhabitacionesnohotel.btnVerDisponibilidadNoHotel);
			
		}
		if (e.getSource()==ventana1.panelhabitacionesnohotel.btnContinuarHabitacionesNoHotel) {
			if(Modelo1.contador2==1) {
				funciones.cambiarDePanel(ventana1.panelhabitacionesnohotel, ventana1.panelpago);
				resetear();
			}
			else {
				funciones.cambiarDePanel(ventana1.panelhabitacionesnohotel, ventana1.panellogin);
				resetear();
			}
			
			
		}
	}
	
}
