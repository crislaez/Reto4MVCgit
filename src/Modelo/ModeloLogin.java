package Modelo;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import org.apache.commons.codec.digest.DigestUtils;

import Coordinador.Controlador1;
import Vista.Ventana1;

public class ModeloLogin {
	
	Ventana1 ventana1;
	Controlador1 controlador;
	gestorBD gestor;
	Metodos2 metodos;
	int comprobar=0;
	
	public ModeloLogin(gestorBD gestor,Metodos2 metodos){
		this.gestor= gestor;
		this.metodos=metodos;
	}
	/**
	 * 
	 * @param cliente
	 * @param formatteddni
	 * @param passworContraseña
	 * @param Login
	 * @param Precio
	 * @param BasesLegales
	 */
	public void continuarlogin(Cliente cliente,JFormattedTextField formatteddni,JPasswordField passworContraseña,JPanel Login,JPanel Precio,JPanel BasesLegales) {
		Modelo1.contador3=1;
		try {
			cliente.setDni(formatteddni.getText());
			Modelo1.encriptMD5=DigestUtils.md5Hex(passworContraseña.getText());
			cliente.setContraseña(Modelo1.encriptMD5);
			System.out.println(cliente.getDni());
			comprobar=gestor.comprovardnicontraseña(cliente.getDni(), cliente.getContraseña());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(comprobar==1) {
			if(Modelo1.contador2==1) {
				Login.setVisible(false);
				Precio.setVisible(true);
			}
			else {
				Login.setVisible(false);
				BasesLegales.setVisible(true);
			}
		}
		else {
			 JOptionPane.showMessageDialog(null, "Error al comprobar los datos");
		}
	}

}
