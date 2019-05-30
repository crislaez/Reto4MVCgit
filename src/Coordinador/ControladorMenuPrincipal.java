package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Modelo1;
import Vista.Ventana1;

public class ControladorMenuPrincipal implements ActionListener{

	FuncionesControlador funciones = new FuncionesControlador();
	
	private Ventana1 ventana1;
	private Modelo1 model1;
	
	public ControladorMenuPrincipal(Ventana1 ventana1,Modelo1 model1) {
		this.ventana1=ventana1;
		this.model1=model1;
		
		ventana1.panelmenuprincipal.btnHacerReserva.addActionListener(this);
		ventana1.panelmenuprincipal.btnBorrarReserva.addActionListener(this);
		ventana1.panelmenuprincipal.btnBorrarCliente.addActionListener(this);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==ventana1.panelmenuprincipal.btnHacerReserva) {
			funciones.cambiarDePanel(ventana1.panelmenuprincipal, ventana1.panelmenuopcion);
			
			
		}
		if (e.getSource()==ventana1.panelmenuprincipal.btnBorrarReserva) {
			funciones.cambiarDePanel(ventana1.panelmenuprincipal, ventana1.panelborrarreserva);
			
		}
		if (e.getSource()==ventana1.panelmenuprincipal.btnBorrarCliente) {
			funciones.cambiarDePanel(ventana1.panelmenuprincipal, ventana1.panelborrarcliente);
			
		}
		
	}

}
