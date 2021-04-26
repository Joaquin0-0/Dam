package Entregables;

/**
 * 
 * @author Joaquin Peris Gonzalez Ejercicio 2 Tema 9 - Interfaces DAM
 *
 */
public class Revista extends Publicacion {
	// Atributos
	private int numero;

	// Constructores
	public Revista(int numero) {
		super();
		this.numero = numero;
	}

	public Revista(int codigo, String añoPublicacion, boolean prestamo, int numero) {
		super(codigo, añoPublicacion, prestamo);
		this.numero = numero;
	}

	// Getters and Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * De la clase padre llamas a al toString para implementarla en la clase hija.
	 * 
	 */
	@Override
	public String toString() {
		return super.toString() + "numero " + numero;
	}

}
