package tena�;

import Herencia.Coche;

public class profesor extends perosna {
	// Atributos
	private String despacho;
	private String horarioTutorias;

	// Constructor
	profesor(String nombre, int edad, Coche c, String despacho, String horarioTutorias) {
		super(nombre, edad, c);
		this.despacho = despacho;
		this.horarioTutorias = horarioTutorias;
	}

	// Getters && Setters
	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public String getHorarioTutorias() {
		return horarioTutorias;
	}

	public void setHorarioTutorias(String horarioTutorias) {
		this.horarioTutorias = horarioTutorias;
	}

	// Metodos
	public String getConsultas() {
		return getNombre() + " tiene tutoria los " + horarioTutorias + " en la sala de " + despacho;
	}
}