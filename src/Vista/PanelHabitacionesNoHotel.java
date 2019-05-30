package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class PanelHabitacionesNoHotel extends JPanel{

	public JButton btnAtrasHabitacionesNoHotel,btnContinuarHabitacionesNoHotel,btnVerDisponibilidadNoHotel;
	public JScrollPane scrollPaneHabitacionNoHotel;
	public JList listHabitacion ;
	public DefaultListModel modelo2;
	public JLabel lblHabitacionesDisponiblesNoHotel,lblFondoHabitacionesNoHotel;
	
	public PanelHabitacionesNoHotel() {
		setBorder(new LineBorder(new Color(0, 0, 0), 4));
		setBackground(SystemColor.controlHighlight);
		setLayout(null);
		
		btnAtrasHabitacionesNoHotel = new JButton("ATRAS");
		btnAtrasHabitacionesNoHotel.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtrasHabitacionesNoHotel.setBounds(-13, 565, 198, 48);
		add(btnAtrasHabitacionesNoHotel);
		
		btnContinuarHabitacionesNoHotel = new JButton("CONTINUAR");
		btnContinuarHabitacionesNoHotel.setFont(new Font("Arial", Font.BOLD, 15));
		btnContinuarHabitacionesNoHotel.setBounds(738, 565, 198, 48);
		add(btnContinuarHabitacionesNoHotel);
		btnContinuarHabitacionesNoHotel.setEnabled(false);
		
		scrollPaneHabitacionNoHotel = new JScrollPane();
		scrollPaneHabitacionNoHotel.setBounds(110, 186, 713, 210);
		add(scrollPaneHabitacionNoHotel);
		
		listHabitacion = new JList();
		scrollPaneHabitacionNoHotel.setViewportView(listHabitacion);
		modelo2 = new DefaultListModel();
		
		lblHabitacionesDisponiblesNoHotel = new JLabel("NUMERO DE HABITACIONES");
		lblHabitacionesDisponiblesNoHotel.setForeground(Color.WHITE);
		lblHabitacionesDisponiblesNoHotel.setFont(new Font("Arial", Font.BOLD, 33));
		lblHabitacionesDisponiblesNoHotel.setBounds(248, 43, 473, 90);
		add(lblHabitacionesDisponiblesNoHotel);
		
		btnVerDisponibilidadNoHotel = new JButton("VER DISPONIBILIDAD");
		btnVerDisponibilidadNoHotel.setFont(new Font("Arial", Font.BOLD, 11));
		btnVerDisponibilidadNoHotel.setBounds(372, 429, 161, 23);
		add(btnVerDisponibilidadNoHotel);
		
		
		lblFondoHabitacionesNoHotel = new JLabel("New label");
		lblFondoHabitacionesNoHotel.setIcon(new ImageIcon("Cosas/fondo1.png"));
		lblFondoHabitacionesNoHotel.setBounds(0, 0, 924, 601);
		add(lblFondoHabitacionesNoHotel);
	}
}
