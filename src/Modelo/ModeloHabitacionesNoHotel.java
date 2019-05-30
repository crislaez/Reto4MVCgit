package Modelo;

import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Coordinador.Controlador1;
import Vista.Ventana1;

public class ModeloHabitacionesNoHotel {
	
	Ventana1 ventana1;
	Controlador1 controlador;
	gestorBD gestor;
	Metodos2 metodos;
	boolean error;
	
	public ModeloHabitacionesNoHotel(gestorBD gestor,Metodos2 metodos){
		this.gestor= gestor;
		this.metodos=metodos;
	}
	/**
	 * 
	 * @param reserva
	 * @param btnContinuarHabitacionesNoHotel
	 * @param btnVerDisponibilidadNoHotel
	 */
	public void botonbuscarhabitacionnohotel(Reserva2 reserva,JButton btnContinuarHabitacionesNoHotel,JButton btnVerDisponibilidadNoHotel) {
	
		try {
			
		if(Modelo1.contador==2) {
			
				error=gestor.buscarreservascasa(reserva.getCodigocasa(), reserva.getFechafin(), reserva.getFechainicio());
				System.out.println(error);
			
		}else if(Modelo1.contador==3) {
			
			error=gestor.buscarreservasapartamento(reserva.getCodigoapatamento(), reserva.getFechafin(), reserva.getFechainicio());
			System.out.println(error);
		}
		
	
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	if(error==true) {
		JOptionPane.showMessageDialog(null, "Disponible");
		
		
		btnContinuarHabitacionesNoHotel.setEnabled(true);
		btnVerDisponibilidadNoHotel.setEnabled(false);
		
	}
	else {
		JOptionPane.showMessageDialog(null, "No Disponible");
		
	}
	}

}
