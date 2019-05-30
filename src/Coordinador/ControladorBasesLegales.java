package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Modelo1;
import Vista.Ventana1;

public class ControladorBasesLegales implements ActionListener{

	FuncionesControlador funciones = new FuncionesControlador();
	
	private Ventana1 ventana1;
	private Modelo1 model1;
	
	public ControladorBasesLegales(Ventana1 ventana1,Modelo1 model1) {
		this.ventana1=ventana1;
		this.model1=model1;
		
		ventana1.panelbaseslegales.btnContinuarBasesLegales.addActionListener(this);
		ventana1.panelbaseslegales.rdbtnAceptarCondiciones.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource()==ventana1.panelbaseslegales.btnContinuarBasesLegales) {
			model1.modelobaseslegales.continuarbaseslegales(model1.cliente, ventana1.panelbaseslegales,ventana1.panelpago);
			
		}
		if (arg0.getSource()==ventana1.panelbaseslegales.rdbtnAceptarCondiciones) {
			model1.modelobaseslegales.rdbtnbaseslegales(ventana1.panelbaseslegales.rdbtnAceptarCondiciones, ventana1.panelbaseslegales.btnContinuarBasesLegales);
			
		}
	}
}
