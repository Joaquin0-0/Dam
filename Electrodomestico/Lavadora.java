package Electrodomestico;

/**
 *
 * @autor: Joaquin Peris Gonzalez
 *  Ejercicio 4 
 *  Tema 8
 *   1 DAM
 * @since 14/04/2021
 */

/**
 * Creas los constructores con sus atributos. Y sus modificaciones de los
 * atributos iniciales.
 */

public class Lavadora extends electrodomestico {

	private int carga = 5;

	public Lavadora() {
		this.carga = 5;
	}

	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.carga = carga;
	}

	public Lavadora(int precioBase, int carga, String color, int peso, String consumoEnergetico) {
		super(precioBase, color, peso, consumoEnergetico);
		this.carga = carga;
	}

	/**
	 * 
	 * La construccion de los Getters and Setters.
	 * 
	 */
	
	/**
	 * 
	 * @return carga.
	 */
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	/**
	 * Cogemos el preciofinal de la clase padre y la pasamos a la hija y averiguamos
	 * que si la carga supera x se suma.
	 * 
	 * @see precioFinal
	 * 
	 * @return este metodo nos devuelve el precio que tiene de sobrecoste la
	 *         lavadora si supera cierta cantidad de peso.
	 * 
	 */

	@Override
	public double precioFinal() {
		double devolver = super.precioFinal();

		if (carga > 30) {
			devolver = devolver + 50;
		}

		return devolver;
		/**
		 * 
		 *Este metodo nos devuelve el precio que tiene de sobrecoste la  lavadora si supera cierta cantidad de peso.
		 * @return devolver
		 */
				        
	}
}
