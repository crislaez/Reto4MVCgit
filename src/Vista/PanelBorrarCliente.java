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

public class PanelBorrarCliente extends JPanel{
	
	public JLabel lblDniBorrarCliente,lblContrasellaBorrarCLiente,lblIntroducirDatosBorrarCliente,lblFondoBorrarCliente;
	public JFormattedTextField formattedDniBorrarCliente;
	public JPasswordField passwordContraseña;
	public JButton btnAtrasBorrarTicket,btnBorrarBorrarCliente;
	
	public PanelBorrarCliente() {
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
		
			
		lblDniBorrarCliente = new JLabel("DNI:");
		lblDniBorrarCliente.setForeground(Color.WHITE);
		lblDniBorrarCliente.setFont(new Font("Arial", Font.BOLD, 15));
		lblDniBorrarCliente.setBounds(351, 262, 30, 14);
		add(lblDniBorrarCliente);
		
		formattedDniBorrarCliente = new JFormattedTextField(mf);
		formattedDniBorrarCliente.setBounds(402, 260, 125, 20);
		add(formattedDniBorrarCliente);
		
		lblContrasellaBorrarCLiente = new JLabel("CONTRASEÑA:");
		lblContrasellaBorrarCLiente.setForeground(Color.WHITE);
		lblContrasellaBorrarCLiente.setFont(new Font("Arial", Font.BOLD, 15));
		lblContrasellaBorrarCLiente.setBounds(284, 316, 108, 14);
		add(lblContrasellaBorrarCLiente);
		
		passwordContraseña = new JPasswordField();
		passwordContraseña.setBounds(402, 314, 125, 20);
		add(passwordContraseña);
		
		btnAtrasBorrarTicket = new JButton("ATRAS");
		btnAtrasBorrarTicket.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtrasBorrarTicket.setBounds(-13, 565, 198, 48);
		add(btnAtrasBorrarTicket);
		
		btnBorrarBorrarCliente = new JButton("BORRAR");
		btnBorrarBorrarCliente.setFont(new Font("Arial", Font.BOLD, 15));
		btnBorrarBorrarCliente.setBounds(738, 565, 198, 48);
		add(btnBorrarBorrarCliente);
		
		lblIntroducirDatosBorrarCliente = new JLabel("INTRODUDCA EL DNI Y LA CONTRASE\u00D1A");
		lblIntroducirDatosBorrarCliente.setForeground(Color.WHITE);
		lblIntroducirDatosBorrarCliente.setFont(new Font("Arial", Font.BOLD, 33));
		lblIntroducirDatosBorrarCliente.setBounds(143, 100, 684, 82);
		add(lblIntroducirDatosBorrarCliente);
		
		lblFondoBorrarCliente = new JLabel("New label");
		lblFondoBorrarCliente.setIcon(new ImageIcon("Cosas/fondo1.png"));
		lblFondoBorrarCliente.setBounds(0, 0, 924, 601);
		add(lblFondoBorrarCliente);
	}

}
