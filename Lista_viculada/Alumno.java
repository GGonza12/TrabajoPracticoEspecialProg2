package Lista_viculada;

import java.util.ArrayList;

public class Alumno {
	private String nombre,apellido;
	private int dni;
	private int edad;
	private ArrayList<String> intereses;
	public Alumno(String nombre, String apellido, int dni, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.intereses = new ArrayList<String>();
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getDni() {
		return dni;
	}
	public int getEdad() {
		return edad;
	}
	public ArrayList<String> getIntereses() {
		return new ArrayList<>(intereses);
	}
	public void addInteres(String i) {
		intereses.add(i);
	}
	
	
}
