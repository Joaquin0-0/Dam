package Productos;

public class noPerecedero extends Producto {
	private String tipo;

	public noPerecedero() {

	}

	public noPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/*
	 * Aplicamos en metodo de la clase padre a al hija y calculamos lo datos necesarios
	 * */
	public double calcular(int cantidad) {


		return super.calcular(cantidad);
	}
}