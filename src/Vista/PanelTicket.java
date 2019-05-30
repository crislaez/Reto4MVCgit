package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

public class PanelTicket extends JPanel{

	public JLabel lblReserva,lblTicket;
	public JButton btnFin,btnAtrasTicket;
	public JScrollPane scrollPaneTicket;
	public JTextPane textReserva;
	
	public PanelTicket() {
		setBorder(new LineBorder(new Color(0, 0, 0), 4));
		setBackground(SystemColor.controlHighlight);
		setLayout(null);
		
		lblReserva = new JLabel("AQUI ESTA SU RESERVA");
		lblReserva.setForeground(Color.WHITE);
		lblReserva.setFont(new Font("Arial", Font.BOLD, 37));
		lblReserva.setBounds(227, 55, 477, 91);
		add(lblReserva);
		
		btnFin = new JButton("FINALIZAR");
		btnFin.setFont(new Font("Arial", Font.BOLD, 15));
		btnFin.setBounds(738, 565, 198, 48);
		add(btnFin);
		
		btnAtrasTicket = new JButton("MAS RESERVAS");
		btnAtrasTicket.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtrasTicket.setBounds(-13, 565, 198, 48);
		add(btnAtrasTicket);
		
		scrollPaneTicket  = new JScrollPane();
		scrollPaneTicket.setBounds(227, 191, 477, 342);
		add(scrollPaneTicket);
		
		textReserva = new JTextPane();
		scrollPaneTicket.setViewportView(textReserva);
		textReserva.setEditable(false);
		
		lblTicket = new JLabel("New label");
		lblTicket.setIcon(new ImageIcon("Cosas/fondo1.png"));
		lblTicket.setBounds(0, 0, 924, 601);
		add(lblTicket);
		
	}

}
