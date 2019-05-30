package Principal;

import Coordinador.Controlador1;
import Modelo.Modelo1;
import Vista.Ventana1;



public class Main {

	Modelo1 modelo1;
	Controlador1 controlador1;
	Ventana1 ventana1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main main=new Main();
		main.iniciar();
	}
	
	public void iniciar() {
		// Instanciar clases
		ventana1 = new Ventana1();
		modelo1 = new Modelo1();
		controlador1 = new Controlador1(ventana1, modelo1);
		
		// Asociaciones entre clases
		modelo1.setControlador(controlador1); 
				
		//Iniciar la ventana
		ventana1.setVisible(true);
		
	}

}
