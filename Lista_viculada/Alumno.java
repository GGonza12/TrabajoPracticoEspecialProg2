package Lista_viculada;

import java.util.ArrayList;

public class Alumno extends ElementoUniversidad{
	private String apellido;
	private int dni;
	private int edad;
	private ArrayList<String> intereses;
	public Alumno(String nombre, String apellido, int dni, int edad) {
		super(nombre);
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.intereses = new ArrayList<String>();
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
	@Override
	public String toString() {
		return "Alumno [nombre=" + super.getNombre() + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad
				+ ", intereses=" + intereses + "]";
	}
	@Override
	public int getCantidadAlumnos() {
		return 1;
	}
	
	
}
