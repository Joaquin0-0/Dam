package tenaç;

import Herencia.Coche;

public class perosna {

	// Atributos
	private String nombre;
	private int edad;
	private Coche c;

	// Gettes
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public void setC(Coche c) {
		this.c = c;
	}

	public Coche getC() {
		return c;
	}

	// Constructors
	public perosna() {

	}

	public perosna(String nombre) {
		this.nombre = nombre;
		this.edad = 0;
		this.c = null;
	}

	public perosna(String nombre, int edad, Coche c) {
		this.nombre = nombre;
		this.edad = edad;
		this.c = c;
	}

}