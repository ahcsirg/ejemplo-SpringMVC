package com.example.demo;

public class Persona {
	
	private String nombre;
	private String Apellidos;
	private int edad;
	
	
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		Apellidos = apellidos;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return Apellidos;
	}


	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	

}
