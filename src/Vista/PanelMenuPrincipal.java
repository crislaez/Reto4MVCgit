package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PanelMenuPrincipal extends JPanel {
	
	public JButton btnHacerReserva,btnBorrarReserva,btnBorrarCliente;
	public JLabel lblFondoMenuPrincipal;
	
	public PanelMenuPrincipal() {
		
		setBorder(new LineBorder(new Color(0, 0, 0), 4));
		setBackground(SystemColor.controlHighlight);
		setLayout(null);
		
		btnHacerReserva = new JButton("HACER RESERVA");
		btnHacerReserva.setFont(new Font("Arial", Font.BOLD, 33));
		btnHacerReserva.setBounds(128, 67, 685, 91);
		add(btnHacerReserva);
		
		btnBorrarReserva = new JButton("BORRAR RESERVA");
		btnBorrarReserva.setFont(new Font("Arial", Font.BOLD, 33));
		btnBorrarReserva.setBounds(128, 247, 685, 91);
		add(btnBorrarReserva);
		
		btnBorrarCliente = new JButton("BORRAR CLIENTE");
		btnBorrarCliente.setFont(new Font("Arial", Font.BOLD, 33));
		btnBorrarCliente.setBounds(128, 424, 685, 91);
		add(btnBorrarCliente);
		
		lblFondoMenuPrincipal = new JLabel("New label");
		lblFondoMenuPrincipal.setIcon(new ImageIcon("Cosas/fondo1.png"));
		lblFondoMenuPrincipal.setBounds(0, 0, 924, 601);
		add(lblFondoMenuPrincipal);
		
		
	}

}
