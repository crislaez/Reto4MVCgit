package Modelo;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import org.apache.commons.codec.digest.DigestUtils;

import Coordinador.Controlador1;
import Coordinador.FuncionesControlador;
import Vista.Ventana1;

public class ModeloBorrarCliente {
	
	Controlador1 controlador;
	gestorBD gestor;
	FuncionesControlador funciones=new FuncionesControlador();
	
	public ModeloBorrarCliente(gestorBD gestor){
		this.gestor= gestor;
		
	}
	
	public int botonborrarcliente(JFormattedTextField formattedDniBorrarCliente,JPasswordField passwordContraseña,Cliente cliente) {
		gestor.conectar();
		int prueba=0;
		
		cliente.setDni(formattedDniBorrarCliente.getText());
		Modelo1.encriptMD5=DigestUtils.md5Hex(passwordContraseña.getText());
		cliente.setContraseña(Modelo1.encriptMD5);
		
        int decision=JOptionPane.showConfirmDialog(null,"Esta Seguro de Borrar el Usuario?","Advertencia",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
	    	if(decision==JOptionPane.YES_OPTION) {
	    		
	    		try {
					prueba=gestor.borrarCliente(cliente.getDni(), cliente.getContraseña());
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					
					
				}
	    		if(prueba==1) {
	    			JOptionPane.showMessageDialog(null, "Usuario Borrado correctamente");
	    			formattedDniBorrarCliente.setText("");
	    			passwordContraseña.setText("");
	    			//funciones.cambiarDePanel(ventana1.panelborrarcliente, ventana1.panelmenuprincipal);
	    		}
	    		else {
	    			JOptionPane.showMessageDialog(null, "Datos Incorrectos");
	    		}
	    		
	    	}
	    	
	    	gestor.close();
	    	return prueba;
	    	
	}

}
