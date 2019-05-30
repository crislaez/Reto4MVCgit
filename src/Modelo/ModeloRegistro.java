package Modelo;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.apache.commons.codec.digest.DigestUtils;

import Coordinador.Controlador1;
import Coordinador.FuncionesControlador;

public class ModeloRegistro {

	
	Controlador1 controlador;
	gestorBD gestor;
	Metodos2 metodos;
	FuncionesControlador funciones=new FuncionesControlador();
	int prueba=0;
	String sexo;
	
	public ModeloRegistro(gestorBD gestor,Metodos2 metodos){
		this.gestor= gestor;
		this.metodos=metodos;
	}
	/**
	 * 
	 * @param rdbtnHombreRegistro
	 * @param rdbtnMujerRegistro
	 */
	public void rbtnhombre(JRadioButton rdbtnHombreRegistro,JRadioButton rdbtnMujerRegistro) {
		if(rdbtnHombreRegistro.isSelected()) {
			sexo="Hombre";
			System.out.println(sexo);
		}
		else if(!rdbtnHombreRegistro.isSelected()) {
			sexo="";
			System.out.println(sexo);
		}
	}
	/**
	 * 
	 * @param rdbtnHombreRegistro
	 * @param rdbtnMujerRegistro
	 */
	public void rbtnmujer(JRadioButton rdbtnHombreRegistro,JRadioButton rdbtnMujerRegistro) {
		if(rdbtnHombreRegistro.isSelected()) {
			sexo="Mujer";
			System.out.println(sexo);
		}
		else if(!rdbtnHombreRegistro.isSelected()) {
			sexo="";
			System.out.println(sexo);
		}
	}
	/**
	 * 
	 * @param cliente
	 * @param formattedDniRegistro
	 * @param textNombreRegistro
	 * @param textApellidoRegistro
	 * @param formattedEdadRegistro
	 * @param rdbtnHombreRegistro
	 * @param rdbtnMujerRegistro
	 * @param passwordContraseñaRegistro
	 * @param Registro
	 * @param Login
	 */
	public void ingresar(Cliente cliente,JFormattedTextField formattedDniRegistro,JTextField textNombreRegistro,JTextField textApellidoRegistro,JFormattedTextField formattedEdadRegistro,JRadioButton rdbtnHombreRegistro,JRadioButton rdbtnMujerRegistro,JPasswordField passwordContraseñaRegistro,JPanel Registro,JPanel Login) {
		
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
			Modelo1.encriptMD5=DigestUtils.md5Hex(passwordContraseñaRegistro.getText());
			cliente.setContraseña(Modelo1.encriptMD5);
			
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
	
}
