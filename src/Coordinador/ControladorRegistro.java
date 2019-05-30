package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Modelo1;
import Vista.Ventana1;

public class ControladorRegistro implements ActionListener{

	
	FuncionesControlador funciones = new FuncionesControlador();
	
	private Ventana1 ventana1;
	private Modelo1 model1;
	
	public ControladorRegistro(Ventana1 ventana1,Modelo1 model1) {
		this.ventana1=ventana1;
		this.model1=model1;
		
		ventana1.panelregistro.btnAtrasRegistro.addActionListener(this);
		ventana1.panelregistro.btnIngresarRegistro.addActionListener(this);
		ventana1.panelregistro.rdbtnHombreRegistro.addActionListener(this);
		ventana1.panelregistro.rdbtnMujerRegistro.addActionListener(this);
		
	}

	public void resetear() {
		ventana1.panelregistro.formattedDniRegistro.setText("");
		ventana1.panelregistro.textNombreRegistro.setText("");
		ventana1.panelregistro.textApellidoRegistro.setText("");
		ventana1.panelregistro.formattedEdadRegistro.setText("");
		ventana1.panelregistro.passwordContraseñaRegistro.setText("");
		Modelo1.habitacionconcatenada="";
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource()==ventana1.panelregistro.btnAtrasRegistro) {
			funciones.cambiarDePanel(ventana1.panelregistro, ventana1.panelmenuopcion);
			resetear();
		}
		if (arg0.getSource()==ventana1.panelregistro.btnIngresarRegistro) {
			model1.modeloregistro.ingresar(model1.cliente, ventana1.panelregistro.formattedDniRegistro, ventana1.panelregistro.textNombreRegistro, ventana1.panelregistro.textApellidoRegistro, ventana1.panelregistro.formattedEdadRegistro, ventana1.panelregistro.rdbtnHombreRegistro, ventana1.panelregistro.rdbtnMujerRegistro, ventana1.panelregistro.passwordContraseñaRegistro, ventana1.panelregistro,ventana1.panellogin);
			resetear();
		}
		if (arg0.getSource()==ventana1.panelregistro.rdbtnHombreRegistro) {
			model1.modeloregistro.rbtnhombre(ventana1.panelregistro.rdbtnHombreRegistro, ventana1.panelregistro.rdbtnMujerRegistro);
		}
		if (arg0.getSource()==ventana1.panelregistro.rdbtnMujerRegistro) {
			model1.modeloregistro.rbtnmujer(ventana1.panelregistro.rdbtnHombreRegistro, ventana1.panelregistro.rdbtnMujerRegistro);
		}
		
		}
	
	}

