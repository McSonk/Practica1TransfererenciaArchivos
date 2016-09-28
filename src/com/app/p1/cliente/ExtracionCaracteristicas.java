package com.app.p1.cliente;

import java.io.File;

public class ExtracionCaracteristicas {
	private  File file;
	private  String nombre; 
	private  String extension;
	private  Integer tamanio;
	
	public void  setArchivo (File file){
	
		this.file=file;
	}
	public void analizar (){
		//Extrasion de caracteristicas @.@.
		nombre=file.getName();
		if( file.length() < Integer.MAX_VALUE ){			
			tamanio=(int) file.length();
		}
		//extension="123";
		//nombre=
	
		
	}
	
	public   File getFile(){
		return file;
	}

	public String getNombre(){
		
		
		return nombre;
	}
	
	public String getExtension(){
		return extension;
	}
	public Integer getTamanio(){
		return tamanio;
		
	}
}
