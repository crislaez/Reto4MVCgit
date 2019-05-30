package Modelo;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

import Coordinador.Controlador1;
import Coordinador.FuncionesControlador;
import Vista.Ventana1;

public class ModeloBorrarReserva {
	
	//Ventana1 ventana1;
	//Modelo1 modelo1;
	Controlador1 controlador;
	gestorBD gestor;
	FuncionesControlador funciones=new FuncionesControlador();
	
	public ModeloBorrarReserva(gestorBD gestor){
		this.gestor= gestor;
		
	}
	public int botonborrarreserva(JFormattedTextField formattedDniBorrarReserva,JFormattedTextField formattedCodigoReserva) {
		gestor.conectar();
		int prueba=0;
		 int decision=JOptionPane.showConfirmDialog(null,"Esta Seguro de Borrar la Reserva?","Advertencia",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
		 
		 if(decision==JOptionPane.YES_OPTION) {
				try {
					prueba=gestor.borrarReserva(formattedDniBorrarReserva.getText(), Integer.parseInt(formattedCodigoReserva.getText()));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(prueba==1) {
	    			JOptionPane.showMessageDialog(null, "Reserva Borrada correctamente");
	    			formattedDniBorrarReserva.setText("");
	    			formattedCodigoReserva.setText("");
	    			//funciones.cambiarDePanel(ventana1.panelborrarreserva, ventana1.panelmenuprincipal);
	    			
				}
				else {
					JOptionPane.showMessageDialog(null, "Datos Incorrectos");
					
				}
				
		 }
		 gestor.close();
		 return prueba;

	}

}
