package com.backend.util;



public class PropiedadesConexionBD {

	public static String DRIVER_BD = "com.mysql.jdbc.Driver";;
	public static String CADENA_BD = "jdbc:mysql://localhost:3306/bodega";
	public static String USER_BD = "root";
	public static String PASSWORD_BD = "mysql";
	private final String SEP_ARCHIVOS = System.getProperty("file.separator");
	private final String RUTA_PROPERTIES = System.getProperty("user.home")+SEP_ARCHIVOS+"sio"+SEP_ARCHIVOS+"conexion.properties";

	public PropiedadesConexionBD(){ 
		
	}

	public void inicializarPropiedades(){
	    try {           
	        /*Properties propiedades = new Properties();            
	        propiedades.load(new FileInputStream(RUTA_PROPERTIES));
	        
	        DRIVER_BD = propiedades.getProperty("conexion.driver");
	        CADENA_BD = propiedades.getProperty("conexion.cadena");
	        USER_BD = propiedades.getProperty("conexion.user");
	        PASSWORD_BD = propiedades.getProperty("conexion.password");  */
	    	DRIVER_BD = "com.mysql.jdbc.Driver";
	    	CADENA_BD = "jdbc:mysql://localhost:3306/bodega";
	    	USER_BD = "root";
	    	PASSWORD_BD = "mysql";
	        
	    } catch (Exception e) {
	        e.printStackTrace();            
	    }
	}
	
}