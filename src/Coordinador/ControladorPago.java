package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Modelo1;
import Vista.Ventana1;

public class ControladorPago implements ActionListener{

	
	FuncionesControlador funciones = new FuncionesControlador();
	
	private Ventana1 ventana1;
	private Modelo1 model1;
	
	public ControladorPago(Ventana1 ventana1,Modelo1 model1) {
		this.ventana1=ventana1;
		this.model1=model1;
		
		ventana1.panelpago.btnPrecioAtras.addActionListener(this);
		ventana1.panelpago.btnPrecioContinuar.addActionListener(this);
		ventana1.panelpago.billete200.addActionListener(this);
		ventana1.panelpago.billete100.addActionListener(this);
		ventana1.panelpago.billete50.addActionListener(this);
		ventana1.panelpago.billete20.addActionListener(this);
		ventana1.panelpago.billete10.addActionListener(this);
		ventana1.panelpago.billete5.addActionListener(this);
		ventana1.panelpago.moneda2e.addActionListener(this);
		ventana1.panelpago.moneda1e.addActionListener(this);
		ventana1.panelpago.moneda50cent.addActionListener(this);
		ventana1.panelpago.moneda20cent.addActionListener(this);
		ventana1.panelpago.moneda10cent.addActionListener(this);
		ventana1.panelpago.moneda5cent.addActionListener(this);
		ventana1.panelpago.moneda2cent.addActionListener(this);
		ventana1.panelpago.moneda1cent.addActionListener(this);
		
	}
	public void resetear() {
		ventana1.panelpago.btnPrecioContinuar.setEnabled(false);
		ventana1.panelpago.DineroFaltante.setText("");
		ventana1.panelpago.DineroIntroducido.setText("");
		ventana1.panelpago.Vueltas.setText("");
		ventana1.panelpago.billete200.setEnabled(true);
		ventana1.panelpago.billete100.setEnabled(true);
		ventana1.panelpago.billete50.setEnabled(true);
		ventana1.panelpago.billete10.setEnabled(true);
		ventana1.panelpago.billete5.setEnabled(true);
		ventana1.panelpago.moneda2e.setEnabled(true);
		ventana1.panelpago.moneda1e.setEnabled(true);
		ventana1.panelpago.moneda50cent.setEnabled(true);
		ventana1.panelpago.moneda20cent.setEnabled(true);
		ventana1.panelpago.moneda10cent.setEnabled(true);
		ventana1.panelpago.moneda5cent.setEnabled(true);
		ventana1.panelpago.moneda2cent.setEnabled(true);
		ventana1.panelpago.moneda1cent.setEnabled(true);
		Modelo1.habitacionconcatenada="";
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource()==ventana1.panelpago.btnPrecioAtras) {
			funciones.cambiarDePanel(ventana1.panelpago, ventana1.panelmenuopcion);
			resetear();
		}
		if (arg0.getSource()==ventana1.panelpago.btnPrecioContinuar) {
			model1.modelopago.continuarpago(model1.reserva, model1.cliente, ventana1.panelticket, ventana1.panelpago, ventana1.panelticket.textReserva);
			funciones.cambiarDePanel(ventana1.panelpago, ventana1.panelticket);
			resetear();
		}
		if (arg0.getSource()==ventana1.panelpago.billete200) {
			model1.modelopago.btn200(model1.reserva, ventana1.panelpago.DineroFaltante, ventana1.panelpago.DineroIntroducido, ventana1.panelpago.Vueltas, ventana1.panelpago.btnPrecioContinuar, ventana1.panelpago.billete200, ventana1.panelpago.billete100, ventana1.panelpago.billete50, ventana1.panelpago.billete20, ventana1.panelpago.billete10, ventana1.panelpago.billete5, ventana1.panelpago.moneda2e, ventana1.panelpago.moneda1e, ventana1.panelpago.moneda50cent, ventana1.panelpago.moneda20cent, ventana1.panelpago.moneda10cent, ventana1.panelpago.moneda5cent, ventana1.panelpago.moneda2cent, ventana1.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana1.panelpago.billete100) {
			model1.modelopago.btn100(model1.reserva, ventana1.panelpago.DineroFaltante, ventana1.panelpago.DineroIntroducido, ventana1.panelpago.Vueltas, ventana1.panelpago.btnPrecioContinuar, ventana1.panelpago.billete200, ventana1.panelpago.billete100, ventana1.panelpago.billete50, ventana1.panelpago.billete20, ventana1.panelpago.billete10, ventana1.panelpago.billete5, ventana1.panelpago.moneda2e, ventana1.panelpago.moneda1e, ventana1.panelpago.moneda50cent, ventana1.panelpago.moneda20cent, ventana1.panelpago.moneda10cent, ventana1.panelpago.moneda5cent, ventana1.panelpago.moneda2cent, ventana1.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana1.panelpago.billete50) {
			model1.modelopago.btn50(model1.reserva, ventana1.panelpago.DineroFaltante, ventana1.panelpago.DineroIntroducido, ventana1.panelpago.Vueltas, ventana1.panelpago.btnPrecioContinuar, ventana1.panelpago.billete200, ventana1.panelpago.billete100, ventana1.panelpago.billete50, ventana1.panelpago.billete20, ventana1.panelpago.billete10, ventana1.panelpago.billete5, ventana1.panelpago.moneda2e, ventana1.panelpago.moneda1e, ventana1.panelpago.moneda50cent, ventana1.panelpago.moneda20cent, ventana1.panelpago.moneda10cent, ventana1.panelpago.moneda5cent, ventana1.panelpago.moneda2cent, ventana1.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana1.panelpago.billete20) {
			model1.modelopago.btn20(model1.reserva, ventana1.panelpago.DineroFaltante, ventana1.panelpago.DineroIntroducido, ventana1.panelpago.Vueltas, ventana1.panelpago.btnPrecioContinuar, ventana1.panelpago.billete200, ventana1.panelpago.billete100, ventana1.panelpago.billete50, ventana1.panelpago.billete20, ventana1.panelpago.billete10, ventana1.panelpago.billete5, ventana1.panelpago.moneda2e, ventana1.panelpago.moneda1e, ventana1.panelpago.moneda50cent, ventana1.panelpago.moneda20cent, ventana1.panelpago.moneda10cent, ventana1.panelpago.moneda5cent, ventana1.panelpago.moneda2cent, ventana1.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana1.panelpago.billete10) {
			model1.modelopago.btn10(model1.reserva, ventana1.panelpago.DineroFaltante, ventana1.panelpago.DineroIntroducido, ventana1.panelpago.Vueltas, ventana1.panelpago.btnPrecioContinuar, ventana1.panelpago.billete200, ventana1.panelpago.billete100, ventana1.panelpago.billete50, ventana1.panelpago.billete20, ventana1.panelpago.billete10, ventana1.panelpago.billete5, ventana1.panelpago.moneda2e, ventana1.panelpago.moneda1e, ventana1.panelpago.moneda50cent, ventana1.panelpago.moneda20cent, ventana1.panelpago.moneda10cent, ventana1.panelpago.moneda5cent, ventana1.panelpago.moneda2cent, ventana1.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana1.panelpago.billete5) {
			model1.modelopago.btn5(model1.reserva, ventana1.panelpago.DineroFaltante, ventana1.panelpago.DineroIntroducido, ventana1.panelpago.Vueltas, ventana1.panelpago.btnPrecioContinuar, ventana1.panelpago.billete200, ventana1.panelpago.billete100, ventana1.panelpago.billete50, ventana1.panelpago.billete20, ventana1.panelpago.billete10, ventana1.panelpago.billete5, ventana1.panelpago.moneda2e, ventana1.panelpago.moneda1e, ventana1.panelpago.moneda50cent, ventana1.panelpago.moneda20cent, ventana1.panelpago.moneda10cent, ventana1.panelpago.moneda5cent, ventana1.panelpago.moneda2cent, ventana1.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana1.panelpago.moneda2e) {
			model1.modelopago.btn2e(model1.reserva, ventana1.panelpago.DineroFaltante, ventana1.panelpago.DineroIntroducido, ventana1.panelpago.Vueltas, ventana1.panelpago.btnPrecioContinuar, ventana1.panelpago.billete200, ventana1.panelpago.billete100, ventana1.panelpago.billete50, ventana1.panelpago.billete20, ventana1.panelpago.billete10, ventana1.panelpago.billete5, ventana1.panelpago.moneda2e, ventana1.panelpago.moneda1e, ventana1.panelpago.moneda50cent, ventana1.panelpago.moneda20cent, ventana1.panelpago.moneda10cent, ventana1.panelpago.moneda5cent, ventana1.panelpago.moneda2cent, ventana1.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana1.panelpago.moneda1e) {
			model1.modelopago.btn1e(model1.reserva, ventana1.panelpago.DineroFaltante, ventana1.panelpago.DineroIntroducido, ventana1.panelpago.Vueltas, ventana1.panelpago.btnPrecioContinuar, ventana1.panelpago.billete200, ventana1.panelpago.billete100, ventana1.panelpago.billete50, ventana1.panelpago.billete20, ventana1.panelpago.billete10, ventana1.panelpago.billete5, ventana1.panelpago.moneda2e, ventana1.panelpago.moneda1e, ventana1.panelpago.moneda50cent, ventana1.panelpago.moneda20cent, ventana1.panelpago.moneda10cent, ventana1.panelpago.moneda5cent, ventana1.panelpago.moneda2cent, ventana1.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana1.panelpago.moneda50cent) {
			model1.modelopago.btn50cent(model1.reserva, ventana1.panelpago.DineroFaltante, ventana1.panelpago.DineroIntroducido, ventana1.panelpago.Vueltas, ventana1.panelpago.btnPrecioContinuar, ventana1.panelpago.billete200, ventana1.panelpago.billete100, ventana1.panelpago.billete50, ventana1.panelpago.billete20, ventana1.panelpago.billete10, ventana1.panelpago.billete5, ventana1.panelpago.moneda2e, ventana1.panelpago.moneda1e, ventana1.panelpago.moneda50cent, ventana1.panelpago.moneda20cent, ventana1.panelpago.moneda10cent, ventana1.panelpago.moneda5cent, ventana1.panelpago.moneda2cent, ventana1.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana1.panelpago.moneda20cent) {
			model1.modelopago.btn20cent(model1.reserva, ventana1.panelpago.DineroFaltante, ventana1.panelpago.DineroIntroducido, ventana1.panelpago.Vueltas, ventana1.panelpago.btnPrecioContinuar, ventana1.panelpago.billete200, ventana1.panelpago.billete100, ventana1.panelpago.billete50, ventana1.panelpago.billete20, ventana1.panelpago.billete10, ventana1.panelpago.billete5, ventana1.panelpago.moneda2e, ventana1.panelpago.moneda1e, ventana1.panelpago.moneda50cent, ventana1.panelpago.moneda20cent, ventana1.panelpago.moneda10cent, ventana1.panelpago.moneda5cent, ventana1.panelpago.moneda2cent, ventana1.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana1.panelpago.moneda10cent) {
			model1.modelopago.btn10cent(model1.reserva, ventana1.panelpago.DineroFaltante, ventana1.panelpago.DineroIntroducido, ventana1.panelpago.Vueltas, ventana1.panelpago.btnPrecioContinuar, ventana1.panelpago.billete200, ventana1.panelpago.billete100, ventana1.panelpago.billete50, ventana1.panelpago.billete20, ventana1.panelpago.billete10, ventana1.panelpago.billete5, ventana1.panelpago.moneda2e, ventana1.panelpago.moneda1e, ventana1.panelpago.moneda50cent, ventana1.panelpago.moneda20cent, ventana1.panelpago.moneda10cent, ventana1.panelpago.moneda5cent, ventana1.panelpago.moneda2cent, ventana1.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana1.panelpago.moneda5cent) {
			model1.modelopago.btn5cent(model1.reserva, ventana1.panelpago.DineroFaltante, ventana1.panelpago.DineroIntroducido, ventana1.panelpago.Vueltas, ventana1.panelpago.btnPrecioContinuar, ventana1.panelpago.billete200, ventana1.panelpago.billete100, ventana1.panelpago.billete50, ventana1.panelpago.billete20, ventana1.panelpago.billete10, ventana1.panelpago.billete5, ventana1.panelpago.moneda2e, ventana1.panelpago.moneda1e, ventana1.panelpago.moneda50cent, ventana1.panelpago.moneda20cent, ventana1.panelpago.moneda10cent, ventana1.panelpago.moneda5cent, ventana1.panelpago.moneda2cent, ventana1.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana1.panelpago.moneda2cent) {
			model1.modelopago.btn2cent(model1.reserva, ventana1.panelpago.DineroFaltante, ventana1.panelpago.DineroIntroducido, ventana1.panelpago.Vueltas, ventana1.panelpago.btnPrecioContinuar, ventana1.panelpago.billete200, ventana1.panelpago.billete100, ventana1.panelpago.billete50, ventana1.panelpago.billete20, ventana1.panelpago.billete10, ventana1.panelpago.billete5, ventana1.panelpago.moneda2e, ventana1.panelpago.moneda1e, ventana1.panelpago.moneda50cent, ventana1.panelpago.moneda20cent, ventana1.panelpago.moneda10cent, ventana1.panelpago.moneda5cent, ventana1.panelpago.moneda2cent, ventana1.panelpago.moneda1cent);
		}
		if (arg0.getSource()==ventana1.panelpago.moneda1cent) {
			model1.modelopago.btn1cent(model1.reserva, ventana1.panelpago.DineroFaltante, ventana1.panelpago.DineroIntroducido, ventana1.panelpago.Vueltas, ventana1.panelpago.btnPrecioContinuar, ventana1.panelpago.billete200, ventana1.panelpago.billete100, ventana1.panelpago.billete50, ventana1.panelpago.billete20, ventana1.panelpago.billete10, ventana1.panelpago.billete5, ventana1.panelpago.moneda2e, ventana1.panelpago.moneda1e, ventana1.panelpago.moneda50cent, ventana1.panelpago.moneda20cent, ventana1.panelpago.moneda10cent, ventana1.panelpago.moneda5cent, ventana1.panelpago.moneda2cent, ventana1.panelpago.moneda1cent);
		}
		
	}
}
