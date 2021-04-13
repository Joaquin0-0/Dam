package Electrodomestico;

public class electrodomestico {

	private int precioBase;
	private String color;
	private int peso;
	private String consumoEnergetico;

	/*
	 * 
	 * 
	 */
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

		this.precioBase = 100;
		this.peso = 5;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;

	}

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

	public char ComprobarEnergetico(char letra) {

		if (letra >= 'A' && letra <= 'F') {
			return letra;
		}
		return 'F';
	}

	public void comprobrarColor(String color) {

		if (color != "blanco" && color != "negro" && color != "rojo" && color != "azul" && color != "gris") {
			this.color = color;
		}

	}

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
