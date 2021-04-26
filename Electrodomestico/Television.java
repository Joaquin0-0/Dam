package Electrodomestico;
/**
 *
 * @autor: Joaquin Peris Gonzalez
 *  Ejercicio 4 
 *  Tema 8
 *   1 DAM
 * @since 14/04/2021
 * 
 */

/**
 * Creas los constructores con sus atributos. Y sus modificaciones de los
 * atributos iniciales.
 */

public class Television extends electrodomestico {

	private int pulgadas;

	private boolean smartTV;

	public Television() {
		super();
	}

	public Television(int pulgadas, boolean smartTV) {
		super();
		this.pulgadas = 20;
		this.smartTV = false;
	}

	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		this.pulgadas = 20;
		this.smartTV = false;
	}

	public Television(int precioBase, int carga, String color, int peso, String consumoEnergetico) {
		super(precioBase, color, peso, consumoEnergetico);
		this.pulgadas = pulgadas;
		this.smartTV = smartTV;
	}

	/**
	 * Creacion de los Getters and Setters.
	 * 
	 */
	/**
	 * 
	 * @return pulgadas.
	 */
	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	/**
	 * 
	 * @return smartTV.
	 */
	public boolean isSmartTV() {
		return smartTV;
	}

	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}

}
