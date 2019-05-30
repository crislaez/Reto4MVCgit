package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class PanelPago extends JPanel{

	public JLabel lblDineroFaltante,lblDineroIntroducido,lblVueltas,lblPrecio;
	public JButton btnPrecioAtras,btnPrecioContinuar;
	public JButton billete200,billete100,billete50,billete20,billete10,billete5;
	public JButton moneda2e,moneda1e,moneda50cent,moneda20cent,moneda10cent,moneda5cent,moneda2cent,moneda1cent;
	public JTextField DineroIntroducido,DineroFaltante,Vueltas;
	
	public PanelPago() {
		setBorder(new LineBorder(new Color(0, 0, 0), 4));
		setBackground(SystemColor.controlHighlight);
		setLayout(null);
		
		lblDineroFaltante = new JLabel("PRECIO HOTEL:");
		lblDineroFaltante.setForeground(Color.WHITE);
		lblDineroFaltante.setFont(new Font("Arial", Font.BOLD, 15));
		lblDineroFaltante.setBounds(525, 327, 127, 16);
		add(lblDineroFaltante);
		
		lblDineroIntroducido = new JLabel("DINERO INTRODUCIDO:");
		lblDineroIntroducido.setForeground(Color.WHITE);
		lblDineroIntroducido.setFont(new Font("Arial", Font.BOLD, 15));
		lblDineroIntroducido.setBounds(471, 364, 180, 16);
		add(lblDineroIntroducido);
		
		lblVueltas = new JLabel("VUELTAS:");
		lblVueltas.setForeground(Color.WHITE);
		lblVueltas.setFont(new Font("Arial", Font.BOLD, 15));
		lblVueltas.setBounds(568, 404, 84, 14);
		add(lblVueltas);
		
		btnPrecioAtras = new JButton("ATRAS");
		btnPrecioAtras.setFont(new Font("Arial", Font.BOLD, 15));
		btnPrecioAtras.setBounds(-13, 565, 198, 48);
		add(btnPrecioAtras);
		
		btnPrecioContinuar = new JButton("CONTINUAR");
		btnPrecioContinuar.setFont(new Font("Arial", Font.BOLD, 15));
		btnPrecioContinuar.setBounds(738, 565, 198, 48);
		add(btnPrecioContinuar);
		btnPrecioContinuar.setEnabled(false);
		
		DineroIntroducido = new JTextField();
		DineroIntroducido.setHorizontalAlignment(SwingConstants.RIGHT);
		DineroIntroducido.setEditable(false);
		DineroIntroducido.setColumns(10);
		DineroIntroducido.setBounds(694, 360, 101, 26);
		add(DineroIntroducido);
		
		DineroFaltante = new JTextField();
		DineroFaltante.setBounds(694, 323, 101, 26);
		add(DineroFaltante);
		DineroFaltante.setColumns(10);
		
		Vueltas = new JTextField();
		Vueltas.setBounds(694, 402, 101, 26);
		add(Vueltas);
		Vueltas.setColumns(10);
		
		billete200 = new JButton();
		billete200.setText("200\u20AC");
		billete100 = new JButton();
		billete100.setText("100\u20AC");
		billete50 = new JButton();
		billete50.setText("50\u20AC");
		billete20 = new JButton();
		billete20.setText("20\u20AC");
		billete10 = new JButton();
		billete10.setText("10\u20AC");
		billete5 = new JButton();
		billete5.setText("5\u20AC");
		moneda2e = new JButton();
		moneda2e.setText("2\u20AC");
		moneda1e = new JButton();
		moneda1e.setText("1\u20AC");
		moneda50cent = new JButton();
		moneda50cent.setText("50cent");
		moneda20cent = new JButton();
		moneda20cent.setText("20cent");
		moneda10cent = new JButton();
		moneda10cent.setText("10cent");
		moneda5cent = new JButton();
		moneda5cent.setText("5cent");
		moneda2cent = new JButton();
		moneda2cent.setText("2cent");
		moneda1cent = new JButton();
		moneda1cent.setText("1cent");
		
		billete200.setActionCommand("200.00");
		billete100.setActionCommand("100.00");
		billete50.setActionCommand("50.00");
		billete20.setActionCommand("20.00");
		billete10.setActionCommand("10.00");
		billete5.setActionCommand("5.00");
		moneda2e.setActionCommand("2.00");
		moneda1e.setActionCommand("1.00");
		moneda50cent.setActionCommand("0.500");
		moneda20cent.setActionCommand("0.200");
		moneda10cent.setActionCommand("0.100");
		moneda5cent.setActionCommand("0.0500");
		moneda2cent.setActionCommand("0.0200");
		moneda1cent.setActionCommand("0.0100");
		
		
		billete200.setFont(new Font("Arial", Font.BOLD, 20));
		billete200.setBounds(52, 65, 106, 39);
		add(billete200);
		
		
		billete100.setFont(new Font("Arial", Font.BOLD, 20));
		billete100.setBounds(266, 65, 106, 39);
		add(billete100);
		
		
		billete50.setFont(new Font("Arial", Font.BOLD, 20));
		billete50.setBounds(471, 65, 106, 39);
		add(billete50);
		
		
		billete20.setFont(new Font("Arial", Font.BOLD, 20));
		billete20.setBounds(679, 65, 106, 39);
		add(billete20);
		
		
		billete10.setFont(new Font("Arial", Font.BOLD, 20));
		billete10.setBounds(52, 143, 106, 39);
		add(billete10);
		
		
		billete5.setFont(new Font("Arial", Font.BOLD, 20));
		billete5.setBounds(266, 143, 106, 39);
		add(billete5);
		
		
		moneda2e.setFont(new Font("Arial", Font.BOLD, 20));
		moneda2e.setBounds(471, 143, 106, 39);
		add(moneda2e);
		
		
		moneda1e.setFont(new Font("Arial", Font.BOLD, 20));
		moneda1e.setBounds(679, 143, 106, 39);
		add(moneda1e);
		
		
		moneda50cent.setFont(new Font("Arial", Font.BOLD, 20));
		moneda50cent.setBounds(52, 222, 106, 39);
		add(moneda50cent);
		
		
		moneda20cent.setFont(new Font("Arial", Font.BOLD, 20));
		moneda20cent.setBounds(266, 222, 106, 39);
		add(moneda20cent);
		
		
		moneda10cent.setFont(new Font("Arial", Font.BOLD, 20));
		moneda10cent.setBounds(471, 222, 106, 39);
		add(moneda10cent);
		
		
		moneda5cent.setFont(new Font("Arial", Font.BOLD, 20));
		moneda5cent.setBounds(679, 222, 106, 39);
		add(moneda5cent);
		
		
		moneda2cent.setFont(new Font("Arial", Font.BOLD, 20));
		moneda2cent.setBounds(52, 295, 106, 39);
		add(moneda2cent);
		
		
		moneda1cent.setFont(new Font("Arial", Font.BOLD, 20));
		moneda1cent.setBounds(266, 295, 106, 39);
		add(moneda1cent);
		
		lblPrecio = new JLabel("New label");
		lblPrecio.setIcon(new ImageIcon("Cosas/fondo1.png"));
		lblPrecio.setBounds(0, 0, 936, 601);
		add(lblPrecio);
		
	}
}
