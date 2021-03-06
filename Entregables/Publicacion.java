package Entregables;

/**
 * 
 * @author Joaquin Peris Gonzalez Ejercicio 2 Tema 9 - Interfaces DAM
 *
 */
public class Publicacion implements publicaciones {

	// Atributos
	private int codigo;
	private String aņoPublicacion;
	private boolean prestamo;

	public Publicacion(int codigo, String aņoPublicacion) {
		this.codigo = codigo;
		this.aņoPublicacion = aņoPublicacion;
		prestamo = false;
	}

	// Constructores
	public Publicacion() {
		prestamo = false;
	}

	public Publicacion(int codigo, String aņoPublicacion, boolean prestamo) {

		this.codigo = codigo;
		this.aņoPublicacion = aņoPublicacion;
		this.prestamo = prestamo;
	}

	// Getters and Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getAņoPublicacion() {
		return aņoPublicacion;
	}

	public void setAņoPublicacion(String aņoPublicacion) {
		this.aņoPublicacion = aņoPublicacion;
	}

	public boolean isPrestamo() {
		return prestamo;
	}

	public void setPrestamo(boolean prestamo) {
		this.prestamo = prestamo;
	}

	// Metodos
	/**
	 * Creamos un toString para hacer una cadena de texto.
	 */
	public String toString() {
		return "Publicacion : codigo = " + codigo + ", aņoPublicacion = " + aņoPublicacion + ", prestamo = " + prestamo
				+ " " + " ";
	}

	/**
	 * Creamos el metodo prestar para comprobar si el libro esta prestado o no y que
	 * te lo diga con un syso.
	 * 
	 */
	@Override
	public void prestar() {
		if (prestamo) {
			System.out.println("El libro no esta disponible");
		} else {
			System.out.println("El libro esta disponible");
		}
	}

	/**
	 * Creamos el metodo devolver para comprobar si el libro ha sido devuelto o no y
	 * que te lo diga con un syso.
	 * 
	 */
	@Override
	public void devolver() {
		if (prestamo) {
			System.out.println("Esta en el almacen");
		} else {
			System.out.println("El libro ha sido prestado");
		}
	}

	/**
	 * Creamos el metodo prestado para comprobar si el libro esat prestado.
	 * 
	 */
	@Override
	public boolean prestado() {
		boolean resultado = false;
		if (prestamo) {
			resultado = true;

		}
		return false;
	}

}
