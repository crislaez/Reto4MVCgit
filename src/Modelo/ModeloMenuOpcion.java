package Modelo;

import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import Coordinador.Controlador1;
import Coordinador.FuncionesControlador;
import Vista.Ventana1;

public class ModeloMenuOpcion {
	String dia_ida,mes_ida,ano_ida,dia_vuelta,mes_vuelta,ano_vuelta,fechainicio,fechafin,ubicacion,nombre,precio;
	double otroprecio=0;
	double preciofinal=0;
	Ventana1 ventana1;
	//Modelo1 modelo1;
	Controlador1 controlador;
	gestorBD gestor;
	Metodos2 metodos;
	String wifi="false";
	String piscina="false";
	String spa="false";
	String parking="false";
	String aireacondicionado="false";
	String restaurante="false";
	String bar="false";
	String gym="false";
	String combo="";
	int contadororden=0;
	
	
	public ModeloMenuOpcion(gestorBD gestor,Metodos2 metodos){
		this.gestor= gestor;
		this.metodos=metodos;
	}
	/**
	 * 
	 * @param comboboxpension
	 */
	public void combopension(JComboBox comboboxpension) {
		if(comboboxpension.getSelectedIndex()==0) {
			Modelo1.pension=5;
			System.out.println(Modelo1.pension);
		}
		else if(comboboxpension.getSelectedIndex()==1) {
			Modelo1.pension=10;
			System.out.println(Modelo1.pension);
		}
		else if(comboboxpension.getSelectedIndex()==2) {
			Modelo1.pension=20;
			System.out.println(Modelo1.pension);
		}
	}
	/**
	 * 
	 * @param chckbxordenarprecio
	 */
	public void ordenprecio(JCheckBox chckbxordenarprecio,JCheckBox chckbxordenarpopularidad,JCheckBox chckbxestrellas) {
		if(chckbxordenarprecio.isSelected()) {
			contadororden=1;
			System.out.println(contadororden);
			chckbxordenarpopularidad.setEnabled(false);
			chckbxestrellas.setEnabled(false);
		}
		else if(!chckbxordenarprecio.isSelected()) {
			contadororden=0;
			System.out.println(contadororden);
			chckbxordenarpopularidad.setEnabled(true);
			chckbxestrellas.setEnabled(true);
		}
	}
	/**
	 * 
	 * @param chckbxordenarprecio
	 * @param chckbxordenarpopularidad
	 * @param chckbxestrellas
	 */
	public void ordenestrellas(JCheckBox chckbxordenarprecio,JCheckBox chckbxordenarpopularidad,JCheckBox chckbxestrellas) {
		if(chckbxestrellas.isSelected()) {
			contadororden=3;
			System.out.println(contadororden);
			chckbxordenarpopularidad.setEnabled(false);
			chckbxordenarprecio.setEnabled(false);
		}
		else if(!chckbxestrellas.isSelected()) {
			contadororden=0;
			System.out.println(contadororden);
			chckbxordenarpopularidad.setEnabled(true);
			chckbxordenarprecio.setEnabled(true);
		}
	}
	
	/**
	 * 
	 * @param chckbxordenarpopularidad
	 */
	public void ordenpopularidad(JCheckBox chckbxordenarpopularidad,JCheckBox chckbxordenarprecio,JCheckBox chckbxestrellas) {
		if(chckbxordenarpopularidad.isSelected()) {
			contadororden=2;
			System.out.println(contadororden);
			chckbxordenarprecio.setEnabled(false);
			chckbxestrellas.setEnabled(false);
		}
		else if(!chckbxordenarpopularidad.isSelected()) {
			contadororden=0;
			System.out.println(contadororden);
			chckbxordenarprecio.setEnabled(true);
			chckbxestrellas.setEnabled(true);
		}
	}
	
	/**
	 * 
	 * @param dateFechaIda
	 * @param dateFechaVuelta
	 * @param reserva
	 */
	public void fechas(JDateChooser dateFechaIda,JDateChooser dateFechaVuelta,Reserva2 reserva) {

		dia_ida = Integer.toString(dateFechaIda.getCalendar().get(Calendar.DAY_OF_MONTH)); 
		mes_ida = Integer.toString(dateFechaIda.getCalendar().get(Calendar.MONTH) + 1);
		ano_ida = Integer.toString(dateFechaIda.getCalendar().get(Calendar.YEAR));
			
		dia_vuelta = Integer.toString(dateFechaVuelta.getCalendar().get(Calendar.DAY_OF_MONTH)); 
		mes_vuelta = Integer.toString(dateFechaVuelta.getCalendar().get(Calendar.MONTH) + 1);
        ano_vuelta = Integer.toString(dateFechaVuelta.getCalendar().get(Calendar.YEAR));
		fechainicio=(ano_ida + "/" + mes_ida + "/" + dia_ida); 
		fechafin=(ano_vuelta + "/" + mes_vuelta + "/" + dia_vuelta); 
	    reserva.setFechainicio(fechainicio);
	    reserva.setFechafin(fechafin);
	    System.out.println(reserva.getFechainicio());
	    System.out.println(reserva.getFechafin());
	}
	/**
	 * 
	 * @param rdbtnHotel
	 * @param rdbtnCasa
	 * @param rdbtnApartamento
	 * @param modelo3
	 */
	public void rdbthotel(JRadioButton rdbtnHotel,JRadioButton rdbtnCasa,JRadioButton rdbtnApartamento,DefaultListModel modelo3,JComboBox comboboxpension,JCheckBox chckbxestrellas) {
	
		if(rdbtnHotel.isSelected()) {
			rdbtnCasa.setEnabled(false);
			rdbtnApartamento.setEnabled(false);
			comboboxpension.setEnabled(true);
			chckbxestrellas.setEnabled(true);
			
		}
		if(!rdbtnHotel.isSelected()) {
			rdbtnCasa.setEnabled(true);
			rdbtnApartamento.setEnabled(true);
			modelo3.clear();
			comboboxpension.setEnabled(false);
			chckbxestrellas.setEnabled(false);
			Modelo1.pension=0;
			
		}
	}
	/**
	 * 
	 * @param rdbtnHotel
	 * @param rdbtnCasa
	 * @param rdbtnApartamento
	 * @param modelo3
	 */
	public void rdtbcasa(JRadioButton rdbtnHotel,JRadioButton rdbtnCasa,JRadioButton rdbtnApartamento,DefaultListModel modelo3,JComboBox comboboxpension) {
		
		if(rdbtnCasa.isSelected()) {
			rdbtnHotel.setEnabled(false);
			rdbtnApartamento.setEnabled(false);	
			comboboxpension.setEnabled(false);
			
		}
		if(!rdbtnCasa.isSelected()) {
			rdbtnHotel.setEnabled(true);
			rdbtnApartamento.setEnabled(true);	
			modelo3.clear();
		}
	}
		/**
		 * 
		 * @param rdbtnWIFI
		 */
	//-------------------
	public void rdbtwifi(JRadioButton rdbtnWIFI) {
		if(rdbtnWIFI.isSelected()) {
			wifi="true";
			System.out.println("wifi: "+wifi);
			Modelo1.pwifi=10;
			System.out.println(Modelo1.pwifi);
			
		}
		if(!rdbtnWIFI.isSelected()) {
			wifi="false";
			System.out.println("wifi: "+wifi);
			Modelo1.pwifi=0;
			System.out.println(Modelo1.pwifi);
		}
	}
	/**
	 * 
	 * @param rdbtnPiscina
	 */
	//-------------------
	public void rdbtpiscina(JRadioButton rdbtnPiscina) {
		if(rdbtnPiscina.isSelected()) {
			piscina="true";
			System.out.println("piscina: "+piscina);
			Modelo1.ppiscina=30;
			System.out.println(Modelo1.ppiscina);
			
		}
		if(!rdbtnPiscina.isSelected()) {
			piscina="false";
			System.out.println("piscina: "+piscina);
			Modelo1.ppiscina=0;
			System.out.println(Modelo1.ppiscina);
		}
	}
	/**
	 * 
	 * @param rdbtnSpa
	 */
	//-------------------
	public void rdbtspa(JRadioButton rdbtnSpa) {
		if(rdbtnSpa.isSelected()) {
			spa="true";
			System.out.println("spa: "+spa);
			Modelo1.pspa=50;
			System.out.println(Modelo1.pspa);
			
		}
		if(!rdbtnSpa.isSelected()) {
			spa="false";
			System.out.println("spa: "+spa);
			Modelo1.pspa=0;
			System.out.println(Modelo1.pspa);
		}	
	}
	/**
	 * 
	 * @param rdbtnParking
	 */
	//-------------------
	public void rdbtparking(JRadioButton rdbtnParking) {
		if(rdbtnParking.isSelected()) {
			parking="true";
			System.out.println("parking: "+parking);
			Modelo1.pparking=40;
			System.out.println(Modelo1.pparking);
			
		}
		if(!rdbtnParking.isSelected()) {
			parking="false";
			System.out.println("parking: "+parking);
			Modelo1.pparking=0;
			System.out.println(Modelo1.pparking);
		}
	}
	/**
	 * 
	 * @param rdbtnAireAcondicionado
	 */
	//-------------------
	public void rdbtac(JRadioButton rdbtnAireAcondicionado) {
		if(rdbtnAireAcondicionado.isSelected()) {
			aireacondicionado="true";
			System.out.println("aireacondicionado: "+aireacondicionado);
			Modelo1.paire=45;
			System.out.println(Modelo1.paire);
			
		}
		if(!rdbtnAireAcondicionado.isSelected()) {
			aireacondicionado="false";
			System.out.println("aireacondicionado: "+aireacondicionado);
			Modelo1.paire=0;
			System.out.println(Modelo1.paire);
		}
	}
	/**
	 * 
	 * @param rdbtnRestaurante
	 */
	//-------------------
	public void rdbtrestaurante(JRadioButton rdbtnRestaurante) {
		if(rdbtnRestaurante.isSelected()) {
			restaurante="true";
			System.out.println("restaurante: "+restaurante);
			Modelo1.prestaurante=100;
			System.out.println(Modelo1.prestaurante);
			
		}
		if(!rdbtnRestaurante.isSelected()) {
			restaurante="false";
			System.out.println("restaurante: "+restaurante);
			Modelo1.prestaurante=0;
			System.out.println(Modelo1.prestaurante);
		}

	}
	/**
	 * 
	 * @param rdbtnBar
	 */
	//-------------------
	public void rdbtbar(JRadioButton rdbtnBar) {
		if(rdbtnBar.isSelected()) {
			bar="true";
			System.out.println("bar: "+bar);
			Modelo1.pbar=35;
			System.out.println(Modelo1.pbar);
			
		}
		if(!rdbtnBar.isSelected()) {
			bar="false";
			System.out.println("bar: "+bar);
			Modelo1.pbar=0;
			System.out.println(Modelo1.pbar);
		}
	}
	/**
	 * 
	 * @param rdbtnGym
	 */
	//-------------------
	public void rdbtgym(JRadioButton rdbtnGym) {
		if(rdbtnGym.isSelected()) {
			gym="true";
			System.out.println("gym: "+gym);
			Modelo1.pgym=25;
			System.out.println(Modelo1.pgym);
			
		}
		if(!rdbtnGym.isSelected()) {
			gym="false";
			System.out.println("gym: "+gym);
			Modelo1.pgym=0;
			System.out.println(Modelo1.pgym);
		}
	}
	/**
	 * 
	 * @param rdbtnHotel
	 * @param rdbtnCasa
	 * @param rdbtnApartamento
	 * @param modelo3
	 */
	public void rdtbapartamento(JRadioButton rdbtnHotel,JRadioButton rdbtnCasa,JRadioButton rdbtnApartamento,DefaultListModel modelo3,JComboBox comboboxpension) {
		
		if(rdbtnApartamento.isSelected()) {
			rdbtnHotel.setEnabled(false);
			rdbtnCasa.setEnabled(false);
			comboboxpension.setEnabled(false);

		}
		if(!rdbtnApartamento.isSelected()) {
			
			rdbtnHotel.setEnabled(true);
			rdbtnCasa.setEnabled(true);	
			modelo3.clear();
		}
	}
	
   /**
    * metodo que dependiendo de que contador tenga, guarde un codigo en reserva.setcodigoreserve()
    * @param cadena
    * @param codigo
    * @param codigos
    * @param contador
    */
	public void codigo(String cadena, String codigo,int codigos,Reserva2 reserva,JDateChooser dateFechaIda,JDateChooser dateFechaVuelta,JTextField DineroFaltante) {
		cadena=codigo.split(",")[1];
		ubicacion=codigo.split(",")[5];
		nombre=codigo.split(",")[3];
		precio=codigo.split(",")[8];
		codigos=Integer.parseInt(cadena);
		System.out.println("hola");
		System.out.println(Modelo1.contador);
		
		if(Modelo1.contador==1) {
			reserva.setUbicacion(ubicacion);
			reserva.setCodigohotel(codigos);
			reserva.setNombreAlojamiento(nombre);
			
		}
		else if(Modelo1.contador==2) {
			
			otroprecio=Double.parseDouble(precio);
			reserva.setUbicacion(ubicacion);
			reserva.setCodigocasa(codigos);
			reserva.setNombreAlojamiento(nombre);
			preciofinal=metodos.preciototal(dateFechaIda, dateFechaVuelta, otroprecio);
			reserva.setPrecio(preciofinal);
			System.out.println(reserva.getUbicacion());
			System.out.println(reserva.getCodigocasa());
			System.out.println(reserva.getNombreAlojamiento());
			System.out.println(reserva.getPrecio());
			DineroFaltante.setText(reserva.getPrecio()+" \u20ac");
			Modelo1.total_faltante = reserva.getPrecio();
			
		}
		else if(Modelo1.contador==3) {
			
			otroprecio=Double.parseDouble(precio);
			reserva.setUbicacion(ubicacion);
			reserva.setCodigoapatamento(codigos);
			reserva.setNombreAlojamiento(nombre);
			preciofinal=metodos.preciototal(dateFechaIda, dateFechaVuelta, otroprecio);
			reserva.setPrecio(preciofinal);
			System.out.println(reserva.getUbicacion());
			System.out.println(reserva.getCodigoapatamento());
			System.out.println(reserva.getNombreAlojamiento());
			System.out.println(reserva.getPrecio());
			DineroFaltante.setText(reserva.getPrecio()+" \u20ac");
			Modelo1.total_faltante = reserva.getPrecio();
		}
		
	}
	public void buscarhabitacioncasa(Reserva2 reserva,JList listHabitacion,DefaultListModel modelo2) {
		gestor.buscarhabitacioncasa(reserva.getCodigocasa(),listHabitacion,modelo2);
		//listHabitacion.setModel(modelo2);
	}
	public void buscarhabitacionapartamento(Reserva2 reserva,JList listHabitacion,DefaultListModel modelo2) {
		gestor.buscarhabitacionapartamento(reserva.getCodigoapatamento(),listHabitacion,modelo2);
		//listHabitacion.setModel(modelo2);
	}
	/**
	 * metodo del boton buscar y muestre los alojamientos
	 * @param personas
	 * @param comboBoxPersonas
	 * @param reserva
	 * @param rdbtnHotel
	 * @param rdbtnCasa
	 * @param rdbtnApartamento
	 * @param contador
	 * @param dateFechaIda
	 * @param dateFechaVuelta
	 * @param textUbicacion
	 * @param textCodigoDescuento
	 * @param lblError
	 * @param codigodescuento
	 * @param listhoteles
	 * @param modelo3
	 */
	//---------------
	public void btnbuscar(JComboBox comboBoxPersonas,Reserva2 reserva,JRadioButton rdbtnHotel,JRadioButton rdbtnCasa,JRadioButton rdbtnApartamento,JDateChooser dateFechaIda,JDateChooser dateFechaVuelta,JTextField textUbicacion,JTextField textCodigoDescuento,JLabel lblError,JList listhoteles,DefaultListModel modelo3) {
		Modelo1.persona=(int) comboBoxPersonas.getSelectedItem();
		reserva.setNumeropresonas(Modelo1.persona);
		System.out.println(Modelo1.persona);
		System.out.println("pension"+Modelo1.pension);
		System.out.println("contador"+contadororden);
		
		if(rdbtnHotel.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Barakaldo") || rdbtnHotel.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Bilbao") || rdbtnHotel.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Santurce") || rdbtnHotel.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Las Arenas")) {
		//metodos.boton2accionlistener(alojamiento, boton2, textUbicacion, rdbtnHotel);
			
			Modelo1.contador=1;
			System.out.println(Modelo1.contador+"boton hotel");
			//--codigo de descuento
			metodos.codigodescuentoerror(textCodigoDescuento, lblError);
			
			
			//gestor.rellenarhoteles(textUbicacion.getText(), listhoteles, modelo3);
			if(contadororden==0) {
				gestor.finalrellenarhotelessinorden(textUbicacion.getText(), wifi, piscina, spa, parking, aireacondicionado, restaurante, bar, gym, listhoteles, modelo3);
			
			}
			else if(contadororden==1) {
				gestor.finalrellenarhoteles(textUbicacion.getText(), wifi, piscina, spa, parking, aireacondicionado, restaurante, bar, gym, listhoteles, modelo3);
			}
			else if(contadororden==2) {
				gestor.finalrellenarhotelesnumeroreservas(textUbicacion.getText(), wifi, piscina, spa, parking, aireacondicionado, restaurante, bar, gym, listhoteles, modelo3);
			}
			else if(contadororden==3) {
				gestor.finalrellenarhotelesestrellas(textUbicacion.getText(), wifi, piscina, spa, parking, aireacondicionado, restaurante, bar, gym, listhoteles, modelo3);
			}
			
			listhoteles.setModel(modelo3);
			}
		//-----------------------------
		else if(rdbtnCasa.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Barakaldo") || rdbtnCasa.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Bilbao") || rdbtnCasa.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Santurce") || rdbtnCasa.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Las Arenas")) {
				//metodos.boton2accionlistener(alojamiento, boton2, textUbicacion, rdbtnHotel);
			Modelo1.contador=2;
			System.out.println(Modelo1.contador+"boton casa");
			//--codigo de descuento
			metodos.codigodescuentoerror(textCodigoDescuento, lblError);
			
			
			//gestor.rellenarcasa(textUbicacion.getText(), listhoteles, modelo3);
			if(contadororden==0) {
				gestor.finalrellenarcasasinorden(textUbicacion.getText(), wifi, piscina, spa, parking, aireacondicionado, restaurante, bar, gym, listhoteles, modelo3);
			
			}
			else if(contadororden==1) {
				gestor.finalrellenarcasa(textUbicacion.getText(), wifi, piscina, spa, parking, aireacondicionado, restaurante, bar, gym, listhoteles, modelo3);
			}
			else if(contadororden==2) {
				gestor.finalrellenarcasanumeroreservas(textUbicacion.getText(), wifi, piscina, spa, parking, aireacondicionado, restaurante, bar, gym, listhoteles, modelo3);
			}	
			listhoteles.setModel(modelo3);
				
			}
		//-------------------------------------
		else if(rdbtnApartamento.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Barakaldo") || rdbtnApartamento.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Bilbao") || rdbtnApartamento.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Santurce") || rdbtnApartamento.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Las Arenas")) {
			//metodos.boton2accionlistener(alojamiento, boton2, textUbicacion, rdbtnHotel);
			Modelo1.contador=3;
			System.out.println(Modelo1.contador+"boton apartamento");
			//--codigo de descuento
			metodos.codigodescuentoerror(textCodigoDescuento, lblError);
			
			//gestor.rellenarapartamento(textUbicacion.getText(), listhoteles, modelo3);
			if(contadororden==0) {
				gestor.finalrellenarapartamentosinorden(textUbicacion.getText(), wifi, piscina, spa, parking, aireacondicionado, restaurante, bar, gym, listhoteles, modelo3);
			}
			else if(contadororden==1) {
				gestor.finalrellenarapartamento(textUbicacion.getText(), wifi, piscina, spa, parking, aireacondicionado, restaurante, bar, gym, listhoteles, modelo3);
			}
			else if(contadororden==2) {
				gestor.finalrellenarapartamentonumeroreservas(textUbicacion.getText(), wifi, piscina, spa, parking, aireacondicionado, restaurante, bar, gym, listhoteles, modelo3);
			}
			listhoteles.setModel(modelo3);
				
			
			
			}
		
		else if(!textUbicacion.getText().equals("Barakaldo") && !textUbicacion.getText().equals("Bilbao") && !textUbicacion.getText().equals("Santurce") && !textUbicacion.getText().equals("Las Arenas") ) {
			//rdbtnHotel.setEnabled(false);
			JOptionPane.showMessageDialog(null, "Seleccione Ubicacion, Solo hay Disponibles, Bilbao, Santurce, Las Arenas, Barakaldo");
		}

		else if(dateFechaIda.getDate() == null) {
			JOptionPane.showMessageDialog(null, "Seleccione Fecha Entrada");
		}
		else if(dateFechaVuelta.getDate()  == null) {
			JOptionPane.showMessageDialog(null, "Seleccione Fecha Salida");
		}	

		else if(!rdbtnHotel.isSelected() || !rdbtnCasa.isSelected() || !rdbtnApartamento.isSelected()) {
			JOptionPane.showMessageDialog(null, "Seleccione la Opcion, Hotel, Casa o Apartamento");
		}
		

	}

}
