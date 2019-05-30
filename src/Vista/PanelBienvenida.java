package Vista;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBienvenida extends JPanel{
	
	public JButton btnBienvenida;
	
	public PanelBienvenida() {
		btnBienvenida = new JButton("Bienvenido");
		btnBienvenida.setBounds(0, 0, 950, 650);
		add(btnBienvenida);
		btnBienvenida.setFont(new Font("Arial", Font.BOLD, 37));
	}

}
