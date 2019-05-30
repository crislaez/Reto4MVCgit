package Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Modelo.Apartamento;
import Modelo.Casa;
import Modelo.Hotel;
import Modelo.Metodos2;
import Modelo.Modelo1;
import Vista.Ventana1;

public class ControladorMenuOpcion implements ActionListener, MouseListener{
	
	FuncionesControlador funciones = new FuncionesControlador();
	
	private Ventana1 ventana1;
	private Modelo1 model1;
	//Metodos2 metodos= new Metodos2();
	
	public ControladorMenuOpcion(Ventana1 ventana1,Modelo1 model1) {
		this.ventana1=ventana1;
		this.model1=model1;
			
		ventana1.panelmenuopcion.btnBuscar.addActionListener(this);
		ventana1.panelmenuopcion.btnMenuOpcionAtras.addActionListener(this);
		ventana1.panelmenuopcion.dateFechaIda.getCalendarButton().addActionListener(this);
		ventana1.panelmenuopcion.dateFechaVuelta.getCalendarButton().addActionListener(this);
		ventana1.panelmenuopcion.btnContinuarMenunOpcion.addActionListener(this);
		ventana1.panelmenuopcion.listAlojamientos.getSelectedIndex();
	
		ventana1.panelmenuopcion.rdbtnHotel.addActionListener(this);
		ventana1.panelmenuopcion.rdbtnCasa.addActionListener(this);
		ventana1.panelmenuopcion.rdbtnApartamento.addActionListener(this);
		
		ventana1.panelmenuopcion.rdbtnWIFI.addActionListener(this);
		ventana1.panelmenuopcion.rdbtnPiscina.addActionListener(this);
		ventana1.panelmenuopcion.rdbtnSpa.addActionListener(this);
		ventana1.panelmenuopcion.rdbtnParking.addActionListener(this);
		ventana1.panelmenuopcion.rdbtnAireAcondicionado.addActionListener(this);
		ventana1.panelmenuopcion.rdbtnRestaurante.addActionListener(this);
		ventana1.panelmenuopcion.rdbtnBar.addActionListener(this);
		ventana1.panelmenuopcion.rdbtnGym.addActionListener(this);
		ventana1.panelmenuopcion.listAlojamientos.addMouseListener(this);
		
		ventana1.panelmenuopcion.chckbxordenarprecio.addActionListener(this);
		ventana1.panelmenuopcion.chckbxordenarpopularidad.addActionListener(this);
		ventana1.panelmenuopcion.chckbxestrellas.addActionListener(this);
		
		ventana1.panelmenuopcion.comboboxpension.addActionListener(this);
	}

	public void resetar() {
		ventana1.panelmenuopcion.textUbicacion.setText("");
		ventana1.panelmenuopcion.modelo3.removeAllElements();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==ventana1.panelmenuopcion.btnContinuarMenunOpcion) {
			if(Modelo1.contador==1) {
				funciones.cambiarDePanel(ventana1.panelmenuopcion, ventana1.panelhabitaciones);
				resetar();
			}
			else if(Modelo1.contador==2) {
				funciones.cambiarDePanel(ventana1.panelmenuopcion, ventana1.panelhabitacionesnohotel);
				model1.modelomenuopcion.buscarhabitacioncasa(model1.reserva, ventana1.panelhabitacionesnohotel.listHabitacion, ventana1.panelhabitacionesnohotel.modelo2);
				resetar();
			}
			else if(Modelo1.contador==3) {
				funciones.cambiarDePanel(ventana1.panelmenuopcion, ventana1.panelhabitacionesnohotel);
				model1.modelomenuopcion.buscarhabitacionapartamento(model1.reserva, ventana1.panelhabitacionesnohotel.listHabitacion, ventana1.panelhabitacionesnohotel.modelo2);
				resetar();
			}
			
			
			
		}
		if (e.getSource()==ventana1.panelmenuopcion.btnMenuOpcionAtras) {
			funciones.cambiarDePanel(ventana1.panelmenuopcion, ventana1.panelmenuprincipal);
			
		}
		if (e.getSource()==ventana1.panelmenuopcion.btnBuscar) {
			ventana1.panelmenuopcion.modelo3.removeAllElements();
			model1.modelomenuopcion.btnbuscar(ventana1.panelmenuopcion.comboBoxPersonas, model1.reserva, ventana1.panelmenuopcion.rdbtnHotel, ventana1.panelmenuopcion.rdbtnCasa, ventana1.panelmenuopcion.rdbtnApartamento, ventana1.panelmenuopcion.dateFechaIda, ventana1.panelmenuopcion.dateFechaVuelta, ventana1.panelmenuopcion.textUbicacion, ventana1.panelmenuopcion.textCodigoDescuento, ventana1.panelmenuopcion.lblError,ventana1.panelmenuopcion.listAlojamientos,ventana1.panelmenuopcion.modelo3);
			System.out.println("btnbuscar");//model1.modelomenuopcion.rdtbapartamento(ventana1.panelmenuopcion.rdbtnHotel, ventana1.panelmenuopcion.rdbtnCasa, ventana1.panelmenuopcion.rdbtnApartamento,ventana1.panelmenuopcion.opcion);
		}
		if (e.getSource()==ventana1.panelmenuopcion.dateFechaIda.getCalendarButton()) {
			//funciones.cambiarDePanel(ventana1.panelmenuopcion, ventana1.panelmenuprincipal);
			model1.metodos.diasatras(ventana1.panelmenuopcion.dateFechaIda, ventana1.panelmenuopcion.dateFechaVuelta);
		}
		if (e.getSource()==ventana1.panelmenuopcion.dateFechaVuelta.getCalendarButton()) {
			//funciones.cambiarDePanel(ventana1.panelmenuopcion, ventana1.panelmenuprincipal);
			model1.metodos.diasadelante(ventana1.panelmenuopcion.dateFechaIda,ventana1.panelmenuopcion.dateFechaVuelta);
		}
		//-
		if (e.getSource()==ventana1.panelmenuopcion.rdbtnHotel) {
			model1.modelomenuopcion.rdbthotel(ventana1.panelmenuopcion.rdbtnHotel, ventana1.panelmenuopcion.rdbtnCasa, ventana1.panelmenuopcion.rdbtnApartamento,ventana1.panelmenuopcion.modelo3,ventana1.panelmenuopcion.comboboxpension,ventana1.panelmenuopcion.chckbxestrellas);
			ventana1.panelmenuopcion.modelo3.clear();
		}
		if (e.getSource()==ventana1.panelmenuopcion.rdbtnCasa) {
			model1.modelomenuopcion.rdtbcasa(ventana1.panelmenuopcion.rdbtnHotel, ventana1.panelmenuopcion.rdbtnCasa, ventana1.panelmenuopcion.rdbtnApartamento,ventana1.panelmenuopcion.modelo3,ventana1.panelmenuopcion.comboboxpension);
			ventana1.panelmenuopcion.modelo3.clear();
		}
		if (e.getSource()==ventana1.panelmenuopcion.rdbtnApartamento) {
			model1.modelomenuopcion.rdtbapartamento(ventana1.panelmenuopcion.rdbtnHotel, ventana1.panelmenuopcion.rdbtnCasa, ventana1.panelmenuopcion.rdbtnApartamento,ventana1.panelmenuopcion.modelo3,ventana1.panelmenuopcion.comboboxpension);
			ventana1.panelmenuopcion.modelo3.clear();
		}
		//-
			
		if (e.getSource()==ventana1.panelmenuopcion.rdbtnWIFI) {
			model1.modelomenuopcion.rdbtwifi(ventana1.panelmenuopcion.rdbtnWIFI);
		}
		if (e.getSource()==ventana1.panelmenuopcion.rdbtnPiscina) {
			model1.modelomenuopcion.rdbtpiscina(ventana1.panelmenuopcion.rdbtnPiscina);
		}
		if (e.getSource()==ventana1.panelmenuopcion.rdbtnSpa) {
			model1.modelomenuopcion.rdbtspa(ventana1.panelmenuopcion.rdbtnSpa);
		}
		if (e.getSource()==ventana1.panelmenuopcion.rdbtnParking) {
			model1.modelomenuopcion.rdbtparking(ventana1.panelmenuopcion.rdbtnParking);
		}
		if (e.getSource()==ventana1.panelmenuopcion.rdbtnAireAcondicionado) {
			model1.modelomenuopcion.rdbtac(ventana1.panelmenuopcion.rdbtnAireAcondicionado);
		}
		if (e.getSource()==ventana1.panelmenuopcion.rdbtnRestaurante) {
			model1.modelomenuopcion.rdbtrestaurante(ventana1.panelmenuopcion.rdbtnRestaurante);
		}
		if (e.getSource()==ventana1.panelmenuopcion.rdbtnBar) {
			model1.modelomenuopcion.rdbtbar(ventana1.panelmenuopcion.rdbtnBar);
		}
		if (e.getSource()==ventana1.panelmenuopcion.rdbtnGym) {
			model1.modelomenuopcion.rdbtgym(ventana1.panelmenuopcion.rdbtnGym);
		}
		if (e.getSource()==ventana1.panelmenuopcion.chckbxordenarprecio) {
			model1.modelomenuopcion.ordenprecio(ventana1.panelmenuopcion.chckbxordenarprecio,ventana1.panelmenuopcion.chckbxordenarpopularidad,ventana1.panelmenuopcion.chckbxestrellas);
		}
		if (e.getSource()==ventana1.panelmenuopcion.chckbxordenarpopularidad) {
			model1.modelomenuopcion.ordenpopularidad(ventana1.panelmenuopcion.chckbxordenarpopularidad,ventana1.panelmenuopcion.chckbxordenarprecio,ventana1.panelmenuopcion.chckbxestrellas);
		}
		if (e.getSource()==ventana1.panelmenuopcion.comboboxpension) {
			model1.modelomenuopcion.combopension(ventana1.panelmenuopcion.comboboxpension);
		}
		if (e.getSource()==ventana1.panelmenuopcion.chckbxestrellas) {
			model1.modelomenuopcion.ordenestrellas(ventana1.panelmenuopcion.chckbxordenarprecio, ventana1.panelmenuopcion.chckbxordenarpopularidad, ventana1.panelmenuopcion.chckbxestrellas);
		}
			
			
		
	}
	//---------------------------------------------------------------------------------

  
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		try {
			ventana1.panelmenuopcion.btnContinuarMenunOpcion.setEnabled(true);
			Modelo1.codigo= (String) ventana1.panelmenuopcion.listAlojamientos.getSelectedValue();
		
			model1.modelomenuopcion.codigo(Modelo1.cadena, Modelo1.codigo, Modelo1.codigos, model1.reserva,ventana1.panelmenuopcion.dateFechaIda, ventana1.panelmenuopcion.dateFechaVuelta,ventana1.panelpago.DineroFaltante);
			model1.modelomenuopcion.fechas(ventana1.panelmenuopcion.dateFechaIda, ventana1.panelmenuopcion.dateFechaVuelta, model1.reserva);
		}catch(NullPointerException e) {
			System.out.println("NullPointerException corregido");
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
