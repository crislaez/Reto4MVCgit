package Modelo;

import java.awt.event.ActionEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;



public class Metodos2 {

//----------------------------------------------------------------------------
	public String EscribiroCrearFichearo(int codigohotel,int codigocasa,int codigoapartamento,String codigohabitacion, String dni,double precio, String nombreAlojamiento, String ubicacion, int numeropersonas,String fechainicio, String fechafin,int contador)  {
		System.out.println("contador en metodos "+contador);
		String nombre="";
		String habitacion="";
		int codigo=0;
		if(contador==1) {
			nombre="l Hotel: ";
			habitacion="\r\n"+"Codigo de las Habitaciones: "+codigohabitacion;
			codigo=codigohotel;
		}
		else if(contador==2) {
			nombre=" la Casa: ";
			
			codigo=codigocasa;
		}
		else if(contador==3) {
			nombre="l Apartamento: ";
		
			codigo=codigoapartamento;
		}
		String frase= ("Codigo de"+nombre+codigo+habitacion+"\r\n"+"DNI Cliente: "+dni+ "\r\n"+"Precio Hotel: " + precio + "\r\n" + "Nombre Hotel: " + nombreAlojamiento+ "\r\n" + "Ubicacion Hotel: " + ubicacion+ "\r\n"+"Numero de Personas: " + numeropersonas+ "\r\n"+"Fecha Inicio: " + fechainicio+ "\r\n"+"Fecha Fin: " + fechafin);
		char c=0;
		try {

			FileOutputStream f= new FileOutputStream("Cosas/reserva.png");  //---> En un directorio concreto
			
			//*** pasar los caracteres al flujo
			for(int i =0; i<frase.length(); i++) {
				c=frase.charAt(i);
				f.write(c);
			}
			//*** cerrra el flujo de salida
			f.close();
			
		}catch (IOException e) {
			System.out.println("error  "+e.getMessage());
		}
		return frase;
		
		}	
		
//------------------------------------------------------------------------------------------------------

	public void cuentaatras() {
				
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//----------------------------------------
	public void cerrar() {
		
		for(int i=0;i<5;i++ ) {
				cuentaatras();	
			
		}
		System.exit(0);
	}

//-------------------------------------------------------------------------------------
	public void botonesmenu2(ArrayList<Alojamiento> alojamiento, JButton boton2[], JPanel Panel_ScrollMenuopcion) {
		
		for(int i=0;i<alojamiento.size();i++) {
			if(alojamiento.get(i) instanceof Hotel) {
			boton2[i] = new JButton("Nombre: "+((Hotel)alojamiento.get(i)).getNombreAlojamiento()+",  Ubicacion: "+((Hotel)alojamiento.get(i)).getUbicacion());
			Panel_ScrollMenuopcion.add(boton2[i]);
			
			boton2[i].setActionCommand((((Hotel)alojamiento.get(i)).getNombreAlojamiento()));
			boton2[i].setEnabled(false);
			boton2[i].setVisible(false);
			
			}
					
		};
	}
//-------------------------------------------------------------------------------------
	public void limitar(JDateChooser dateFechaIda, JDateChooser dateFecahVuelta) {
		dateFechaIda.setMinSelectableDate(Date.valueOf(LocalDate.now()));
		dateFecahVuelta.setMinSelectableDate(Date.valueOf(LocalDate.now().plusDays(1)));
	}
//---------------------------------------------------------------------------------
	public void diasadelante(JDateChooser dateFechaIda, JDateChooser dateFecahVuelta) {
		

		try {
			
			int dia=dateFechaIda.getCalendar().get(Calendar.DAY_OF_MONTH);
			int mes =dateFechaIda.getCalendar().get(Calendar.MONTH)+1;
			int año=dateFechaIda.getCalendar().get(Calendar.YEAR);
			LocalDate fechasalida = LocalDate.of(año, mes, dia);
			dateFecahVuelta.setMinSelectableDate(Date.valueOf(fechasalida.plusDays(1)));
			
		}catch(NullPointerException e) {
			System.out.print("NullPointerException variable vacia");
			e.getMessage();
		}
	
		
	}
//---------------------------------------------------------------------------------
		public void diasatras(JDateChooser dateFechaIda, JDateChooser dateFecahVuelta) {
			

			try {
				
				int dia=dateFecahVuelta.getCalendar().get(Calendar.DAY_OF_MONTH);
				int mes =dateFecahVuelta.getCalendar().get(Calendar.MONTH)+1;
				int año=dateFecahVuelta.getCalendar().get(Calendar.YEAR);
				LocalDate fechaentrada = LocalDate.of(año, mes, dia);
				dateFechaIda.setMaxSelectableDate(Date.valueOf(fechaentrada.minusDays(1)));
			}catch(NullPointerException e) {
				System.out.print("NullPointerException variable vacia");
				e.getMessage();
			}
		
			
		}

//---------------------------------------------------------------------------------
		public void codigodescuentoerror(JTextField textCodigoDescuento,JLabel lblError) {
			
			if(!textCodigoDescuento.getText().equals("1050") && !textCodigoDescuento.getText().equals("1060") && !textCodigoDescuento.getText().equals("1070")) {
				Modelo1.codigodescuento=0;
				System.out.println(Modelo1.codigodescuento);
				lblError.setVisible(true);
			}
			else if(textCodigoDescuento.getText().equals("1050")){
				Modelo1.codigodescuento=0.1;
				System.out.println(Modelo1.codigodescuento);
				lblError.setVisible(false);
			}
			else if(textCodigoDescuento.getText().equals("1060")){
				Modelo1.codigodescuento=0.2;
				System.out.println(Modelo1.codigodescuento);
				lblError.setVisible(false);
			}
			else if(textCodigoDescuento.getText().equals("1070")){
				Modelo1.codigodescuento=0.3;
				System.out.println(Modelo1.codigodescuento);
				lblError.setVisible(false);
			}
		}
//-------------------------------------------------------------------------------

	public double preciototal(JDateChooser dateFechaIda,JDateChooser dateFechaVuelta,double preciodia) {
		double precio=0;
		double complementos=0;
		double preciosindescuento=0;
		double festivo=0;
		double estival=0;
		double estivalfestivo=0;
		double preciopension;
		int prueba=0;
		int contador=0;
		int contadordos=0;
		int contadortres=0;
		Calendar fechainicio=dateFechaIda.getCalendar();
		Calendar fechafin=dateFechaVuelta.getCalendar();
		int dia=0;
		
		
		while(fechainicio.before(fechafin)|| fechainicio.equals(fechafin)) {
			
			if(          ((fechainicio.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) && (fechainicio.get(Calendar.MONTH) != Calendar.JUNE)) 
					 &&  ((fechainicio.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) && (fechainicio.get(Calendar.MONTH) != Calendar.JULY))
					 &&  ((fechainicio.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) && (fechainicio.get(Calendar.MONTH) != Calendar.AUGUST))
					 ||  ((fechainicio.get(Calendar.DATE) == 1) && (fechainicio.get(Calendar.MONTH) == Calendar.JANUARY))
					 ||  ((fechainicio.get(Calendar.DATE) == 14) &&(fechainicio.get(Calendar.MONTH) == Calendar.MARCH))
					 ||  ((fechainicio.get(Calendar.DATE) == 18) &&(fechainicio.get(Calendar.MONTH) == Calendar.APRIL))
					 ||  ((fechainicio.get(Calendar.DATE) == 19) &&(fechainicio.get(Calendar.MONTH) == Calendar.APRIL))
					 ||  ((fechainicio.get(Calendar.DATE) == 22) &&(fechainicio.get(Calendar.MONTH) == Calendar.APRIL))
					 ||  ((fechainicio.get(Calendar.DATE) == 1) &&(fechainicio.get(Calendar.MONTH) == Calendar.MAY))
					 ||  ((fechainicio.get(Calendar.DATE) == 12) &&(fechainicio.get(Calendar.MONTH) == Calendar.OCTOBER))
					 ||  ((fechainicio.get(Calendar.DATE) == 1) &&(fechainicio.get(Calendar.MONTH) == Calendar.NOVEMBER))
					 ||  ((fechainicio.get(Calendar.DATE) == 6) &&(fechainicio.get(Calendar.MONTH) == Calendar.DECEMBER))
					 ||  ((fechainicio.get(Calendar.DATE) == 25) &&(fechainicio.get(Calendar.MONTH) == Calendar.DECEMBER)) )  {
				contador++;//se sube un 20 % por ser festivo
			}
			else if(    ((fechainicio.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) && (fechainicio.get(Calendar.MONTH) == Calendar.JUNE)) 
					 || ((fechainicio.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) && (fechainicio.get(Calendar.MONTH) == Calendar.JULY))
					 || ((fechainicio.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) && (fechainicio.get(Calendar.MONTH) == Calendar.AUGUST))
					 || ((fechainicio.get(Calendar.DATE) == 25) &&(fechainicio.get(Calendar.MONTH) == Calendar.JULY))
					 || ((fechainicio.get(Calendar.DATE) == 31) &&(fechainicio.get(Calendar.MONTH) == Calendar.JULY))
					 || ((fechainicio.get(Calendar.DATE) == 16) &&(fechainicio.get(Calendar.MONTH) == Calendar.AUGUST)) ) {
				contadortres++;//se sube un 30 % 20 de festivo y 10 por estival
			}
			else if(   ((fechainicio.get(Calendar.MONTH) == Calendar.JUNE) && (fechainicio.get(Calendar.DAY_OF_WEEK)!=Calendar.SUNDAY))
					|| ((fechainicio.get(Calendar.MONTH) == Calendar.JULY) && (fechainicio.get(Calendar.DAY_OF_WEEK)!=Calendar.SUNDAY))
					|| ((fechainicio.get(Calendar.MONTH) == Calendar.JULY) && (fechainicio.get(Calendar.DATE)!=25))
					|| ((fechainicio.get(Calendar.MONTH) == Calendar.JULY) && (fechainicio.get(Calendar.DATE)!=31))
					|| ((fechainicio.get(Calendar.MONTH) == Calendar.AUGUST) && (fechainicio.get(Calendar.DATE)!=16))
					|| ((fechainicio.get(Calendar.MONTH) == Calendar.AUGUST) && (fechainicio.get(Calendar.DAY_OF_WEEK)!=Calendar.SUNDAY)) ) {
				contadordos++;//se sube un 10 % por ser estival
			}
			
			dia++;
			fechainicio.add(Calendar.DATE, 1);
		}
		
		System.out.println(dia+" dias");
		System.out.println(contador+" festios");
		System.out.println(contadordos+" dias estivales");
		System.out.println(contadortres+" festivo y estival");
		
		preciopension=Modelo1.pension*dia;
		System.out.println("pension escogida "+Modelo1.pension+" * "+dia);
		System.out.println("precio de la pension compleata "+preciopension);
		festivo=contador*((preciodia*0.2)+preciodia);
		estival=contadordos*((preciodia*0.1)+preciodia);
		estivalfestivo=contadortres*((preciodia*0.3)+preciodia);
		prueba=dia-contador-contadordos-contadortres;
		System.out.println(prueba+" dias no festivos por "+preciodia+" y se le suma el precio festivo de "+contador+" dias "+festivo+" mas estivales "+contadordos+" dias "+estival+" mas dias festivos y estivales "+contadortres+" dias "+estivalfestivo);
		preciosindescuento=(prueba*preciodia)+festivo+estival+estivalfestivo;
		System.out.println(preciosindescuento);
		complementos=preciosindescuento-(preciosindescuento*Modelo1.codigodescuento);
		System.out.println("precio wifi: "+Modelo1.pwifi+" piscina: "+Modelo1.ppiscina+" spa: "+Modelo1.pspa+" parking: "+Modelo1.pparking+" a/c: "+Modelo1.paire+" restaurante: "+Modelo1.prestaurante+" bar: "+Modelo1.pbar+" gym: "+Modelo1.pgym+" pension: "+preciopension);
		precio=complementos+Modelo1.pwifi+Modelo1.ppiscina+Modelo1.pspa+Modelo1.pparking+Modelo1.paire+Modelo1.prestaurante+Modelo1.pbar+Modelo1.pgym+preciopension;
		System.out.println(precio);
		return precio;
		
	}
	
//-----------------------------------------------------------------------------------------------

//-------------------------------------------------------------------------------------
	public void boton2accionlistener(ArrayList<Alojamiento> alojamiento,JButton boton2[], JTextField textUbicacion,JRadioButton rdbtnHotel) {
		
		for(int i=0;i<alojamiento.size();i++) {
			boton2[i].setVisible(false);

			if(alojamiento.get(i) instanceof Hotel) {
				if(textUbicacion.getText().equals(((Hotel)alojamiento.get(i)).getUbicacion())) {
					
					boton2[i].setEnabled(true);
					boton2[i].setVisible(true);
					rdbtnHotel.setEnabled(false);
				}
				/*
				else if(!textUbicacion.getText().equals(((Hotel)alojamiento.get(i)).getUbicacion())) {
					JOptionPane.showMessageDialog(null, "Ubicacion no encontrada");
					return;
				}
				*/
			}
				
		}
	}
//-------------------------------------------------------------------------------------

	public static void ordenarAlojamiento(ArrayList<Alojamiento> array) {
		
		Alojamiento parad=new Alojamiento();
		
		for(int iuno=0;iuno<(array.size()-1);iuno++)
              {
            
                 for(int idos=0;idos<((array.size()-iuno)-1);idos++)
                {
                
                     if(array.get(idos).getPrecio()>array.get(idos+1).getPrecio())
                    {
                	                  
                	  parad=array.get(idos+1);
                          array.set(idos+1,array.get(idos));
                          array.set(idos,parad);
                    
                    }
                }
             }
      

		
	}
//-------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------
	
}
