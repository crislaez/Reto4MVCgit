package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Modelo1;
import Vista.Ventana1;

public class ControladorBorrarCliente implements ActionListener{
	
	FuncionesControlador funciones = new FuncionesControlador();
	
	private Ventana1 ventana1;
	private Modelo1 modelo1;
	
	public ControladorBorrarCliente(Ventana1 ventana1,Modelo1 modelo1) {
		this.ventana1=ventana1;
		this.modelo1=modelo1;
		
		
		ventana1.panelborrarcliente.btnAtrasBorrarTicket.addActionListener(this);
		ventana1.panelborrarcliente.btnBorrarBorrarCliente.addActionListener(this);
	}

	public void resetar() {
		ventana1.panelborrarcliente.formattedDniBorrarCliente.setText("");
		ventana1.panelborrarcliente.passwordContraseña.setText("");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource()==ventana1.panelborrarcliente.btnAtrasBorrarTicket) {
			funciones.cambiarDePanel(ventana1.panelborrarcliente, ventana1.panelmenuprincipal);
			resetar();
			
		}
		if (arg0.getSource()==ventana1.panelborrarcliente.btnBorrarBorrarCliente) {
			int prueba=modelo1.modeloborrarcliente.botonborrarcliente(ventana1.panelborrarcliente.formattedDniBorrarCliente,ventana1.panelborrarcliente.passwordContraseña,modelo1.cliente);
			if(prueba==1) {
				funciones.cambiarDePanel(ventana1.panelborrarcliente, ventana1.panelmenuprincipal);
				resetar();
			}
		}
		
	}

}
