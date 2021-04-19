package Productos;

public class Perecedero extends Producto {

	private int diasAcaducar;

	public Perecedero() {

	}

	public Perecedero(String nombre, double precio, int diasAcaducar) {
		super(nombre, precio);
		this.diasAcaducar = diasAcaducar;
	}

	public int getDiasAcaducar() {
		return diasAcaducar;
	}

	public void setDiasAcaducar(int diasAcaducar) {
		this.diasAcaducar = diasAcaducar;
	}

	
	/*
	 * Aplicamos en metodo de la clase padre a al hija y calculamos lo datos necesarios
	 * */
	@Override
	public double calcular(int cantidad) {

		double precio =super.calcular(cantidad);

		if (diasAcaducar == 1) {
			precio = super.calcular(cantidad) / 4;

		} else {

		}
		if (diasAcaducar == 2) {
			precio = super.calcular(cantidad) / 3;

		} else {

		}
		if (diasAcaducar == 3) {
			precio = super.calcular(cantidad) / 2;

		} else {

		}
		return precio;
	}
}
