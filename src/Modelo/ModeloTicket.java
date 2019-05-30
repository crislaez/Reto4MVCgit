package Modelo;

import Coordinador.Controlador1;
import Coordinador.FuncionesControlador;

public class ModeloTicket {
	
	Controlador1 controlador;
	gestorBD gestor;
	Metodos2 metodos;
	FuncionesControlador funciones=new FuncionesControlador();
	int prueba;
	
	public ModeloTicket(gestorBD gestor,Metodos2 metodos){
		this.gestor= gestor;
		this.metodos=metodos;
	}

}
