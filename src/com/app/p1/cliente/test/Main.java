package com.app.p1.cliente.test;

import java.io.File;

import com.app.p1.cliente.ExtracionCaracteristicas;

public class Main {
	public static void main( String args[] ){
		ExtracionCaracteristicas extraccion = null;
		extraccion = new ExtracionCaracteristicas();
		File file = new File( "/home/pma/Desktop/hola.txt" );
		extraccion.setArchivo( file );
		extraccion.analizar(  );
		System.out.println( "El nombre del archivo es: " + extraccion.getNombre( ) );
		//System.out.println( "La extension del archivo es: " + extraccion.getExtension( ) );
		System.out.println( "El tamano del archivo es: " + extraccion.getTamanio( ) );
		
		String test = "Holasdafasdf_mundo.txt";
		
		System.out.println( test );
		System.out.println( test.charAt( 11 ) );
		System.out.println( test.indexOf( '.' ) );
		System.out.println( test.length( ) );
		System.out.println( test.charAt( test.length( ) - 1 ) );//??
		
		System.out.println( test.substring( 1, 8 ) );
		System.out.println( test.substring( 0, test.length( ) - 1 ) );//cadena incompleta
		System.out.println( test.substring( 0, test.length( )  ) );//cadena completa
		
		System.out.println( test.substring( test.indexOf( '.' ), test.length( )  ) );
		System.out.println( test.substring( test.indexOf( '.' )+1 , test.length( )  ) );//Extension
		System.out.println(test.substring(0, test.indexOf('.')));//Nombre del archivo
		
	}
}
