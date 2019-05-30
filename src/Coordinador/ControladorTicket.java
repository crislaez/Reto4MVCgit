package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Modelo1;
import Vista.Ventana1;

public class ControladorTicket implements ActionListener{

	
	FuncionesControlador funciones = new FuncionesControlador();
	
	private Ventana1 ventana1;
	private Modelo1 model1;
	
	public ControladorTicket(Ventana1 ventana1,Modelo1 model1) {
		this.ventana1=ventana1;
		this.model1=model1;
		
		ventana1.panelticket.btnAtrasTicket.addActionListener(this);
		ventana1.panelticket.btnFin.addActionListener(this);
		
		
	}

	public void resetear() {
		Modelo1.habitacionconcatenada="";
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==ventana1.panelticket.btnAtrasTicket) {
			funciones.cambiarDePanel(ventana1.panelticket, ventana1.panelmenuopcion);
			resetear();
		}
		if (e.getSource()==ventana1.panelticket.btnFin) {
			System.exit(-1);
		}
		
	}
}
