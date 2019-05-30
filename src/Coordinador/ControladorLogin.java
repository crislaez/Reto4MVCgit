package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Modelo1;
import Vista.Ventana1;

public class ControladorLogin implements ActionListener{
	FuncionesControlador funciones = new FuncionesControlador();
	
	private Ventana1 ventana1;
	private Modelo1 modelo1;
	
	public ControladorLogin(Ventana1 ventana1,Modelo1 modelo1) {
		this.ventana1=ventana1;
		this.modelo1=modelo1;
		
		ventana1.panellogin.btnAtrasLogin.addActionListener(this);
		ventana1.panellogin.btnContinuarLogin.addActionListener(this);
		ventana1.panellogin.btnRegistrarse.addActionListener(this);
		
	}

	public void resetar() {
		ventana1.panellogin.formatteddni.setText("");
		ventana1.panellogin.passworContraseña.setText("");
		Modelo1.habitacionconcatenada="";
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==ventana1.panellogin.btnContinuarLogin) {
			modelo1.modelologin.continuarlogin(modelo1.cliente, ventana1.panellogin.formatteddni,  ventana1.panellogin.passworContraseña,  ventana1.panellogin, ventana1.panelpago, ventana1.panelbaseslegales);
			resetar();
		}
		if (e.getSource()==ventana1.panellogin.btnAtrasLogin) {
			funciones.cambiarDePanel(ventana1.panellogin, ventana1.panelmenuopcion);
			resetar();
		}
		if (e.getSource()==ventana1.panellogin.btnRegistrarse) {
			funciones.cambiarDePanel(ventana1.panellogin, ventana1.panelregistro);
			resetar();
			
		}
		
	}

}
