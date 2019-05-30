package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Modelo1;
import Vista.Ventana1;

public class ControladorBorrarReserva  implements ActionListener{
	
	FuncionesControlador funciones = new FuncionesControlador();
	
	private Ventana1 ventana1;
	private Modelo1 modelo1;
	
	public ControladorBorrarReserva(Ventana1 ventana1,Modelo1 modelo1) {
		this.ventana1=ventana1;
		this.modelo1=modelo1;
		
		
		ventana1.panelborrarreserva.btnAtrasBorraReserva.addActionListener(this);
		ventana1.panelborrarreserva.btnBorrarBorrarReserva.addActionListener(this);
	}
	
	public void resetar() {
		ventana1.panelborrarreserva.formattedDniBorrarReserva.setText("");
		ventana1.panelborrarreserva.formattedCodigoReserva.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==ventana1.panelborrarreserva.btnAtrasBorraReserva) {
			funciones.cambiarDePanel(ventana1.panelborrarreserva, ventana1.panelmenuprincipal);
			resetar();
		}
		if (e.getSource()==ventana1.panelborrarreserva.btnBorrarBorrarReserva) {
			int prueba=modelo1.modeloborrarreserva.botonborrarreserva(ventana1.panelborrarreserva.formattedDniBorrarReserva, ventana1.panelborrarreserva.formattedCodigoReserva);
			if(prueba==1) {
				funciones.cambiarDePanel(ventana1.panelborrarreserva, ventana1.panelmenuprincipal);
				resetar();
			}
			
		}
		
	}
	
}
