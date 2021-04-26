package Herencia;

public abstract class MiembroUPV extends Persona {
	int carnet;

	public MiembroUPV(String nombre,int edad, int carnet) {
		super(nombre);
		this.carnet = carnet;
	}

	public int getCarnet() {
		return carnet;
	}

	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}
	
	public abstract void menuIntranet();
}
