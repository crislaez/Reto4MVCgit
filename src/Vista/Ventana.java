package Vista;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.GregorianCalendar;



import java.util.Date;


import javax.swing.JButton;
import java.awt.Font;
import java.awt.List;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;


import Modelo.Alojamiento;
import Modelo.Apartamento;
import Modelo.Baseslegales;
import Modelo.Cama;
import Modelo.Casa;
import Modelo.Cliente;
import Modelo.Habitacion;
import Modelo.Hotel;
import Modelo.Metodos2;
import Modelo.Reserva2;
import Modelo.ReservaHabitacion;
import Modelo.gestorBD;

import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class Ventana extends JFrame {
	private static final List Lista = null;
	//crar variables
	private JPanel contentPane;
	gestorBD gestor= new gestorBD();
	ArrayList<Alojamiento> alojamiento=new ArrayList<Alojamiento>();
	ArrayList<Habitacion> habitacion=new ArrayList();
	ArrayList<Cama> cama=new ArrayList<Cama>();
	Metodos2 metodos=new Metodos2();
	SimpleDateFormat formatoFecha=new SimpleDateFormat("dd-mm-yyyy");
	
	Reserva2 reserva=new Reserva2();
	ReservaHabitacion reservahabitaciones= new ReservaHabitacion();
	Cliente cliente=new Cliente();
	Baseslegales baseslegales2=new Baseslegales();
	
	private String dia_ida = "";
	private String mes_ida = "";
	private String ano_ida = "";
	
	private int personas=0;
	private int cantidadcamas=0;
	private int cantidadmaximacamas=0;
	private double precioporhabitacion=0;
	private double preciomaximo=0;
	private int codigoreserva=0;
	
	private String dia_vuelta = "";
	private String mes_vuelta = "";
	private String ano_vuelta = "";
	
	private String encriptMD5;
	
	private double total=0;
	private String nombre="";
	private String ubicacion="";
	private int codigo=0;
	private boolean error;
	private double codigodescuento=0;
	private int contador=0;
	private int contador2=0;
	private int contador3=0;
	private int contador4=0;
	private int descuento=0;
	private String codigohabitacion="";
	private String habitacionconcatenada="";
	private int cod=0;
	
	private boolean wifi=false;
	private boolean piscina=false;
	private boolean spa=false;
	private boolean parking=false;
	private boolean aireacondicionado=false;
	private boolean restaurante=false;
	private boolean bar=false;
	private boolean gym=false;
	
	private double total_introducido=0;
	private double total_faltante;
	private double total_devolucion=0;
	private double valorBoton=0;
	
	private int comprobar=0;
	private int prueba=0;
	private Calendar fecha ;
	
	private int pos=0;

	private  int año;
	private int mes;
	private int dia;
	private int codigohotel;
	private String fechainicio;
	private String fechafin;
	private String fechaactual;
	
	private JTextField DineroFaltante;
	private JTextField DineroIntroducido;
	private JTextField textField;
	private JTextField textUbicacion;
	private JTextField textNombreRegistro;
	private JTextField textApellidoRegistro;
	private JPasswordField passworContraseña;
	private JPasswordField passwordContraseñaRegistro;
	private JTextField Vueltas;
	private JPasswordField passwordContraseña;
	private JPanel MenuOpcion,Bienvenida,MenuPrincipal,BorrarCliente,BorrarReserva,Habitaciones,HabitacionesNoHotel,Login,Registro;
	private JPanel Precio,Ticket;
	private JPanel Panel_SCROLL_3,Panel_ScrollMenuopcion;
	private JButton btnBienvenida,btnHacerReserva,btnBorrarReserva,btnBorrarCliente,btnAtrasBorrarCliente,btnBorrarBorrarCliente,btnAtrasBorraReserva,btnBorrarBorrarReserva;
	private JButton btnAtrasHabitacions,btnBuscarReservasHabitaciones,btnContinuarHabitaciones,btnAtrasHabitacionesNoHotel;
	private JButton btnContinuarHabitacionesNoHotel,btnVerDisponibilidadNoHotel,btnRegistrarse,btnAtrasLogin,btnContinuarLogin;
	private JButton btnAtrasRegistro,btnIngresarRegistro,btnFin,btnAtrasTicket,btnMenuOpcionAtras,btnBuscar,btnPrecioAtras,btnPrecioContinuar;
	private JButton btnContinuarBasesLegales;
	private JLabel lblFondoMenuPrincipal,lblDniBorrarCliente,lblContrasellaBorrarCLiente,lblIntroducirDatosBorrarCliente,lblFondoBorrarCliente,lblIntroducirDatosBorrarReserva;
	private JLabel lblDniBorrarReserva,lblCodigoReservBorrarReserva,lblFondoBorrarReserva,lblescogerHotelHabitaciones,lblCamas;
	private JLabel lblFonfoHabitaciones,lblHabitacionesDisponiblesNoHotel,lblFondoHabitacionesNoHotel,lblDni,lblContraseña;
	private JLabel lblNewLabel,lbFondoLogin,lblRegistroRegistro,lblDniRegistro,lblNombreRegistro,lblApellidoRegistro,lblEdadRegistro;
	private JLabel lblSexoRegistro,lblContraseñaRegistro,lblNewLabel_1,lblReserva,lblTicket,lblAlojamiento,lblDestino,lblFechaida,lblFechavuelta;
	private JLabel lblEstival,lblFestivo,lblFondoMenuOpcion,lblDineroFaltante,lblDineroIntroducido,lblVueltas,lblFondoBasesLegales;
	private JFormattedTextField formattedDniBorrarCliente,formattedDniBorrarReserva,formattedCodigoReserva,formatteddni,formattedDniRegistro;
	private JFormattedTextField formattedEdadRegistro;
	private JScrollPane scrollpaneHabitacions,scrollPaneCamas,scrollPaneHabitacionNoHotel,scrollPaneTicket,ScrollMenuopcion,scrollPaneBasesLegales;
	private JTextPane textReserva,baseslegales;
	private JRadioButton rdbtnHombreRegistro,rdbtnMujerRegistro,rdbtnHotel,rdbtnCasa,rdbtnApartamento,rdbtnAceptarCondiciones;
	private JRadioButton rdbtnWIFI,rdbtnPiscina,rdbtnSpa,rdbtnParking,rdbtnAireAcondicionado,rdbtnRestaurante,rdbtnBar,rdbtnGym;
	private JDateChooser dateFechaIda,dateFechaVuelta;
	private JPanel BasesLegales;
	private String blegales="Aviso Legal\r\n" + 
			"Introducción\r\n" + 
			"Entrada en vigor: 09 de Agosto de 2018.\r\n" + 
			"\r\n" + 
			"El presente se constituye como el Aviso Legal de la web de HOTEL LA LAGUNA SPA & GOLF, ubicada en la URL https://www.hotellalaguna.com.\r\n" + 
			"\r\n" + 
			"Datos de la compañía\r\n" + 
			"Titular: Hotel La Laguna SPA & Golf, S.L. (en adelante «HOTEL LA LAGUNA SPA & GOLF»)\r\n" + 
			"Domicilio social: Avda. Antonio Quesada nº 53, 03170, Rojales (Alicante)\r\n" + 
			"CIF: B-53652939\r\n" + 
			"Registro Público: Inscrita en el Registro Mercantil de Alicante, Tomo 2526, Folio 92, Sección 8ª, Hoja A-69758\r\n" + 
			"Teléfono: 965 72 55 77\r\n" + 
			"Email: dpo@hotellalaguna.com\r\n" + 
			"\r\n" + 
			"Condiciones de uso\r\n" + 
			"El acceso al Sitio Web por parte de los Usuarios tiene carácter libre y gratuito.\r\n" + 
			"El acceso, navegación y utilización del Sitio www.hotellalaguna.com implica la aceptación expresa y sin reservas de todos los términos de las presentes condiciones de uso, teniendo la misma validez y eficacia que cualquier contrato celebrado por escrito y firmado.\r\n" + 
			"Su observancia y cumplimiento será exigible respecto de cualquier persona que acceda, navegue o utilice la Web. Si Ud. no está de acuerdo con los términos expuestos, no acceda, navegue o utilice ninguna página del sitio web.\r\n" + 
			"\r\n" + 
			"Derechos de propiedad intelectual e industrial\r\n" + 
			"Todos los derechos de propiedad industrial e intelectual de este sitio Web y de las distintas páginas web pertenecientes al mismo, así como de los elementos contenidos en el mismo y en sus páginas web (incluidos, con carácter enunciativo que no limitativo, el diseño gráfico, código fuente, logos, contenidos, imágenes, textos, gráficos, ilustraciones, fotografías, bases de datos y demás elementos que aparecen en la Web), salvo que se indique lo contrario, son titularidad exclusiva de HOTEL LA LAGUNA SPA & GOLF o de terceros considerados legítimos.\r\n" + 
			"\r\n" + 
			"En este sentido, HOTEL LA LAGUNA SPA & GOLF hace expresa reserva de todos los derechos. Igualmente, todos los nombres comerciales, dominios, marcas o signos distintivos de cualquier clase contenidos en el sitio Web y sus páginas web, están protegidos por la Ley.\r\n" + 
			"\r\n" + 
			"HOTEL LA LAGUNA SPA & GOLF no concede ningún tipo de licencia o autorización de uso público y/o comercial al Usuario sobre sus derechos de propiedad intelectual e industrial o sobre cualquier otro derecho relacionado con este sitio Web, sus páginas webs y los servicios ofrecidos en las mismas. El Usuario única y exclusivamente podrá acceder a tales elementos y servicios para su uso personal y privado, quedando, por tanto, terminantemente prohibida la utilización de la totalidad o parte de los contenidos de este Web y páginas webs pertenecientes al mismo con propósitos públicos o comerciales, su distribución, comunicación pública, incluida la modalidad de puesta a disposición, así como su modificación, alteración o descompilación a no ser que para ello se cuente con el consentimiento expreso y por escrito de HOTEL LA LAGUNA SPA & GOLF.\r\n" + 
			"\r\n" + 
			"Por ello, el Usuario reconoce que la reproducción, distribución, comercialización, transformación, y en general, cualquier otra forma de explotación, por cualquier procedimiento, de todo o parte de los contenidos de este sitio Web constituye una infracción de los derechos de propiedad intelectual y/o industrial de HOTEL LA LAGUNA SPA & GOLF o de su titular.\r\n" + 
			"\r\n" + 
			"Cualquier uso indebido de las mismas por personas diferentes de su legítimo titular y sin el consentimiento expreso e inequívoco por parte de éste podrá ser denunciado y perseguido a través de todos los medios legales existentes en el Ordenamiento Jurídico español y/o comunitario.\r\n" + 
			"\r\n" + 
			"Los derechos de propiedad intelectual y marchas de terceros están destacados convenientemente y deben ser respetados por todo aquél que acceda a esta página, no siendo responsabilidad de HOTEL LA LAGUNA SPA & GOLF el uso que el usuario pueda llevar a cabo al respecto, recayendo la responsabilidad exclusiva en su persona.\r\n" + 
			"\r\n" + 
			"Sólo para uso personal y privado se permite descargar los contenidos, copiar o imprimir cualquier página de esta web, quedando prohibido modificar, copiar, reutilizar, explotar, reproducir, transformar, comunicar públicamente, hacer segundas o posteriores publicaciones, cargar archivos, enviar por correo, transmitir, usar, tratar o distribuir de cualquier forma la totalidad o parte de los Contenidos y productos incluidos en el Sitio Web para propósitos públicos o comerciales, si no se cuenta con la autorización expresa y por escrito de HOTEL LA LAGUNA SPA & GOLF o, en su caso, del titular de los derechos a que corresponda.\r\n" + 
			"En ningún caso se entenderá que el acceso y navegación del Usuario por el Sitio Web o la adquisición de los productos de HOTEL LA LAGUNA SPA & GOLF ofertados a través del Sitio Web, implica una renuncia, transmisión, licencia o cesión total ni parcial de dichos derechos por parte de HOTEL LA LAGUNA SPA & GOLF.\r\n" + 
			"\r\n" + 
			"En consecuencia, no está permitido suprimir, eludir o manipular el aviso de derechos de autor («copyright») y cualesquiera otros datos de identificación de los derechos de HOTEL LA LAGUNA SPA & GOLF o de sus titulares incorporados a los Contenidos y productos, así como los dispositivos técnicos de protección, las huellas digitales, marcas de agua o cualesquiera mecanismos de información y/o de identificación que pudieren contenerse en los mismos.\r\n" + 
			"\r\n" + 
			"Condiciones de uso del sitio web\r\n" + 
			"No está permitido y, por tanto, sus consecuencias serán de la exclusiva responsabilidad del usuario, el acceso o la utilización del Sitio Web con fines ilegales o no autorizados, con o sin finalidad económica, y, más específicamente y sin que el siguiente listado tenga carácter absoluto, queda prohibido:\r\n" + 
			"\r\n" + 
			"Usar el Sitio Web en forma alguna que pueda provocar daños, interrupciones, ineficiencias o defectos en su funcionalidad o en el ordenador de un tercero;\r\n" + 
			"Usar el Sitio Web para la transmisión, la instalación o la publicación de cualquier virus, código malicioso u otros programas o archivos perjudiciales;\r\n" + 
			"Usar el Sitio Web para recoger datos de carácter personal de otros usuarios;\r\n" + 
			"Registrarse a través del Sitio Web con una identidad falsa, suplantado a terceros o utilizando un perfil o realizando cualquier otra acción que pueda confundir a otros usuarios sobre la identidad del origen de un mensaje;\r\n" + 
			"Acceder sin autorización a cualquier sección del Sitio Web, a otros sistemas o redes conectadas a la Plataforma, a ningún servidor de HOTEL LA LAGUNA SPA & GOLF ni a los servicios ofrecidos a través del Sitio Web, por medio de pirateo o falsificación, extracción de contraseñas o cualquier otro medio ilegítimo;\r\n" + 
			"Quebrantar, o intentar quebrantar, las medidas de seguridad o autenticación del Sitio Web o de cualquier red conectada a la misma, o las medidas de seguridad o protección inherentes a los contenidos ofrecidos en el Sitio Web;\r\n" + 
			"Llevar a cabo alguna acción que provoque una saturación desproporcionada o innecesaria en la infraestructura del Sitio Web o en los sistemas o redes de HOTEL LA LAGUNA SPA & GOLF, así como en los sistemas y redes conectados al Sitio Web; o\r\n" + 
			"Impedir el normal desarrollo de un evento, concurso, promoción o cualquier otra actividad disponible a través del Sitio Web o cualesquiera de sus funcionalidades, ya sea alterando o tratando de alterar, ilegalmente o de cualquier otra forma, el acceso, participación o funcionamiento de aquéllos, o falseando el resultado de los mismos y/o utilizando métodos de participación fraudulentos, mediante cualquier procedimiento, y/o a través de cualquier práctica que atente o vulnere en modo alguno las presentes Condiciones de uso.\r\n" + 
			"Cualquier uso comercial no autorizado de los mismos, o su reventa, salvo que se cuente con la previa autorización escrita de HOTEL LA LAGUNA SPA & GOLF. Los contenidos y productos ofertados a través del Sitio Web se facilitan únicamente a usuarios finales, a personas que naveguen a través de la Web, a personas que se den de alta en el Registro de Usuarios y a personas interesadas en realizar o que realicen la reserva de un inmueble de HOTEL LA LAGUNA SPA & GOLF.\r\n" + 
			"Reproducir o copiar, distribuir, permitir el acceso del público a través de cualquier modalidad de comunicación pública, transformar o modificar los contenidos, a menos que se cuente con la autorización del titular de los correspondientes derechos o ello resulte legalmente permitido.\r\n" + 
			"Emplear los contenidos y, en particular, la información de cualquier clase obtenida a través del Sitio Web o de los servicios para remitir publicidad, comunicaciones con fines de venta directa o con cualquier otra clase de finalidad comercial, mensajes no solicitados dirigidos a una pluralidad de personas con independencia de su finalidad, así como a abstenerse de comercializar o divulgar de cualquier modo dicha información.\r\n" + 
			"El incumplimiento de cualquiera de las anteriores obligaciones por el usuario podrá llevar aparejada la adopción por HOTEL LA LAGUNA SPA & GOLF de las medidas oportunas amparadas en Derecho y en el ejercicio de sus derechos u obligaciones, pudiendo llegar a la eliminación o bloqueo de la cuenta del usuario infractor, sin que medie posibilidad de indemnización alguna por los daños y perjuicios causados.\r\n" + 
			"\r\n" + 
			"Licencia sobre las comunicaciones\r\n" + 
			"En el caso de que el Usuario envíe información de cualquier tipo a HOTEL LA LAGUNA SPA & GOLF a través del Sitio Web, mediante los canales dispuestos a tal fin en la propia Página, el Usuario declara, garantiza y acepta que tiene derecho a hacerlo libremente, que dicha información no infringe ningún derecho de propiedad intelectual, de marca, de patente, secreto comercial, o cualquier otro derecho de tercero, que dicha información no tiene carácter confidencial y que dicha información no es perjudicial para terceros.\r\n" + 
			"\r\n" + 
			"El Usuario reconoce asumir la responsabilidad y dejará indemne a HOTEL LA LAGUNA SPA & GOLF por cualquier comunicación que suministre personalmente o a su nombre, alcanzando dicha responsabilidad sin restricción alguna la exactitud, legalidad, originalidad y titularidad de la misma.\r\n" + 
			"\r\n" + 
			"Responsabilidades\r\n" + 
			"HOTEL LA LAGUNA SPA & GOLF no asume ninguna responsabilidad derivada, o que pudiera derivarse de la utilización que los usuarios hagan de las informaciones y contenidos de esta página web. Los contenidos y las informaciones no vinculan a la susodicha, ni constituyen opiniones, o consejos, pues se trata meramente de un servicio ofrecido con carácter informativo y divulgativo. HOTEL LA LAGUNA SPA & GOLF no puede asumir ninguna responsabilidad derivada del uso incorrecto, inapropiado o ilícito de la información aparecida en la presente página web.\r\n" + 
			"\r\n" + 
			"HOTEL LA LAGUNA SPA & GOLF empleará todos los esfuerzos y medios razonables para facilitar información actualizada y fehaciente en la Web, no obstante, HOTEL LA LAGUNA SPA & GOLF no asume ninguna garantía en relación con la ausencia de errores, o de posibles inexactitudes y/u omisiones en ninguno de los contenidos accesibles a través de este Web.\r\n" + 
			"\r\n" + 
			"HOTEL LA LAGUNA SPA & GOLF se reserva el derecho a modificar, desarrollar o actualizar en cualquier momento y sin previa notificación, las condiciones de uso del presente Web. El Usuario quedará obligado automáticamente por las condiciones de uso que se hallen vigentes en el momento en que acceda al Web, por lo que deberá leer periódicamente dichas condiciones de uso.\r\n" + 
			"\r\n" + 
			"El Usuario es el único responsable de las infracciones en las que pueda incurrir o de los perjuicios que pueda causar por la utilización de la Web, quedando HOTEL LA LAGUNA SPA & GOLF, sus socios, colaboradores, empleados y representantes, exonerados de cualquier clase de responsabilidad que se pudiera derivar por las acciones del Usuario.\r\n" + 
			"\r\n" + 
			"El Usuario es el único responsable frente a cualquier reclamación o acción legal, judicial o extrajudicial, iniciada por terceras personas contra HOTEL LA LAGUNA SPA & GOLF basada en la utilización por el Usuario de la Web. En su caso, el Usuario asumirá cuantos gastos, costes e indemnizaciones sean irrogados al titular de la Web con motivo de tales reclamaciones o acciones legales.\r\n" + 
			"\r\n" + 
			"HOTEL LA LAGUNA SPA & GOLF se reserva el derecho de suspender temporalmente el acceso a su página web por causas relacionadas con motivo de operaciones de mantenimiento, reparación, actualización o mejora.\r\n" + 
			"\r\n" + 
			"HOTEL LA LAGUNA SPA & GOLF queda exento de toda responsabilidad que se pudiera derivar de interferencias, omisiones, interrupciones, virus informáticos, averías telefónicas o desconexiones en el funcionamiento operativo del sistema electrónico, motivado por causas ajenas al titular de la Web. Asimismo, HOTEL LA LAGUNA SPA & GOLF también excluye cualquier responsabilidad que pudiera derivarse por retrasos o bloqueos en el funcionamiento operativo de este sistema electrónico causado por deficiencias o sobre carga en las líneas telefónicas o en Internet, así como de daños causados por terceras personas mediante intromisiones ilegitimas fuera del control de HOTEL LA LAGUNA SPA & GOLF.\r\n" + 
			"\r\n" + 
			"HOTEL LA LAGUNA SPA & GOLF ha adoptado las medidas de seguridad que permite el estado actual de la tecnología. Sin embargo, el usuario es consciente del hecho según el cual HOTEL LA LAGUNA SPA & GOLF no puede garantizar la ausencia absoluta de virus o elementos lesivos.\r\n" + 
			"\r\n" + 
			"Si el Usuario tuviera conocimiento de la existencia de algún contenido ilícito, ilegal, contrario a las leyes o que pudiera suponer una infracción de derechos de propiedad intelectual y/o industrial, deberá notificarlo inmediatamente a HOTEL LA LAGUNA SPA & GOLF para que ésta pueda proceder a la adopción de las medidas oportunas.\r\n" + 
			"\r\n" + 
			"Duración y modificación\r\n" + 
			"HOTEL LA LAGUNA SPA & GOLF podrá modificar los términos y condiciones aquí estipulados, total o parcialmente, publicando cualquier cambio en la misma forma en que aparece este Aviso legal o a través de cualquier tipo de comunicación dirigida a los Usuarios.\r\n" + 
			"\r\n" + 
			"La vigencia temporal de este Aviso legal coincide, por lo tanto, con el tiempo de su exposición, hasta que sean modificadas total o parcialmente, momento en el cual pasará a tener vigencia el Aviso legal modificado.\r\n" + 
			"\r\n" + 
			"Con independencia de lo dispuesto en las condiciones particulares, HOTEL LA LAGUNA SPA & GOLF podrá dar por terminado, suspender o interrumpir, en cualquier momento sin necesidad de preaviso, el acceso a los contenidos de la página, sin posibilidad por parte del Usuario de exigir indemnización alguna. Tras dicha extinción, seguirán vigentes las prohibiciones de uso de los contenidos expuestas anteriormente en el presente Aviso legal.\r\n" + 
			"\r\n" + 
			"Salvaguarda de las normas\r\n" + 
			"Si algún término y condición de las presentes Normas fuera declarado nulo o inoperante, el resto de las disposiciones se mantendrán en los términos acordados. HOTEL LA LAGUNA SPA & GOLF se compromete a sustituir la estipulación afectada por la nulidad aproximándose lo más posible a la intención inicialmente perseguida.\r\n" + 
			"\r\n" + 
			"Jurisdicción\r\n" + 
			"Las relaciones establecidas entre HOTEL LA LAGUNA SPA & GOLF y el Usuario se regirán por lo dispuesto en la normativa española vigente acerca de la legislación aplicable y la jurisdicción competente. No obstante, para los casos en los que la normativa prevea la posibilidad a las partes de someterse a un fuero, HOTEL LA LAGUNA SPA & GOLF y el Usuario, con renuncia expresa a cualquier otro fuero que pudiera corresponderles, someterán cualesquiera controversias y/o litigios al conocimiento de los Juzgados y Tribunales de Torrevieja (Alicante).\r\n" + 
			"\r\n" + 
			"Compromiso\r\n" + 
			"Este documento ha sido redactado conforme a la situación actual de HOTEL LA LAGUNA SPA & GOLF\r\n" + 
			"En Rojales, a 09 de agosto de 2018\r\n" + 
			"\r\n" + 
			"Fdo.: Amedeo Maturo Senra\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"Dpto.: DPO\r\n" + 
			"Cargo: DPO";
	private JTextField textCodigoDescuento;
	private JLabel lblError;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public Ventana() throws Exception {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Workspace\\AAAAReto\\cosas\\2016_02_22_04_07_21_9757e437-5ec1-4378-804f-ca0f9567c110_380048_Widakk.png"));
		gestor.conectar();
		gestor.seleccionarHotel(alojamiento);
		gestor.seleccionarCasa(alojamiento);
		gestor.seleccionarApartamento(alojamiento);
		gestor.seleccionarHabitacion(habitacion);
		//metodos.ordenarAlojamiento(alojamiento);//ordena por precio
		//----------------------------------------------------------
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 950, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
	
//paneles-----------------------------------------------------------------------------------------------------------------------------------------------	
		MenuOpcion = new JPanel();//panel MenuOpcion----------------------
		Bienvenida = new JPanel();//panel Bienvenida----------------------
		contentPane.add(Bienvenida, "name_405158011795776");
		Bienvenida.setLayout(null);
		
		btnBienvenida = new JButton("Bienvenido");
		btnBienvenida.setBounds(0, 0, 924, 601);
		Bienvenida.add(btnBienvenida);
		btnBienvenida.setFont(new Font("Arial", Font.BOLD, 37));
		
		MenuPrincipal = new JPanel();
		contentPane.add(MenuPrincipal, "name_867333008767988");
		MenuPrincipal.setLayout(null);
		
		btnHacerReserva = new JButton("HACER RESERVA");
		btnHacerReserva.setFont(new Font("Arial", Font.BOLD, 33));
		btnHacerReserva.setBounds(128, 67, 685, 91);
		MenuPrincipal.add(btnHacerReserva);
		
		btnBorrarReserva = new JButton("BORRAR RESERVA");
		btnBorrarReserva.setFont(new Font("Arial", Font.BOLD, 33));
		btnBorrarReserva.setBounds(128, 247, 685, 91);
		MenuPrincipal.add(btnBorrarReserva);
		
		btnBorrarCliente = new JButton("BORRAR CLIENTE");
		btnBorrarCliente.setFont(new Font("Arial", Font.BOLD, 33));
		btnBorrarCliente.setBounds(128, 424, 685, 91);
		MenuPrincipal.add(btnBorrarCliente);
		
		lblFondoMenuPrincipal = new JLabel("New label");
		lblFondoMenuPrincipal.setIcon(new ImageIcon("C:\\Workspace\\AAAAReto\\cosas\\fondo1.png"));
		lblFondoMenuPrincipal.setBounds(0, 0, 924, 601);
		MenuPrincipal.add(lblFondoMenuPrincipal);
		
		BorrarCliente = new JPanel();
		contentPane.add(BorrarCliente, "name_867917561419076");
		BorrarCliente.setLayout(null);
		
		lblDniBorrarCliente = new JLabel("DNI:");
		lblDniBorrarCliente.setForeground(Color.WHITE);
		lblDniBorrarCliente.setFont(new Font("Arial", Font.BOLD, 15));
		lblDniBorrarCliente.setBounds(351, 262, 30, 14);
		BorrarCliente.add(lblDniBorrarCliente);
		
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
		
		
		formattedDniBorrarCliente = new JFormattedTextField(mf);
		formattedDniBorrarCliente.setBounds(402, 260, 125, 20);
		BorrarCliente.add(formattedDniBorrarCliente);
		
		lblContrasellaBorrarCLiente = new JLabel("CONTRASEÑA:");
		lblContrasellaBorrarCLiente.setForeground(Color.WHITE);
		lblContrasellaBorrarCLiente.setFont(new Font("Arial", Font.BOLD, 15));
		lblContrasellaBorrarCLiente.setBounds(284, 316, 108, 14);
		BorrarCliente.add(lblContrasellaBorrarCLiente);
		
		
		passwordContraseña = new JPasswordField();
		passwordContraseña.setBounds(402, 314, 125, 20);
		BorrarCliente.add(passwordContraseña);
		
		btnAtrasBorrarCliente = new JButton("ATRAS");
		btnAtrasBorrarCliente.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtrasBorrarCliente.setBounds(-13, 565, 198, 48);
		BorrarCliente.add(btnAtrasBorrarCliente);
		
		btnBorrarBorrarCliente = new JButton("BORRAR");
		btnBorrarBorrarCliente.setFont(new Font("Arial", Font.BOLD, 15));
		btnBorrarBorrarCliente.setBounds(738, 565, 198, 48);
		BorrarCliente.add(btnBorrarBorrarCliente);
		
		lblIntroducirDatosBorrarCliente = new JLabel("INTRODUDCA EL DNI Y LA CONTRASE\u00D1A");
		lblIntroducirDatosBorrarCliente.setForeground(Color.WHITE);
		lblIntroducirDatosBorrarCliente.setFont(new Font("Arial", Font.BOLD, 33));
		lblIntroducirDatosBorrarCliente.setBounds(143, 100, 684, 82);
		BorrarCliente.add(lblIntroducirDatosBorrarCliente);
		
		lblFondoBorrarCliente = new JLabel("New label");
		lblFondoBorrarCliente.setIcon(new ImageIcon("C:\\Workspace\\AAAAReto\\cosas\\fondo1.png"));
		lblFondoBorrarCliente.setBounds(0, 0, 924, 601);
		BorrarCliente.add(lblFondoBorrarCliente);
		
		BorrarReserva = new JPanel();
		contentPane.add(BorrarReserva, "name_945655456262459");
		BorrarReserva.setLayout(null);
		
		btnAtrasBorraReserva = new JButton("ATRAS");
		btnAtrasBorraReserva.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtrasBorraReserva.setBounds(-13, 565, 198, 48);
		BorrarReserva.add(btnAtrasBorraReserva);
		
		btnBorrarBorrarReserva = new JButton("BORRAR");
		btnBorrarBorrarReserva.setFont(new Font("Arial", Font.BOLD, 15));
		btnBorrarBorrarReserva.setBounds(738, 565, 198, 48);
		BorrarReserva.add(btnBorrarBorrarReserva);
		
		lblIntroducirDatosBorrarReserva = new JLabel("INTRODUDCA EL DNI Y EL CODIGO DE LA RESERVA");
		lblIntroducirDatosBorrarReserva.setForeground(Color.WHITE);
		lblIntroducirDatosBorrarReserva.setFont(new Font("Arial", Font.BOLD, 33));
		lblIntroducirDatosBorrarReserva.setBounds(49, 97, 838, 63);
		BorrarReserva.add(lblIntroducirDatosBorrarReserva);
		
		lblDniBorrarReserva = new JLabel("DNI:");
		lblDniBorrarReserva.setForeground(Color.WHITE);
		lblDniBorrarReserva.setFont(new Font("Arial", Font.BOLD, 15));
		lblDniBorrarReserva.setBounds(353, 266, 30, 14);
		BorrarReserva.add(lblDniBorrarReserva);
		
		formattedDniBorrarReserva = new JFormattedTextField(mf);
		formattedDniBorrarReserva.setBounds(393, 264, 111, 20);
		BorrarReserva.add(formattedDniBorrarReserva);
		
		lblCodigoReservBorrarReserva = new JLabel("CODIGO RESERVA:");
		lblCodigoReservBorrarReserva.setForeground(Color.WHITE);
		lblCodigoReservBorrarReserva.setFont(new Font("Arial", Font.BOLD, 15));
		lblCodigoReservBorrarReserva.setBounds(244, 315, 140, 14);
		BorrarReserva.add(lblCodigoReservBorrarReserva);
		
		formattedCodigoReserva = new JFormattedTextField(mft);
		formattedCodigoReserva.setBounds(393, 313, 111, 20);
		BorrarReserva.add(formattedCodigoReserva);
		
		lblFondoBorrarReserva = new JLabel("New label");
		lblFondoBorrarReserva.setIcon(new ImageIcon("C:\\Workspace\\AAAAReto\\cosas\\fondo1.png"));
		lblFondoBorrarReserva.setBounds(0, 0, 924, 601);
		BorrarReserva.add(lblFondoBorrarReserva);

		contentPane.add(MenuOpcion, "name_405172524934464");
		MenuOpcion.setLayout(null);
		
		Habitaciones = new JPanel();
		contentPane.add(Habitaciones, "name_87439071332632");
		Habitaciones.setLayout(null);
		
		lblescogerHotelHabitaciones = new JLabel("SELECCIONE LA HABITACION");
		lblescogerHotelHabitaciones.setForeground(Color.WHITE);
		lblescogerHotelHabitaciones.setFont(new Font("Arial", Font.BOLD, 33));
		lblescogerHotelHabitaciones.setBounds(199, 21, 495, 58);
		Habitaciones.add(lblescogerHotelHabitaciones);
				
		scrollpaneHabitacions = new JScrollPane();
		Panel_SCROLL_3 = new JPanel();
		scrollpaneHabitacions.setBounds(10, 90, 904, 185);
		scrollpaneHabitacions.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		Habitaciones.add(scrollpaneHabitacions);
		scrollpaneHabitacions.setViewportView(Panel_SCROLL_3);
		Panel_SCROLL_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnAtrasHabitacions = new JButton("ATRAS");
		btnAtrasHabitacions.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtrasHabitacions.setBounds(-13, 565, 198, 48);
		Habitaciones.add(btnAtrasHabitacions);
		
		btnBuscarReservasHabitaciones = new JButton("VER DISPONIBILIDAD");
		btnBuscarReservasHabitaciones.setFont(new Font("Arial", Font.BOLD, 11));
		btnBuscarReservasHabitaciones.setBounds(364, 289, 148, 23);
		Habitaciones.add(btnBuscarReservasHabitaciones);
		
		scrollPaneCamas = new JScrollPane();
		scrollPaneCamas.setBounds(10, 411, 904, 120);
		Habitaciones.add(scrollPaneCamas);
		
		JList listCamas = new JList();
		scrollPaneCamas.setViewportView(listCamas);
		DefaultListModel modelo = new DefaultListModel();
		
		btnContinuarHabitaciones = new JButton("CONTINUAR");
		btnContinuarHabitaciones.setFont(new Font("Arial", Font.BOLD, 15));
		btnContinuarHabitaciones.setBounds(738, 565, 198, 48);
		Habitaciones.add(btnContinuarHabitaciones);
		
		lblCamas = new JLabel("CAMAS");
		lblCamas.setForeground(Color.WHITE);
		lblCamas.setFont(new Font("Arial", Font.BOLD, 23));
		lblCamas.setBounds(393, 342, 96, 58);
		Habitaciones.add(lblCamas);
				
		lblFonfoHabitaciones = new JLabel("New label");
		lblFonfoHabitaciones.setIcon(new ImageIcon("C:\\Workspace\\AAAAReto\\cosas\\fondo1.png"));
		lblFonfoHabitaciones.setBounds(0, 0, 924, 601);
		Habitaciones.add(lblFonfoHabitaciones);
		
		HabitacionesNoHotel = new JPanel();
		contentPane.add(HabitacionesNoHotel, "name_691435927173534");
		HabitacionesNoHotel.setLayout(null);
		
		btnAtrasHabitacionesNoHotel = new JButton("ATRAS");
		btnAtrasHabitacionesNoHotel.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtrasHabitacionesNoHotel.setBounds(-13, 565, 198, 48);
		HabitacionesNoHotel.add(btnAtrasHabitacionesNoHotel);
		
		btnContinuarHabitacionesNoHotel = new JButton("CONTINUAR");
		btnContinuarHabitacionesNoHotel.setFont(new Font("Arial", Font.BOLD, 15));
		btnContinuarHabitacionesNoHotel.setBounds(738, 565, 198, 48);
		HabitacionesNoHotel.add(btnContinuarHabitacionesNoHotel);
		
		scrollPaneHabitacionNoHotel = new JScrollPane();
		scrollPaneHabitacionNoHotel.setBounds(110, 186, 713, 210);
		HabitacionesNoHotel.add(scrollPaneHabitacionNoHotel);
		
		JList listHabitacion = new JList();
		scrollPaneHabitacionNoHotel.setViewportView(listHabitacion);
		DefaultListModel modelo2 = new DefaultListModel();
		
		lblHabitacionesDisponiblesNoHotel = new JLabel("NUMERO DE HABITACIONES");
		lblHabitacionesDisponiblesNoHotel.setForeground(Color.WHITE);
		lblHabitacionesDisponiblesNoHotel.setFont(new Font("Arial", Font.BOLD, 33));
		lblHabitacionesDisponiblesNoHotel.setBounds(248, 43, 473, 90);
		HabitacionesNoHotel.add(lblHabitacionesDisponiblesNoHotel);
		
		btnVerDisponibilidadNoHotel = new JButton("VER DISPONIBILIDAD");
		btnVerDisponibilidadNoHotel.setFont(new Font("Arial", Font.BOLD, 11));
		btnVerDisponibilidadNoHotel.setBounds(378, 429, 148, 23);
		HabitacionesNoHotel.add(btnVerDisponibilidadNoHotel);
		
		lblFondoHabitacionesNoHotel = new JLabel("New label");
		lblFondoHabitacionesNoHotel.setIcon(new ImageIcon("C:\\Workspace\\AAAAReto\\cosas\\fondo1.png"));
		lblFondoHabitacionesNoHotel.setBounds(0, 0, 924, 601);
		HabitacionesNoHotel.add(lblFondoHabitacionesNoHotel);
		
		Login = new JPanel();
		contentPane.add(Login, "name_265169896312071");
		Login.setLayout(null);
		
		lblDni = new JLabel("DNI: ");
		lblDni.setForeground(Color.WHITE);
		lblDni.setFont(new Font("Arial", Font.BOLD, 15));
		lblDni.setBounds(355, 257, 34, 14);
		Login.add(lblDni);
		

		formatteddni = new JFormattedTextField(mf);
		formatteddni.setBounds(399, 255, 122, 20);
		Login.add(formatteddni);
		
		lblContraseña = new JLabel("CONTRASE\u00D1A: ");
		lblContraseña.setForeground(Color.WHITE);
		lblContraseña.setFont(new Font("Arial", Font.BOLD, 15));
		lblContraseña.setBounds(277, 301, 112, 14);
		Login.add(lblContraseña);
		
		passworContraseña = new JPasswordField();
		passworContraseña.setBounds(399, 299, 122, 20);
		Login.add(passworContraseña);
		
		lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 37));
		lblNewLabel.setBounds(407, 82, 122, 64);
		Login.add(lblNewLabel);
		
		btnRegistrarse = new JButton("REGISTRASRSE");
		btnRegistrarse.setFont(new Font("Arial", Font.BOLD, 15));
		btnRegistrarse.setBounds(373, 565, 198, 48);
		Login.add(btnRegistrarse);
		
		btnAtrasLogin = new JButton("ATRAS");
		btnAtrasLogin.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtrasLogin.setBounds(-13, 565, 198, 48);
		Login.add(btnAtrasLogin);
		
		btnContinuarLogin = new JButton("CONTINUAR");
		btnContinuarLogin.setFont(new Font("Arial", Font.BOLD, 15));
		btnContinuarLogin.setBounds(738, 565, 198, 48);
		Login.add(btnContinuarLogin);
		
		lbFondoLogin = new JLabel("New label");
		lbFondoLogin.setIcon(new ImageIcon("C:\\Workspace\\AAAAReto\\cosas\\fondo1.png"));
		lbFondoLogin.setBounds(0, 0, 924, 601);
		Login.add(lbFondoLogin);
		
		Registro = new JPanel();
		contentPane.add(Registro, "name_267124957995409");
		Registro.setLayout(null);
		
		lblRegistroRegistro = new JLabel("REGISTRO");
		lblRegistroRegistro.setForeground(Color.WHITE);
		lblRegistroRegistro.setFont(new Font("Arial", Font.BOLD, 37));
		lblRegistroRegistro.setBounds(353, 82, 207, 64);
		Registro.add(lblRegistroRegistro);
		
		lblDniRegistro = new JLabel("DNI:");
		lblDniRegistro.setForeground(Color.WHITE);
		lblDniRegistro.setFont(new Font("Arial", Font.BOLD, 15));
		lblDniRegistro.setBounds(350, 237, 30, 14);
		Registro.add(lblDniRegistro);
		
		formattedDniRegistro = new JFormattedTextField(mf);
		formattedDniRegistro.setBounds(405, 235, 104, 20);
		Registro.add(formattedDniRegistro);
		
		lblNombreRegistro = new JLabel("NOMBRE:");
		lblNombreRegistro.setForeground(Color.WHITE);
		lblNombreRegistro.setFont(new Font("Arial", Font.BOLD, 15));
		lblNombreRegistro.setBounds(308, 274, 72, 14);
		Registro.add(lblNombreRegistro);
		
		textNombreRegistro = new JTextField();
		textNombreRegistro.setBounds(405, 272, 104, 20);
		Registro.add(textNombreRegistro);
		textNombreRegistro.setColumns(10);
		
		lblApellidoRegistro = new JLabel("APELLIDO:");
		lblApellidoRegistro.setForeground(Color.WHITE);
		lblApellidoRegistro.setFont(new Font("Arial", Font.BOLD, 15));
		lblApellidoRegistro.setBounds(299, 325, 81, 14);
		Registro.add(lblApellidoRegistro);
		
		textApellidoRegistro = new JTextField();
		textApellidoRegistro.setBounds(405, 323, 104, 20);
		Registro.add(textApellidoRegistro);
		textApellidoRegistro.setColumns(10);
		
		lblEdadRegistro = new JLabel("EDAD:");
		lblEdadRegistro.setForeground(Color.WHITE);
		lblEdadRegistro.setFont(new Font("Arial", Font.BOLD, 15));
		lblEdadRegistro.setBounds(334, 375, 46, 14);
		Registro.add(lblEdadRegistro);
		
		formattedEdadRegistro = new JFormattedTextField(mft);
		formattedEdadRegistro.setBounds(405, 373, 104, 20);
		Registro.add(formattedEdadRegistro);
		
		lblSexoRegistro = new JLabel("SEXO:");
		lblSexoRegistro.setForeground(Color.WHITE);
		lblSexoRegistro.setFont(new Font("Arial", Font.BOLD, 15));
		lblSexoRegistro.setBounds(334, 420, 46, 14);
		Registro.add(lblSexoRegistro);
		
		rdbtnHombreRegistro = new JRadioButton("Hombre");
		rdbtnHombreRegistro.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnHombreRegistro.setBounds(405, 411, 81, 23);
		Registro.add(rdbtnHombreRegistro);
		
		rdbtnMujerRegistro = new JRadioButton("Mujer");
		rdbtnMujerRegistro.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnMujerRegistro.setBounds(498, 411, 81, 23);
		Registro.add(rdbtnMujerRegistro);
		
		lblContraseñaRegistro = new JLabel("CONTRASE\u00D1A:");
		lblContraseñaRegistro.setForeground(Color.WHITE);
		lblContraseñaRegistro.setFont(new Font("Arial", Font.BOLD, 15));
		lblContraseñaRegistro.setBounds(272, 469, 108, 14);
		Registro.add(lblContraseñaRegistro);
		
		passwordContraseñaRegistro = new JPasswordField();
		passwordContraseñaRegistro.setBounds(405, 467, 104, 20);
		Registro.add(passwordContraseñaRegistro);
		
		btnAtrasRegistro = new JButton("ATRAS");
		btnAtrasRegistro.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtrasRegistro.setBounds(-13, 565, 198, 48);
		Registro.add(btnAtrasRegistro);
		
		btnIngresarRegistro = new JButton("INGRESAR");
		btnIngresarRegistro.setFont(new Font("Arial", Font.BOLD, 15));
		btnIngresarRegistro.setBounds(738, 565, 198, 48);
		Registro.add(btnIngresarRegistro);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Workspace\\AAAAReto\\cosas\\fondo1.png"));
		lblNewLabel_1.setBounds(0, 0, 924, 601);
		Registro.add(lblNewLabel_1);
		
		BasesLegales = new JPanel();
		contentPane.add(BasesLegales, "name_1724439046484710");
		BasesLegales.setLayout(null);
		
		scrollPaneBasesLegales = new JScrollPane();
		scrollPaneBasesLegales.setBounds(31, 32, 866, 426);
		BasesLegales.add(scrollPaneBasesLegales);
		baseslegales = new JTextPane();
		scrollPaneBasesLegales.setViewportView(baseslegales);
		
		baseslegales.getStyledDocument().insertString(baseslegales.getStyledDocument().getLength(),blegales, null);
		
		btnContinuarBasesLegales = new JButton("CONTINUAR");
		btnContinuarBasesLegales.setFont(new Font("Arial", Font.BOLD, 15));
		btnContinuarBasesLegales.setBounds(738, 565, 198, 48);
		BasesLegales.add(btnContinuarBasesLegales);
		btnContinuarBasesLegales.setEnabled(false);
		
		rdbtnAceptarCondiciones = new JRadioButton("ACEPTO LAS CONDICIONES DE USO");
		rdbtnAceptarCondiciones.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnAceptarCondiciones.setBounds(31, 465, 293, 23);
		BasesLegales.add(rdbtnAceptarCondiciones);
		
		lblFondoBasesLegales = new JLabel("New label");
		lblFondoBasesLegales.setIcon(new ImageIcon("C:\\Users\\eclip\\Desktop\\AAAAReto\\cosas\\fondo1.png"));
		lblFondoBasesLegales.setBounds(0, 0, 924, 601);
		BasesLegales.add(lblFondoBasesLegales);
		
		Precio = new JPanel();//panel total--------------------------
		contentPane.add(Precio, "name_405198168381402");
		Precio.setLayout(null);
		
		Ticket = new JPanel();//panel ticke--------------------------------
		contentPane.add(Ticket, "name_405203006465190");
		Ticket.setLayout(null);
//botones-----------------------------------------------------------------------------------------------------------------------------------------------	
		textField = new JTextField();
		textField.setBounds(234, 227, 485, 226);
		textField.setText(reserva.getPrecio()+" \u20ac");
	
		textField.setColumns(10);
		
		lblReserva = new JLabel("AQUI ESTA SU RESERVA");
		lblReserva.setForeground(Color.WHITE);
		lblReserva.setFont(new Font("Arial", Font.BOLD, 37));
		lblReserva.setBounds(227, 55, 477, 91);
		Ticket.add(lblReserva);
		
		btnFin = new JButton("FINALIZAR");
		btnFin.setFont(new Font("Arial", Font.BOLD, 15));
		btnFin.setBounds(738, 565, 198, 48);
		Ticket.add(btnFin);
		
		btnAtrasTicket = new JButton("MAS RESERVAS");
		btnAtrasTicket.setFont(new Font("Arial", Font.BOLD, 15));
		btnAtrasTicket.setBounds(-13, 565, 198, 48);
		Ticket.add(btnAtrasTicket);
		
		scrollPaneTicket  = new JScrollPane();
		scrollPaneTicket.setBounds(227, 191, 477, 342);
		Ticket.add(scrollPaneTicket);
		
		textReserva = new JTextPane();
		scrollPaneTicket.setViewportView(textReserva);
		textReserva.setEditable(false);
		
		lblTicket = new JLabel("New label");
		lblTicket.setIcon(new ImageIcon("C:\\Workspace\\AAAAReto\\cosas\\fondo1.png"));
		lblTicket.setBounds(0, 0, 924, 601);
		Ticket.add(lblTicket);
		
		rdbtnHotel = new JRadioButton("HOTEL");
		rdbtnHotel.setForeground(Color.BLACK);
		rdbtnHotel.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnHotel.setBounds(207, 22, 109, 23);
		MenuOpcion.add(rdbtnHotel);
				
		rdbtnCasa = new JRadioButton("CASA");
		rdbtnCasa.setForeground(Color.BLACK);
		rdbtnCasa.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnCasa.setBounds(333, 22, 109, 23);
		MenuOpcion.add(rdbtnCasa);
				
		rdbtnApartamento = new JRadioButton("APARTAMENTO");
		rdbtnApartamento.setForeground(Color.BLACK);
		rdbtnApartamento.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnApartamento.setBounds(459, 22, 139, 23);
		MenuOpcion.add(rdbtnApartamento);
				
		JButton boton[] = new JButton[alojamiento.size()];
		JButton boton2[] = new JButton[alojamiento.size()];
		JButton boton3[] = new JButton[habitacion.size()];
		
		lblAlojamiento = new JLabel("ALOJAMIENTO:");
		lblAlojamiento.setForeground(Color.WHITE);
		lblAlojamiento.setFont(new Font("Arial", Font.BOLD, 15));
		lblAlojamiento.setBounds(72, 26, 111, 14);
		MenuOpcion.add(lblAlojamiento);
		
		lblDestino = new JLabel("DESTINO:");
		lblDestino.setForeground(Color.WHITE);
		lblDestino.setFont(new Font("Arial", Font.BOLD, 15));
		lblDestino.setBounds(111, 73, 72, 16);
		MenuOpcion.add(lblDestino);
		
		lblFechaida = new JLabel("FECHA ENTRADA:");
		lblFechaida.setForeground(Color.WHITE);
		lblFechaida.setFont(new Font("Arial", Font.BOLD, 15));
		lblFechaida.setBounds(54, 126, 129, 14);
		MenuOpcion.add(lblFechaida);
		
		lblFechavuelta = new JLabel("FECHA SALIDA:");
		lblFechavuelta.setForeground(Color.WHITE);
		lblFechavuelta.setFont(new Font("Arial", Font.BOLD, 15));
		lblFechavuelta.setBounds(67, 174, 116, 14);
		MenuOpcion.add(lblFechavuelta);
			
		btnMenuOpcionAtras = new JButton("ATRAS");
		btnMenuOpcionAtras.setFont(new Font("Arial", Font.BOLD, 15));
		btnMenuOpcionAtras.setBounds(-13, 565, 198, 48);
		MenuOpcion.add(btnMenuOpcionAtras);
		
		//----------------------------------------------------------------------------
		ScrollMenuopcion = new JScrollPane();
		Panel_ScrollMenuopcion = new JPanel();
		ScrollMenuopcion.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		ScrollMenuopcion.setBounds(390, 64, 524, 333);
		MenuOpcion.add(ScrollMenuopcion);
		ScrollMenuopcion.setViewportView(Panel_ScrollMenuopcion);
		Panel_ScrollMenuopcion.setLayout(new GridLayout(0, 1, 0, 0));
		//----------------------------------------------------------------------------
		
		textUbicacion = new JTextField();
		textUbicacion.setBounds(207, 72, 109, 20);
		textUbicacion.setHorizontalAlignment(SwingConstants.RIGHT);
		textUbicacion.setColumns(10);
		MenuOpcion.add(textUbicacion);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setFont(new Font("Arial", Font.BOLD, 15));
		btnBuscar.setBounds(390, 423, 524, 81);
		MenuOpcion.add(btnBuscar);
		
		dateFechaIda = new JDateChooser();
		dateFechaIda.setBounds(207, 120, 109, 20);
		MenuOpcion.add(dateFechaIda);
		
		dateFechaVuelta = new JDateChooser();
		dateFechaVuelta.setBounds(207, 168, 109, 20);
		MenuOpcion.add(dateFechaVuelta);
		
		metodos.limitar(dateFechaIda , dateFechaVuelta);
		
		
		lblEstival = new JLabel("*Estival Incremento 10%");
		lblEstival.setForeground(Color.WHITE);
		lblEstival.setFont(new Font("Bahnschrift", Font.ITALIC, 15));
		lblEstival.setBounds(215, 581, 198, 14);
		MenuOpcion.add(lblEstival);
		
		lblFestivo = new JLabel("*Festivo Incremento 20%");
		lblFestivo.setForeground(Color.WHITE);
		lblFestivo.setFont(new Font("Bahnschrift", Font.ITALIC, 15));
		lblFestivo.setBounds(437, 581, 211, 14);
		MenuOpcion.add(lblFestivo);
		
		JLabel lblFestivoEstival = new JLabel("*Festivo y Estival Incremento 30%");
		lblFestivoEstival.setForeground(Color.WHITE);
		lblFestivoEstival.setFont(new Font("Bahnschrift", Font.ITALIC, 15));
		lblFestivoEstival.setBounds(676, 581, 238, 14);
		MenuOpcion.add(lblFestivoEstival);
		
		JLabel lblCodigoDescuento = new JLabel("*CODIGO DESCUENTO:");
		lblCodigoDescuento.setForeground(Color.WHITE);
		lblCodigoDescuento.setFont(new Font("Arial", Font.BOLD, 15));
		lblCodigoDescuento.setBounds(10, 275, 181, 14);
		MenuOpcion.add(lblCodigoDescuento);
		
		textCodigoDescuento = new JTextField();
		textCodigoDescuento.setBounds(209, 273, 107, 20);
		MenuOpcion.add(textCodigoDescuento);
		textCodigoDescuento.setColumns(10);
		
		lblError = new JLabel("New label");
		lblError.setIcon(new ImageIcon("C:\\Workspace\\AAAAReto\\cosas\\images.png"));
		lblError.setBounds(337, 253, 38, 36);
		MenuOpcion.add(lblError);
		lblError.setVisible(false);
		
		JLabel lblNumeroPersonas = new JLabel("PERSONAS:");
		lblNumeroPersonas.setForeground(Color.WHITE);
		lblNumeroPersonas.setFont(new Font("Arial", Font.BOLD, 15));
		lblNumeroPersonas.setBounds(90, 219, 95, 18);
		MenuOpcion.add(lblNumeroPersonas);
		
		
		JComboBox comboBoxPersonas = new JComboBox();
		for(int i=1; i<11;i++) {
			comboBoxPersonas.addItem(i); 
		}

		comboBoxPersonas.setBounds(207, 219, 109, 20);
		MenuOpcion.add(comboBoxPersonas);
		
		rdbtnWIFI = new JRadioButton("WIFI");
		rdbtnWIFI.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnWIFI.setBounds(10, 319, 139, 23);
		MenuOpcion.add(rdbtnWIFI);
		
		rdbtnPiscina = new JRadioButton("PISCINA");
		rdbtnPiscina.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnPiscina.setBounds(177, 319, 139, 23);
		MenuOpcion.add(rdbtnPiscina);
		
		rdbtnSpa = new JRadioButton("SPA");
		rdbtnSpa.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnSpa.setBounds(10, 374, 139, 23);
		MenuOpcion.add(rdbtnSpa);
		
		rdbtnParking = new JRadioButton("PARKING");
		rdbtnParking.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnParking.setBounds(177, 374, 139, 23);
		MenuOpcion.add(rdbtnParking);
		
		rdbtnAireAcondicionado = new JRadioButton("A/C");
		rdbtnAireAcondicionado.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnAireAcondicionado.setBounds(10, 423, 139, 23);
		MenuOpcion.add(rdbtnAireAcondicionado);
		
		rdbtnRestaurante = new JRadioButton("RESTAURANTE");
		rdbtnRestaurante.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnRestaurante.setBounds(177, 423, 139, 23);
		MenuOpcion.add(rdbtnRestaurante);
		
		rdbtnBar = new JRadioButton("BAR");
		rdbtnBar.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnBar.setBounds(10, 473, 139, 23);
		MenuOpcion.add(rdbtnBar);
		
		rdbtnGym = new JRadioButton("GYM");
		rdbtnGym.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnGym.setBounds(177, 473, 139, 23);
		MenuOpcion.add(rdbtnGym);

		lblFondoMenuOpcion = new JLabel("New label");
		lblFondoMenuOpcion.setForeground(Color.WHITE);
		lblFondoMenuOpcion.setIcon(new ImageIcon("C:\\Workspace\\AAAAReto\\cosas\\fondo1.png"));
		lblFondoMenuOpcion.setBounds(0, 0, 924, 601);
		MenuOpcion.add(lblFondoMenuOpcion);

		lblDineroFaltante = new JLabel("PRECIO HOTEL:");
		lblDineroFaltante.setForeground(Color.WHITE);
		lblDineroFaltante.setFont(new Font("Arial", Font.BOLD, 15));
		lblDineroFaltante.setBounds(534, 327, 118, 16);
		Precio.add(lblDineroFaltante);
		
		lblDineroIntroducido = new JLabel("DINERO INTRODUCIDO:");
		lblDineroIntroducido.setForeground(Color.WHITE);
		lblDineroIntroducido.setFont(new Font("Arial", Font.BOLD, 15));
		lblDineroIntroducido.setBounds(471, 364, 180, 16);
		Precio.add(lblDineroIntroducido);
		
		lblVueltas = new JLabel("VUELTAS:");
		lblVueltas.setForeground(Color.WHITE);
		lblVueltas.setFont(new Font("Arial", Font.BOLD, 15));
		lblVueltas.setBounds(574, 404, 78, 14);
		Precio.add(lblVueltas);
		
		btnPrecioAtras = new JButton("ATRAS");
		btnPrecioAtras.setFont(new Font("Arial", Font.BOLD, 15));
		btnPrecioAtras.setBounds(-13, 565, 198, 48);
		Precio.add(btnPrecioAtras);
		
		
//botones--------------------------------------------------------------------------------------------------------------
		JButton billete200 = new JButton();
		billete200.setText("200\u20AC");
		JButton billete100 = new JButton();
		billete100.setText("100\u20AC");
		JButton billete50 = new JButton();
		billete50.setText("50\u20AC");
		JButton billete20 = new JButton();
		billete20.setText("20\u20AC");
		JButton billete10 = new JButton();
		billete10.setText("10\u20AC");
		JButton billete5 = new JButton();
		billete5.setText("5\u20AC");
		JButton moneda2e = new JButton();
		moneda2e.setText("2\u20AC");
		JButton moneda1e = new JButton();
		moneda1e.setText("1\u20AC");
		JButton moneda50cent = new JButton();
		moneda50cent.setText("50cent");
		JButton moneda20cent = new JButton();
		moneda20cent.setText("20cent");
		JButton moneda10cent = new JButton();
		moneda10cent.setText("10cent");
		JButton moneda5cent = new JButton();
		moneda5cent.setText("5cent");
		JButton moneda2cent = new JButton();
		moneda2cent.setText("2cent");
		JButton moneda1cent = new JButton();
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
		
		btnPrecioContinuar = new JButton("CONTINUAR");
		btnPrecioContinuar.setFont(new Font("Arial", Font.BOLD, 15));
		btnPrecioContinuar.setBounds(738, 565, 198, 48);
		Precio.add(btnPrecioContinuar);
		
		billete200.setFont(new Font("Arial", Font.BOLD, 20));
		billete200.setBounds(113, 65, 106, 55);
		Precio.add(billete200);
		
		
		billete100.setFont(new Font("Arial", Font.BOLD, 20));
		billete100.setBounds(266, 80, 106, 70);
		Precio.add(billete100);
		
		
		billete50.setFont(new Font("Arial", Font.BOLD, 20));
		billete50.setBounds(471, 65, 106, 39);
		Precio.add(billete50);
		
		
		billete20.setFont(new Font("Arial", Font.BOLD, 20));
		billete20.setBounds(679, 65, 106, 39);
		Precio.add(billete20);
		
		
		billete10.setFont(new Font("Arial", Font.BOLD, 20));
		billete10.setBounds(52, 143, 106, 39);
		Precio.add(billete10);
		
		
		billete5.setFont(new Font("Arial", Font.BOLD, 20));
		billete5.setBounds(266, 143, 106, 39);
		Precio.add(billete5);
		
		
		moneda2e.setFont(new Font("Arial", Font.BOLD, 20));
		moneda2e.setBounds(471, 143, 106, 39);
		Precio.add(moneda2e);
		
		
		moneda1e.setFont(new Font("Arial", Font.BOLD, 20));
		moneda1e.setBounds(679, 143, 106, 39);
		Precio.add(moneda1e);
		
		
		moneda50cent.setFont(new Font("Arial", Font.BOLD, 20));
		moneda50cent.setBounds(52, 222, 106, 39);
		Precio.add(moneda50cent);
		
		
		moneda20cent.setFont(new Font("Arial", Font.BOLD, 20));
		moneda20cent.setBounds(266, 222, 106, 39);
		Precio.add(moneda20cent);
		
		
		moneda10cent.setFont(new Font("Arial", Font.BOLD, 20));
		moneda10cent.setBounds(471, 222, 106, 39);
		Precio.add(moneda10cent);
		
		
		moneda5cent.setFont(new Font("Arial", Font.BOLD, 20));
		moneda5cent.setBounds(679, 222, 106, 39);
		Precio.add(moneda5cent);
		
		
		moneda2cent.setFont(new Font("Arial", Font.BOLD, 20));
		moneda2cent.setBounds(52, 295, 106, 39);
		Precio.add(moneda2cent);
		
		
		moneda1cent.setFont(new Font("Arial", Font.BOLD, 20));
		moneda1cent.setBounds(266, 295, 106, 39);
		Precio.add(moneda1cent);
		
		DineroIntroducido = new JTextField();
		DineroIntroducido.setHorizontalAlignment(SwingConstants.RIGHT);
		DineroIntroducido.setEditable(false);
		DineroIntroducido.setColumns(10);
		DineroIntroducido.setBounds(694, 360, 101, 26);
		Precio.add(DineroIntroducido);
		
		DineroFaltante = new JTextField();
		DineroFaltante.setBounds(694, 323, 101, 26);
		Precio.add(DineroFaltante);
		DineroFaltante.setColumns(10);
		
		
		DineroIntroducido.setBounds(694, 360, 101, 26);
		Precio.add(DineroIntroducido);
		DineroIntroducido.setColumns(10);
		
		Vueltas = new JTextField();
		Vueltas.setBounds(694, 402, 101, 26);
		Precio.add(Vueltas);
		Vueltas.setColumns(10);
//-------------------------------------------------------------
	
		
	
		btnBuscarReservasHabitaciones.setEnabled(false);
//radiobotones----------------------------------------------------------------------------------
	//botones Habitacion crear	
		for(int i=0;i<habitacion.size();i++) {
			//////-------------------------------------------------
			
				boton3[i] = new JButton("Codigo Habitacion: "+habitacion.get(i).getCodigohabitacion()+",  Codigo Hotel: "+habitacion.get(i).getCodigohotel()+",  Numero Camas: "+habitacion.get(i).getNumerocamas()+",  Precio: "+habitacion.get(i).getPrecio());
				Panel_SCROLL_3.add(boton3[i]);
				
				boton3[i].setActionCommand(Integer.toString((habitacion.get(i).getCodigohabitacion())));
				boton3[i].setEnabled(false);
				boton3[i].setVisible(false);
		
		};
//-------------------------------------------------
		btnContinuarHabitaciones.setEnabled(false);
		btnContinuarHabitacionesNoHotel.setEnabled(false);
//---------------------------------------------------------		
		rdbtnWIFI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnWIFI.isSelected()) {
					wifi=true;
					System.out.println("wifi: "+wifi);
					
					
					
				}
				if(!rdbtnWIFI.isSelected()) {
					wifi=false;
					System.out.println("wifi: "+wifi);
				}

			}
		});
		rdbtnPiscina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnPiscina.isSelected()) {
					piscina=true;
					System.out.println("piscina: "+piscina);
					
					
					
				}
				if(!rdbtnPiscina.isSelected()) {
					piscina=false;
					System.out.println("piscina: "+piscina);
				}

			}
		});
		rdbtnSpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnSpa.isSelected()) {
					spa=true;
					System.out.println("spa: "+spa);
					
					
					
				}
				if(!rdbtnSpa.isSelected()) {
					spa=false;
					System.out.println("spa: "+spa);
				}

			}
		});
		rdbtnParking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnParking.isSelected()) {
					parking=true;
					System.out.println("parking: "+parking);
					
					
					
				}
				if(!rdbtnParking.isSelected()) {
					parking=false;
					System.out.println("parking: "+parking);
				}

			}
		});
		rdbtnAireAcondicionado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnAireAcondicionado.isSelected()) {
					aireacondicionado=true;
					System.out.println("aireacondicionado: "+aireacondicionado);
					
					
					
				}
				if(!rdbtnAireAcondicionado.isSelected()) {
					aireacondicionado=false;
					System.out.println("aireacondicionado: "+aireacondicionado);
				}

			}
		});
		rdbtnRestaurante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnRestaurante.isSelected()) {
					restaurante=true;
					System.out.println("restaurante: "+restaurante);
					
					
					
				}
				if(!rdbtnRestaurante.isSelected()) {
					restaurante=false;
					System.out.println("restaurante: "+restaurante);
				}

			}
		});
		rdbtnBar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnBar.isSelected()) {
					bar=true;
					System.out.println("bar: "+bar);
					
					
					
				}
				if(!rdbtnBar.isSelected()) {
					bar=false;
					System.out.println("bar: "+bar);
				}

			}
		});
		rdbtnGym.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnGym.isSelected()) {
					gym=true;
					System.out.println("gym: "+gym);
					
					
					
				}
				if(!rdbtnGym.isSelected()) {
					gym=false;
					System.out.println("gym: "+gym);
				}

			}
		});
//---------------------------------------------------------		
	 	rdbtnHotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnHotel.isSelected()) {
					rdbtnCasa.setEnabled(false);
					rdbtnApartamento.setEnabled(false);
					contador=1;
		
					
					
					
				}
				if(!rdbtnHotel.isSelected()) {
					rdbtnCasa.setEnabled(true);
					rdbtnApartamento.setEnabled(true);
				
					
				}

			}
		});		
		
		rdbtnCasa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnCasa.isSelected()) {
					rdbtnHotel.setEnabled(false);
					rdbtnApartamento.setEnabled(false);	
					contador=2;

				}
				if(!rdbtnCasa.isSelected()) {
					rdbtnHotel.setEnabled(true);
					rdbtnApartamento.setEnabled(true);	
				}

			}
		});	
		
		rdbtnApartamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnApartamento.isSelected()) {
					rdbtnHotel.setEnabled(false);
					rdbtnCasa.setEnabled(false);
					contador=3;

	
				}
				if(!rdbtnApartamento.isSelected()) {
					
					rdbtnHotel.setEnabled(true);
					rdbtnCasa.setEnabled(true);	
				}

			}
		});	
		
		rdbtnHombreRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnHombreRegistro.isSelected()) {
					rdbtnMujerRegistro.setEnabled(false);
						cliente.setSexo("Hombre");
				}
				if(!rdbtnHombreRegistro.isSelected()) {
					rdbtnMujerRegistro.setEnabled(true);
						
				}

			}
		});	
		
		rdbtnMujerRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnMujerRegistro.isSelected()) {
					rdbtnHombreRegistro.setEnabled(false);
					cliente.setSexo("Mujer");
				}
				if(!rdbtnMujerRegistro.isSelected()) {
					rdbtnHombreRegistro.setEnabled(true);
						
				}

			}
		});
		rdbtnAceptarCondiciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnAceptarCondiciones.isSelected()) {
					btnContinuarBasesLegales.setEnabled(true);
				}
				if(!rdbtnAceptarCondiciones.isSelected()) {
					btnContinuarBasesLegales.setEnabled(false);
						
				}

			}
		});

//botones Menu Opcion---------------------------------------------------------------------------
	//metodos.botonesmenu2(alojamiento, boton2, Panel_ScrollMenuopcion);
	
	for(int i=0;i<alojamiento.size();i++) {
		
		if(alojamiento.get(i) instanceof Hotel) {
		boton2[i] = new JButton("Nombre: "+((Hotel)alojamiento.get(i)).getNombreAlojamiento()+",  Ubicacion: "+((Hotel)alojamiento.get(i)).getUbicacion());
		Panel_ScrollMenuopcion.add(boton2[i]);
		
		boton2[i].setActionCommand((((Hotel)alojamiento.get(i)).getNombreAlojamiento()));
		boton2[i].setEnabled(false);
		boton2[i].setVisible(false);
		
		}
		
		if(alojamiento.get(i) instanceof Casa) {
			boton2[i] = new JButton("Nombre: "+((Casa)alojamiento.get(i)).getNombreAlojamiento()+",  Ubicacion: "+((Casa)alojamiento.get(i)).getUbicacion()+", Precio: "+((Casa)alojamiento.get(i)).getPrecio());
			Panel_ScrollMenuopcion.add(boton2[i]);
			
			boton2[i].setActionCommand((((Casa)alojamiento.get(i)).getNombreAlojamiento()));
			boton2[i].setEnabled(false);
			boton2[i].setVisible(false);
			
		}
		
		if(alojamiento.get(i) instanceof Apartamento) {
			boton2[i] = new JButton("Nombre: "+((Apartamento)alojamiento.get(i)).getNombreAlojamiento()+",  Ubicacion: "+((Apartamento)alojamiento.get(i)).getUbicacion()+", Precio: "+((Apartamento)alojamiento.get(i)).getPrecio());
			Panel_ScrollMenuopcion.add(boton2[i]);
			
			boton2[i].setActionCommand((((Apartamento)alojamiento.get(i)).getNombreAlojamiento()));
			boton2[i].setEnabled(false);
			boton2[i].setVisible(false);
		}
				
	};

//-------------------------------------------------------------------------------------------------------------		
//setactioncomand boton Mneuopcion		
	btnBuscar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		//	System.out.println(comboBoxPersonas.getSelectedItem());
			personas=(int) comboBoxPersonas.getSelectedItem();
			reserva.setNumeropresonas(personas);
			
			if(rdbtnHotel.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Barakaldo") || rdbtnHotel.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Bilbao") || rdbtnHotel.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Santurce") || rdbtnHotel.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Las Arenas")) {
			//metodos.boton2accionlistener(alojamiento, boton2, textUbicacion, rdbtnHotel);
			contador=1;
			
			//--codigo de descuento
			//metodos.codigodescuentoerror(textCodigoDescuento, lblError, codigodescuento);
			//--
			
				for(int i=0;i<alojamiento.size();i++) {
					boton2[i].setVisible(false);

					if(alojamiento.get(i) instanceof Hotel) {
						if(textUbicacion.getText().equals(((Hotel)alojamiento.get(i)).getUbicacion())) {
							
							
							boton2[i].setEnabled(true);
							boton2[i].setVisible(true);
							
							
						}
			
					}
	
					
						
				}
			
			}
			//-----------------------------
			else if(rdbtnCasa.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Barakaldo") || rdbtnCasa.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Bilbao") || rdbtnCasa.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Santurce") || rdbtnCasa.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Las Arenas")) {
				//metodos.boton2accionlistener(alojamiento, boton2, textUbicacion, rdbtnHotel);
			contador=2;
			
			//--codigo de descuento
			//metodos.codigodescuentoerror(textCodigoDescuento, lblError, codigodescuento);
			//--
					for(int i=0;i<alojamiento.size();i++) {
						boton2[i].setVisible(false);

			
						if(alojamiento.get(i) instanceof Casa) {
	                      if(textUbicacion.getText().equals(((Casa)alojamiento.get(i)).getUbicacion())) {
								
								
								boton2[i].setEnabled(true);
								boton2[i].setVisible(true);
								
								
							}
						}
			
						
							
					}
				
				}
			//-------------------------------------
			else if(rdbtnApartamento.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Barakaldo") || rdbtnApartamento.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Bilbao") || rdbtnApartamento.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Santurce") || rdbtnApartamento.isSelected() && dateFechaIda.getDate() != null && dateFechaVuelta.getDate()  != null && textUbicacion.getText().equals("Las Arenas")) {
				//metodos.boton2accionlistener(alojamiento, boton2, textUbicacion, rdbtnHotel);
				contador=3;
				
				//--codigo de descuento
				//metodos.codigodescuentoerror(textCodigoDescuento, lblError, codigodescuento);
				//--
			
					for(int i=0;i<alojamiento.size();i++) {
						boton2[i].setVisible(false);


						if(alojamiento.get(i) instanceof Apartamento) {
							 if(textUbicacion.getText().equals(((Apartamento)alojamiento.get(i)).getUbicacion())) {
									
									
									boton2[i].setEnabled(true);
									boton2[i].setVisible(true);
									
									
								}
						}
						
							
					}
				
				}
			
			else if(!textUbicacion.getText().equals("Barakaldo") && !textUbicacion.getText().equals("Bilbao") && !textUbicacion.getText().equals("Santurce") && !textUbicacion.getText().equals("Las Arenas") ) {
				//rdbtnHotel.setEnabled(false);
				JOptionPane.showMessageDialog(null, "Seleccione Ubicacion, Solo hay Disponibles, Bilbao, Santurce, Las Arenas, Barakaldo");
			}

			else if(dateFechaIda.getDate() == null) {
				JOptionPane.showMessageDialog(null, "Seleccione Fecha Entrada");
			}
			else if(dateFechaVuelta.getDate()  == null) {
				JOptionPane.showMessageDialog(null, "Seleccione Fecha Salida");
			}	

			else if(!rdbtnHotel.isSelected() || !rdbtnCasa.isSelected() || !rdbtnApartamento.isSelected()) {
				JOptionPane.showMessageDialog(null, "Seleccione la Opcion, Hotel, Casa o Apartamento");
			}
			
	
			
			
		}
	});	
//------------------------------------------------------------------------------------------------------
//final botonmenuopcion
//Botones MenuOpcion -----------------
		for(int i=0;i<alojamiento.size();i++) {
			
			boton2[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					dia_ida = Integer.toString(dateFechaIda.getCalendar().get(Calendar.DAY_OF_MONTH)); 
					mes_ida = Integer.toString(dateFechaIda.getCalendar().get(Calendar.MONTH) + 1);
					ano_ida = Integer.toString(dateFechaIda.getCalendar().get(Calendar.YEAR));
						
					dia_vuelta = Integer.toString(dateFechaVuelta.getCalendar().get(Calendar.DAY_OF_MONTH)); 
					mes_vuelta = Integer.toString(dateFechaVuelta.getCalendar().get(Calendar.MONTH) + 1);
			        ano_vuelta = Integer.toString(dateFechaVuelta.getCalendar().get(Calendar.YEAR));
					fechainicio=(ano_ida + "/" + mes_ida + "/" + dia_ida); 
					fechafin=(ano_vuelta + "/" + mes_vuelta + "/" + dia_vuelta); 
				    reserva.setFechainicio(fechainicio);
				    reserva.setFechafin(fechafin);
					
					MenuOpcion.setVisible(false);
					Habitaciones.setVisible(true);
					
					for(int i=0;i<alojamiento.size();i++) {
						boton2[i].setVisible(false);
						
						if(alojamiento.get(i) instanceof Hotel) {
						
							if(boton2[i].getActionCommand().equals(((Hotel)alojamiento.get(i)).getNombreAlojamiento()) && boton2[i].getActionCommand().equals(arg0.getActionCommand()) ) {
								reserva.setCodigohotel(((Hotel)alojamiento.get(i)).getCodigohotel());
								reserva.setUbicacion(((Hotel)alojamiento.get(i)).getUbicacion());
								reserva.setNombreAlojamiento(((Hotel)alojamiento.get(i)).getNombreAlojamiento());
								
								
								boton3[i].setVisible(false);
							
							for(int a=0;a<habitacion.size();a++) {
								if(((Hotel)alojamiento.get(i)).getCodigohotel()== habitacion.get(a).getCodigohotel()) {
									boton3[a].setVisible(true);
									boton3[a].setEnabled(true);
	
									
									
									MenuOpcion.setVisible(false);
									Habitaciones.setVisible(true);
									
								}
							}
							

						}
							
						}
						if(alojamiento.get(i) instanceof Casa) {
							
							if(boton2[i].getActionCommand().equals(((Casa)alojamiento.get(i)).getNombreAlojamiento()) && boton2[i].getActionCommand().equals(arg0.getActionCommand())) {
								reserva.setCodigocasa(((Casa)alojamiento.get(i)).getCodigocasa());
								reserva.setUbicacion(((Casa)alojamiento.get(i)).getUbicacion());
								reserva.setNombreAlojamiento(((Casa)alojamiento.get(i)).getNombreAlojamiento());
								//reserva.setPrecio(metodos.preciototal(dateFechaIda,dateFechaVuelta, ((Casa)alojamiento.get(i)).getPrecio(),codigodescuento));
								
								DineroFaltante.setText(reserva.getPrecio()+" \u20ac");
								total_faltante = reserva.getPrecio();
								
								gestor.buscarhabitacioncasa(reserva.getCodigocasa(),listHabitacion,modelo2);
								HabitacionesNoHotel.setVisible(true);
								Habitaciones.setVisible(false);
							
		
							

						}
							
							
						}
						if(alojamiento.get(i) instanceof Apartamento) {
							
							if(boton2[i].getActionCommand().equals(((Apartamento)alojamiento.get(i)).getNombreAlojamiento()) && boton2[i].getActionCommand().equals(arg0.getActionCommand())) {
							//	reserva.setCodigoapatamento(((Apartamento)alojamiento.get(i)).getCodigoapartamento());
								reserva.setUbicacion(((Apartamento)alojamiento.get(i)).getUbicacion());
								reserva.setNombreAlojamiento(((Apartamento)alojamiento.get(i)).getNombreAlojamiento());
								//reserva.setPrecio(metodos.preciototal(dateFechaIda,dateFechaVuelta, ((Apartamento)alojamiento.get(i)).getPrecio(),codigodescuento));
								
								DineroFaltante.setText(reserva.getPrecio()+" \u20ac");
								total_faltante = reserva.getPrecio();
								
								gestor.buscarhabitacionapartamento(reserva.getCodigoapatamento(),listHabitacion,modelo2);
								HabitacionesNoHotel.setVisible(true);
								Habitaciones.setVisible(false);
							
		
							

						}
						}
						
						
						
					}
				}
			});	
		}

//action listener boton3[]-------------------------------------------
	for(int i=0; i<habitacion.size();i++) {
		
		boton3[i].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				modelo.clear();//para borrar el jlist cada vez que doy para ver las camas
				//metodos.cambioastring(dateFechaIda, dateFechaVuelta);
				dia_ida = Integer.toString(dateFechaIda.getCalendar().get(Calendar.DAY_OF_MONTH)); 
				mes_ida = Integer.toString(dateFechaIda.getCalendar().get(Calendar.MONTH) + 1);
				ano_ida = Integer.toString(dateFechaIda.getCalendar().get(Calendar.YEAR));
					
				dia_vuelta = Integer.toString(dateFechaVuelta.getCalendar().get(Calendar.DAY_OF_MONTH)); 
				mes_vuelta = Integer.toString(dateFechaVuelta.getCalendar().get(Calendar.MONTH) + 1);
		        ano_vuelta = Integer.toString(dateFechaVuelta.getCalendar().get(Calendar.YEAR));
				fechainicio=(ano_ida + "/" + mes_ida + "/" + dia_ida); 
				fechafin=(ano_vuelta + "/" + mes_vuelta + "/" + dia_vuelta); 
			    reserva.setFechainicio(fechainicio);
			    reserva.setFechafin(fechafin);
				
				//btnContinuarHabitaciones.setEnabled(true);
				for(int i=0; i<habitacion.size();i++) {
					
					if(boton3[i].getActionCommand().equals(Integer.toString(habitacion.get(i).getCodigohabitacion())) && boton3[i].getActionCommand().equals(arg0.getActionCommand() )){
						
						//boton3[i].setEnabled(false);
						btnBuscarReservasHabitaciones.setEnabled(true);//
						codigo=habitacion.get(i).getCodigohabitacion();//
						//reserva.setPrecio(habitacion.get(i).getPrecio()); 
						//precioporhabitacion=metodos.preciototal(dateFechaIda,dateFechaVuelta, habitacion.get(i).getPrecio(),codigodescuento);
						reserva.setCodigohotel(habitacion.get(i).getCodigohotel());
						reservahabitaciones.setCodigohabitacion(habitacion.get(i).getCodigohabitacion());
						codigohabitacion=Integer.toString(habitacion.get(i).getCodigohabitacion());//este es para cuando se reserve mas avitaciones a la vez
						//reserva.setUbicacion(((Hotel)alojamiento.get(i)).getUbicacion());
						//DineroFaltante.setText(reserva.getPrecio()+" \u20ac");
						//DineroFaltante.setText(reserva.getPrecio()+" \u20ac");
						//total_faltante = reserva.getPrecio();
						cantidadcamas=gestor.buscarcamas(codigo, listCamas, modelo);//devuelve x camas
						
						System.out.println("total camas devueltas al pinchar el boton "+cantidadcamas+" y total camas escogidas en el combo: "+reserva.getNumeropresonas());
						
					}
					
				}
	
			}
		});
	}
	listCamas.setModel(modelo);
	
	dateFechaVuelta.getCalendarButton().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			metodos.diasadelante(dateFechaIda, dateFechaVuelta);
		}
	});
	
	dateFechaIda.getCalendarButton().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			metodos.diasatras(dateFechaIda, dateFechaVuelta);
		}
	});
	
	btnAtrasBorraReserva.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			BorrarReserva.setVisible(false);
			MenuPrincipal.setVisible(true);
		}
	});
	
	btnBorrarCliente.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			MenuPrincipal.setVisible(false);
			BorrarCliente.setVisible(true);
		}
	});
	
	btnBorrarReserva.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			MenuPrincipal.setVisible(false);
			BorrarReserva.setVisible(true);
		}
	});
	
	
	btnBorrarBorrarReserva.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			gestor.conectar();
			 int decision=JOptionPane.showConfirmDialog(null,"Esta Seguro de Borrar la Reserva?","Advertencia",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
			 
			 if(decision==JOptionPane.YES_OPTION) {
					try {
						prueba=gestor.borrarReserva(formattedDniBorrarReserva.getText(), Integer.parseInt(formattedCodigoReserva.getText()));
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(prueba==1) {
		    			JOptionPane.showMessageDialog(null, "Reserva Borrada correctamente");
		    			formattedDniBorrarReserva.setText("");
		    			formattedCodigoReserva.setText("");
		    			BorrarReserva.setVisible(false);
			    		MenuPrincipal.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Datos Incorrectos");
						
					}
					gestor.close();
			 }

			
		}
	});
	
	btnBorrarBorrarCliente.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			gestor.conectar();
	
	        int decision=JOptionPane.showConfirmDialog(null,"Esta Seguro de Borrar el Usuario?","Advertencia",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
		    	if(decision==JOptionPane.YES_OPTION) {
		    		
		    		try {
						prueba=gestor.borrarCliente(formattedDniBorrarCliente.getText(), passwordContraseña.getText());
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						
						
					}
		    		if(prueba==1) {
		    			JOptionPane.showMessageDialog(null, "Usuario Borrado correctamente");
		    			formattedDniBorrarCliente.setText("");
		    			passwordContraseña.setText("");
		    			BorrarCliente.setVisible(false);
			    		MenuPrincipal.setVisible(true);
		    		}
		    		else {
		    			JOptionPane.showMessageDialog(null, "Datos Incorrectos");
		    		}
		    		gestor.close();
		    	}

			
		}
	});
	
	btnHacerReserva.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			MenuPrincipal.setVisible(false);
			MenuOpcion.setVisible(true);
		}
	});
	
	btnAtrasBorrarCliente.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			BorrarCliente.setVisible(false);
			MenuPrincipal.setVisible(true);
		}
	});
	
	
	btnBienvenida.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			Bienvenida.setVisible(false);
            MenuPrincipal.setVisible(true);
		
		}
	});

	btnContinuarHabitaciones.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(contador3==1) {
				Habitaciones.setVisible(false);
				Precio.setVisible(true);
			}
			else {
			Habitaciones.setVisible(false);
			Login.setVisible(true);
			}
		}
	});

	btnAtrasHabitacionesNoHotel.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			HabitacionesNoHotel.setVisible(false);
			MenuOpcion.setVisible(true);
			textUbicacion.setText("");
			modelo2.removeAllElements();
			cantidadcamas=0;
			personas=0;
			cantidadmaximacamas=0;
			btnVerDisponibilidadNoHotel.setEnabled(true);
			
		}
	});
	
		btnMenuOpcionAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<alojamiento.size();i++) {
	  				   boton2[i].setVisible(false);
					   boton2[i].setEnabled(false);
					   
					}
				textUbicacion.setText("");
				MenuOpcion.setVisible(false);
				MenuPrincipal.setVisible(true);
				
				if(rdbtnHotel.isSelected()) {
					rdbtnCasa.setEnabled(false);
					rdbtnApartamento.setEnabled(false);
			
		
					
					
					
				}

				else if(rdbtnCasa.isSelected()) {
					rdbtnHotel.setEnabled(false);
					rdbtnApartamento.setEnabled(false);
					
		
					
					
					
				}

				else if(rdbtnApartamento.isSelected()) {
					rdbtnHotel.setEnabled(false);
					rdbtnCasa.setEnabled(false);
					
					
					
					
				}

				
			}
		});
		
		btnContinuarBasesLegales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contador2=1;
				fecha = new GregorianCalendar();
				
				 año = fecha.get(Calendar.YEAR);
			     mes = fecha.get(Calendar.MONTH)+1;
			     dia = fecha.get(Calendar.DAY_OF_MONTH);
			     
			     fechaactual=(año + "/" + mes + "/" + dia); 
			
				
				try {
					error=false;
					gestor.insertarBaseslegales(cliente.getDni(), fechaactual);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					error=true;
				}
				System.out.println(fechaactual);
				BasesLegales.setVisible(false);
				Precio.setVisible(true);
				
			}
		});
//--------------------------------------------------------------------------------------------------
		btnVerDisponibilidadNoHotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(contador==2) {
						
						error=gestor.buscarreservascasa(reserva.getCodigocasa(), reserva.getFechafin(), reserva.getFechainicio());
						System.out.println(error);
						
					}else if(contador==3) {
						
						error=gestor.buscarreservasapartamento(reserva.getCodigoapatamento(), reserva.getFechafin(), reserva.getFechainicio());
						System.out.println(error);
					}
					
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				if(error==true) {
					JOptionPane.showMessageDialog(null, "Disponible");
					btnContinuarHabitacionesNoHotel.setEnabled(true);
					btnVerDisponibilidadNoHotel.setEnabled(false);
					
				}
				else {
					JOptionPane.showMessageDialog(null, "No Disponible");
				
				}
				
			}
		});
		
		btnContinuarHabitacionesNoHotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(contador3==1) {
					HabitacionesNoHotel.setVisible(false);
					Precio.setVisible(true);
				}
				else {
				HabitacionesNoHotel.setVisible(false);
				Login.setVisible(true);
				}
			}
		});
		
		
		btnBuscarReservasHabitaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				try {
					error=gestor.buscarreservas(codigo, reserva.getFechafin(), reserva.getFechainicio());
					System.out.println(error);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(error);
				if(error==true) {
					JOptionPane.showMessageDialog(null, "Habitacion Disponible");
					//btnContinuarHabitaciones.setEnabled(true);
					cantidadmaximacamas=cantidadmaximacamas+cantidadcamas;
					preciomaximo=preciomaximo+precioporhabitacion;
					habitacionconcatenada=habitacionconcatenada+codigohabitacion+",";
					
					try {
						codigoreserva=gestor.ultimocodigoreserva(contador4);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						gestor.insertarReservahotel(codigoreserva, reservahabitaciones.getCodigohabitacion());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}//metodo que inserta reserva de la habitacion
					System.out.println("precio de todas las habitaciones: "+preciomaximo);
					System.out.println("habitaciones: "+habitacionconcatenada);
					System.out.println("suma total de camas: "+cantidadmaximacamas+"Personas seleccionadas ene l combobos: "+personas);
					for(int i=0; i<habitacion.size();i++) {//una vez comprobado la disponibilidad y esta disponible, no desabilita para que no se pueda pulsar
						if(codigo==habitacion.get(i).getCodigohabitacion()) {
							boton3[i].setEnabled(false);
							System.out.println(habitacion.get(i).getCodigohotel());
						}
					}
					
					if(cantidadmaximacamas>=personas) {
						btnContinuarHabitaciones.setEnabled(true);
					//	reserva.setCodigohabitacion(Integer.parseInt(habitacionconcatenada));//desbloquear este y el de abajo para cuando escojas 2 o mas habitaciones
					//	System.out.println(reserva.getCodigohabitacion());
						reserva.setPrecio(preciomaximo);
						System.out.println("precio total para calcular: "+reserva.getPrecio());
						DineroFaltante.setText(reserva.getPrecio()+" \u20ac");
						total_faltante = reserva.getPrecio();
						for(int i=0; i<habitacion.size();i++) {//una vez comprobado la disponibilidad y esta disponible, no desabilita para que no se pueda pulsar
							boton3[i].setEnabled(false);
						}
						btnBuscarReservasHabitaciones.setEnabled(false);
						
					}
					contador4=1;
				}
				else {
					JOptionPane.showMessageDialog(null, "Habitacion No Disponible");
					modelo.clear();
				}
				
			}
		});
		
		btnAtrasTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ticket.setVisible(false);
				MenuOpcion.setVisible(true);
				//TipoAlojamiento.setVisible(true);
				
				for(int i=0;i<alojamiento.size();i++) {
	  				   boton2[i].setVisible(false);
					   boton2[i].setEnabled(false);
					   
					 
					}
				for(int i=0; i<habitacion.size();i++) {
					boton3[i].setVisible(false);
					boton3[i].setEnabled(false);
				}
				cantidadcamas=0;
				personas=0;
				cantidadmaximacamas=0;
				contador=0;
				precioporhabitacion=0;
				preciomaximo=0;
				modelo2.removeAllElements();
				modelo.clear();
				btnContinuarHabitacionesNoHotel.setEnabled(false);
				btnContinuarHabitaciones.setEnabled(false);
				textUbicacion.setText("");
				DineroFaltante.setText("0.00");
				DineroFaltante.setText(reserva.getPrecio()+" \u20ac");
				DineroIntroducido.setText("0.00");
				Vueltas.setText("0.00");
				formatteddni.setText("");
				passworContraseña.setText("");
				total_faltante=0;
				total_introducido=0;
				total_devolucion=0;
				billete200.setEnabled(true);
				billete100.setEnabled(true);
				billete50.setEnabled(true);
				billete20.setEnabled(true);
				billete10.setEnabled(true);
				billete5.setEnabled(true);
				moneda2e.setEnabled(true);
				moneda1e.setEnabled(true);
				moneda50cent.setEnabled(true);
				moneda20cent.setEnabled(true);
				moneda10cent.setEnabled(true);
				moneda5cent.setEnabled(true);
				moneda2cent.setEnabled(true);
				moneda1cent.setEnabled(true);
				btnPrecioContinuar.setEnabled(false);
				btnVerDisponibilidadNoHotel.setEnabled(true);
			}
		});
		
		btnAtrasHabitacions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Habitaciones.setVisible(false);
				MenuOpcion.setVisible(true);
				modelo.removeAllElements();
				btnBuscarReservasHabitaciones.setEnabled(false);
				listCamas.setModel(modelo);
				for(int i=0; i<habitacion.size();i++) {
					boton3[i].setVisible(false);
					boton3[i].setEnabled(false);
				}
				textUbicacion.setText("");
				rdbtnHotel.setEnabled(true);
				cantidadcamas=0;
				personas=0;
				cantidadmaximacamas=0;
				precioporhabitacion=0;
				preciomaximo=0;
				
			}
		});
//Paneldinero---------------------------------------------------------------------		
		btnPrecioAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Precio.setVisible(false);
				MenuOpcion.setVisible(true);
				//TipoAlojamiento.setVisible(true);
				
				for(int i=0;i<alojamiento.size();i++) {
	  				   boton2[i].setVisible(false);
					   boton2[i].setEnabled(false);
					   
					 
					}
				for(int i=0; i<habitacion.size();i++) {
					boton3[i].setVisible(false);
					boton3[i].setEnabled(false);
				}
				cantidadcamas=0;
				personas=0;
				cantidadmaximacamas=0;
				contador=0;
				precioporhabitacion=0;
				preciomaximo=0;
				modelo2.removeAllElements();
				modelo.clear();
				btnContinuarHabitacionesNoHotel.setEnabled(false);
				btnContinuarHabitaciones.setEnabled(false);
				textUbicacion.setText("");
				DineroFaltante.setText("0.00");
				DineroFaltante.setText(reserva.getPrecio()+" \u20ac");
				DineroIntroducido.setText("0.00");
				Vueltas.setText("0.00");
				formatteddni.setText("");
				passworContraseña.setText("");
				total_faltante=0;
				total_introducido=0;
				total_devolucion=0;
				billete200.setEnabled(true);
				billete100.setEnabled(true);
				billete50.setEnabled(true);
				billete20.setEnabled(true);
				billete10.setEnabled(true);
				billete5.setEnabled(true);
				moneda2e.setEnabled(true);
				moneda1e.setEnabled(true);
				moneda50cent.setEnabled(true);
				moneda20cent.setEnabled(true);
				moneda10cent.setEnabled(true);
				moneda5cent.setEnabled(true);
				moneda2cent.setEnabled(true);
				moneda1cent.setEnabled(true);
				btnPrecioContinuar.setEnabled(false);
				btnVerDisponibilidadNoHotel.setEnabled(true);
			}
		});
		
		btnAtrasHabitacions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Habitaciones.setVisible(false);
				MenuOpcion.setVisible(true);
				modelo.removeAllElements();
				btnBuscarReservasHabitaciones.setEnabled(false);
				listCamas.setModel(modelo);
				for(int i=0; i<habitacion.size();i++) {
					boton3[i].setVisible(false);
					boton3[i].setEnabled(false);
				}
				textUbicacion.setText("");
				rdbtnHotel.setEnabled(true);
				cantidadcamas=0;
				personas=0;
				cantidadmaximacamas=0;
				
			}
		});



		btnContinuarLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//MD5CryptoServideProvider encrip= new MD5CryptoServideProvider();
				contador3=1;
				try {
					cliente.setDni(formatteddni.getText());
					encriptMD5=DigestUtils.md5Hex(passworContraseña.getText());
					cliente.setContraseña(encriptMD5);
					
					comprobar=gestor.comprovardnicontraseña(cliente.getDni(), cliente.getContraseña());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(comprobar==1) {
					if(contador2==1) {
						Login.setVisible(false);
						Precio.setVisible(true);
					}
					else {
					Login.setVisible(false);
					BasesLegales.setVisible(true);
					}
				}
				else {
					 JOptionPane.showMessageDialog(null, "Error al comprobar los datos");
				}
			
			}
		});
		
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Login.setVisible(false);
				    Registro.setVisible(true);
			}
		});
		
		
		btnAtrasLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.setVisible(false);
				MenuOpcion.setVisible(true);
				//TipoAlojamiento.setVisible(true);
				
				for(int i=0;i<alojamiento.size();i++) {
	  				   boton2[i].setVisible(false);
					   boton2[i].setEnabled(false);
					   
					 
					}
				for(int i=0; i<habitacion.size();i++) {
					boton3[i].setVisible(false);
					boton3[i].setEnabled(false);
				}
				cantidadcamas=0;
				personas=0;
				cantidadmaximacamas=0;
				contador=0;
				preciomaximo=0;
				modelo2.removeAllElements();
				modelo.clear();
				btnContinuarHabitacionesNoHotel.setEnabled(false);
				btnContinuarHabitaciones.setEnabled(false);
				textUbicacion.setText("");
				DineroFaltante.setText("0.00");
				DineroFaltante.setText(reserva.getPrecio()+" \u20ac");
				DineroIntroducido.setText("0.00");
				Vueltas.setText("0.00");
				formatteddni.setText("");
				passworContraseña.setText("");
				total_faltante=0;
				total_introducido=0;
				total_devolucion=0;
				billete200.setEnabled(true);
				billete100.setEnabled(true);
				billete50.setEnabled(true);
				billete20.setEnabled(true);
				billete10.setEnabled(true);
				billete5.setEnabled(true);
				moneda2e.setEnabled(true);
				moneda1e.setEnabled(true);
				moneda50cent.setEnabled(true);
				moneda20cent.setEnabled(true);
				moneda10cent.setEnabled(true);
				moneda5cent.setEnabled(true);
				moneda2cent.setEnabled(true);
				moneda1cent.setEnabled(true);
				btnPrecioContinuar.setEnabled(false);
				btnVerDisponibilidadNoHotel.setEnabled(true);
				precioporhabitacion=0;
				if(rdbtnHotel.isSelected()) {
					rdbtnCasa.setEnabled(false);
					rdbtnApartamento.setEnabled(false);
			
		
					
					
					
				}

				else if(rdbtnCasa.isSelected()) {
					rdbtnHotel.setEnabled(false);
					rdbtnApartamento.setEnabled(false);
					
		
					
					
					
				}

				else if(rdbtnApartamento.isSelected()) {
					rdbtnHotel.setEnabled(false);
					rdbtnCasa.setEnabled(false);
					
					
					
					
				}
			}
		});
		btnPrecioContinuar.setEnabled(false);
		if(DineroFaltante.equals("0")) {
			btnPrecioContinuar.setEnabled(true);
		}

		btnIngresarRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				if(formattedDniRegistro.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Inserte Dni");
				}
				else if(textNombreRegistro.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Inserte Nombre");
				}
				else if(textApellidoRegistro.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Inserte Apellido");
				}
				else if(formattedEdadRegistro.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Inserte Edad");
				}
				else if(!rdbtnHombreRegistro.isSelected() || rdbtnMujerRegistro.isSelected()) {
					JOptionPane.showMessageDialog(null, "Inserte Sexo");
				}
				
				else if(passwordContraseñaRegistro.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Inserte Contraseña");
				}
				else {
					
					cliente.setDni(formattedDniRegistro.getText());
					cliente.setNombre(textNombreRegistro.getText());
					cliente.setApellido(textApellidoRegistro.getText());
					cliente.setEdad(Integer.parseInt(formattedEdadRegistro.getText()));
					encriptMD5=DigestUtils.md5Hex(passwordContraseñaRegistro.getText());
					cliente.setContraseña(encriptMD5);
					
					try {
						prueba=gestor.insertarCliente(cliente.getDni(), cliente.getNombre(), cliente.getApellido(), cliente.getEdad(), cliente.getSexo(), cliente.getContraseña());
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						
					}
					
					if(prueba==1) {
						formattedDniRegistro.setText("");
						textNombreRegistro.setText("");
						textApellidoRegistro.setText("");
						formattedEdadRegistro.setText("");
						passwordContraseñaRegistro.setText("");
					}
					else {
					JOptionPane.showMessageDialog(null, "Usuario Registrado Correctamente");
					Registro.setVisible(false);
					Login.setVisible(true);
					}
				}
				
				
			    
			}
		});
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		btnPrecioContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

		   
				try {
					gestor.insertarReserva(reserva.getCodigohotel(),reserva.getCodigocasa(),reserva.getCodigoapatamento(),cliente.getDni(),reserva.getPrecio(), reserva.getNombreAlojamiento(), reserva.getUbicacion(),reserva.getNumeropresonas(),reserva.getFechainicio(),reserva.getFechafin(), contador);
					
					metodos.EscribiroCrearFichearo(reserva.getCodigohotel(),reserva.getCodigocasa(),reserva.getCodigoapatamento(),habitacionconcatenada,cliente.getDni(),reserva.getPrecio(), reserva.getNombreAlojamiento(), reserva.getUbicacion(),reserva.getNumeropresonas(),reserva.getFechainicio(),reserva.getFechafin(),contador);
					
					String nombre="";
					String codigohabitacion="";
					int codigo=0;
					if(contador==1) {
						nombre="l Hotel: ";
						codigohabitacion="\r\n"+"Codigo de las Habitaciones "+habitacionconcatenada;
						codigo=reserva.getCodigohotel();
					}
					else if(contador==2) {
						nombre=" la Casa: ";
						
						codigo=reserva.getCodigocasa();
					}
					else if(contador==3) {
						nombre="l Apartamento: ";
					
						codigo=reserva.getCodigoapatamento();
					}
					String frase= ("Codigo de"+nombre+codigo+codigohabitacion+"\r\n"+"DNI Cliente: "+cliente.getDni()+ "\r\n"+"Precio: " + reserva.getPrecio() + "\r\n" + "Nombre: " + reserva.getNombreAlojamiento()+ "\r\n" + "Ubicacion: " + reserva.getUbicacion()+ "\r\n"+"Numero de Personas: " +reserva.getNumeropresonas()+ "\r\n"+"Fecha Inicio: " + reserva.getFechainicio()+ "\r\n"+"Fecha Fin: " + reserva.getFechafin()+"\r\n"+"-------------"+"\r\n");
					
					textReserva.getStyledDocument().insertString(textReserva.getStyledDocument().getLength(),frase, null);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Error al conectar a la Base de Datos");
				}
				//metodos.cerrar();
				Ticket.setVisible(true);
				Precio.setVisible(false);
				
			}
		});
		btnAtrasRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registro.setVisible(false);
				MenuOpcion.setVisible(true);
				//TipoAlojamiento.setVisible(true);
				
				for(int i=0;i<alojamiento.size();i++) {
	  				   boton2[i].setVisible(false);
					   boton2[i].setEnabled(false);
					   
					 
					}
				for(int i=0; i<habitacion.size();i++) {
					boton3[i].setVisible(false);
					boton3[i].setEnabled(false);
				}
				cantidadcamas=0;
				personas=0;
				cantidadmaximacamas=0;
				contador=0;
				precioporhabitacion=0;
				preciomaximo=0;
				modelo2.removeAllElements();
				modelo.clear();
				btnContinuarHabitacionesNoHotel.setEnabled(false);
				btnContinuarHabitaciones.setEnabled(false);
				textUbicacion.setText("");
				DineroFaltante.setText("0.00");
				DineroFaltante.setText(reserva.getPrecio()+" \u20ac");
				DineroIntroducido.setText("0.00");
				Vueltas.setText("0.00");
				formatteddni.setText("");
				passworContraseña.setText("");
				total_faltante=0;
				total_introducido=0;
				total_devolucion=0;
				billete200.setEnabled(true);
				billete100.setEnabled(true);
				billete50.setEnabled(true);
				billete20.setEnabled(true);
				billete10.setEnabled(true);
				billete5.setEnabled(true);
				moneda2e.setEnabled(true);
				moneda1e.setEnabled(true);
				moneda50cent.setEnabled(true);
				moneda20cent.setEnabled(true);
				moneda10cent.setEnabled(true);
				moneda5cent.setEnabled(true);
				moneda2cent.setEnabled(true);
				moneda1cent.setEnabled(true);
				btnPrecioContinuar.setEnabled(false);
				btnVerDisponibilidadNoHotel.setEnabled(true);
				if(rdbtnHotel.isSelected()) {
					rdbtnCasa.setEnabled(false);
					rdbtnApartamento.setEnabled(false);
			
		
					
					
					
				}

				else if(rdbtnCasa.isSelected()) {
					rdbtnHotel.setEnabled(false);
					rdbtnApartamento.setEnabled(false);
					
		
					
					
					
				}

				else if(rdbtnApartamento.isSelected()) {
					rdbtnHotel.setEnabled(false);
					rdbtnCasa.setEnabled(false);
					
					
					
					
				}
			}
			
		});
		
		btnFin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(1);
			}
		});
		
//---------------------------------------------------------------------------------------------------------------------

		
//---------------------------------------------------------------------------------------------------------------------
//action listener	
		billete200.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				valorBoton = Double.parseDouble(billete200.getActionCommand());
				total_introducido=total_introducido+valorBoton;
				total_faltante = total_faltante-valorBoton;
				DineroFaltante.setText(String.format("%.2f",total_faltante));
				DineroIntroducido.setText(String.format("%.2f", total_introducido));
				//Vueltas.setText(String.format("%.2f", total_devolucion));
				if (total_faltante <= 0.009)
				{
					btnPrecioContinuar.setEnabled(true);
					billete200.setEnabled(false);
					billete100.setEnabled(false);
					billete50.setEnabled(false);
					billete20.setEnabled(false);
					billete10.setEnabled(false);
					billete5.setEnabled(false);
					moneda2e.setEnabled(false);
					moneda1e.setEnabled(false);
					moneda50cent.setEnabled(false);
					moneda20cent.setEnabled(false);
					moneda10cent.setEnabled(false);
					moneda5cent.setEnabled(false);
					moneda2cent.setEnabled(false);
					moneda1cent.setEnabled(false);
					DineroFaltante.setText("0.00");
				}
				if (total_introducido > total_faltante)
				{
					total_devolucion = total_introducido - reserva.getPrecio();
					BigDecimal decimal = new BigDecimal(total_devolucion);
					total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
					Vueltas.setText(String.format("%.2f", total_devolucion));
				}
			}
		});
	
		billete200.setBounds(52, 65, 106, 39);
		Precio.add(billete200);
		
		
		
		billete100.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				valorBoton = Double.parseDouble(billete100.getActionCommand());
				total_introducido=total_introducido+valorBoton;
				total_faltante = total_faltante-valorBoton;
				DineroFaltante.setText(String.format("%.2f",total_faltante));
				DineroIntroducido.setText(String.format("%.2f", total_introducido));
				//Vueltas.setText(String.format("%.2f", total_devolucion));
				if (total_faltante <= 0.009)
				{
					btnPrecioContinuar.setEnabled(true);
					billete200.setEnabled(false);
					billete100.setEnabled(false);
					billete50.setEnabled(false);
					billete20.setEnabled(false);
					billete10.setEnabled(false);
					billete5.setEnabled(false);
					moneda2e.setEnabled(false);
					moneda1e.setEnabled(false);
					moneda50cent.setEnabled(false);
					moneda20cent.setEnabled(false);
					moneda10cent.setEnabled(false);
					moneda5cent.setEnabled(false);
					moneda2cent.setEnabled(false);
					moneda1cent.setEnabled(false);
					DineroFaltante.setText("0.00");
				}
				if (total_introducido > total_faltante)
				{
					total_devolucion = total_introducido - reserva.getPrecio();
					BigDecimal decimal = new BigDecimal(total_devolucion);
					total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
					Vueltas.setText(String.format("%.2f", total_devolucion));
					
				}
			}
		});
		
		billete100.setBounds(266, 65, 106, 39);
		Precio.add(billete100);
		
		
		
		billete50.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				valorBoton = Double.parseDouble(billete50.getActionCommand());
				total_introducido=total_introducido+valorBoton;
				total_faltante = total_faltante-valorBoton;
				DineroFaltante.setText(String.format("%.2f",total_faltante));
				DineroIntroducido.setText(String.format("%.2f", total_introducido));
				//Vueltas.setText(String.format("%.2f", total_devolucion));
				if (total_faltante <= 0.009)
				{
					btnPrecioContinuar.setEnabled(true);
					billete200.setEnabled(false);
					billete100.setEnabled(false);
					billete50.setEnabled(false);
					billete20.setEnabled(false);
					billete10.setEnabled(false);
					billete5.setEnabled(false);
					moneda2e.setEnabled(false);
					moneda1e.setEnabled(false);
					moneda50cent.setEnabled(false);
					moneda20cent.setEnabled(false);
					moneda10cent.setEnabled(false);
					moneda5cent.setEnabled(false);
					moneda2cent.setEnabled(false);
					moneda1cent.setEnabled(false);
					DineroFaltante.setText("0.00");
				}
				if (total_introducido > total_faltante)
				{
					total_devolucion = total_introducido -reserva.getPrecio();
					BigDecimal decimal = new BigDecimal(total_devolucion);
					total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
					Vueltas.setText(String.format("%.2f", total_devolucion));
				}
			}
		});
		
		billete50.setBounds(471, 65, 106, 39);
		Precio.add(billete50);
		
		
		
		billete20.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				valorBoton = Double.parseDouble(billete20.getActionCommand());
				total_introducido=total_introducido+valorBoton;
				total_faltante = total_faltante-valorBoton;
				DineroFaltante.setText(String.format("%.2f",total_faltante));
				DineroIntroducido.setText(String.format("%.2f", total_introducido));
			//	Vueltas.setText(String.format("%.2f", total_devolucion));
				if (total_faltante <= 0.009)
				{
					btnPrecioContinuar.setEnabled(true);
					billete200.setEnabled(false);
					billete100.setEnabled(false);
					billete50.setEnabled(false);
					billete20.setEnabled(false);
					billete10.setEnabled(false);
					billete5.setEnabled(false);
					moneda2e.setEnabled(false);
					moneda1e.setEnabled(false);
					moneda50cent.setEnabled(false);
					moneda20cent.setEnabled(false);
					moneda10cent.setEnabled(false);
					moneda5cent.setEnabled(false);
					moneda2cent.setEnabled(false);
					moneda1cent.setEnabled(false);
					DineroFaltante.setText("0.00");
				}
				if (total_introducido > total_faltante)
				{
					total_devolucion = total_introducido - reserva.getPrecio();
					BigDecimal decimal = new BigDecimal(total_devolucion);
					total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
					Vueltas.setText(String.format("%.2f", total_devolucion));
				}
			}
		});
		
		billete20.setBounds(679, 65, 106, 39);
		Precio.add(billete20);
		
		
		
		billete10.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				valorBoton = Double.parseDouble(billete10.getActionCommand());
				total_introducido=total_introducido+valorBoton;
				total_faltante = total_faltante-valorBoton;
				DineroFaltante.setText(String.format("%.2f",total_faltante));
				DineroIntroducido.setText(String.format("%.2f", total_introducido));
				//Vueltas.setText(String.format("%.2f", total_devolucion));
				if (total_faltante <= 0.009)
				{
					btnPrecioContinuar.setEnabled(true);
					billete200.setEnabled(false);
					billete100.setEnabled(false);
					billete50.setEnabled(false);
					billete20.setEnabled(false);
					billete10.setEnabled(false);
					billete5.setEnabled(false);
					moneda2e.setEnabled(false);
					moneda1e.setEnabled(false);
					moneda50cent.setEnabled(false);
					moneda20cent.setEnabled(false);
					moneda10cent.setEnabled(false);
					moneda5cent.setEnabled(false);
					moneda2cent.setEnabled(false);
					moneda1cent.setEnabled(false);
					DineroFaltante.setText("0.00");
				}
				if (total_introducido > total_faltante)
				{
					total_devolucion = total_introducido - reserva.getPrecio();
					BigDecimal decimal = new BigDecimal(total_devolucion);
					total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
					Vueltas.setText(String.format("%.2f", total_devolucion));
				}
			}
		});
		billete10.setBounds(52, 143, 106, 39);
		Precio.add(billete10);
		
		
		
		billete5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				valorBoton = Double.parseDouble(billete5.getActionCommand());
				total_introducido=total_introducido+valorBoton;
				total_faltante = total_faltante-valorBoton;
				DineroFaltante.setText(String.format("%.2f",total_faltante));
				DineroIntroducido.setText(String.format("%.2f", total_introducido));
				//Vueltas.setText(String.format("%.2f", total_devolucion));
				if (total_faltante <= 0.009)
				{
					btnPrecioContinuar.setEnabled(true);
					billete200.setEnabled(false);
					billete100.setEnabled(false);
					billete50.setEnabled(false);
					billete20.setEnabled(false);
					billete10.setEnabled(false);
					billete5.setEnabled(false);
					moneda2e.setEnabled(false);
					moneda1e.setEnabled(false);
					moneda50cent.setEnabled(false);
					moneda20cent.setEnabled(false);
					moneda10cent.setEnabled(false);
					moneda5cent.setEnabled(false);
					moneda2cent.setEnabled(false);
					moneda1cent.setEnabled(false);
					DineroFaltante.setText("0.00");
				}
				if (total_introducido > total_faltante)
				{
					total_devolucion = total_introducido - reserva.getPrecio();
					BigDecimal decimal = new BigDecimal(total_devolucion);
					total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
					Vueltas.setText(String.format("%.2f", total_devolucion));
				}
			}
		});
		billete5.setBounds(266, 143, 106, 39);
		Precio.add(billete5);
		
		
		
		moneda2e.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				valorBoton = Double.parseDouble(moneda2e.getActionCommand());
				total_introducido=total_introducido+valorBoton;
				total_faltante = total_faltante-valorBoton;
				DineroFaltante.setText(String.format("%.2f",total_faltante));
				DineroIntroducido.setText(String.format("%.2f", total_introducido));
				//Vueltas.setText(String.format("%.2f", total_devolucion));
				if (total_faltante <= 0.009)
				{
					btnPrecioContinuar.setEnabled(true);
					billete200.setEnabled(false);
					billete100.setEnabled(false);
					billete50.setEnabled(false);
					billete20.setEnabled(false);
					billete10.setEnabled(false);
					billete5.setEnabled(false);
					moneda2e.setEnabled(false);
					moneda1e.setEnabled(false);
					moneda50cent.setEnabled(false);
					moneda20cent.setEnabled(false);
					moneda10cent.setEnabled(false);
					moneda5cent.setEnabled(false);
					moneda2cent.setEnabled(false);
					moneda1cent.setEnabled(false);
					DineroFaltante.setText("0.00");
				}
				if (total_introducido > total_faltante)
				{
					total_devolucion = total_introducido - reserva.getPrecio();
					BigDecimal decimal = new BigDecimal(total_devolucion);
					total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
					Vueltas.setText(String.format("%.2f", total_devolucion));
				}
			}
		});
		moneda2e.setBounds(471, 143, 106, 39);
		Precio.add(moneda2e);
		
		
		moneda1e.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				valorBoton = Double.parseDouble(moneda1e.getActionCommand());
				total_introducido=total_introducido+valorBoton;
				total_faltante = total_faltante-valorBoton;
				DineroFaltante.setText(String.format("%.2f",total_faltante));
				DineroIntroducido.setText(String.format("%.2f", total_introducido));
				//Vueltas.setText(String.format("%.2f", total_devolucion));
				if (total_faltante <= 0.009)
				{
					btnPrecioContinuar.setEnabled(true);
					billete200.setEnabled(false);
					billete100.setEnabled(false);
					billete50.setEnabled(false);
					billete20.setEnabled(false);
					billete10.setEnabled(false);
					billete5.setEnabled(false);
					moneda2e.setEnabled(false);
					moneda1e.setEnabled(false);
					moneda50cent.setEnabled(false);
					moneda20cent.setEnabled(false);
					moneda10cent.setEnabled(false);
					moneda5cent.setEnabled(false);
					moneda2cent.setEnabled(false);
					moneda1cent.setEnabled(false);
					DineroFaltante.setText("0.00");
				}
				if (total_introducido > total_faltante)
				{
					total_devolucion = total_introducido - reserva.getPrecio();
					BigDecimal decimal = new BigDecimal(total_devolucion);
					total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
					Vueltas.setText(String.format("%.2f", total_devolucion));
				}
			}
		});
		moneda1e.setBounds(679, 143, 106, 39);
		Precio.add(moneda1e);
		
		
		moneda50cent.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				valorBoton = Double.parseDouble(moneda50cent.getActionCommand());
				total_introducido=total_introducido+valorBoton;
				total_faltante = total_faltante-valorBoton;
				DineroFaltante.setText(String.format("%.2f",total_faltante));
				DineroIntroducido.setText(String.format("%.2f", total_introducido));
			//	Vueltas.setText(String.format("%.2f", total_devolucion));
				if (total_faltante <= 0.009)
				{
					btnPrecioContinuar.setEnabled(true);
					billete200.setEnabled(false);
					billete100.setEnabled(false);
					billete50.setEnabled(false);
					billete20.setEnabled(false);
					billete10.setEnabled(false);
					billete5.setEnabled(false);
					moneda2e.setEnabled(false);
					moneda1e.setEnabled(false);
					moneda50cent.setEnabled(false);
					moneda20cent.setEnabled(false);
					moneda10cent.setEnabled(false);
					moneda5cent.setEnabled(false);
					moneda2cent.setEnabled(false);
					moneda1cent.setEnabled(false);
					DineroFaltante.setText("0.00");
				}
				if (total_introducido > total_faltante)
				{
					total_devolucion = total_introducido - reserva.getPrecio();
					BigDecimal decimal = new BigDecimal(total_devolucion);
					total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
					Vueltas.setText(String.format("%.2f", total_devolucion));
				}
			}
		});
		moneda50cent.setBounds(52, 222, 106, 39);
		Precio.add(moneda50cent);
		
		
		moneda20cent.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				valorBoton = Double.parseDouble(moneda20cent.getActionCommand());
				total_introducido=total_introducido+valorBoton;
				total_faltante = total_faltante-valorBoton;
				DineroFaltante.setText(String.format("%.2f",total_faltante));
				DineroIntroducido.setText(String.format("%.2f", total_introducido));
				//Vueltas.setText(String.format("%.2f", total_devolucion));
				if (total_faltante <= 0.009)
				{
					btnPrecioContinuar.setEnabled(true);
					billete200.setEnabled(false);
					billete100.setEnabled(false);
					billete50.setEnabled(false);
					billete20.setEnabled(false);
					billete10.setEnabled(false);
					billete5.setEnabled(false);
					moneda2e.setEnabled(false);
					moneda1e.setEnabled(false);
					moneda50cent.setEnabled(false);
					moneda20cent.setEnabled(false);
					moneda10cent.setEnabled(false);
					moneda5cent.setEnabled(false);
					moneda2cent.setEnabled(false);
					moneda1cent.setEnabled(false);
					DineroFaltante.setText("0.00");
				}
				if (total_introducido > total_faltante)
				{
					total_devolucion = total_introducido - reserva.getPrecio();
					BigDecimal decimal = new BigDecimal(total_devolucion);
					total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
					Vueltas.setText(String.format("%.2f", total_devolucion));
				}
			}
		});
		moneda20cent.setBounds(266, 222, 106, 39);
		Precio.add(moneda20cent);
		
		
		moneda10cent.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				valorBoton = Double.parseDouble(moneda10cent.getActionCommand());
				total_introducido=total_introducido+valorBoton;
				total_faltante = total_faltante-valorBoton;
				DineroFaltante.setText(String.format("%.2f",total_faltante));
				DineroIntroducido.setText(String.format("%.2f", total_introducido));
				//Vueltas.setText(String.format("%.2f", total_devolucion));
				if (total_faltante <= 0.009)
				{
					btnPrecioContinuar.setEnabled(true);
					billete200.setEnabled(false);
					billete100.setEnabled(false);
					billete50.setEnabled(false);
					billete20.setEnabled(false);
					billete10.setEnabled(false);
					billete5.setEnabled(false);
					moneda2e.setEnabled(false);
					moneda1e.setEnabled(false);
					moneda50cent.setEnabled(false);
					moneda20cent.setEnabled(false);
					moneda10cent.setEnabled(false);
					moneda5cent.setEnabled(false);
					moneda2cent.setEnabled(false);
					moneda1cent.setEnabled(false);
					DineroFaltante.setText("0.00");
				}
				if (total_introducido > total_faltante)
				{
					total_devolucion = total_introducido - reserva.getPrecio();
					BigDecimal decimal = new BigDecimal(total_devolucion);
					total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
					Vueltas.setText(String.format("%.2f", total_devolucion));
				}
			}
		});
		moneda10cent.setBounds(471, 222, 106, 39);
		Precio.add(moneda10cent);
		
		
		moneda5cent.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				valorBoton = Double.parseDouble(moneda5cent.getActionCommand());
				total_introducido=total_introducido+valorBoton;
				total_faltante = total_faltante-valorBoton;
				DineroFaltante.setText(String.format("%.2f",total_faltante));
				DineroIntroducido.setText(String.format("%.2f", total_introducido));
				//Vueltas.setText(String.format("%.2f", total_devolucion));
				if (total_faltante <= 0.009)
				{
					btnPrecioContinuar.setEnabled(true);
					billete200.setEnabled(false);
					billete100.setEnabled(false);
					billete50.setEnabled(false);
					billete20.setEnabled(false);
					billete10.setEnabled(false);
					billete5.setEnabled(false);
					moneda2e.setEnabled(false);
					moneda1e.setEnabled(false);
					moneda50cent.setEnabled(false);
					moneda20cent.setEnabled(false);
					moneda10cent.setEnabled(false);
					moneda5cent.setEnabled(false);
					moneda2cent.setEnabled(false);
					moneda1cent.setEnabled(false);
					DineroFaltante.setText("0.00");
				}
				if (total_introducido > total_faltante)
				{
					total_devolucion = total_introducido - reserva.getPrecio();
					BigDecimal decimal = new BigDecimal(total_devolucion);
					total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
					Vueltas.setText(String.format("%.2f", total_devolucion));
				}
			}
		});
		moneda5cent.setBounds(679, 222, 106, 39);
		Precio.add(moneda5cent);
		
		
		moneda2cent.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				valorBoton = Double.parseDouble(moneda2cent.getActionCommand());
				total_introducido=total_introducido+valorBoton;
				total_faltante = total_faltante-valorBoton;
				DineroFaltante.setText(String.format("%.2f",total_faltante));
				DineroIntroducido.setText(String.format("%.2f", total_introducido));
				//Vueltas.setText(String.format("%.2f", total_devolucion));
				if (total_faltante <= 0.009)
				{
					btnPrecioContinuar.setEnabled(true);
					billete200.setEnabled(false);
					billete100.setEnabled(false);
					billete50.setEnabled(false);
					billete20.setEnabled(false);
					billete10.setEnabled(false);
					billete5.setEnabled(false);
					moneda2e.setEnabled(false);
					moneda1e.setEnabled(false);
					moneda50cent.setEnabled(false);
					moneda20cent.setEnabled(false);
					moneda10cent.setEnabled(false);
					moneda5cent.setEnabled(false);
					moneda2cent.setEnabled(false);
					moneda1cent.setEnabled(false);
					DineroFaltante.setText("0.00");
				}
				if (total_introducido > total_faltante)
				{
					total_devolucion = total_introducido - reserva.getPrecio();
					BigDecimal decimal = new BigDecimal(total_devolucion);
					total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
					Vueltas.setText(String.format("%.2f", total_devolucion));
				}
			}
		});
		moneda2cent.setBounds(52, 295, 106, 39);
		Precio.add(moneda2cent);
		
		
		moneda1cent.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				valorBoton = Double.parseDouble(moneda1cent.getActionCommand());
				total_introducido=total_introducido+valorBoton;
				total_faltante = total_faltante-valorBoton;
				DineroFaltante.setText(String.format("%.2f",total_faltante));
				DineroIntroducido.setText(String.format("%.2f", total_introducido));
				//Vueltas.setText(String.format("%.2f", total_devolucion));
				if (total_faltante <= 0.009)
				{
					btnPrecioContinuar.setEnabled(true);
					billete200.setEnabled(false);
					billete100.setEnabled(false);
					billete50.setEnabled(false);
					billete20.setEnabled(false);
					billete10.setEnabled(false);
					billete5.setEnabled(false);
					moneda2e.setEnabled(false);
					moneda1e.setEnabled(false);
					moneda50cent.setEnabled(false);
					moneda20cent.setEnabled(false);
					moneda10cent.setEnabled(false);
					moneda5cent.setEnabled(false);
					moneda2cent.setEnabled(false);
					moneda1cent.setEnabled(false);
					DineroFaltante.setText("0.00");
				}
				if (total_introducido > total_faltante)
				{
					total_devolucion = total_introducido - reserva.getPrecio();
					BigDecimal decimal = new BigDecimal(total_devolucion);
					total_devolucion = decimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
					Vueltas.setText(String.format("%.2f", total_devolucion));
				}
			}
		});
		moneda1cent.setBounds(266, 295, 106, 39);
		Precio.add(moneda1cent);
		

		
		JLabel lblPrecio = new JLabel("New label");
		lblPrecio.setIcon(new ImageIcon("C:\\Workspace\\AAAAReto\\cosas\\fondo1.png"));
		lblPrecio.setBounds(0, 0, 936, 601);
		Precio.add(lblPrecio);
	
		
		
		//---------------------------------------------------------

		
		
		//-----------------panel4--------------------------------------------------------


		gestor.close();
		
	}
}
