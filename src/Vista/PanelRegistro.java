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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

public class PanelRegistro extends JPanel{

		public JLabel lblRegistroRegistro,lblDniRegistro,lblNombreRegistro,lblApellidoRegistro,lblEdadRegistro;
		public JLabel lblSexoRegistro,lblContraseñaRegistro,lblNewLabel_1;
		public JFormattedTextField formattedDniRegistro,formattedEdadRegistro;
		public JTextField textNombreRegistro,textApellidoRegistro;
		public JPasswordField passwordContraseñaRegistro;
		public JRadioButton rdbtnHombreRegistro,rdbtnMujerRegistro;
		public JButton btnAtrasRegistro,btnIngresarRegistro;
		
		public PanelRegistro() {
				
			setBorder(new LineBorder(new Color(0, 0, 0), 4));
			setBackground(SystemColor.controlHighlight);
			setLayout(null);
			
			lblRegistroRegistro = new JLabel("REGISTRO");
			lblRegistroRegistro.setForeground(Color.WHITE);
			lblRegistroRegistro.setFont(new Font("Arial", Font.BOLD, 37));
			lblRegistroRegistro.setBounds(353, 82, 207, 64);
			add(lblRegistroRegistro);
			
			lblDniRegistro = new JLabel("DNI:");
			lblDniRegistro.setForeground(Color.WHITE);
			lblDniRegistro.setFont(new Font("Arial", Font.BOLD, 15));
			lblDniRegistro.setBounds(334, 237, 46, 14);
			add(lblDniRegistro);
			
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
			
			formattedDniRegistro = new JFormattedTextField(mf);
			formattedDniRegistro.setBounds(405, 235, 104, 20);
			add(formattedDniRegistro);
			
			lblNombreRegistro = new JLabel("NOMBRE:");
			lblNombreRegistro.setForeground(Color.WHITE);
			lblNombreRegistro.setFont(new Font("Arial", Font.BOLD, 15));
			lblNombreRegistro.setBounds(299, 274, 81, 14);
			add(lblNombreRegistro);
			
			textNombreRegistro = new JTextField();
			textNombreRegistro.setBounds(405, 272, 104, 20);
			add(textNombreRegistro);
			textNombreRegistro.setColumns(10);
			
			lblApellidoRegistro = new JLabel("APELLIDO:");
			lblApellidoRegistro.setForeground(Color.WHITE);
			lblApellidoRegistro.setFont(new Font("Arial", Font.BOLD, 15));
			lblApellidoRegistro.setBounds(287, 325, 93, 14);
			add(lblApellidoRegistro);
			
			textApellidoRegistro = new JTextField();
			textApellidoRegistro.setBounds(405, 323, 104, 20);
			add(textApellidoRegistro);
			textApellidoRegistro.setColumns(10);
			
			lblEdadRegistro = new JLabel("EDAD:");
			lblEdadRegistro.setForeground(Color.WHITE);
			lblEdadRegistro.setFont(new Font("Arial", Font.BOLD, 15));
			lblEdadRegistro.setBounds(321, 375, 59, 14);
			add(lblEdadRegistro);
			
			formattedEdadRegistro = new JFormattedTextField(mft);
			formattedEdadRegistro.setBounds(405, 373, 104, 20);
			add(formattedEdadRegistro);
			
			lblSexoRegistro = new JLabel("SEXO:");
			lblSexoRegistro.setForeground(Color.WHITE);
			lblSexoRegistro.setFont(new Font("Arial", Font.BOLD, 15));
			lblSexoRegistro.setBounds(321, 420, 59, 14);
			add(lblSexoRegistro);
			
			rdbtnHombreRegistro = new JRadioButton("Hombre");
			rdbtnHombreRegistro.setFont(new Font("Arial", Font.BOLD, 15));
			rdbtnHombreRegistro.setBounds(405, 411, 93, 23);
			add(rdbtnHombreRegistro);
			
			rdbtnMujerRegistro = new JRadioButton("Mujer");
			rdbtnMujerRegistro.setFont(new Font("Arial", Font.BOLD, 15));
			rdbtnMujerRegistro.setBounds(511, 411, 81, 23);
			add(rdbtnMujerRegistro);
			
			lblContraseñaRegistro = new JLabel("CONTRASE\u00D1A:");
			lblContraseñaRegistro.setForeground(Color.WHITE);
			lblContraseñaRegistro.setFont(new Font("Arial", Font.BOLD, 15));
			lblContraseñaRegistro.setBounds(258, 469, 122, 14);
			add(lblContraseñaRegistro);
			
			passwordContraseñaRegistro = new JPasswordField();
			passwordContraseñaRegistro.setBounds(405, 467, 104, 20);
			add(passwordContraseñaRegistro);
			
			btnAtrasRegistro = new JButton("ATRAS");
			btnAtrasRegistro.setFont(new Font("Arial", Font.BOLD, 15));
			btnAtrasRegistro.setBounds(-13, 565, 198, 48);
			add(btnAtrasRegistro);
			
			btnIngresarRegistro = new JButton("INGRESAR");
			btnIngresarRegistro.setFont(new Font("Arial", Font.BOLD, 15));
			btnIngresarRegistro.setBounds(738, 565, 198, 48);
			add(btnIngresarRegistro);
			
			lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setIcon(new ImageIcon("Cosas/fondo1.png"));
			lblNewLabel_1.setBounds(0, 0, 924, 601);
			add(lblNewLabel_1);
			
			
		}
}
