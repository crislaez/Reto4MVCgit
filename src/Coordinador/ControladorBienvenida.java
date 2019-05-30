package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Modelo.Modelo1;
import Vista.Ventana1;



public class ControladorBienvenida implements ActionListener{

	FuncionesControlador funciones = new FuncionesControlador();
	
	private Ventana1 ventana1;
	private Modelo1 model1;
	
	public ControladorBienvenida(Ventana1 ventana1,Modelo1 model1) {
		this.ventana1=ventana1;
		this.model1=model1;
		
		ventana1.panelbienvenida.btnBienvenida.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==ventana1.panelbienvenida.btnBienvenida) {
			funciones.cambiarDePanel(ventana1.panelbienvenida, ventana1.panelmenuprincipal);
			
		}
		
	
	
	}
		
	

}
