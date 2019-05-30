package Modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import Coordinador.Controlador1;
import Coordinador.FuncionesControlador;

public class ModeloPago {

	//Ventana1 ventana1;
	//Modelo1 modelo1;
	Controlador1 controlador;
	gestorBD gestor;
	Metodos2 metodos;
	FuncionesControlador funciones=new FuncionesControlador();
	double valorBoton=0;
	double total_introducido=0;
	//double total_faltante;
	double total_devolucion=0;
	
	public ModeloPago(gestorBD gestor, Metodos2 metodos){
		this.gestor= gestor;
		this.metodos=metodos;
		
	}
	/**
	 * 
	 * @param reserva
	 * @param cliente
	 * @param Ticket
	 * @param Precio
	 * @param textReserva
	 */
	public void continuarpago(Reserva2 reserva,Cliente cliente,JPanel Ticket,JPanel Precio,JTextPane textReserva) {
		try {
			gestor.insertarReserva(reserva.getCodigohotel(),reserva.getCodigocasa(),reserva.getCodigoapatamento(),cliente.getDni(),reserva.getPrecio(), reserva.getNombreAlojamiento(), reserva.getUbicacion(),reserva.getNumeropresonas(),reserva.getFechainicio(),reserva.getFechafin(), Modelo1.contador);
			
			
			
			metodos.EscribiroCrearFichearo(reserva.getCodigohotel(),reserva.getCodigocasa(),reserva.getCodigoapatamento(),Modelo1.habitacionconcatenada,cliente.getDni(),reserva.getPrecio(), reserva.getNombreAlojamiento(), reserva.getUbicacion(),reserva.getNumeropresonas(),reserva.getFechainicio(),reserva.getFechafin(),Modelo1.contador);
			
			String nombre="";
			String codigohabitacion="";
			int codigo=0;
			if(Modelo1.contador==1) {
				nombre="l Hotel: ";
				codigohabitacion="\r\n"+"Codigo de las Habitaciones "+Modelo1.habitacionconcatenada;
				codigo=reserva.getCodigohotel();
				gestor.insertarnumeroreservahotel(reserva.getCodigohotel());//el problema------------------
			}
			else if(Modelo1.contador==2) {
				nombre=" la Casa: ";
				codigo=reserva.getCodigocasa();
				gestor.insertarnumeroreservacasa(reserva.getCodigocasa());//el problema------------------
			}
			else if(Modelo1.contador==3) {
				nombre="l Apartamento: ";
				codigo=reserva.getCodigoapatamento();
				gestor.insertarnumeroreservaapartamento(reserva.getCodigoapatamento());//el problema------------------
			}
			String frase= ("Codigo de"+nombre+codigo+codigohabitacion+"\r\n"+"DNI Cliente: "+cliente.getDni()+ "\r\n"+"Precio: " + reserva.getPrecio() + "\r\n" + "Nombre: " + reserva.getNombreAlojamiento()+ "\r\n" + "Ubicacion: " + reserva.getUbicacion()+ "\r\n"+"Numero de Personas: " +reserva.getNumeropresonas()+ "\r\n"+"Fecha Inicio: " + reserva.getFechainicio()+ "\r\n"+"Fecha Fin: " + reserva.getFechafin()+"\r\n"+"-------------"+"\r\n");
			
			textReserva.getStyledDocument().insertString(textReserva.getStyledDocument().getLength(),frase, null);
			total_introducido=0;
			total_devolucion=0;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error al conectar a la Base de Datos");
		}
		//metodos.cerrar();
		Ticket.setVisible(true);
		Precio.setVisible(false);
	}
	/**
	 * 
	 * @param reserva
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param billete200
	 * @param billete100
	 * @param billete50
	 * @param billete20
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn200(Reserva2 reserva,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton billete200,JButton billete100,JButton billete50,JButton billete20,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent){
		
		valorBoton = Double.parseDouble(billete200.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo1.total_faltante = Modelo1.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo1.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo1.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			billete200.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			billete20.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo1.total_faltante)
		{
			total_devolucion = total_introducido - reserva.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
		
	}
	/**
	 * 
	 * @param reserva
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param billete200
	 * @param billete100
	 * @param billete50
	 * @param billete20
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn100(Reserva2 reserva,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton billete200,JButton billete100,JButton billete50,JButton billete20,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		valorBoton = Double.parseDouble(billete100.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo1.total_faltante = Modelo1.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo1.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo1.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			billete200.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			billete20.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo1.total_faltante)
		{
			total_devolucion = total_introducido - reserva.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
			
		}
	}
	/**
	 * 
	 * @param reserva
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param billete200
	 * @param billete100
	 * @param billete50
	 * @param billete20
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn50(Reserva2 reserva,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton billete200,JButton billete100,JButton billete50,JButton billete20,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		valorBoton = Double.parseDouble(billete50.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo1.total_faltante = Modelo1.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo1.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo1.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			billete200.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			billete20.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo1.total_faltante)
		{
			total_devolucion = total_introducido -reserva.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param reserva
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param billete200
	 * @param billete100
	 * @param billete50
	 * @param billete20
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn20(Reserva2 reserva,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton billete200,JButton billete100,JButton billete50,JButton billete20,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		valorBoton = Double.parseDouble(billete20.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo1.total_faltante = Modelo1.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo1.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
	//	Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo1.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			billete200.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			billete20.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo1.total_faltante)
		{
			total_devolucion = total_introducido - reserva.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param reserva
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param billete200
	 * @param billete100
	 * @param billete50
	 * @param billete20
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn10(Reserva2 reserva,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton billete200,JButton billete100,JButton billete50,JButton billete20,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		valorBoton = Double.parseDouble(billete10.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo1.total_faltante = Modelo1.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo1.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo1.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			billete200.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			billete20.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo1.total_faltante)
		{
			total_devolucion = total_introducido - reserva.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param reserva
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param billete200
	 * @param billete100
	 * @param billete50
	 * @param billete20
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn5(Reserva2 reserva,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton billete200,JButton billete100,JButton billete50,JButton billete20,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		valorBoton = Double.parseDouble(billete5.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo1.total_faltante = Modelo1.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo1.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo1.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			billete200.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			billete20.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo1.total_faltante)
		{
			total_devolucion = total_introducido - reserva.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param reserva
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param billete200
	 * @param billete100
	 * @param billete50
	 * @param billete20
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn2e(Reserva2 reserva,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton billete200,JButton billete100,JButton billete50,JButton billete20,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		valorBoton = Double.parseDouble(moneda2e.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo1.total_faltante = Modelo1.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo1.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo1.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			billete200.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			billete20.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo1.total_faltante)
		{
			total_devolucion = total_introducido - reserva.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param reserva
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param billete200
	 * @param billete100
	 * @param billete50
	 * @param billete20
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn1e(Reserva2 reserva,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton billete200,JButton billete100,JButton billete50,JButton billete20,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		valorBoton = Double.parseDouble(moneda1e.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo1.total_faltante = Modelo1.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo1.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo1.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			billete200.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			billete20.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo1.total_faltante)
		{
			total_devolucion = total_introducido - reserva.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param reserva
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param billete200
	 * @param billete100
	 * @param billete50
	 * @param billete20
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn50cent(Reserva2 reserva,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton billete200,JButton billete100,JButton billete50,JButton billete20,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		valorBoton = Double.parseDouble(moneda50cent.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo1.total_faltante = Modelo1.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo1.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
	//	Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo1.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			billete200.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			billete20.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo1.total_faltante)
		{
			total_devolucion = total_introducido - reserva.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param reserva
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param billete200
	 * @param billete100
	 * @param billete50
	 * @param billete20
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn20cent(Reserva2 reserva,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton billete200,JButton billete100,JButton billete50,JButton billete20,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		valorBoton = Double.parseDouble(moneda20cent.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo1.total_faltante = Modelo1.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo1.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo1.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			billete200.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			billete20.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo1.total_faltante)
		{
			total_devolucion = total_introducido - reserva.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param reserva
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param billete200
	 * @param billete100
	 * @param billete50
	 * @param billete20
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn10cent(Reserva2 reserva,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton billete200,JButton billete100,JButton billete50,JButton billete20,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		valorBoton = Double.parseDouble(moneda10cent.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo1.total_faltante = Modelo1.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo1.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo1.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			billete200.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			billete20.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo1.total_faltante)
		{
			total_devolucion = total_introducido - reserva.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param reserva
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param billete200
	 * @param billete100
	 * @param billete50
	 * @param billete20
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn5cent(Reserva2 reserva,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton billete200,JButton billete100,JButton billete50,JButton billete20,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		valorBoton = Double.parseDouble(moneda5cent.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo1.total_faltante = Modelo1.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo1.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo1.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			billete200.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			billete20.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo1.total_faltante)
		{
			total_devolucion = total_introducido - reserva.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param reserva
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param billete200
	 * @param billete100
	 * @param billete50
	 * @param billete20
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn2cent(Reserva2 reserva,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton billete200,JButton billete100,JButton billete50,JButton billete20,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		valorBoton = Double.parseDouble(moneda2cent.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo1.total_faltante = Modelo1.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo1.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo1.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			billete200.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			billete20.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo1.total_faltante)
		{
			total_devolucion = total_introducido - reserva.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	/**
	 * 
	 * @param reserva
	 * @param DineroFaltante
	 * @param DineroIntroducido
	 * @param Vueltas
	 * @param btnPrecioContinuar
	 * @param billete200
	 * @param billete100
	 * @param billete50
	 * @param billete20
	 * @param billete10
	 * @param billete5
	 * @param moneda2e
	 * @param moneda1e
	 * @param moneda50cent
	 * @param moneda20cent
	 * @param moneda10cent
	 * @param moneda5cent
	 * @param moneda2cent
	 * @param moneda1cent
	 */
	public void btn1cent(Reserva2 reserva,JTextField DineroFaltante,JTextField DineroIntroducido,JTextField Vueltas,JButton btnPrecioContinuar,JButton billete200,JButton billete100,JButton billete50,JButton billete20,JButton billete10,JButton billete5,JButton moneda2e,JButton moneda1e,JButton moneda50cent,JButton moneda20cent,JButton moneda10cent,JButton moneda5cent,JButton moneda2cent,JButton moneda1cent) {
		valorBoton = Double.parseDouble(moneda1cent.getActionCommand());
		total_introducido=total_introducido+valorBoton;
		Modelo1.total_faltante = Modelo1.total_faltante-valorBoton;
		DineroFaltante.setText(String.format("%.2f",Modelo1.total_faltante));
		DineroIntroducido.setText(String.format("%.2f", total_introducido));
		//Vueltas.setText(String.format("%.2f", total_devolucion));
		if (Modelo1.total_faltante <= 0.009)
		{
			btnPrecioContinuar.setEnabled(true);
			billete200.setEnabled(false);
			billete100.setEnabled(false);
			billete50.setEnabled(false);
			billete20.setEnabled(false);
			billete10.setEnabled(false);
			billete5.setEnabled(false);
			moneda2e.setEnabled(false);
			moneda1e.setEnabled(false);
			moneda50cent.setEnabled(false);
			moneda20cent.setEnabled(false);
			moneda10cent.setEnabled(false);
			moneda5cent.setEnabled(false);
			moneda2cent.setEnabled(false);
			moneda1cent.setEnabled(false);
			DineroFaltante.setText("0.00");
		}
		if (total_introducido > Modelo1.total_faltante)
		{
			total_devolucion = total_introducido - reserva.getPrecio();
			BigDecimal decimal = new BigDecimal(total_devolucion);
			total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
			Vueltas.setText(String.format("%.2f", total_devolucion));
		}
	}
	
	
}
