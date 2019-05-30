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

public class PanelLogin extends JPanel{

	public JLabel lblDni,lblContraseña,lblNewLabel,lbFondoLogin;
	public JFormattedTextField formatteddni;
	public JPasswordField passworContraseña;
	public JButton btnRegistrarse,btnAtrasLogin,btnContinuarLogin;
	
	public PanelLogin() {
		setBorder(new LineBorder(new Color(0, 0, 0), 4));
		setBackground(SystemColor.controlHighlight);
		setLayout(null);
		
		lblDni = new JLabel("DNI: ");
		lblDni.setForeground(Color.WHITE);
		lblDni.setFont(new Font("Arial", Font.BOLD, 15));
		lblDni.setBounds(348, 257, 41, 14);
		add(lblDni);
		
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
		
		formatteddni = new JFormattedTextField(mf);
		formatteddni.setBounds(399, 255, 122, 20);
		add(formatteddni);
		
		lblContraseña = new JLabel("CONTRASEÑA: ");
		lblContraseña.setForeground(Color.WHITE);
		lblContraseña.setFont(new Font("Arial", Font.BOLD, 15));
		lblContraseña.setBounds(267, 301, 122, 14);
		add(lblContraseña);
		
		passworContraseña = new JPasswordField();
		passworContraseña.setBounds(399, 299, 122, 20);
		add(passworContraseña);
		
		lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 37));
		lblNewLabel.setBounds(407, 82, 122, 64);
		add(lblNewLabel);
		
		btnRegistrarse = new JButton("REGISTRASRSE");
		btnRegistrarse.setFont(new Font("Arial", Font.BOLD, 15));
		btnRegistrarse.setBounds(373, 565, 198, 48);
		add(btnRegistrarse);
		
		btnAtrasLogin = new JButton("ATRAS");
		btnAtrasLogin.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtrasLogin.setBounds(-13, 565, 198, 48);
		add(btnAtrasLogin);
		
		btnContinuarLogin = new JButton("CONTINUAR");
		btnContinuarLogin.setFont(new Font("Arial", Font.BOLD, 15));
		btnContinuarLogin.setBounds(738, 565, 198, 48);
		add(btnContinuarLogin);
		
		
		lbFondoLogin = new JLabel("New label");
		lbFondoLogin.setIcon(new ImageIcon("Cosas/fondo1.png"));
		lbFondoLogin.setBounds(0, 0, 924, 601);
		add(lbFondoLogin);
		
	}
		
}
