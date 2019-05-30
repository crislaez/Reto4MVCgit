package Modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import Coordinador.Controlador1;
import Vista.Ventana1;

public class ModeloBasesLegales {

	
	Ventana1 ventana1;
	Controlador1 controlador;
	gestorBD gestor;
	Metodos2 metodos;
	int año,mes,dia;
	String fechaactual;
	boolean error;
	Calendar fecha; 
	
	
	public ModeloBasesLegales(gestorBD gestor,Metodos2 metodos){
		this.gestor= gestor;
		this.metodos=metodos;
	}
	/**
	 * 
	 * @param rdbtnAceptarCondiciones
	 * @param btnContinuarBasesLegales
	 */
	public void rdbtnbaseslegales(JRadioButton rdbtnAceptarCondiciones,JButton btnContinuarBasesLegales) {
		if(rdbtnAceptarCondiciones.isSelected()) {
			btnContinuarBasesLegales.setEnabled(true);
		}
		if(!rdbtnAceptarCondiciones.isSelected()) {
			btnContinuarBasesLegales.setEnabled(false);
				
		}
	}
	/**
	 * 
	 * @param cliente
	 * @param BasesLegales
	 * @param Precio
	 */
	public void continuarbaseslegales(Cliente cliente,JPanel BasesLegales,JPanel Precio) {
		Modelo1.contador2=1;
		fecha = new GregorianCalendar();
		
		 año = fecha.get(Calendar.YEAR);
	     mes = fecha.get(Calendar.MONTH)+1;
	     dia = fecha.get(Calendar.DAY_OF_MONTH);
	     
	     fechaactual=(año + "/" + mes + "/" + dia); 
			
		try {
			error=false;
			gestor.insertarBaseslegales(cliente.getDni(), fechaactual);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			error=true;
		}
		System.out.println(fechaactual);
		BasesLegales.setVisible(false);
		Precio.setVisible(true);
		
	}
	
}
