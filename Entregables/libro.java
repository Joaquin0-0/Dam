package Entregables;

/**
 * 
 * @author Joaquin Peris Gonzalez Ejercicio 2 Tema 9 - Interfaces DAM
 *
 */
public class libro extends Publicacion {
	// Atributos
	private String autor;

	// Constructores
	public libro(String autor) {
		super();
		this.autor = autor;
	}

	public libro(int codigo, String añoPublicacion, boolean prestamo, String autor) {
		super(codigo, añoPublicacion, prestamo);
		this.autor = autor;
	}

	// Getters and Setters
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	// Metodos
	/**
	 * De la clase padre llamas a al toString para implementarla en la clase hija.
	 * 
	 */
	@Override
	public String toString() {
		return super.toString() + "";
	}

}
