package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.text.BadLocationException;

public class PanelBasesLegales extends JPanel{

	public JScrollPane scrollPaneBasesLegales;
	public JTextPane baseslegales;
	public JButton btnContinuarBasesLegales;
	public JRadioButton rdbtnAceptarCondiciones;
	public JLabel lblFondoBasesLegales;
	public String blegales="Aviso Legal\r\n" + 
			"Introducci�n\r\n" + 
			"Entrada en vigor: 09 de Agosto de 2018.\r\n" + 
			"\r\n" + 
			"El presente se constituye como el Aviso Legal de la web de HOTEL LA LAGUNA SPA & GOLF, ubicada en la URL https://www.hotellalaguna.com.\r\n" + 
			"\r\n" + 
			"Datos de la compa��a\r\n" + 
			"Titular: Hotel La Laguna SPA & Golf, S.L. (en adelante �HOTEL LA LAGUNA SPA & GOLF�)\r\n" + 
			"Domicilio social: Avda. Antonio Quesada n� 53, 03170, Rojales (Alicante)\r\n" + 
			"CIF: B-53652939\r\n" + 
			"Registro P�blico: Inscrita en el Registro Mercantil de Alicante, Tomo 2526, Folio 92, Secci�n 8�, Hoja A-69758\r\n" + 
			"Tel�fono: 965 72 55 77\r\n" + 
			"Email: dpo@hotellalaguna.com\r\n" + 
			"\r\n" + 
			"Condiciones de uso\r\n" + 
			"El acceso al Sitio Web por parte de los Usuarios tiene car�cter libre y gratuito.\r\n" + 
			"El acceso, navegaci�n y utilizaci�n del Sitio www.hotellalaguna.com implica la aceptaci�n expresa y sin reservas de todos los t�rminos de las presentes condiciones de uso, teniendo la misma validez y eficacia que cualquier contrato celebrado por escrito y firmado.\r\n" + 
			"Su observancia y cumplimiento ser� exigible respecto de cualquier persona que acceda, navegue o utilice la Web. Si Ud. no est� de acuerdo con los t�rminos expuestos, no acceda, navegue o utilice ninguna p�gina del sitio web.\r\n" + 
			"\r\n" + 
			"Derechos de propiedad intelectual e industrial\r\n" + 
			"Todos los derechos de propiedad industrial e intelectual de este sitio Web y de las distintas p�ginas web pertenecientes al mismo, as� como de los elementos contenidos en el mismo y en sus p�ginas web (incluidos, con car�cter enunciativo que no limitativo, el dise�o gr�fico, c�digo fuente, logos, contenidos, im�genes, textos, gr�ficos, ilustraciones, fotograf�as, bases de datos y dem�s elementos que aparecen en la Web), salvo que se indique lo contrario, son titularidad exclusiva de HOTEL LA LAGUNA SPA & GOLF o de terceros considerados leg�timos.\r\n" + 
			"\r\n" + 
			"En este sentido, HOTEL LA LAGUNA SPA & GOLF hace expresa reserva de todos los derechos. Igualmente, todos los nombres comerciales, dominios, marcas o signos distintivos de cualquier clase contenidos en el sitio Web y sus p�ginas web, est�n protegidos por la Ley.\r\n" + 
			"\r\n" + 
			"HOTEL LA LAGUNA SPA & GOLF no concede ning�n tipo de licencia o autorizaci�n de uso p�blico y/o comercial al Usuario sobre sus derechos de propiedad intelectual e industrial o sobre cualquier otro derecho relacionado con este sitio Web, sus p�ginas webs y los servicios ofrecidos en las mismas. El Usuario �nica y exclusivamente podr� acceder a tales elementos y servicios para su uso personal y privado, quedando, por tanto, terminantemente prohibida la utilizaci�n de la totalidad o parte de los contenidos de este Web y p�ginas webs pertenecientes al mismo con prop�sitos p�blicos o comerciales, su distribuci�n, comunicaci�n p�blica, incluida la modalidad de puesta a disposici�n, as� como su modificaci�n, alteraci�n o descompilaci�n a no ser que para ello se cuente con el consentimiento expreso y por escrito de HOTEL LA LAGUNA SPA & GOLF.\r\n" + 
			"\r\n" + 
			"Por ello, el Usuario reconoce que la reproducci�n, distribuci�n, comercializaci�n, transformaci�n, y en general, cualquier otra forma de explotaci�n, por cualquier procedimiento, de todo o parte de los contenidos de este sitio Web constituye una infracci�n de los derechos de propiedad intelectual y/o industrial de HOTEL LA LAGUNA SPA & GOLF o de su titular.\r\n" + 
			"\r\n" + 
			"Cualquier uso indebido de las mismas por personas diferentes de su leg�timo titular y sin el consentimiento expreso e inequ�voco por parte de �ste podr� ser denunciado y perseguido a trav�s de todos los medios legales existentes en el Ordenamiento Jur�dico espa�ol y/o comunitario.\r\n" + 
			"\r\n" + 
			"Los derechos de propiedad intelectual y marchas de terceros est�n destacados convenientemente y deben ser respetados por todo aqu�l que acceda a esta p�gina, no siendo responsabilidad de HOTEL LA LAGUNA SPA & GOLF el uso que el usuario pueda llevar a cabo al respecto, recayendo la responsabilidad exclusiva en su persona.\r\n" + 
			"\r\n" + 
			"S�lo para uso personal y privado se permite descargar los contenidos, copiar o imprimir cualquier p�gina de esta web, quedando prohibido modificar, copiar, reutilizar, explotar, reproducir, transformar, comunicar p�blicamente, hacer segundas o posteriores publicaciones, cargar archivos, enviar por correo, transmitir, usar, tratar o distribuir de cualquier forma la totalidad o parte de los Contenidos y productos incluidos en el Sitio Web para prop�sitos p�blicos o comerciales, si no se cuenta con la autorizaci�n expresa y por escrito de HOTEL LA LAGUNA SPA & GOLF o, en su caso, del titular de los derechos a que corresponda.\r\n" + 
			"En ning�n caso se entender� que el acceso y navegaci�n del Usuario por el Sitio Web o la adquisici�n de los productos de HOTEL LA LAGUNA SPA & GOLF ofertados a trav�s del Sitio Web, implica una renuncia, transmisi�n, licencia o cesi�n total ni parcial de dichos derechos por parte de HOTEL LA LAGUNA SPA & GOLF.\r\n" + 
			"\r\n" + 
			"En consecuencia, no est� permitido suprimir, eludir o manipular el aviso de derechos de autor (�copyright�) y cualesquiera otros datos de identificaci�n de los derechos de HOTEL LA LAGUNA SPA & GOLF o de sus titulares incorporados a los Contenidos y productos, as� como los dispositivos t�cnicos de protecci�n, las huellas digitales, marcas de agua o cualesquiera mecanismos de informaci�n y/o de identificaci�n que pudieren contenerse en los mismos.\r\n" + 
			"\r\n" + 
			"Condiciones de uso del sitio web\r\n" + 
			"No est� permitido y, por tanto, sus consecuencias ser�n de la exclusiva responsabilidad del usuario, el acceso o la utilizaci�n del Sitio Web con fines ilegales o no autorizados, con o sin finalidad econ�mica, y, m�s espec�ficamente y sin que el siguiente listado tenga car�cter absoluto, queda prohibido:\r\n" + 
			"\r\n" + 
			"Usar el Sitio Web en forma alguna que pueda provocar da�os, interrupciones, ineficiencias o defectos en su funcionalidad o en el ordenador de un tercero;\r\n" + 
			"Usar el Sitio Web para la transmisi�n, la instalaci�n o la publicaci�n de cualquier virus, c�digo malicioso u otros programas o archivos perjudiciales;\r\n" + 
			"Usar el Sitio Web para recoger datos de car�cter personal de otros usuarios;\r\n" + 
			"Registrarse a trav�s del Sitio Web con una identidad falsa, suplantado a terceros o utilizando un perfil o realizando cualquier otra acci�n que pueda confundir a otros usuarios sobre la identidad del origen de un mensaje;\r\n" + 
			"Acceder sin autorizaci�n a cualquier secci�n del Sitio Web, a otros sistemas o redes conectadas a la Plataforma, a ning�n servidor de HOTEL LA LAGUNA SPA & GOLF ni a los servicios ofrecidos a trav�s del Sitio Web, por medio de pirateo o falsificaci�n, extracci�n de contrase�as o cualquier otro medio ileg�timo;\r\n" + 
			"Quebrantar, o intentar quebrantar, las medidas de seguridad o autenticaci�n del Sitio Web o de cualquier red conectada a la misma, o las medidas de seguridad o protecci�n inherentes a los contenidos ofrecidos en el Sitio Web;\r\n" + 
			"Llevar a cabo alguna acci�n que provoque una saturaci�n desproporcionada o innecesaria en la infraestructura del Sitio Web o en los sistemas o redes de HOTEL LA LAGUNA SPA & GOLF, as� como en los sistemas y redes conectados al Sitio Web; o\r\n" + 
			"Impedir el normal desarrollo de un evento, concurso, promoci�n o cualquier otra actividad disponible a trav�s del Sitio Web o cualesquiera de sus funcionalidades, ya sea alterando o tratando de alterar, ilegalmente o de cualquier otra forma, el acceso, participaci�n o funcionamiento de aqu�llos, o falseando el resultado de los mismos y/o utilizando m�todos de participaci�n fraudulentos, mediante cualquier procedimiento, y/o a trav�s de cualquier pr�ctica que atente o vulnere en modo alguno las presentes Condiciones de uso.\r\n" + 
			"Cualquier uso comercial no autorizado de los mismos, o su reventa, salvo que se cuente con la previa autorizaci�n escrita de HOTEL LA LAGUNA SPA & GOLF. Los contenidos y productos ofertados a trav�s del Sitio Web se facilitan �nicamente a usuarios finales, a personas que naveguen a trav�s de la Web, a personas que se den de alta en el Registro de Usuarios y a personas interesadas en realizar o que realicen la reserva de un inmueble de HOTEL LA LAGUNA SPA & GOLF.\r\n" + 
			"Reproducir o copiar, distribuir, permitir el acceso del p�blico a trav�s de cualquier modalidad de comunicaci�n p�blica, transformar o modificar los contenidos, a menos que se cuente con la autorizaci�n del titular de los correspondientes derechos o ello resulte legalmente permitido.\r\n" + 
			"Emplear los contenidos y, en particular, la informaci�n de cualquier clase obtenida a trav�s del Sitio Web o de los servicios para remitir publicidad, comunicaciones con fines de venta directa o con cualquier otra clase de finalidad comercial, mensajes no solicitados dirigidos a una pluralidad de personas con independencia de su finalidad, as� como a abstenerse de comercializar o divulgar de cualquier modo dicha informaci�n.\r\n" + 
			"El incumplimiento de cualquiera de las anteriores obligaciones por el usuario podr� llevar aparejada la adopci�n por HOTEL LA LAGUNA SPA & GOLF de las medidas oportunas amparadas en Derecho y en el ejercicio de sus derechos u obligaciones, pudiendo llegar a la eliminaci�n o bloqueo de la cuenta del usuario infractor, sin que medie posibilidad de indemnizaci�n alguna por los da�os y perjuicios causados.\r\n" + 
			"\r\n" + 
			"Licencia sobre las comunicaciones\r\n" + 
			"En el caso de que el Usuario env�e informaci�n de cualquier tipo a HOTEL LA LAGUNA SPA & GOLF a trav�s del Sitio Web, mediante los canales dispuestos a tal fin en la propia P�gina, el Usuario declara, garantiza y acepta que tiene derecho a hacerlo libremente, que dicha informaci�n no infringe ning�n derecho de propiedad intelectual, de marca, de patente, secreto comercial, o cualquier otro derecho de tercero, que dicha informaci�n no tiene car�cter confidencial y que dicha informaci�n no es perjudicial para terceros.\r\n" + 
			"\r\n" + 
			"El Usuario reconoce asumir la responsabilidad y dejar� indemne a HOTEL LA LAGUNA SPA & GOLF por cualquier comunicaci�n que suministre personalmente o a su nombre, alcanzando dicha responsabilidad sin restricci�n alguna la exactitud, legalidad, originalidad y titularidad de la misma.\r\n" + 
			"\r\n" + 
			"Responsabilidades\r\n" + 
			"HOTEL LA LAGUNA SPA & GOLF no asume ninguna responsabilidad derivada, o que pudiera derivarse de la utilizaci�n que los usuarios hagan de las informaciones y contenidos de esta p�gina web. Los contenidos y las informaciones no vinculan a la susodicha, ni constituyen opiniones, o consejos, pues se trata meramente de un servicio ofrecido con car�cter informativo y divulgativo. HOTEL LA LAGUNA SPA & GOLF no puede asumir ninguna responsabilidad derivada del uso incorrecto, inapropiado o il�cito de la informaci�n aparecida en la presente p�gina web.\r\n" + 
			"\r\n" + 
			"HOTEL LA LAGUNA SPA & GOLF emplear� todos los esfuerzos y medios razonables para facilitar informaci�n actualizada y fehaciente en la Web, no obstante, HOTEL LA LAGUNA SPA & GOLF no asume ninguna garant�a en relaci�n con la ausencia de errores, o de posibles inexactitudes y/u omisiones en ninguno de los contenidos accesibles a trav�s de este Web.\r\n" + 
			"\r\n" + 
			"HOTEL LA LAGUNA SPA & GOLF se reserva el derecho a modificar, desarrollar o actualizar en cualquier momento y sin previa notificaci�n, las condiciones de uso del presente Web. El Usuario quedar� obligado autom�ticamente por las condiciones de uso que se hallen vigentes en el momento en que acceda al Web, por lo que deber� leer peri�dicamente dichas condiciones de uso.\r\n" + 
			"\r\n" + 
			"El Usuario es el �nico responsable de las infracciones en las que pueda incurrir o de los perjuicios que pueda causar por la utilizaci�n de la Web, quedando HOTEL LA LAGUNA SPA & GOLF, sus socios, colaboradores, empleados y representantes, exonerados de cualquier clase de responsabilidad que se pudiera derivar por las acciones del Usuario.\r\n" + 
			"\r\n" + 
			"El Usuario es el �nico responsable frente a cualquier reclamaci�n o acci�n legal, judicial o extrajudicial, iniciada por terceras personas contra HOTEL LA LAGUNA SPA & GOLF basada en la utilizaci�n por el Usuario de la Web. En su caso, el Usuario asumir� cuantos gastos, costes e indemnizaciones sean irrogados al titular de la Web con motivo de tales reclamaciones o acciones legales.\r\n" + 
			"\r\n" + 
			"HOTEL LA LAGUNA SPA & GOLF se reserva el derecho de suspender temporalmente el acceso a su p�gina web por causas relacionadas con motivo de operaciones de mantenimiento, reparaci�n, actualizaci�n o mejora.\r\n" + 
			"\r\n" + 
			"HOTEL LA LAGUNA SPA & GOLF queda exento de toda responsabilidad que se pudiera derivar de interferencias, omisiones, interrupciones, virus inform�ticos, aver�as telef�nicas o desconexiones en el funcionamiento operativo del sistema electr�nico, motivado por causas ajenas al titular de la Web. Asimismo, HOTEL LA LAGUNA SPA & GOLF tambi�n excluye cualquier responsabilidad que pudiera derivarse por retrasos o bloqueos en el funcionamiento operativo de este sistema electr�nico causado por deficiencias o sobre carga en las l�neas telef�nicas o en Internet, as� como de da�os causados por terceras personas mediante intromisiones ilegitimas fuera del control de HOTEL LA LAGUNA SPA & GOLF.\r\n" + 
			"\r\n" + 
			"HOTEL LA LAGUNA SPA & GOLF ha adoptado las medidas de seguridad que permite el estado actual de la tecnolog�a. Sin embargo, el usuario es consciente del hecho seg�n el cual HOTEL LA LAGUNA SPA & GOLF no puede garantizar la ausencia absoluta de virus o elementos lesivos.\r\n" + 
			"\r\n" + 
			"Si el Usuario tuviera conocimiento de la existencia de alg�n contenido il�cito, ilegal, contrario a las leyes o que pudiera suponer una infracci�n de derechos de propiedad intelectual y/o industrial, deber� notificarlo inmediatamente a HOTEL LA LAGUNA SPA & GOLF para que �sta pueda proceder a la adopci�n de las medidas oportunas.\r\n" + 
			"\r\n" + 
			"Duraci�n y modificaci�n\r\n" + 
			"HOTEL LA LAGUNA SPA & GOLF podr� modificar los t�rminos y condiciones aqu� estipulados, total o parcialmente, publicando cualquier cambio en la misma forma en que aparece este Aviso legal o a trav�s de cualquier tipo de comunicaci�n dirigida a los Usuarios.\r\n" + 
			"\r\n" + 
			"La vigencia temporal de este Aviso legal coincide, por lo tanto, con el tiempo de su exposici�n, hasta que sean modificadas total o parcialmente, momento en el cual pasar� a tener vigencia el Aviso legal modificado.\r\n" + 
			"\r\n" + 
			"Con independencia de lo dispuesto en las condiciones particulares, HOTEL LA LAGUNA SPA & GOLF podr� dar por terminado, suspender o interrumpir, en cualquier momento sin necesidad de preaviso, el acceso a los contenidos de la p�gina, sin posibilidad por parte del Usuario de exigir indemnizaci�n alguna. Tras dicha extinci�n, seguir�n vigentes las prohibiciones de uso de los contenidos expuestas anteriormente en el presente Aviso legal.\r\n" + 
			"\r\n" + 
			"Salvaguarda de las normas\r\n" + 
			"Si alg�n t�rmino y condici�n de las presentes Normas fuera declarado nulo o inoperante, el resto de las disposiciones se mantendr�n en los t�rminos acordados. HOTEL LA LAGUNA SPA & GOLF se compromete a sustituir la estipulaci�n afectada por la nulidad aproxim�ndose lo m�s posible a la intenci�n inicialmente perseguida.\r\n" + 
			"\r\n" + 
			"Jurisdicci�n\r\n" + 
			"Las relaciones establecidas entre HOTEL LA LAGUNA SPA & GOLF y el Usuario se regir�n por lo dispuesto en la normativa espa�ola vigente acerca de la legislaci�n aplicable y la jurisdicci�n competente. No obstante, para los casos en los que la normativa prevea la posibilidad a las partes de someterse a un fuero, HOTEL LA LAGUNA SPA & GOLF y el Usuario, con renuncia expresa a cualquier otro fuero que pudiera corresponderles, someter�n cualesquiera controversias y/o litigios al conocimiento de los Juzgados y Tribunales de Torrevieja (Alicante).\r\n" + 
			"\r\n" + 
			"Compromiso\r\n" + 
			"Este documento ha sido redactado conforme a la situaci�n actual de HOTEL LA LAGUNA SPA & GOLF\r\n" + 
			"En Rojales, a 09 de agosto de 2018\r\n" + 
			"\r\n" + 
			"Fdo.: Amedeo Maturo Senra\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"Dpto.: DPO\r\n" + 
			"Cargo: DPO";
	
	public PanelBasesLegales() {
		setBorder(new LineBorder(new Color(0, 0, 0), 4));
		setBackground(SystemColor.controlHighlight);
		setLayout(null);
		
		scrollPaneBasesLegales = new JScrollPane();
		scrollPaneBasesLegales.setBounds(31, 32, 866, 426);
		add(scrollPaneBasesLegales);
		baseslegales = new JTextPane();
		scrollPaneBasesLegales.setViewportView(baseslegales);
		
		btnContinuarBasesLegales = new JButton("CONTINUAR");
		btnContinuarBasesLegales.setFont(new Font("Arial", Font.BOLD, 15));
		btnContinuarBasesLegales.setBounds(738, 565, 198, 48);
		add(btnContinuarBasesLegales);
		btnContinuarBasesLegales.setEnabled(false);
		
		rdbtnAceptarCondiciones = new JRadioButton("ACEPTO LAS CONDICIONES DE USO");
		rdbtnAceptarCondiciones.setFont(new Font("Arial", Font.BOLD, 15));
		rdbtnAceptarCondiciones.setBounds(31, 465, 293, 23);
		add(rdbtnAceptarCondiciones);
		
		lblFondoBasesLegales = new JLabel("New label");
		lblFondoBasesLegales.setIcon(new ImageIcon("Cosas/fondo1.png"));
		lblFondoBasesLegales.setBounds(0, 0, 924, 601);
		add(lblFondoBasesLegales);
		
		try {
			baseslegales.getStyledDocument().insertString(baseslegales.getStyledDocument().getLength(),blegales, null);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	

}
