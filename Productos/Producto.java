package Productos;

public class Producto {

	private String nombre;
	protected double precio;

	/**
	 * 
	 * @author : Joaquin Peris Gonzalez
	 * Ejercicio 5 Tema 8 - Herencia
	 * 
	 */
	public Producto() {

	}

	public Producto(String nombre, double precio) {

		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	/**
	 * Creamos le metodo toString para convertir lo metedos ne string
	 */
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}

	/**
	 * 
	 * Creamos un metodo para calcular la cantidad y segun su tipo se especificara en cadad clase
	 */
	public double calcular(int cantidad) {

		double calcular = cantidad * this.precio;

		return calcular;
	}
}
