package Modelo;

import java.sql.SQLException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import Coordinador.Controlador1;
import Vista.Ventana1;

public class ModeloHabitaciones {

	Ventana1 ventana1;
	//Modelo1 modelo1;
	Controlador1 controlador;
	gestorBD gestor;
	Metodos2 metodos;
	//Metodos2 metodos= new Metodos2();
	boolean error;
	int cantidadmaximacamas=0;
	String cadena="";
	String cadena2="";
	int codigos=0;
	double precio=0;
	double otroprecio=0;
	double preciomaximo=0;
	int cantidadcamas=0;
	int codigoreserva=0;
	int contador4=0;
	
	public ModeloHabitaciones(gestorBD gestor,Metodos2 metodos){
		this.gestor= gestor;
		this.metodos=metodos;
	}
	/**
	 * 
	 * @param reserva
	 * @param listhabitacion
	 * @param modelo2
	 */
	public void mostrarhabitacion(Reserva2 reserva, JList listhabitacion,DefaultListModel modelo2) {
		gestor.buscarhabitacionhotel(reserva.getCodigohotel(), listhabitacion, modelo2);
		listhabitacion.setModel(modelo2);
	}
	/**
	 * 
	 * @param codigo
	 * @param reserva
	 * @param reservahabitacion
	 * @param listCamas
	 * @param modelo3
	 * @param dateFechaIda
	 * @param dateFechaVuelta
	 */
	public void buscarcamas(String codigo,Reserva2 reserva,ReservaHabitacion reservahabitacion,JList listCamas,DefaultListModel modelo3, JDateChooser dateFechaIda,JDateChooser dateFechaVuelta ) {
		modelo3.clear();
		cadena=codigo.split(",")[1];
		codigos=Integer.parseInt(cadena);
		cadena2=codigo.split(",")[7];
		precio=Double.parseDouble(cadena2);
		otroprecio=metodos.preciototal(dateFechaIda,dateFechaVuelta, precio);
		reservahabitacion.setCodigohabitacion(codigos);
		reserva.setPrecio(otroprecio);
		System.out.println(reserva.getPrecio());
		System.out.println("codigo habitacion "+reservahabitacion.getCodigohabitacion());
		cantidadcamas=gestor.buscarcamas(reservahabitacion.getCodigohabitacion(), listCamas, modelo3);
		listCamas.setModel(modelo3);
	}
	/**
	 * 
	 * @param reserva
	 * @param reservahabitacion
	 * @param modelo3
	 */
	public void botondisponibilidad(Reserva2 reserva,ReservaHabitacion reservahabitacion,DefaultListModel modelo3,DefaultListModel modelo2,JButton botondisponibilidad,JButton continuar,JTextField DineroFaltante) {
		System.out.println(Modelo1.persona);
		try {
			error=gestor.buscarreservas(reserva.getCodigohotel(), reserva.getFechafin(), reserva.getFechainicio());
			System.out.println(error);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(error);
		if(error==true) {
			JOptionPane.showMessageDialog(null, "Habitacion Disponible");
			//btnContinuarHabitaciones.setEnabled(true);
			cantidadmaximacamas=cantidadmaximacamas+cantidadcamas;
			preciomaximo=preciomaximo+otroprecio;
			Modelo1.habitacionconcatenada=Modelo1.habitacionconcatenada+reservahabitacion.getCodigohabitacion()+",";
			
			try {
				codigoreserva=gestor.ultimocodigoreserva(contador4);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				gestor.insertarReservahotel(codigoreserva, reservahabitacion.getCodigohabitacion());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//metodo que inserta reserva de la habitacion
			System.out.println("precio de todas las habitaciones: "+preciomaximo);
			System.out.println("habitaciones: "+Modelo1.habitacionconcatenada);
			System.out.println("suma total de camas: "+cantidadmaximacamas+"Personas seleccionadas ene l combobos: "+Modelo1.persona);
			
			
			if(cantidadmaximacamas>=Modelo1.persona) {
				//ventana1.panelhabitaciones.btnContinuarHabitaciones.setEnabled(true);
				modelo2.clear();
				modelo3.clear();
				reserva.setPrecio(preciomaximo);
				System.out.println("precio total para calcular: "+reserva.getPrecio());
				DineroFaltante.setText(reserva.getPrecio()+" \u20ac");
				Modelo1.total_faltante = reserva.getPrecio();
				botondisponibilidad.setEnabled(false);
				continuar.setEnabled(true);
				preciomaximo=0;
				otroprecio=0;
			}
			contador4=1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Habitacion No Disponible");
			modelo3.clear();
		}
	}
	
	
}
