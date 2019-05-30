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
