package Vista;

import java.awt.CardLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;


public class Ventana1 extends JFrame{
 
	private JPanel contentPane;
	
	public PanelBienvenida panelbienvenida;
	public PanelMenuPrincipal panelmenuprincipal;
	public PanelBorrarCliente panelborrarcliente;
	public PanelBorrarReserva panelborrarreserva;
	public PanelMenuOpcion panelmenuopcion;
	public PanelHabitaciones panelhabitaciones;
	public PanelLogin panellogin;
	public PanelHabitacionesNoHotel panelhabitacionesnohotel;
	public PanelRegistro panelregistro;
	public PanelBasesLegales panelbaseslegales;
	public PanelPago panelpago;
	public PanelTicket panelticket;

	
	public Ventana1() {
	//tamaño del Jpanel contenpane
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 950, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		//instanciar Bienvenida
		panelbienvenida= new PanelBienvenida();
		contentPane.add(panelbienvenida);
		panelbienvenida.setLayout(null);;
		
		//instanciar menubienvenida
		panelmenuprincipal=new PanelMenuPrincipal();
		contentPane.add(panelmenuprincipal);
		panelmenuprincipal.setLayout(null);
		
		//instanciar borrar cliente
		panelborrarcliente=new PanelBorrarCliente();
		contentPane.add(panelborrarcliente);
		panelborrarcliente.setLayout(null);
		
		//instanciar borrar reserva
		panelborrarreserva=new PanelBorrarReserva();
		contentPane.add(panelborrarreserva);
		panelborrarreserva.setLayout(null);
			
		//instanciar menu opcion
		panelmenuopcion=new PanelMenuOpcion();
		contentPane.add(panelmenuopcion);
		panelmenuopcion.setLayout(null);
						
		//instanciar menu habitaciones
		panelhabitaciones=new PanelHabitaciones();
		contentPane.add(panelhabitaciones);
		panelhabitaciones.setLayout(null);
		
		//instanciar menu login
		panellogin=new PanelLogin();
		contentPane.add(panellogin);
		panellogin.setLayout(null);
		
		//instanciar menu habitacionesnohotel
		panelhabitacionesnohotel=new PanelHabitacionesNoHotel();
		contentPane.add(panelhabitacionesnohotel);
		panelhabitacionesnohotel.setLayout(null);
		
		//instanciar menu registro
		panelregistro=new PanelRegistro();
		contentPane.add(panelregistro);
		panelregistro.setLayout(null);
		
		//instanciar menu bases legales
		panelbaseslegales=new PanelBasesLegales();
		contentPane.add(panelbaseslegales);
		panelbaseslegales.setLayout(null);
		
		//instanciar menu pago
		panelpago=new PanelPago();
		contentPane.add(panelpago);
		panelpago.setLayout(null);
		
		//instanciar menu ticket
		panelticket=new PanelTicket();
		contentPane.add(panelticket);
		panelticket.setLayout(null);
				
	}
}
