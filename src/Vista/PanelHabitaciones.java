package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

import Modelo.Alojamiento;
import Modelo.Habitacion;
import Modelo.Modelo1;

public class PanelHabitaciones extends JPanel{
	
	
	public JLabel lblescogerHotelHabitaciones,lblCamas,lblFonfoHabitaciones;
	public JScrollPane scrollpaneHabitacions,scrollPaneCamas;
	public JButton btnAtrasHabitacions,btnBuscarReservasHabitaciones,btnContinuarHabitaciones,btnMostrarHabitacion;
	public JList listCamas,listHabitacion;
	public DefaultListModel modelo3,modelo2;
	//public JButton boton3[] = new JButton[Modelo1.habitacion.size()];
	
	public PanelHabitaciones() {
		setBorder(new LineBorder(new Color(0, 0, 0), 4));
		setBackground(SystemColor.controlHighlight);
		setLayout(null);
		
		lblescogerHotelHabitaciones = new JLabel("SELECCIONE LA HABITACION");
		lblescogerHotelHabitaciones.setForeground(Color.WHITE);
		lblescogerHotelHabitaciones.setFont(new Font("Arial", Font.BOLD, 33));
		lblescogerHotelHabitaciones.setBounds(199, 21, 495, 58);
		add(lblescogerHotelHabitaciones);
		
		scrollpaneHabitacions = new JScrollPane();
		scrollpaneHabitacions.setBounds(10, 90, 904, 185);
		add(scrollpaneHabitacions);
		
		listHabitacion = new JList();
		scrollpaneHabitacions.setViewportView(listHabitacion);
		modelo2 = new DefaultListModel();
		
		btnAtrasHabitacions = new JButton("ATRAS");
		btnAtrasHabitacions.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtrasHabitacions.setBounds(-13, 565, 198, 48);
		add(btnAtrasHabitacions);
		
		btnBuscarReservasHabitaciones = new JButton("VER DISPONIBILIDAD");
		btnBuscarReservasHabitaciones.setFont(new Font("Arial", Font.BOLD, 11));
		btnBuscarReservasHabitaciones.setBounds(355, 289, 169, 23);
		add(btnBuscarReservasHabitaciones);
		btnBuscarReservasHabitaciones.setEnabled(false);
		
		scrollPaneCamas = new JScrollPane();
		scrollPaneCamas.setBounds(10, 411, 904, 120);
		add(scrollPaneCamas);
		
		listCamas = new JList();
		scrollPaneCamas.setViewportView(listCamas);
		modelo3 = new DefaultListModel();
		
		btnContinuarHabitaciones = new JButton("CONTINUAR");
		btnContinuarHabitaciones.setFont(new Font("Arial", Font.BOLD, 15));
		btnContinuarHabitaciones.setBounds(738, 565, 198, 48);
		add(btnContinuarHabitaciones);
		btnContinuarHabitaciones.setEnabled(false);
		
		lblCamas = new JLabel("CAMAS");
		lblCamas.setForeground(Color.WHITE);
		lblCamas.setFont(new Font("Arial", Font.BOLD, 23));
		lblCamas.setBounds(393, 342, 96, 58);
		add(lblCamas);
		
		btnMostrarHabitacion = new JButton("HABITACION");
		btnMostrarHabitacion.setFont(new Font("Arial", Font.BOLD, 15));
		btnMostrarHabitacion.setBounds(10, 47, 135, 23);
		add(btnMostrarHabitacion);
		
		lblFonfoHabitaciones = new JLabel("New label");
		lblFonfoHabitaciones.setIcon(new ImageIcon("Cosas/fondo1.png"));
		lblFonfoHabitaciones.setBounds(0, 0, 924, 601);
		add(lblFonfoHabitaciones);
		
	
	
		
	}
}
