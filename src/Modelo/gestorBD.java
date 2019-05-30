package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import Modelo.Alojamiento;
import Modelo.Apartamento;
import Modelo.Cama;
import Modelo.Casa;
import Modelo.Cliente;
import Modelo.Habitacion;
import Modelo.Hotel;
import Modelo.Reserva2;







public class gestorBD {
	
	private Connection connect;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
//------------------------------------------------------------------------------------------
//conectar
	public void gestorDB() {
		connect=null;
	}
//----------------------------------------------------------------------------------------------
//direccion
	public void conectar() {
		
		try {
			
			//connect=DriverManager.getConnection(InsertarHost() ,InsertarUsuario(), InsertarContrasena() );
			connect=DriverManager.getConnection(InsertarHost() ,InsertarUsuario(), "" );
			
			
		}catch(java.sql.SQLException sqle ) {
	        
			JOptionPane.showMessageDialog(null, "Error " + sqle);
			System.exit(1);

	    	
		}
		
	}
//------------------------------------------------------------------------------------------------
//insertat hotel
		public void insertarHotel(String nombreAlojamiento,String ubicacion,int habitacionesDisponibles,int numeroEstrellas,double precio) throws Exception 
		{
		    try 
		    {
		    	conectar();
		        // Statements allow to issue SQL queries to the database
		        statement = connect.createStatement();
		
		        // PreparedStatements can use variables and are more efficient
		        preparedStatement = connect
		                .prepareStatement("insert into hotel(nombrealojamiento,ubicacion,habitacionesdisponibles,numeroestrellas,precio,reserva) "
		                		+ "values (\""+nombreAlojamiento+"\",\""+ubicacion+"\",\""+habitacionesDisponibles+"\",\""+numeroEstrellas+"\",\""+precio+"\")");       
		        
		        preparedStatement.executeUpdate();
		
		    } 
		    catch (SQLException e) 
		    {
		    	e.printStackTrace();
		    			    	
		    } 
		    close();
		
		}
//------------------------------------------------------------------------------------------------------------	
//insertat cliente
		public int insertarCliente(String dni,String nombre,String apellido,int edad, String sexo, String contraseña) throws Exception 
		{ int prueba=0;
		    try 
		    {
		    	conectar();
		        // Statements allow to issue SQL queries to the database
		        statement = connect.createStatement();
		
		        // PreparedStatements can use variables and are more efficient
		        preparedStatement = connect
		                .prepareStatement("insert into cliente(dni,nombrecliente,apellidocliente,edad,sexo,contraseña) "
		                		+ "values (\""+dni+"\",\""+nombre+"\",\""+apellido+"\",\""+edad+"\",\""+sexo+"\",\""+contraseña+"\")");       
		        
		        preparedStatement.executeUpdate();
		
		    } 
		    catch (SQLException e) 
		    {
		    	e.printStackTrace();
		    	JOptionPane.showMessageDialog(null, "Error al ingresar, el Usuario ya existe");
		    	prueba=1;	    	
		    } 
		    close();
		return prueba;
		}

//------------------------------------------------------------------------------------------------------------	
//insertat reserva
		public void insertarReserva(int codigohotel,int codigocasa,int codigoapartamento, String dni, double precio,String nombreAlojamiento,String ubicacion,int numeropersonas,String fechainicio, String fechafin, int contador) throws Exception 
		{
			int codigoreserva=0;
			int numero=0;
			conectar();
			try
			{
				statement = connect.createStatement();
				resultSet = statement.executeQuery("select codigoreserva from reserva order by codigoreserva desc limit 1");
				while (resultSet.next())
				{
					numero = resultSet.getInt("codigoreserva");
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			codigoreserva=numero+1;
			//-------------------------------------------------------
		    try 
		    {
		    	if(contador==1) {
		    		codigocasa=0;
		    		codigoapartamento=0;
		            // Statements allow to issue SQL queries to the database
			        statement = connect.createStatement();
			
			        // PreparedStatements can use variables and are more efficient
			        preparedStatement = connect
			                .prepareStatement("insert into reserva(codigoreserva,codigohotel,codigocasa,codigoapartamento,dni,precio,nombreAlojamiento,ubicacion,numeropersonas,fechainicio,fechafin) "
			                		+ "values (\""+codigoreserva+"\",\""+codigohotel+"\",\""+codigocasa+"\",\""+codigoapartamento+"\",\""+dni+"\",\""+precio+"\",\""+nombreAlojamiento+"\",\""+ubicacion+"\",\""+numeropersonas+"\",\""+fechainicio+"\",\""+fechafin+"\")");       
			        
			        preparedStatement.executeUpdate();
		    	}
		    	else if(contador==2) {
		    		codigohotel=0;
		    		codigoapartamento=0;
		    	
			        statement = connect.createStatement();
					
			        // PreparedStatements can use variables and are more efficient
			        preparedStatement = connect
			                .prepareStatement("insert into reserva(codigoreserva,codigohotel,codigocasa,codigoapartamento,dni,precio,nombreAlojamiento,ubicacion,numeropersonas,fechainicio,fechafin) "
			                		+ "values (\""+codigoreserva+"\",\""+codigohotel+"\",\""+codigocasa+"\",\""+codigoapartamento+"\",\""+dni+"\",\""+precio+"\",\""+nombreAlojamiento+"\",\""+ubicacion+"\",\""+numeropersonas+"\",\""+fechainicio+"\",\""+fechafin+"\")");       
			        
			        preparedStatement.executeUpdate();
		    	}
		    	else if(contador==3) {
		    		codigohotel=0;
		    		codigocasa=0;
		    
			        statement = connect.createStatement();
					
			        // PreparedStatements can use variables and are more efficient
			        preparedStatement = connect
			                .prepareStatement("insert into reserva(codigoreserva,codigohotel,codigocasa,codigoapartamento,dni,precio,nombreAlojamiento,ubicacion,numeropersonas,fechainicio,fechafin) "
			                		+ "values (\""+codigoreserva+"\",\""+codigohotel+"\",\""+codigocasa+"\",\""+codigoapartamento+"\",\""+dni+"\",\""+precio+"\",\""+nombreAlojamiento+"\",\""+ubicacion+"\",\""+numeropersonas+"\",\""+fechainicio+"\",\""+fechafin+"\")");       
			        
			        preparedStatement.executeUpdate();
		    	}
		    	
		
		 
		    } 
		    catch (SQLException e) 
		    {
		    	e.printStackTrace();
		    			    	
		    } 
		    close();
		}		
//------------------------------------------------------------------------------------------------------------
//valores del Hotel
		public void seleccionarHotel(ArrayList<Alojamiento> alojamiento) throws Exception {
			 conectar();
		 
					
				try {
						    
				     statement = connect.createStatement();
						  
				     resultSet = statement
				           .executeQuery("select * from hotel");
				    while (resultSet.next()) {
				    int codigohotel=resultSet.getInt("codigohotel");	
				    String nombreAlojamiento=resultSet.getString("nombrealojamiento");	
				    String ubicacion=resultSet.getString("ubicacion");
				    int habitacionesDisponibles=resultSet.getInt("habitacionesdisponibles");
				    int numeroEstrellas=resultSet.getInt("numeroEstrellas");
				    double precio=resultSet.getDouble("precio");
				    int numeroreservas=resultSet.getInt("numeroreservas");
				    boolean wifi=resultSet.getBoolean("wifi");
				    boolean piscina=resultSet.getBoolean("piscina");
				    boolean spa=resultSet.getBoolean("spa");
				    boolean parking=resultSet.getBoolean("parking");
				    boolean aireacondicionado=resultSet.getBoolean("aireacondicionado");
				    boolean restaurante=resultSet.getBoolean("restaurante");
				    boolean bar=resultSet.getBoolean("bar");
				    boolean gym=resultSet.getBoolean("gym");
				    
				    alojamiento.add(new Hotel(nombreAlojamiento,ubicacion,habitacionesDisponibles,precio,numeroreservas,wifi,piscina,spa,parking,aireacondicionado,restaurante,bar,gym,codigohotel,numeroEstrellas));
				      }
						
				    } catch (SQLException e) {
						  	e.printStackTrace();
				  }
				 close();
					
			}	
//------------------------------------------------------------------------------------------------------------
//valores del casa
		public void seleccionarCasa(ArrayList<Alojamiento> alojamiento) throws Exception {
			conectar();
		
					
				try {
						    
				     statement = connect.createStatement();
						  
				     resultSet = statement
				           .executeQuery("select * from casa");
				    while (resultSet.next()) {
				    int codigocasa=resultSet.getInt("codigocasa");	
				    String nombreAlojamiento=resultSet.getString("nombrealojamiento");	
				    String ubicacion=resultSet.getString("ubicacion");
				    int habitacionesDisponibles=resultSet.getInt("habitacionesdisponibles");
				    double precio=resultSet.getDouble("preciocasa");
				    int numeroreservas=resultSet.getInt("numeroreservas");
				    double mcuadrados=resultSet.getDouble("mcuadrados");
				    boolean wifi=resultSet.getBoolean("wifi");
				    boolean piscina=resultSet.getBoolean("piscina");
				    boolean spa=resultSet.getBoolean("spa");
				    boolean parking=resultSet.getBoolean("parking");
				    boolean aireacondicionado=resultSet.getBoolean("aireacondicionado");
				    boolean restaurante=resultSet.getBoolean("restaurante");
				    boolean bar=resultSet.getBoolean("bar");
				    boolean gym=resultSet.getBoolean("gym");
				 
				    
				    alojamiento.add(new Casa(nombreAlojamiento,ubicacion,habitacionesDisponibles,codigocasa,precio,numeroreservas,mcuadrados,wifi,piscina,spa,parking,aireacondicionado,restaurante,bar,gym));
				      }
						
				    } catch (SQLException e) {
						  	e.printStackTrace();
				  }
			
				 close();
			}	
//------------------------------------------------------------------------------------------------------------
//valores del apartamento
		public void seleccionarApartamento(ArrayList<Alojamiento> alojamiento) throws Exception {
			conectar();		
				try {
						    
				     statement = connect.createStatement();
						  
				     resultSet = statement
				           .executeQuery("select * from apartamento");
				    while (resultSet.next()) {
				    int codigoapartamento=resultSet.getInt("codigoapartamento");	
				    String nombreAlojamiento=resultSet.getString("nombreAlojamiento");	
				    String ubicacion=resultSet.getString("ubicacion");
				    int habitacionesDisponibles=resultSet.getInt("habitacionesdisponibles");
				    double precio=resultSet.getDouble("precioapartamento");
				    int numeroreservas=resultSet.getInt("numeroreservas");
				    double mcuadrado=resultSet.getDouble("mcuadrado");
				    int piso=resultSet.getInt("piso");
				    boolean wifi=resultSet.getBoolean("wifi");
				    boolean piscina=resultSet.getBoolean("piscina");
				    boolean spa=resultSet.getBoolean("spa");
				    boolean parking=resultSet.getBoolean("parking");
				    boolean aireacondicionado=resultSet.getBoolean("aireacondicionado");
				    boolean restaurante=resultSet.getBoolean("restaurante");
				    boolean bar=resultSet.getBoolean("bar");
				    boolean gym=resultSet.getBoolean("gym");
				 
				    
				    alojamiento.add(new Apartamento(nombreAlojamiento,ubicacion,habitacionesDisponibles,codigoapartamento,precio,numeroreservas,mcuadrado,piso,wifi,piscina,spa,parking,aireacondicionado,restaurante,bar,gym));
				      }
						
				    } catch (SQLException e) {
						  	e.printStackTrace();
				  }
				 close();
					
			}		
//------------------------------------------------------------------------------------------------------------------------------
//valores del Cliente
		
		public void seleccionarCliente( ArrayList<Cliente> cliente) throws Exception {
			conectar();
				try {
						    
				     statement = connect.createStatement();
						  
				     resultSet = statement
				           .executeQuery("select * from cliente");
				    while (resultSet.next()) {
				    String dni=resultSet.getString("dni");	
				    String nombre=resultSet.getString("nombrecliente");
				    String apellido=resultSet.getString("apellidocliente");
				    int edad=resultSet.getInt("edad");
				    String sexo=resultSet.getString("sexo");
				    String contraseña=resultSet.getString("contraseña");
				   
				    cliente.add(new Cliente(dni,nombre,apellido,edad,sexo,contraseña));
				      }
						
				    } catch (SQLException e) {
						  	e.printStackTrace();
				  }
	
				 close();
			}	
			
//------------------------------------------------------------------------------------------------------------------------------
//valores del Reserva
	
	public void seleccionarReserva(ArrayList<Reserva2> reserva2) throws Exception {
		conectar();
			try {
					    
			     statement = connect.createStatement();
					  
			     resultSet = statement
			           .executeQuery("select * from reserva");
			    while (resultSet.next()) {
			    int codigoreserva=resultSet.getInt("codigoreserva");	
			    int codigohotel=resultSet.getInt("codigohotel");
			    int codigocasa=resultSet.getInt("codigocasa");
			    int codigoapartamento=resultSet.getInt("codigoapartamento");
			  
			    String dni=resultSet.getString("dni");
			    double precio=resultSet.getDouble("precio");	
			    String nombreAlojamiento=resultSet.getString("nombreAlojamiento");
			    String ubicacion=resultSet.getString("ubicacion");
			    int numeropersonas=resultSet.getInt("numeropersonas");
			    String fechainicio=resultSet.getString("fechainicio");
			    String fechafin=resultSet.getString("fechafin");


			    reserva2.add(new Reserva2(codigoreserva,codigohotel,codigocasa,codigoapartamento,dni,precio,nombreAlojamiento,ubicacion,numeropersonas,fechainicio,fechafin));
			      }
					
			    } catch (SQLException e) {
					  	e.printStackTrace();
			  }
			 close();
				
		}	
				
//------------------------------------------------------------------------------------------------------------------------------
//valores de habitacion
	
	public void seleccionarHabitacion(ArrayList<Habitacion> habitacion) throws Exception {
		conectar();
				
			try {
					    
			     statement = connect.createStatement();
					  
			     resultSet = statement
			           .executeQuery("select * from habitacion");
			    while (resultSet.next()) {
			    int codigohabitacion=resultSet.getInt("codigohabitacion");	
			    int codigohotel=resultSet.getInt("codigohotel");
			    int codigocasa=resultSet.getInt("codigocasa");
			    int codigoapartamento=resultSet.getInt("codigoapartamento");
			    int numerocamas=resultSet.getInt("numerocamas");
			    String tipohabitacion=resultSet.getString("tipohabitacion");
			    double mcuadrado=resultSet.getDouble("mcuadrado");
			    double precio=resultSet.getDouble("precio");	


			    habitacion.add(new Habitacion(codigohabitacion,codigohotel,codigocasa,codigoapartamento,numerocamas,tipohabitacion,mcuadrado,precio));
			      }
					
			    } catch (SQLException e) {
					  	e.printStackTrace();
			  }
			 close();
				
		}	
//------------------------------------------------------------------------------------------------------------------------------
//valores del Reserva
	
	public void seleccionarCama( ArrayList<Cama> cama) throws Exception {
		conectar();
				
			try {
					    
			     statement = connect.createStatement();
					  
			     resultSet = statement
			           .executeQuery("select * from cama");
			    while (resultSet.next()) {
			    int codigocama=resultSet.getInt("codigocama");	
			    int codigohotel=resultSet.getInt("codigohotel");	
			    String tipocama=resultSet.getString("tipocama");	

			    cama.add(new Cama(codigocama,codigohotel,tipocama));
			      }
					
			    } catch (SQLException e) {
					  	e.printStackTrace();
			  }
	
			 close();
		}	
					
	
//------------------------------------------------------------------------------------
//Comprobar que el DNI y la contrasena que se pasa por parametros coinciden con el de la BBDD, numero de filas es 1
	public int comprovardnicontraseña(String dni, String contrasena) throws Exception {
		int resultado=0;
		
		
		conectar();
		String sql = "select * FROM cliente WHERE dni='"+dni+"' AND contraseña='"+contrasena+"'";
		try 
		{
	    	
	    	statement = connect.createStatement();
	   
	        resultSet = statement.executeQuery(sql);
	                
	        if(resultSet.next()) 
		    {
	        	resultado=1;
		    }
		      
		} 
	    catch (SQLException e) 
	    {
		    e.printStackTrace();
	
		   
		} 
		 close();
	    return resultado;
	 
	}	
//------------------------------------------------------------------------------------------------------------	
//insertat baseslegales
		public void insertarBaseslegales(String dni,String fecha) throws Exception 
		{
			int codigoreserva=0;
			int numero=0;
			conectar();
			try
			{
				statement = connect.createStatement();
				resultSet = statement.executeQuery("select codigobaseslegales from baseslegales order by codigobaseslegales desc limit 1");
				while (resultSet.next())
				{
					numero = resultSet.getInt("codigobaseslegales");
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			codigoreserva=numero+1;
			//-------------------------------------------------------
		    try 
		    {
		    	
		    				            // Statements allow to issue SQL queries to the database
			        statement = connect.createStatement();
			
			        // PreparedStatements can use variables and are more efficient
			        preparedStatement = connect
			                .prepareStatement("insert into baseslegales(codigobaseslegales,dni,fecha) "
			                		+ "values (\""+codigoreserva+"\",\""+dni+"\",\""+fecha+"\")");       
			        
			        preparedStatement.executeUpdate();
		    	
		    	
		
		 
		    } 
		    catch (SQLException e) 
		    {
		    	e.printStackTrace();
		    			    	
		    } 
		    close();
		}	
//--------------------------------------------------------------------------------------------------------------------------------	
//insertar reservahotel
		public void insertarReservahotel(int codigoreserva,int codigohabitacion) throws Exception 
		{
		
			
			int codigoreservahotel=0;
			int numero=0;
			conectar();
			try
			{
				statement = connect.createStatement();
				resultSet = statement.executeQuery("select codigoreservahotel from reservahotel order by codigoreservahotel desc limit 1");
				while (resultSet.next())
				{
					numero = resultSet.getInt("codigoreservahotel");
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			codigoreservahotel=numero+1;

		    try 
		    {
		    	
		    				            // Statements allow to issue SQL queries to the database
			        statement = connect.createStatement();
			
			        // PreparedStatements can use variables and are more efficient
			        preparedStatement = connect
			                .prepareStatement("insert into reservahotel(codigoreservahotel,codigoreserva,codigohabitacion) "
			                		+ "values (\""+codigoreservahotel+"\",\""+codigoreserva+"\",\""+codigohabitacion+"\")");       
			        
			        preparedStatement.executeUpdate();
		    	
		    	
		
		 
		    } 
		    catch (SQLException e) 
		    {
		    	e.printStackTrace();
		    			    	
		    } 
		    close();
		}	
//--------------------------------------------------------------------------------------------------------------------------------
		public int ultimocodigoreserva(int contador) throws Exception 
		{
			int codigoreserva=0;
			int numero=0;
			conectar();
			try
			{
				statement = connect.createStatement();
				resultSet = statement.executeQuery("select codigoreserva from reserva order by codigoreserva desc limit 1");
				while (resultSet.next())
				{
					numero = resultSet.getInt("codigoreserva");
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			if (contador==0) {
				codigoreserva=numero+1;
				System.out.println(contador);
			}
			else if(contador==1) {
				codigoreserva=numero+1;
				System.out.println(contador);
			}
			
			 close();
			return codigoreserva;
		}
//--------------------------------------------------------------------------------------------------------------------------------			
//borrar cliente
	public int borrarCliente(String dni,String contraseña) throws Exception
	{ int prueba=0;
	conectar();
		try
		{
			statement = connect.createStatement();
			prueba=statement.executeUpdate("delete from cliente where dni = '"+dni+"' and contraseña = '"+contraseña+"'");
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			prueba=0;
		}
		System.out.println(prueba);
		 close();
		return prueba;
	}

//--------------------------------------------------------------------------------------------------------------------------------------------------
//borrar cliente
	public int borrarReserva(String dni,int codigoreserva) throws Exception
	{ int prueba=0;
	conectar();
		try
		{
			statement = connect.createStatement();
			prueba=statement.executeUpdate("delete from reserva where dni = '"+dni+"' and codigoreserva = '"+codigoreserva+"'");
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			prueba=0;
		}
		System.out.println(prueba);
		 close();
		return prueba;
	}

//--------------------------------------------------------------------------------------------------------------------------------------------------
//insertar host
	public static String InsertarHost() 
	{
		String texto="";
		 String host="";
		
		try 
		{
			BufferedReader bf = new BufferedReader(new FileReader("Cosas\\conector.txt"));
			String temp = "";
			String bfRead;
			while((bfRead = bf.readLine()) !=null) //hace el ciclo mientras bfRead tiene datos
			{
				temp = temp + bfRead;// guardado el texto del archivo
			}
			texto = temp;
		}
		catch(Exception e) {
			System.err.println("no se encontro el archivo");
			
		}
				
		host = texto.split(";")[0];
			
		return host;
	}		
//------------------------------------------------------------------------------------------------------------------	
//Insertar usuario
	public static String InsertarUsuario() 
	{
		String texto="";
		String usuario="";
		
		try 
		{
			BufferedReader bf=new BufferedReader(new FileReader("Cosas\\conector.txt"));
			String temp="";
			String bfRead;
			while((bfRead = bf.readLine()) !=null) 
			{//hace el ciclo mientras bfRead tiene datos
				temp=temp + bfRead;// guardado el texto del archivo
			}
			texto=temp;
		}
		catch(Exception e)
		{
			System.err.println("no se encontro el archivo");		
		}
					
		usuario=texto.split(";")[1];
			
		return usuario;
	}
//------------------------------------------------------------------------------------------------------------------------
//Insertar contraseña
	
	public static String InsertarContrasena() 
	{
		String texto="";
		String contrasena="";
		
		try 
		{
			BufferedReader bf=new BufferedReader(new FileReader("Cosas\\conector.txt"));
			String temp="";
			String bfRead;
			while((bfRead = bf.readLine()) !=null) 
			{
				temp=temp + bfRead;// guardado el texto del archivo
			}
			
			texto=temp;
		}
		catch(Exception e) 
		{
			System.err.println("no se encontro el archivo");
			
		}
					
		contrasena=texto.split(";")[2];
					
		return contrasena;
	}		
//------------------------------------------------------------------------------------------------
//insertat numero reserva hotel
		public void insertarnumeroreservahotel(int codigohotel) throws Exception 
		{
			conectar();
			System.out.println("al principio");
			int numero=1;
			int numeroreserva=numeroreservahotel(codigohotel);
			System.out.println(numeroreserva);
			int suma=0;
		
			suma=numero+numeroreserva;
			System.out.println(suma);
		    try 
		    {
		    	statement = connect.createStatement();
				statement.executeUpdate("update hotel set numeroreservas ='"+suma+"' where codigohotel ='"+codigohotel+"'");       
		        
		        preparedStatement.executeUpdate();
		
		    } 
		    catch (SQLException e) 
		    {
		    	System.out.print("SQLException controlar el error");
				e.getMessage();
		    	
		    } 
		    close();
		}	
//------------------------------------------------------------------------------------------------------------------------
//insertar numero reserva hotel
		public int numeroreservahotel(int codigohotel) throws SQLException {
	     int numeroreservas=0;
	        String tipoDeProcedimiento = "{ call insertarnumeroreservahotel(?) }";
	        conectar();
	        try {
	              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);

	              miSentencia.setInt(1, codigohotel);//interrogacion 4 valriable
	           
	             resultSet= miSentencia.executeQuery();
	                  	    
	              while (resultSet.next()) {
	            	  numeroreservas= resultSet.getInt(7);
	            	 
	     			    	
		    
		    }
		   
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	       
	        }
	        close();
	     return numeroreservas;
	    }	
//------------------------------------------------------------------------------------------------
//insertat numero reserva casa
		public void insertarnumeroreservacasa(int codigocasa) throws Exception 
		{
			conectar();
			System.out.println("al principio");
			int numero=1;
			int numeroreserva=numeroreservacasa(codigocasa);
			System.out.println(numeroreserva);
			int suma=0;
		
			suma=numero+numeroreserva;
			System.out.println(suma);
		    try 
		    {
		    	statement = connect.createStatement();
				statement.executeUpdate("update casa set numeroreservas ='"+suma+"' where codigocasa ='"+codigocasa+"'");       
		        
		        preparedStatement.executeUpdate();
		
		    } 
		    catch (SQLException e) 
		    {
		    	System.out.print("SQLException variable vacia");
				e.getMessage();
		    	
		    } 
		    close();
		}			
//------------------------------------------------------------------------------------------------------------------------
//insertar numero reserva casa
		public int numeroreservacasa(int codigocasa) throws SQLException {
	     int numeroreservas=0;
	        String tipoDeProcedimiento = "{ call insertarnumeroreservacasa(?) }";
	        conectar();
	        try {
	              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);

	              miSentencia.setInt(1, codigocasa);//interrogacion 4 valriable
	           
	             resultSet= miSentencia.executeQuery();
	                  	    
	              while (resultSet.next()) {
	            	  numeroreservas= resultSet.getInt(6);
	            	 
	     			    	
		    
		    }
		   
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	       
	        }
	        close();
	     return numeroreservas;
	    }		
//------------------------------------------------------------------------------------------------
//insertat numero reserva casa
		public void insertarnumeroreservaapartamento(int codigoapartamento) throws Exception 
		{
			conectar();
			System.out.println("al principio");
			int numero=1;
			int numeroreserva=numeroreservaapartamento(codigoapartamento);
			System.out.println(numeroreserva);
			int suma=0;
		
			suma=numero+numeroreserva;
			System.out.println(suma);
		    try 
		    {
		    	statement = connect.createStatement();
				statement.executeUpdate("update apartamento set numeroreservas ='"+suma+"' where codigoapartamento ='"+codigoapartamento+"'");       
		        
		        preparedStatement.executeUpdate();
		
		    } 
		    catch (SQLException e) 
		    {
		    	System.out.print("SQLException variable vacia");
				e.getMessage();
		    	
		    } 
		    close();
		}			
//------------------------------------------------------------------------------------------------------------------------
//insertar numero reserva apartamento
		public int numeroreservaapartamento(int codigoapartamento) throws SQLException {
	     int numeroreservas=0;
	        String tipoDeProcedimiento = "{ call insertarnumeroreservaapartamento(?) }";
	        conectar();
	        try {
	              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);

	              miSentencia.setInt(1, codigoapartamento);//interrogacion 4 valriable
	           
	             resultSet= miSentencia.executeQuery();
	                  	    
	              while (resultSet.next()) {
	            	  numeroreservas= resultSet.getInt(6);
	            	 
	     			    	
		    
		    }
		   
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	       
	        }
	        close();
	     return numeroreservas;
	    }			
//------------------------------------------------------------------------------------------------------------------------------
//cama para el Jlist
	public int buscarcamas(int codigohabitacion,JList listacamas,DefaultListModel modelo) {
        // 
		int cantidadcamas=0;
        String tipoDeProcedimiento = "{ call vercamas(?) }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
              // Define que el parámetro de salida
              
            //  miSentencia.registerOutParameter(1, java.sql.Types.INTEGER);//interrogacion 1 devuelve
           //   miSentencia.registerOutParameter(2, java.sql.Types.INTEGER);//interrogacion 2 devuelve
           //   miSentencia.registerOutParameter(3, java.sql.Types.VARCHAR);//interrogacion 3 devuelve
             
              // Define que el parámetro de
              miSentencia.setInt(1, codigohabitacion);//interrogacion 4 valriable
             resultSet= miSentencia.executeQuery();
              	    
              while (resultSet.next()) {
            
            	// cama.add(new Cama(miSentencia.getInt(1),miSentencia.getInt(2),miSentencia.getString(3)));
            	  modelo.addElement("Codigo Cama: "+resultSet.getInt(1)+" Codigo Habitacion: "+resultSet.getInt(2)+" Tipo de Cama: "+resultSet.getString(3)) ;
            	  cantidadcamas++;
              }
	       listacamas.setModel(modelo);  
	       
	            
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        close();
      return cantidadcamas;
    }
//------------------------------------------------------------------------------------------------------------------------
//comprobar reserva hotel
		public boolean buscarreservas(int codigohabitacion,String fechafin, String fechainicio) throws SQLException {
	        boolean error=true;
	        String tipoDeProcedimiento = "{ call buscarreservas(?,?,?) }";
	        conectar();
	        try {
	              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);

	              miSentencia.setInt(1, codigohabitacion);//interrogacion 4 valriable
	              miSentencia.setString(2, fechafin);
	              miSentencia.setString(3, fechainicio);
	             resultSet= miSentencia.executeQuery();
	             if(resultSet.next()) {       	    
	              while (resultSet.next()) {
	            	  resultSet.getInt(1);
	            	  resultSet.getInt(2);
	            	  resultSet.getInt(3);
	            	  resultSet.getInt(4);
	            	  resultSet.getInt(5);
	            	  resultSet.getString(6);
	            	  resultSet.getDouble(7);
	            	  resultSet.getString(8);
	            	  resultSet.getString(9); 
	            	  resultSet.getString(10); 
	            	  resultSet.getString(11);
	                 
	              }
		   
		    	error=false;
		    
		    }
		    else {
		    	error=true;
		    	
		    }
		
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	       
	        }
	        close();
	      return error;
	    }
//------------------------------------------------------------------------------------------------------------------------
//comprobar reserva casa
		public boolean buscarreservascasa(int codigocasa,String fechafin, String fechainicio) throws SQLException {
	        boolean error=true;
	        String tipoDeProcedimiento = "{ call buscarreservascasa(?,?,?) }";
	        conectar();
	        try {
	              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);

	              miSentencia.setInt(1, codigocasa);//interrogacion 4 valriable
	              miSentencia.setString(2, fechafin);
	              miSentencia.setString(3, fechainicio);
	             resultSet= miSentencia.executeQuery();
	             if(resultSet.next()) {       	    
	              while (resultSet.next()) {
	            	  resultSet.getInt(1);
	            	  resultSet.getInt(2);
	            	  resultSet.getInt(3);
	            	  resultSet.getInt(4);
	            	  resultSet.getInt(5);
	            	  resultSet.getString(6);
	            	  resultSet.getDouble(7);
	            	  resultSet.getString(8);
	            	  resultSet.getString(9); 
	            	  resultSet.getString(10); 
	            	  resultSet.getString(11);
	                 
	              }
		   
		    	error=false;
		    
		    }
		    else {
		    	error=true;
		    	
		    }
		
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	       
	        }
	        close();
	      return error;
	    }
//------------------------------------------------------------------------------------------------------------------------	
//comprobar reserva
		public boolean buscarreservasapartamento(int codigoapartamento,String fechafin, String fechainicio) throws SQLException {
	        boolean error=true;
	      
	        String tipoDeProcedimiento = "{ call buscarreservasapartamento(?,?,?) }";
	        conectar();
	        try {
	              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);

	              miSentencia.setInt(1, codigoapartamento);//interrogacion 4 valriable
	              miSentencia.setString(2, fechafin);
	              miSentencia.setString(3, fechainicio);
	             resultSet= miSentencia.executeQuery();
	             if(resultSet.next()) {       	    
	              while (resultSet.next()) {
	            	  resultSet.getInt(1);
	            	  resultSet.getInt(2);
	            	  resultSet.getInt(3);
	            	  resultSet.getInt(4);
	            	  resultSet.getInt(5);
	            	  resultSet.getString(6);
	            	  resultSet.getDouble(7);
	            	  resultSet.getString(8);
	            	  resultSet.getString(9); 
	            	  resultSet.getString(10); 
	            	  resultSet.getString(11);
	                 
	              }
		   
		    	error=false;
		    
		    }
		    else {
		    	error=true;
		    	
		    }
		
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	       
	        }
	        close();
	      return error;
	    }
//------------------------------------------------------------------------------------------------------------------------			
//jlist para habitacion casa
	public void buscarhabitacioncasa(int codigocasa,JList listHabitacion,DefaultListModel modelo2) {
        // 
        String tipoDeProcedimiento = "{ call comprobarhabitacioncasa(?) }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
              // Define que el parámetro de salida
              
            //  miSentencia.registerOutParameter(1, java.sql.Types.INTEGER);//interrogacion 1 devuelve
           //   miSentencia.registerOutParameter(2, java.sql.Types.INTEGER);//interrogacion 2 devuelve
           //   miSentencia.registerOutParameter(3, java.sql.Types.VARCHAR);//interrogacion 3 devuelve
             
              // Define que el parámetro de
              miSentencia.setInt(1, codigocasa);//interrogacion 4 valriable
             resultSet= miSentencia.executeQuery();
              	    
              while (resultSet.next()) {
            
            	// cama.add(new Cama(miSentencia.getInt(1),miSentencia.getInt(2),miSentencia.getString(3)));
            	  modelo2.addElement("Codigo Habitacion: "+resultSet.getInt(1)+" Codigo Casa: "+resultSet.getInt(3)+" Tipo de Habitacion: "+resultSet.getString(6)+" MxM: "+resultSet.getDouble(7)) ;
            	  
              }
              listHabitacion.setModel(modelo2);  
	       
	                
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        close();
    }
//------------------------------------------------------------------------------------------------------------------------		
//jlist para habitacion casa
	public void buscarhabitacionapartamento(int codigoapartamento,JList listHabitacion,DefaultListModel modelo2) {
        // 
        String tipoDeProcedimiento = "{ call comprobarhabitacionapartamento(?) }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
              // Define que el parámetro de salida
              
            //  miSentencia.registerOutParameter(1, java.sql.Types.INTEGER);//interrogacion 1 devuelve
           //   miSentencia.registerOutParameter(2, java.sql.Types.INTEGER);//interrogacion 2 devuelve
           //   miSentencia.registerOutParameter(3, java.sql.Types.VARCHAR);//interrogacion 3 devuelve
             
              // Define que el parámetro de
              miSentencia.setInt(1, codigoapartamento);//interrogacion 4 valriable
             resultSet= miSentencia.executeQuery();
              	    
              while (resultSet.next()) {
            
            	// cama.add(new Cama(miSentencia.getInt(1),miSentencia.getInt(2),miSentencia.getString(3)));
            	  modelo2.addElement("Codigo Habitacion: "+resultSet.getInt(1)+" Codigo Apartamento: "+resultSet.getInt(4)+" Tipo de Habitacion: "+resultSet.getString(6)+" MxM: "+resultSet.getDouble(7)) ;
            	  
              }
              listHabitacion.setModel(modelo2);  
	       
	                
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        close();
    }
//------------------------------------------------------------------------------------------------------------------------		
//rellenar hoteles
	public void rellenarhoteles(String ubcacion,JList listhoteles,DefaultListModel modelo3) {
        // 
        String tipoDeProcedimiento = "{ call rellenarhoteles(?) }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
              // Define que el parámetro de salida
              
            //  miSentencia.registerOutParameter(1, java.sql.Types.INTEGER);//interrogacion 1 devuelve
           //   miSentencia.registerOutParameter(2, java.sql.Types.INTEGER);//interrogacion 2 devuelve
           //   miSentencia.registerOutParameter(3, java.sql.Types.VARCHAR);//interrogacion 3 devuelve
             
              // Define que el parámetro de
              miSentencia.setString(1, ubcacion);//interrogacion 4 valriable
             resultSet= miSentencia.executeQuery();
              	    
              while (resultSet.next()) {
            
            	// cama.add(new Cama(miSentencia.getInt(1),miSentencia.getInt(2),miSentencia.getString(3)));-/
            	  modelo3.addElement("Codigo Hotel:,"+resultSet.getInt(1)+",  Nombre Hotel: ,"+resultSet.getString(2)+",  Ubicacion: ,"+resultSet.getString(3)+",  Numero de Estrellas: "+resultSet.getInt(5)+",  Wifi: "+resultSet.getString(7)+",  Piscina: "+resultSet.getString(8)+",  Spa:"+resultSet.getString(9)+",  Parquing: "+resultSet.getString(10)+",  Aire Acondicionado: "+resultSet.getString(11)+",  Restaurante: "+resultSet.getString(12)+",  Bar: "+resultSet.getString(13)+",  Gym: "+resultSet.getString(14)) ;
            	  
              }
              listhoteles.setModel(modelo3);  
	       
	                
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        close();
    }	
//------------------------------------------------------------------------------------------------------------------------		
//rellenar hoteles final sin orden
	public void finalrellenarhotelessinorden(String ubcacion,String wifi,String piscina,String spa,String parking,String aireacondicionado,String restaurante,String bar,String gym,JList listhoteles,DefaultListModel modelo3) {
        // 
		boolean error=true;
		
        String tipoDeProcedimiento = "{ call rellenarhotelsinorden (?,?,?,?,?,?,?,?,?) }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
              // Define que el parámetro de salida
              
            //  miSentencia.registerOutParameter(1, java.sql.Types.INTEGER);//interrogacion 1 devuelve
           //   miSentencia.registerOutParameter(2, java.sql.Types.INTEGER);//interrogacion 2 devuelve
           //   miSentencia.registerOutParameter(3, java.sql.Types.VARCHAR);//interrogacion 3 devuelve
             
              // Define que el parámetro de
              miSentencia.setString(1, ubcacion);//interrogacion 4 valriable
              miSentencia.setString(2, wifi);
              miSentencia.setString(3, piscina);
              miSentencia.setString(4, spa);
              miSentencia.setString(5, parking);
              miSentencia.setString(6, aireacondicionado);
              miSentencia.setString(7, restaurante);
              miSentencia.setString(8, bar);
              miSentencia.setString(9, gym);
             resultSet= miSentencia.executeQuery();
             
            	 while (resultSet.next()) {
            
            	// cama.add(new Cama(miSentencia.getInt(1),miSentencia.getInt(2),miSentencia.getString(3)));-/
            	  modelo3.addElement("Codigo Hotel:,"+resultSet.getInt(1)+",  Nombre Hotel: ,"+resultSet.getString(2)+",  Ubicacion: ,"+resultSet.getString(3)+",  Numero de Estrellas: "+resultSet.getInt(5)+",  Wifi: "+resultSet.getString(7)+",  Piscina: "+resultSet.getString(8)+",  Spa:"+resultSet.getString(9)+",  Parquing: "+resultSet.getString(10)+",  Aire Acondicionado: "+resultSet.getString(11)+",  Restaurante: "+resultSet.getString(12)+",  Bar: "+resultSet.getString(13)+",  Gym: "+resultSet.getString(14)) ;
            	  error=false;  
              }
              listhoteles.setModel(modelo3);  
              
	       
             
             if(error==true) {
            	 JOptionPane.showMessageDialog(null, "No se encontro nada, marque si desea wifi, piscina, parking, aireacondifionado, restaurante, bar o gym");
             }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        close();
    }	
//------------------------------------------------------------------------------------------------------------------------		
//rellenar hoteles final ordenaro por precio
	public void finalrellenarhoteles(String ubcacion,String wifi,String piscina,String spa,String parking,String aireacondicionado,String restaurante,String bar,String gym,JList listhoteles,DefaultListModel modelo3) {
         boolean error=true;
        String tipoDeProcedimiento = "{ call finalhotel(?,?,?,?,?,?,?,?,?) }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
              // Define que el parámetro de salida
              
            //  miSentencia.registerOutParameter(1, java.sql.Types.INTEGER);//interrogacion 1 devuelve
           //   miSentencia.registerOutParameter(2, java.sql.Types.INTEGER);//interrogacion 2 devuelve
           //   miSentencia.registerOutParameter(3, java.sql.Types.VARCHAR);//interrogacion 3 devuelve
             
              // Define que el parámetro de
              miSentencia.setString(1, ubcacion);//interrogacion 4 valriable
              miSentencia.setString(2, wifi);
              miSentencia.setString(3, piscina);
              miSentencia.setString(4, spa);
              miSentencia.setString(5, parking);
              miSentencia.setString(6, aireacondicionado);
              miSentencia.setString(7, restaurante);
              miSentencia.setString(8, bar);
              miSentencia.setString(9, gym);
             resultSet= miSentencia.executeQuery();
            
              while (resultSet.next()) {
            
            	// cama.add(new Cama(miSentencia.getInt(1),miSentencia.getInt(2),miSentencia.getString(3)));-/
            	  modelo3.addElement("Codigo Hotel:,"+resultSet.getInt(1)+",  Nombre Hotel: ,"+resultSet.getString(2)+",  Ubicacion: ,"+resultSet.getString(3)+",  Numero de Estrellas: "+resultSet.getInt(5)+",  Wifi: "+resultSet.getString(7)+",  Piscina: "+resultSet.getString(8)+",  Spa:"+resultSet.getString(9)+",  Parquing: "+resultSet.getString(10)+",  Aire Acondicionado: "+resultSet.getString(11)+",  Restaurante: "+resultSet.getString(12)+",  Bar: "+resultSet.getString(13)+",  Gym: "+resultSet.getString(14)) ;
            	  error=false;  
              }
              listhoteles.setModel(modelo3);  
              
   	       
            
             if(error==true) {
            	 JOptionPane.showMessageDialog(null, "No se encontro nada, marque si desea wifi, piscina, parking, aireacondifionado, restaurante, bar o gym");
             }
	                
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        close();
    }
//------------------------------------------------------------------------------------------------------------------------		
//rellenar hoteles final ordenaro por precio
	public void finalrellenarhotelesestrellas(String ubcacion,String wifi,String piscina,String spa,String parking,String aireacondicionado,String restaurante,String bar,String gym,JList listhoteles,DefaultListModel modelo3) {
         boolean error=true;
        String tipoDeProcedimiento = "{ call finalordennumeroestrellas(?,?,?,?,?,?,?,?,?) }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
              // Define que el parámetro de salida
              
            //  miSentencia.registerOutParameter(1, java.sql.Types.INTEGER);//interrogacion 1 devuelve
           //   miSentencia.registerOutParameter(2, java.sql.Types.INTEGER);//interrogacion 2 devuelve
           //   miSentencia.registerOutParameter(3, java.sql.Types.VARCHAR);//interrogacion 3 devuelve
             
              // Define que el parámetro de
              miSentencia.setString(1, ubcacion);//interrogacion 4 valriable
              miSentencia.setString(2, wifi);
              miSentencia.setString(3, piscina);
              miSentencia.setString(4, spa);
              miSentencia.setString(5, parking);
              miSentencia.setString(6, aireacondicionado);
              miSentencia.setString(7, restaurante);
              miSentencia.setString(8, bar);
              miSentencia.setString(9, gym);
             resultSet= miSentencia.executeQuery();
            
              while (resultSet.next()) {
            
            	// cama.add(new Cama(miSentencia.getInt(1),miSentencia.getInt(2),miSentencia.getString(3)));-/
            	  modelo3.addElement("Codigo Hotel:,"+resultSet.getInt(1)+",  Nombre Hotel: ,"+resultSet.getString(2)+",  Ubicacion: ,"+resultSet.getString(3)+",  Numero de Estrellas: "+resultSet.getInt(5)+",  Wifi: "+resultSet.getString(7)+",  Piscina: "+resultSet.getString(8)+",  Spa:"+resultSet.getString(9)+",  Parquing: "+resultSet.getString(10)+",  Aire Acondicionado: "+resultSet.getString(11)+",  Restaurante: "+resultSet.getString(12)+",  Bar: "+resultSet.getString(13)+",  Gym: "+resultSet.getString(14)) ;
            	  error=false;  
              }
              listhoteles.setModel(modelo3);  
              
   	       
            
             if(error==true) {
            	 JOptionPane.showMessageDialog(null, "No se encontro nada, marque si desea wifi, piscina, parking, aireacondifionado, restaurante, bar o gym");
             }
	                
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        close();
    }	
//------------------------------------------------------------------------------------------------------------------------		
//rellenar hoteles final ordenaro por numero de reservas
	public void finalrellenarhotelesnumeroreservas(String ubcacion,String wifi,String piscina,String spa,String parking,String aireacondicionado,String restaurante,String bar,String gym,JList listhoteles,DefaultListModel modelo3) {
		boolean error=true;
        String tipoDeProcedimiento = "{ call finalhotelnumeroreservas (?,?,?,?,?,?,?,?,?) }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
              // Define que el parámetro de salida
              
            //  miSentencia.registerOutParameter(1, java.sql.Types.INTEGER);//interrogacion 1 devuelve
           //   miSentencia.registerOutParameter(2, java.sql.Types.INTEGER);//interrogacion 2 devuelve
           //   miSentencia.registerOutParameter(3, java.sql.Types.VARCHAR);//interrogacion 3 devuelve
             
              // Define que el parámetro de
              miSentencia.setString(1, ubcacion);//interrogacion 4 valriable
              miSentencia.setString(2, wifi);
              miSentencia.setString(3, piscina);
              miSentencia.setString(4, spa);
              miSentencia.setString(5, parking);
              miSentencia.setString(6, aireacondicionado);
              miSentencia.setString(7, restaurante);
              miSentencia.setString(8, bar);
              miSentencia.setString(9, gym);
             resultSet= miSentencia.executeQuery();
              
              while (resultSet.next()) {
            
            	// cama.add(new Cama(miSentencia.getInt(1),miSentencia.getInt(2),miSentencia.getString(3)));-/
            	  modelo3.addElement("Codigo Hotel:,"+resultSet.getInt(1)+",  Nombre Hotel: ,"+resultSet.getString(2)+",  Ubicacion: ,"+resultSet.getString(3)+",  Numero de Estrellas: "+resultSet.getInt(5)+",  Wifi: "+resultSet.getString(7)+",  Piscina: "+resultSet.getString(8)+",  Spa:"+resultSet.getString(9)+",  Parquing: "+resultSet.getString(10)+",  Aire Acondicionado: "+resultSet.getString(11)+",  Restaurante: "+resultSet.getString(12)+",  Bar: "+resultSet.getString(13)+",  Gym: "+resultSet.getString(14)) ;
            	  error=false; 
              }
              listhoteles.setModel(modelo3);  
	       
               
      	       
             
             if(error==true) {
            	 JOptionPane.showMessageDialog(null, "No se encontro nada, marque si desea wifi, piscina, parking, aireacondifionado, restaurante, bar o gym");
             }         
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        close();
    }
//------------------------------------------------------------------------------------------------------------------------		
//rellenar casa final sin orden
	public void finalrellenarcasasinorden(String ubcacion,String wifi,String piscina,String spa,String parking,String aireacondicionado,String restaurante,String bar,String gym,JList listhoteles,DefaultListModel modelo3) {
		boolean error=true; 
        String tipoDeProcedimiento = "{ call rellenarcasasinorden(?,?,?,?,?,?,?,?,?) }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
              // Define que el parámetro de salida
              
            //  miSentencia.registerOutParameter(1, java.sql.Types.INTEGER);//interrogacion 1 devuelve
           //   miSentencia.registerOutParameter(2, java.sql.Types.INTEGER);//interrogacion 2 devuelve
           //   miSentencia.registerOutParameter(3, java.sql.Types.VARCHAR);//interrogacion 3 devuelve
             
              // Define que el parámetro de
              miSentencia.setString(1, ubcacion);//interrogacion 4 valriable
              miSentencia.setString(2, wifi);
              miSentencia.setString(3, piscina);
              miSentencia.setString(4, spa);
              miSentencia.setString(5, parking);
              miSentencia.setString(6, aireacondicionado);
              miSentencia.setString(7, restaurante);
              miSentencia.setString(8, bar);
              miSentencia.setString(9, gym);
             resultSet= miSentencia.executeQuery();
                 
              while (resultSet.next()) {
            
            	// cama.add(new Cama(miSentencia.getInt(1),miSentencia.getInt(2),miSentencia.getString(3)));-/
            	  modelo3.addElement("Codigo Casa:,"+resultSet.getInt(1)+", Nombre Casa: ,"+resultSet.getString(2)+",  Ubicacion: ,"+resultSet.getString(3)+",  HabitacionesDisponibles: "+resultSet.getInt(4)+",  Precio: ,"+resultSet.getDouble(5)+",  MxM: "+resultSet.getDouble(6)+",  Numero de Baños: "+resultSet.getInt(7)+",  Wifi: "+resultSet.getString(8)+",  Piscina: "+resultSet.getString(9)+",  Spa:"+resultSet.getString(10)+",  Parquing: "+resultSet.getString(11)+",  Aire Acondicionado: "+resultSet.getString(12)+",  Restaurante: "+resultSet.getString(13)+",  Bar: "+resultSet.getString(14)+",  Gym: "+resultSet.getString(15)) ;
            	  error=false;  
              }
              listhoteles.setModel(modelo3);  
             
     	       
         
             if(error==true) {
            	 JOptionPane.showMessageDialog(null, "No se encontro nada, marque si desea wifi, piscina, parking, aireacondifionado, restaurante, bar o gym");
             }  
	                
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        close();
    }	
//------------------------------------------------------------------------------------------------------------------------		
//rellenar casa final ordenado por precio
	public void finalrellenarcasa(String ubcacion,String wifi,String piscina,String spa,String parking,String aireacondicionado,String restaurante,String bar,String gym,JList listhoteles,DefaultListModel modelo3) {
		boolean error=true; 
        String tipoDeProcedimiento = "{ call finalcasa(?,?,?,?,?,?,?,?,?) }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
              // Define que el parámetro de salida
              
            //  miSentencia.registerOutParameter(1, java.sql.Types.INTEGER);//interrogacion 1 devuelve
           //   miSentencia.registerOutParameter(2, java.sql.Types.INTEGER);//interrogacion 2 devuelve
           //   miSentencia.registerOutParameter(3, java.sql.Types.VARCHAR);//interrogacion 3 devuelve
             
              // Define que el parámetro de
              miSentencia.setString(1, ubcacion);//interrogacion 4 valriable
              miSentencia.setString(2, wifi);
              miSentencia.setString(3, piscina);
              miSentencia.setString(4, spa);
              miSentencia.setString(5, parking);
              miSentencia.setString(6, aireacondicionado);
              miSentencia.setString(7, restaurante);
              miSentencia.setString(8, bar);
              miSentencia.setString(9, gym);
             resultSet= miSentencia.executeQuery();
            
              while (resultSet.next()) {
            
            	// cama.add(new Cama(miSentencia.getInt(1),miSentencia.getInt(2),miSentencia.getString(3)));-/
            	  modelo3.addElement("Codigo Casa:,"+resultSet.getInt(1)+", Nombre Casa: ,"+resultSet.getString(2)+",  Ubicacion: ,"+resultSet.getString(3)+",  HabitacionesDisponibles: "+resultSet.getInt(4)+",  Precio: ,"+resultSet.getDouble(5)+",  MxM: "+resultSet.getDouble(6)+",  Numero de Baños: "+resultSet.getInt(7)+",  Wifi: "+resultSet.getString(8)+",  Piscina: "+resultSet.getString(9)+",  Spa:"+resultSet.getString(10)+",  Parquing: "+resultSet.getString(11)+",  Aire Acondicionado: "+resultSet.getString(12)+",  Restaurante: "+resultSet.getString(13)+",  Bar: "+resultSet.getString(14)+",  Gym: "+resultSet.getString(15)) ;
            	  error=false;
              }
              listhoteles.setModel(modelo3);  
	       
                
    	       
             
             if(error==true) {
            	 JOptionPane.showMessageDialog(null, "No se encontro nada, marque si desea wifi, piscina, parking, aireacondifionado, restaurante, bar o gym");
             }           
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        close();
    }	
//------------------------------------------------------------------------------------------------------------------------		
//rellenar casa final ordenado por numeroreservas
	public void finalrellenarcasanumeroreservas(String ubcacion,String wifi,String piscina,String spa,String parking,String aireacondicionado,String restaurante,String bar,String gym,JList listhoteles,DefaultListModel modelo3) {
		boolean error=true;
        String tipoDeProcedimiento = "{ call finalcasanumeroreservas  (?,?,?,?,?,?,?,?,?) }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
              // Define que el parámetro de salida
              
            //  miSentencia.registerOutParameter(1, java.sql.Types.INTEGER);//interrogacion 1 devuelve
           //   miSentencia.registerOutParameter(2, java.sql.Types.INTEGER);//interrogacion 2 devuelve
           //   miSentencia.registerOutParameter(3, java.sql.Types.VARCHAR);//interrogacion 3 devuelve
             
              // Define que el parámetro de
              miSentencia.setString(1, ubcacion);//interrogacion 4 valriable
              miSentencia.setString(2, wifi);
              miSentencia.setString(3, piscina);
              miSentencia.setString(4, spa);
              miSentencia.setString(5, parking);
              miSentencia.setString(6, aireacondicionado);
              miSentencia.setString(7, restaurante);
              miSentencia.setString(8, bar);
              miSentencia.setString(9, gym);
             resultSet= miSentencia.executeQuery();
           	    
              while (resultSet.next()) {
            
            	// cama.add(new Cama(miSentencia.getInt(1),miSentencia.getInt(2),miSentencia.getString(3)));-/
            	  modelo3.addElement("Codigo Casa:,"+resultSet.getInt(1)+", Nombre Casa: ,"+resultSet.getString(2)+",  Ubicacion: ,"+resultSet.getString(3)+",  HabitacionesDisponibles: "+resultSet.getInt(4)+",  Precio: ,"+resultSet.getDouble(5)+",  MxM: "+resultSet.getDouble(6)+",  Numero de Baños: "+resultSet.getInt(7)+",  Wifi: "+resultSet.getString(8)+",  Piscina: "+resultSet.getString(9)+",  Spa:"+resultSet.getString(10)+",  Parquing: "+resultSet.getString(11)+",  Aire Acondicionado: "+resultSet.getString(12)+",  Restaurante: "+resultSet.getString(13)+",  Bar: "+resultSet.getString(14)+",  Gym: "+resultSet.getString(15)) ;
            	  error=false;
              }
              listhoteles.setModel(modelo3);  
                
   	       
             
             if(error==true) {
            	 JOptionPane.showMessageDialog(null, "No se encontro nada, marque si desea wifi, piscina, parking, aireacondifionado, restaurante, bar o gym");
             }  
	                
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        close();
    }
//------------------------------------------------------------------------------------------------------------------------		
//rellenar apartamento final sin orden
	public void finalrellenarapartamentosinorden(String ubcacion,String wifi,String piscina,String spa,String parking,String aireacondicionado,String restaurante,String bar,String gym,JList listhoteles,DefaultListModel modelo3) {
		boolean error=true;
        String tipoDeProcedimiento = "{ call rellenarapartamentosinorden(?,?,?,?,?,?,?,?,?) }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
              // Define que el parámetro de salida
              
            //  miSentencia.registerOutParameter(1, java.sql.Types.INTEGER);//interrogacion 1 devuelve
           //   miSentencia.registerOutParameter(2, java.sql.Types.INTEGER);//interrogacion 2 devuelve
           //   miSentencia.registerOutParameter(3, java.sql.Types.VARCHAR);//interrogacion 3 devuelve
             
              // Define que el parámetro de
              miSentencia.setString(1, ubcacion);//interrogacion 4 valriable
              miSentencia.setString(2, wifi);
              miSentencia.setString(3, piscina);
              miSentencia.setString(4, spa);
              miSentencia.setString(5, parking);
              miSentencia.setString(6, aireacondicionado);
              miSentencia.setString(7, restaurante);
              miSentencia.setString(8, bar);
              miSentencia.setString(9, gym);
             resultSet= miSentencia.executeQuery();
               
              while (resultSet.next()) {
            
            	// cama.add(new Cama(miSentencia.getInt(1),miSentencia.getInt(2),miSentencia.getString(3)));-/
            	  modelo3.addElement("Codigo Apartamento:,"+resultSet.getInt(1)+", Nombre Casa: ,"+resultSet.getString(2)+",  Ubicacion: ,"+resultSet.getString(3)+",  HabitacionesDisponibles: "+resultSet.getInt(4)+",  Precio: ,"+resultSet.getDouble(5)+",  MxM: "+resultSet.getDouble(6)+",  Piso: "+resultSet.getInt(7)+",  Wifi: "+resultSet.getString(8)+",  Piscina: "+resultSet.getString(9)+",  Spa:"+resultSet.getString(10)+",  Parquing: "+resultSet.getString(11)+",  Aire Acondicionado: "+resultSet.getString(12)+",  Restaurante: "+resultSet.getString(13)+",  Bar: "+resultSet.getString(14)+",  Gym: "+resultSet.getString(15)) ;
               	  error=false;
              }
              listhoteles.setModel(modelo3);  
                
      	       
             
             if(error==true) {
            	 JOptionPane.showMessageDialog(null, "No se encontro nada, marque si desea wifi, piscina, parking, aireacondifionado, restaurante, bar o gym");
             }  
	                
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        close();
    }	
//------------------------------------------------------------------------------------------------------------------------		
//rellenar apartamento final ordenador por precio
	public void finalrellenarapartamento(String ubcacion,String wifi,String piscina,String spa,String parking,String aireacondicionado,String restaurante,String bar,String gym,JList listhoteles,DefaultListModel modelo3) {
		boolean error=true;
        String tipoDeProcedimiento = "{ call finalapartamento(?,?,?,?,?,?,?,?,?) }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
              // Define que el parámetro de salida
              
            //  miSentencia.registerOutParameter(1, java.sql.Types.INTEGER);//interrogacion 1 devuelve
           //   miSentencia.registerOutParameter(2, java.sql.Types.INTEGER);//interrogacion 2 devuelve
           //   miSentencia.registerOutParameter(3, java.sql.Types.VARCHAR);//interrogacion 3 devuelve
             
              // Define que el parámetro de
              miSentencia.setString(1, ubcacion);//interrogacion 4 valriable
              miSentencia.setString(2, wifi);
              miSentencia.setString(3, piscina);
              miSentencia.setString(4, spa);
              miSentencia.setString(5, parking);
              miSentencia.setString(6, aireacondicionado);
              miSentencia.setString(7, restaurante);
              miSentencia.setString(8, bar);
              miSentencia.setString(9, gym);
             resultSet= miSentencia.executeQuery();
            	    
              while (resultSet.next()) {
            
            	// cama.add(new Cama(miSentencia.getInt(1),miSentencia.getInt(2),miSentencia.getString(3)));-/
            	  modelo3.addElement("Codigo Apartamento:,"+resultSet.getInt(1)+", Nombre Casa: ,"+resultSet.getString(2)+",  Ubicacion: ,"+resultSet.getString(3)+",  HabitacionesDisponibles: "+resultSet.getInt(4)+",  Precio: ,"+resultSet.getDouble(5)+",  MxM: "+resultSet.getDouble(6)+",  Piso: "+resultSet.getInt(7)+",  Wifi: "+resultSet.getString(8)+",  Piscina: "+resultSet.getString(9)+",  Spa:"+resultSet.getString(10)+",  Parquing: "+resultSet.getString(11)+",  Aire Acondicionado: "+resultSet.getString(12)+",  Restaurante: "+resultSet.getString(13)+",  Bar: "+resultSet.getString(14)+",  Gym: "+resultSet.getString(15)) ;
            	  error=false; 
              }
              listhoteles.setModel(modelo3);  
               
     	       
             
             if(error==true) {
            	 JOptionPane.showMessageDialog(null, "No se encontro nada, marque si desea wifi, piscina, parking, aireacondifionado, restaurante, bar o gym");
             }  
	                
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        close();
    }
//------------------------------------------------------------------------------------------------------------------------		
//rellenar apartamento final ordenador por numeroreservas
	public void finalrellenarapartamentonumeroreservas(String ubcacion,String wifi,String piscina,String spa,String parking,String aireacondicionado,String restaurante,String bar,String gym,JList listhoteles,DefaultListModel modelo3) {
		boolean error=true;
        String tipoDeProcedimiento = "{ call finalapartamentonumeroreservas (?,?,?,?,?,?,?,?,?) }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
              // Define que el parámetro de salida
              
            //  miSentencia.registerOutParameter(1, java.sql.Types.INTEGER);//interrogacion 1 devuelve
           //   miSentencia.registerOutParameter(2, java.sql.Types.INTEGER);//interrogacion 2 devuelve
           //   miSentencia.registerOutParameter(3, java.sql.Types.VARCHAR);//interrogacion 3 devuelve
             
              // Define que el parámetro de
              miSentencia.setString(1, ubcacion);//interrogacion 4 valriable
              miSentencia.setString(2, wifi);
              miSentencia.setString(3, piscina);
              miSentencia.setString(4, spa);
              miSentencia.setString(5, parking);
              miSentencia.setString(6, aireacondicionado);
              miSentencia.setString(7, restaurante);
              miSentencia.setString(8, bar);
              miSentencia.setString(9, gym);
             resultSet= miSentencia.executeQuery();
               
              while (resultSet.next()) {
            
            	// cama.add(new Cama(miSentencia.getInt(1),miSentencia.getInt(2),miSentencia.getString(3)));-/
            	  modelo3.addElement("Codigo Apartamento:,"+resultSet.getInt(1)+", Nombre Casa: ,"+resultSet.getString(2)+",  Ubicacion: ,"+resultSet.getString(3)+",  HabitacionesDisponibles: "+resultSet.getInt(4)+",  Precio: ,"+resultSet.getDouble(5)+",  MxM: "+resultSet.getDouble(6)+",  Piso: "+resultSet.getInt(7)+",  Wifi: "+resultSet.getString(8)+",  Piscina: "+resultSet.getString(9)+",  Spa:"+resultSet.getString(10)+",  Parquing: "+resultSet.getString(11)+",  Aire Acondicionado: "+resultSet.getString(12)+",  Restaurante: "+resultSet.getString(13)+",  Bar: "+resultSet.getString(14)+",  Gym: "+resultSet.getString(15)) ;
            	  error=false;
              }
              listhoteles.setModel(modelo3);  
                
    	       
             
             if(error==true) {
            	 JOptionPane.showMessageDialog(null, "No se encontro nada, marque si desea wifi, piscina, parking, aireacondifionado, restaurante, bar o gym");
             }  
	                
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        close();
    }		
//------------------------------------------------------------------------------------------------------------------------		
//rellenar casas
	public void rellenarcasa(String ubcacion,JList listhoteles,DefaultListModel modelo3) {
        // 
        String tipoDeProcedimiento = "{ call rellenarcasas(?) }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
              // Define que el parámetro de salida
              
            //  miSentencia.registerOutParameter(1, java.sql.Types.INTEGER);//interrogacion 1 devuelve
           //   miSentencia.registerOutParameter(2, java.sql.Types.INTEGER);//interrogacion 2 devuelve
           //   miSentencia.registerOutParameter(3, java.sql.Types.VARCHAR);//interrogacion 3 devuelve
             
              // Define que el parámetro de
              miSentencia.setString(1, ubcacion);//interrogacion 4 valriable
             resultSet= miSentencia.executeQuery();
              	    
              while (resultSet.next()) {
            
            	// cama.add(new Cama(miSentencia.getInt(1),miSentencia.getInt(2),miSentencia.getString(3)));-/
            	  modelo3.addElement("Codigo Casa:,"+resultSet.getInt(1)+", Nombre Casa: ,"+resultSet.getString(2)+",  Ubicacion: ,"+resultSet.getString(3)+",  HabitacionesDisponibles: "+resultSet.getInt(4)+",  Precio: ,"+resultSet.getDouble(5)+",  MxM: "+resultSet.getDouble(6)+",  Numero de Baños: "+resultSet.getInt(7)+",  Wifi: "+resultSet.getString(8)+",  Piscina: "+resultSet.getString(9)+",  Spa:"+resultSet.getString(10)+",  Parquing: "+resultSet.getString(11)+",  Aire Acondicionado: "+resultSet.getString(12)+",  Restaurante: "+resultSet.getString(13)+",  Bar: "+resultSet.getString(14)+",  Gym: "+resultSet.getString(15)) ;
            	  
              }
              listhoteles.setModel(modelo3);  
	       
	                
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        close();
    }	
//------------------------------------------------------------------------------------------------------------------------		
//rellenar casas
	public void rellenarapartamento(String ubcacion,JList listhoteles,DefaultListModel modelo3) {
        // 
        String tipoDeProcedimiento = "{ call rellenarapartamentos(?) }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
              // Define que el parámetro de salida
              
            //  miSentencia.registerOutParameter(1, java.sql.Types.INTEGER);//interrogacion 1 devuelve
           //   miSentencia.registerOutParameter(2, java.sql.Types.INTEGER);//interrogacion 2 devuelve
           //   miSentencia.registerOutParameter(3, java.sql.Types.VARCHAR);//interrogacion 3 devuelve
             
              // Define que el parámetro de
              miSentencia.setString(1, ubcacion);//interrogacion 4 valriable
             resultSet= miSentencia.executeQuery();
              	    
              while (resultSet.next()) {
            
            	// cama.add(new Cama(miSentencia.getInt(1),miSentencia.getInt(2),miSentencia.getString(3)));-/
            	  modelo3.addElement("Codigo Apartamento:,"+resultSet.getInt(1)+", Nombre Casa: ,"+resultSet.getString(2)+",  Ubicacion: ,"+resultSet.getString(3)+",  HabitacionesDisponibles: "+resultSet.getInt(4)+",  Precio: ,"+resultSet.getDouble(5)+",  MxM: "+resultSet.getDouble(6)+",  Piso: "+resultSet.getInt(7)+",  Wifi: "+resultSet.getString(8)+",  Piscina: "+resultSet.getString(9)+",  Spa:"+resultSet.getString(10)+",  Parquing: "+resultSet.getString(11)+",  Aire Acondicionado: "+resultSet.getString(12)+",  Restaurante: "+resultSet.getString(13)+",  Bar: "+resultSet.getString(14)+",  Gym: "+resultSet.getString(15)) ;
            	  
              }
              listhoteles.setModel(modelo3);  
	       
	                
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        close();
    }	
//------------------------------------------------------------------------------------------------------------------------		
//rellenar casas
	public void buscarhabitacionhotel(int codigo,JList listhabitacion,DefaultListModel modelo2) {
        // 
        String tipoDeProcedimiento = "{ call buscarhabitacioneshotel(?) }";
        conectar();
        try {
              CallableStatement miSentencia = connect.prepareCall(tipoDeProcedimiento);
              // Define que el parámetro de salida
              
            //  miSentencia.registerOutParameter(1, java.sql.Types.INTEGER);//interrogacion 1 devuelve
           //   miSentencia.registerOutParameter(2, java.sql.Types.INTEGER);//interrogacion 2 devuelve
           //   miSentencia.registerOutParameter(3, java.sql.Types.VARCHAR);//interrogacion 3 devuelve
             
              // Define que el parámetro de
              miSentencia.setInt(1, codigo);//interrogacion 4 valriable
             resultSet= miSentencia.executeQuery();
              	    
              while (resultSet.next()) {
            
            	// cama.add(new Cama(miSentencia.getInt(1),miSentencia.getInt(2),miSentencia.getString(3)));-/
            	  modelo2.addElement("Codigo Habitacion:,"+resultSet.getInt(1)+", Codigo Hotel: "+resultSet.getInt(2)+",  Numero de Camas: "+resultSet.getInt(5)+",  MxM: ,"+resultSet.getDouble(7)+",  Precio: ,"+resultSet.getDouble(8)+",") ;
            	  
              }
              listhabitacion.setModel(modelo2);  
	       
	                
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        close();
    }		

//------------------------------------------------------------------------------------------------------------------------		
//close
		public void close() {
		    try {
		        if (resultSet != null) {
		            resultSet.close();
		        }
		
		        if (statement != null) {
		            statement.close();
		        }
		
		        if (connect != null) {
		            connect.close();
		        }
		    } catch (Exception e) {
		
		    }
	}
}