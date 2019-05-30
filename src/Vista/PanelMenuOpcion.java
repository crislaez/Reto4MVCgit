package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

import Modelo.Alojamiento;
import Modelo.Apartamento;
import Modelo.Casa;
import Modelo.Hotel;
import Modelo.Metodos2;
import Modelo.Modelo1;
import Modelo.Reserva2;
import Modelo.gestorBD;

public class PanelMenuOpcion extends JPanel{
	
	
	public JLabel lblAlojamiento,lblDestino,lblFechaida,lblFechavuelta,lblEstival,lblFestivo,lblFestivoEstival,lblCodigoDescuento,lblPension;
	public JLabel lblError,lblNumeroPersonas,lblFondoMenuOpcion;
	public JButton btnMenuOpcionAtras,btnBuscar,btnContinuarMenunOpcion;
	public JRadioButton rdbtnHotel,rdbtnCasa,rdbtnApartamento;
	public JScrollPane ScrollMenuopcion;
	public JTextField textUbicacion,textCodigoDescuento;
	public JDateChooser dateFechaIda,dateFechaVuelta;
	public JComboBox comboBoxPersonas,comboboxpension;
	public JRadioButton rdbtnWIFI,rdbtnPiscina,rdbtnSpa,rdbtnParking,rdbtnAireAcondicionado,rdbtnRestaurante,rdbtnBar,rdbtnGym;
	public JCheckBox chckbxordenarprecio,chckbxordenarpopularidad,chckbxestrellas;
	
	public JList listAlojamientos;
	public DefaultListModel modelo3;
	Metodos2 metodos=new Metodos2();
	//gestorBD gestor=new gestorBD();
	//public Reserva2 reserva=new Reserva2();

	
	
	public PanelMenuOpcion() {
		setBorder(new LineBorder(new Color(0, 0, 0), 4));
		setBackground(SystemColor.controlHighlight);
		setLayout(null);
		
		
		//gestor.seleccionarHabitacion(habitacion);
		//metodos.ordenarAlojamiento(alojamiento)
		
		rdbtnHotel = new JRadioButton("HOTEL");
		rdbtnHotel.setForeground(Color.BLACK);
		rdbtnHotel.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnHotel.setBounds(207, 22, 109, 23);
		add(rdbtnHotel);

		rdbtnCasa = new JRadioButton("CASA");
		rdbtnCasa.setForeground(Color.BLACK);
		rdbtnCasa.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnCasa.setBounds(333, 22, 109, 23);
		add(rdbtnCasa);
		
		rdbtnApartamento = new JRadioButton("APARTAMENTO");
		rdbtnApartamento.setForeground(Color.BLACK);
		rdbtnApartamento.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnApartamento.setBounds(459, 22, 159, 23);
		add(rdbtnApartamento);
		
		lblAlojamiento = new JLabel("ALOJAMIENTO:");
		lblAlojamiento.setForeground(Color.WHITE);
		lblAlojamiento.setFont(new Font("Arial", Font.BOLD, 15));
		lblAlojamiento.setBounds(63, 26, 120, 14);
		add(lblAlojamiento);
		
		lblDestino = new JLabel("DESTINO:");
		lblDestino.setForeground(Color.WHITE);
		lblDestino.setFont(new Font("Arial", Font.BOLD, 15));
		lblDestino.setBounds(109, 73, 74, 16);
		add(lblDestino);
		
		lblFechaida = new JLabel("FECHA ENTRADA:");
		lblFechaida.setForeground(Color.WHITE);
		lblFechaida.setFont(new Font("Arial", Font.BOLD, 15));
		lblFechaida.setBounds(44, 126, 139, 14);
		add(lblFechaida);
		
		lblFechavuelta = new JLabel("FECHA SALIDA:");
		lblFechavuelta.setForeground(Color.WHITE);
		lblFechavuelta.setFont(new Font("Arial", Font.BOLD, 15));
		lblFechavuelta.setBounds(63, 174, 120, 14);
		add(lblFechavuelta);
		
		btnMenuOpcionAtras = new JButton("ATRAS");
		btnMenuOpcionAtras.setFont(new Font("Arial", Font.BOLD, 15));
		btnMenuOpcionAtras.setBounds(-13, 565, 198, 48);
		add(btnMenuOpcionAtras);
		
		ScrollMenuopcion = new JScrollPane();
		ScrollMenuopcion.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		ScrollMenuopcion.setBounds(390, 64, 524, 333);
		add(ScrollMenuopcion);
		
		listAlojamientos = new JList();
		listAlojamientos.setName("listAlojamientos");
		ScrollMenuopcion.setViewportView(listAlojamientos);
		modelo3 = new DefaultListModel();
		
		textUbicacion = new JTextField();
		textUbicacion.setBounds(207, 72, 109, 20);
		textUbicacion.setHorizontalAlignment(SwingConstants.RIGHT);
		textUbicacion.setColumns(10);
		add(textUbicacion);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setFont(new Font("Arial", Font.BOLD, 15));
		btnBuscar.setBounds(390, 423, 524, 81);
		add(btnBuscar);
		
		
		
		dateFechaIda = new JDateChooser();
		dateFechaIda.setBounds(207, 120, 109, 20);
		add(dateFechaIda);
		
		dateFechaVuelta = new JDateChooser();
		dateFechaVuelta.setBounds(207, 168, 109, 20);
		add(dateFechaVuelta);
		metodos.limitar(dateFechaIda , dateFechaVuelta);
		
		lblEstival = new JLabel("*Estival Incremento 10%");
		lblEstival.setForeground(Color.WHITE);
		lblEstival.setFont(new Font("Bahnschrift", Font.ITALIC, 15));
		lblEstival.setBounds(185, 581, 167, 14);
		add(lblEstival);
		
		lblFestivo = new JLabel("*Festivo Incremento 20%");
		lblFestivo.setForeground(Color.WHITE);
		lblFestivo.setFont(new Font("Bahnschrift", Font.ITALIC, 15));
		lblFestivo.setBounds(571, 581, 167, 14);
		add(lblFestivo);
		
		lblFestivoEstival = new JLabel("*Festivo y Estival Incremento 30%");
		lblFestivoEstival.setForeground(Color.WHITE);
		lblFestivoEstival.setFont(new Font("Bahnschrift", Font.ITALIC, 15));
		lblFestivoEstival.setBounds(345, 581,240, 14);
		add(lblFestivoEstival);
		
		lblCodigoDescuento = new JLabel("*CODIGO DESCUENTO:");
		lblCodigoDescuento.setForeground(Color.WHITE);
		lblCodigoDescuento.setFont(new Font("Arial", Font.BOLD, 15));
		lblCodigoDescuento.setBounds(10, 275, 181, 14);
		add(lblCodigoDescuento);
		
		textCodigoDescuento = new JTextField();
		textCodigoDescuento.setBounds(209, 273, 107, 20);
		add(textCodigoDescuento);
		textCodigoDescuento.setColumns(10);
		
		lblError = new JLabel("New label");
		lblError.setIcon(new ImageIcon("C:/eclipse-workspace/AReto4MVC/Cosas/images.png"));
		lblError.setBounds(337, 253, 38, 36);
		add(lblError);
		lblError.setVisible(false);
		
		lblNumeroPersonas = new JLabel("PERSONAS:");
		lblNumeroPersonas.setForeground(Color.WHITE);
		lblNumeroPersonas.setFont(new Font("Arial", Font.BOLD, 15));
		lblNumeroPersonas.setBounds(90, 219, 95, 18);
		add(lblNumeroPersonas);
		
		comboBoxPersonas = new JComboBox();
		for(int i=1; i<11;i++) {
			comboBoxPersonas.addItem(i); 
		}
		comboBoxPersonas.setBounds(207, 219, 109, 20);
		add(comboBoxPersonas);
		
		rdbtnWIFI = new JRadioButton("WIFI");
		rdbtnWIFI.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnWIFI.setBounds(10, 396, 139, 23);
		add(rdbtnWIFI);
		
		rdbtnPiscina = new JRadioButton("PISCINA");
		rdbtnPiscina.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnPiscina.setBounds(177, 396, 139, 23);
		add(rdbtnPiscina);
		
		rdbtnSpa = new JRadioButton("SPA");
		rdbtnSpa.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnSpa.setBounds(10, 439, 139, 23);
		add(rdbtnSpa);
		
		rdbtnParking = new JRadioButton("PARKING");
		rdbtnParking.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnParking.setBounds(177, 439, 139, 23);
		add(rdbtnParking);
		
		rdbtnAireAcondicionado = new JRadioButton("A/C");
		rdbtnAireAcondicionado.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnAireAcondicionado.setBounds(10, 481, 139, 23);
		add(rdbtnAireAcondicionado);
		
		rdbtnRestaurante = new JRadioButton("RESTAURANTE");
		rdbtnRestaurante.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnRestaurante.setBounds(177, 481, 139, 23);
		add(rdbtnRestaurante);
		
		rdbtnBar = new JRadioButton("BAR");
		rdbtnBar.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnBar.setBounds(10, 529, 139, 23);
		add(rdbtnBar);
		
		rdbtnGym = new JRadioButton("GYM");
		rdbtnGym.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnGym.setBounds(177, 529, 139, 23);
		add(rdbtnGym);
		
		btnContinuarMenunOpcion = new JButton("CONTINUAR");
		btnContinuarMenunOpcion.setFont(new Font("Arial", Font.BOLD, 15));
		btnContinuarMenunOpcion.setBounds(738, 565, 198, 48);
		add(btnContinuarMenunOpcion);
		btnContinuarMenunOpcion.setEnabled(false);
			
		chckbxordenarprecio = new JCheckBox("ordenar por precio");
		chckbxordenarprecio.setFont(new Font("Arial", Font.BOLD, 10));
		chckbxordenarprecio.setBounds(390, 531, 120, 21);
		add(chckbxordenarprecio);
		
		chckbxordenarpopularidad = new JCheckBox("ordenar por popularidad");
		chckbxordenarpopularidad.setFont(new Font("Arial", Font.BOLD, 10));
		chckbxordenarpopularidad.setBounds(541, 531, 150, 21);
		add(chckbxordenarpopularidad);
	
		comboboxpension = new JComboBox();
		comboboxpension.addItem("Desayuno");
		comboboxpension.addItem("Media");
		comboboxpension.addItem("Completa");
		comboboxpension.setBounds(207, 328, 109, 21);
		add(comboboxpension);
		comboboxpension.setEnabled(false);
		
		chckbxestrellas = new JCheckBox("ordenar por estrellas");
		chckbxestrellas.setFont(new Font("Arial", Font.BOLD, 10));
		chckbxestrellas.setBounds(738, 531, 129, 21);
		add(chckbxestrellas);
		chckbxestrellas.setEnabled(false);
		
		lblPension = new JLabel("PENSION:");
		lblPension.setForeground(Color.WHITE);
		lblPension.setFont(new Font("Arial", Font.BOLD, 15));
		lblPension.setBounds(109, 332, 74, 13);
		add(lblPension);
		
		lblFondoMenuOpcion = new JLabel("New label");
		lblFondoMenuOpcion.setForeground(Color.WHITE);
		lblFondoMenuOpcion.setIcon(new ImageIcon("Cosas/fondo1.png"));
		lblFondoMenuOpcion.setBounds(0, 0, 924, 601);
		add(lblFondoMenuOpcion);

		
	}
}
