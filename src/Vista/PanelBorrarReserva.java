package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

public class PanelBorrarReserva extends JPanel{
	
	public JLabel lblIntroducirDatosBorrarReserva,lblDniBorrarReserva,lblCodigoReservBorrarReserva,lblFondoBorrarReserva;
	public JFormattedTextField formattedDniBorrarReserva,formattedCodigoReserva;
	public JButton btnAtrasBorraReserva,btnBorrarBorrarReserva;
	
	public PanelBorrarReserva() {
		setBorder(new LineBorder(new Color(0, 0, 0), 4));
		setBackground(SystemColor.controlHighlight);
		setLayout(null);
		
		MaskFormatter mf = null;
		try {
			mf = new MaskFormatter("########?");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MaskFormatter mft = null;
		try {
			mft = new MaskFormatter("##");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		btnAtrasBorraReserva = new JButton("ATRAS");
		btnAtrasBorraReserva.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtrasBorraReserva.setBounds(-13, 565, 198, 48);
		add(btnAtrasBorraReserva);
		
		btnBorrarBorrarReserva = new JButton("BORRAR");
		btnBorrarBorrarReserva.setFont(new Font("Arial", Font.BOLD, 15));
		btnBorrarBorrarReserva.setBounds(738, 565, 198, 48);
		add(btnBorrarBorrarReserva);
		
		lblIntroducirDatosBorrarReserva = new JLabel("INTRODUDCA EL DNI Y EL CODIGO DE LA RESERVA");
		lblIntroducirDatosBorrarReserva.setForeground(Color.WHITE);
		lblIntroducirDatosBorrarReserva.setFont(new Font("Arial", Font.BOLD, 33));
		lblIntroducirDatosBorrarReserva.setBounds(49, 97, 838, 63);
		add(lblIntroducirDatosBorrarReserva);
		
		lblDniBorrarReserva = new JLabel("DNI:");
		lblDniBorrarReserva.setForeground(Color.WHITE);
		lblDniBorrarReserva.setFont(new Font("Arial", Font.BOLD, 15));
		lblDniBorrarReserva.setBounds(353, 266, 30, 14);
		add(lblDniBorrarReserva);
		
		formattedDniBorrarReserva = new JFormattedTextField(mf);
		formattedDniBorrarReserva.setBounds(393, 264, 111, 20);
		add(formattedDniBorrarReserva);
	
		lblCodigoReservBorrarReserva = new JLabel("CODIGO RESERVA:");
		lblCodigoReservBorrarReserva.setForeground(Color.WHITE);
		lblCodigoReservBorrarReserva.setFont(new Font("Arial", Font.BOLD, 15));
		lblCodigoReservBorrarReserva.setBounds(244, 315, 140, 14);
		add(lblCodigoReservBorrarReserva);
		
		formattedCodigoReserva = new JFormattedTextField();
		formattedCodigoReserva.setBounds(393, 313, 111, 20);
		add(formattedCodigoReserva);
		
		lblFondoBorrarReserva = new JLabel("New label");
		lblFondoBorrarReserva.setIcon(new ImageIcon("Cosas/fondo1.png"));
		lblFondoBorrarReserva.setBounds(0, 0, 924, 601);
		add(lblFondoBorrarReserva);
		
	}

}
