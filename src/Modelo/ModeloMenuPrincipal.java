package Modelo;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Coordinador.Controlador1;
import Coordinador.FuncionesControlador;

public class ModeloMenuPrincipal {
	
	//Ventana1 ventana1;
	//Modelo1 modelo1;
	Controlador1 controlador;
	gestorBD gestor;
	FuncionesControlador funciones=new FuncionesControlador();
	
	public ModeloMenuPrincipal(gestorBD gestor){
		this.gestor= gestor;
		
	}
	//-------------------------------------------------
	/*
	public void rellenarboton3(JButton boton3[],JPanel panel_SCROLL_3) {
		for(int i=0;i<Modelo1.habitacion.size();i++) {
			
			
				boton3[i] = new JButton("Codigo Habitacion: "+Modelo1.habitacion.get(i).getCodigohabitacion()+",  Codigo Hotel: "+Modelo1.habitacion.get(i).getCodigohotel()+",  Numero Camas: "+Modelo1.habitacion.get(i).getNumerocamas()+",  Precio: "+Modelo1.habitacion.get(i).getPrecio());
				panel_SCROLL_3.add(boton3[i]);
				
				boton3[i].setActionCommand(Integer.toString((Modelo1.habitacion.get(i).getCodigohabitacion())));
				boton3[i].setEnabled(false);
				boton3[i].setVisible(false);
		
		};
	}
	*/
	//-----------------------------------------------------------
	/*
	public void rellenarboton2(JButton boton2[],JPanel Panel_ScrollMenuopcion) {
		for(int i=0;i<Modelo1.alojamiento.size();i++) {
			
			if(Modelo1.alojamiento.get(i) instanceof Hotel) {
			boton2[i] = new JButton("Nombre: "+((Hotel)Modelo1.alojamiento.get(i)).getNombreAlojamiento()+",  Ubicacion: "+((Hotel)Modelo1.alojamiento.get(i)).getUbicacion());
			Panel_ScrollMenuopcion.add(boton2[i]);
			
			boton2[i].setActionCommand((((Hotel)Modelo1.alojamiento.get(i)).getNombreAlojamiento()));
			boton2[i].setEnabled(false);
			boton2[i].setVisible(false);
			
			}
			
			if(Modelo1.alojamiento.get(i) instanceof Casa) {
				boton2[i] = new JButton("Nombre: "+((Casa)Modelo1.alojamiento.get(i)).getNombreAlojamiento()+",  Ubicacion: "+((Casa)Modelo1.alojamiento.get(i)).getUbicacion()+", Precio: "+((Casa)Modelo1.alojamiento.get(i)).getPrecio());
				Panel_ScrollMenuopcion.add(boton2[i]);
				
				boton2[i].setActionCommand((((Casa)Modelo1.alojamiento.get(i)).getNombreAlojamiento()));
				boton2[i].setEnabled(false);
				boton2[i].setVisible(false);
				
			}
			
			if(Modelo1.alojamiento.get(i) instanceof Apartamento) {
				boton2[i] = new JButton("Nombre: "+((Apartamento)Modelo1.alojamiento.get(i)).getNombreAlojamiento()+",  Ubicacion: "+((Apartamento)Modelo1.alojamiento.get(i)).getUbicacion()+", Precio: "+((Apartamento)Modelo1.alojamiento.get(i)).getPrecio());
				Panel_ScrollMenuopcion.add(boton2[i]);
				
				boton2[i].setActionCommand((((Apartamento)Modelo1.alojamiento.get(i)).getNombreAlojamiento()));
				boton2[i].setEnabled(false);
				boton2[i].setVisible(false);
			}
					
		};
	}
	*/

}
