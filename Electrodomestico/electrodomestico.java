package Electrodomestico;

/**
 *
 * @autor: Joaquin Peris Gonzalez 
 * Ejercicio 4
 *  Tema 8 
 *  1 DAM
 * @since 14/04/2021
 */

/**
 * Creas los constructores con sus atributos.
 */

public class electrodomestico {

	private int precioBase;
	private String color;
	private int peso;
	private String consumoEnergetico = "F";

	public electrodomestico() {
		precioBase = 100;
		peso = 5;
		color = "blanco";
		consumoEnergetico = "F";
	}

	public electrodomestico(int precioBase, String color, int peso, String consumoEnergetico) {

		this.precioBase = precioBase;
		this.color = color;
		this.peso = peso;
		this.consumoEnergetico = consumoEnergetico;
	}

	public electrodomestico(int precioBase, int peso) {

		this.precioBase = precioBase;
		this.peso = peso;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;

	}

	/**
	 * 
	 * La construccion de los Getters and Setters.
	 * 
	 */
	/**
	 * 
	 * @return precioBase
	 */
	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(String consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	/**
	 * 
	 * @param letra Comprueba la letra que le indicas y comprueba que esta en el
	 *              rango que le indicas.
	 * 
	 *
	 * @return letra Te devulve la letra para seguir con las siguientes
	 *         comprobaciones.
	 */
	public char ComprobarEnergetico(char letra) {

		if (letra >= 'A' && letra <= 'F') {
			return letra;
		}
		return 'F';
	}

	/**
	 * 
	 * @param color Comprueba de que color es el electrodomestico dentro de los
	 *              parametros establecidos.
	 * 
	 */

	public void comprobrarColor(String color) {

		if (color != "blanco" && color != "negro" && color != "rojo" && color != "azul" && color != "gris") {
			this.color = color;
		}

	}

	/**
	 * Segun la letra que sea la lavadora te devuleve un precio con sus tarifas.
	 * 
	 *  Te devuleve el precio final del consumo energetico con sus tarifas
	 *         aplicadas.
	 * 
	 * 
	 * 
	 *@return
	 * LETRA
	 *         <ul>
	 *         <li>-- Letra A ,sumas 100 euros --</li>
	 *         <li>-- Letra B ,sumas 80 euros --</li>
	 *         <li>-- Letra C ,sumas 60 euros --</li>
	 *         <li>-- Letra D ,sumas 50 euros --</li>
	 *         <li>-- Letra E ,sumas 30 euros --</li>
	 *         <li>-- Letra F ,sumas 10 euros --</li>
	 *         </ul>
	 * 
	 * 
	 * PESO
	 *         <ul>
	 *         <li>-- 0-19 peso ,sumas 10 euros --</li>
	 *         <li>-- 20-49 peso ,sumas 50 euros --</li>
	 *         <li>-- 50-79 peso ,sumas 80 euros --</li>
	 *         <li>-- 80 peso ,sumas 100 euros --</li>
	 *         </ul>
	 */

	public double precioFinal() {

		switch (consumoEnergetico) {
		case "A":
			precioBase = precioBase + 100;
			break;
		case "B":
			precioBase = precioBase + 80;
			break;
		case "C":
			precioBase = precioBase + 60;
			break;
		case "D":
			precioBase = precioBase + 50;
			break;
		case "E":
			precioBase = precioBase + 30;
			break;
		case "F":
			precioBase = precioBase + 10;
			break;

		}

		/**
		 * @param Segun el peso que sea la lavadora te devuleve un precio con sus
		 *              tarifas.
		 * 
		 * @return precioBase Te devuleve el precio final del peso con sus tarifas
		 *         aplicadas.
		 *
		 */

		if (peso >= 0 && peso < 19) {
			precioBase += 10;
		} else if (peso >= 20 && peso < 49) {
			precioBase += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioBase += 80;
		} else if (peso >= 80) {
			precioBase += 100;
		}
		return precioBase;

	}

}
