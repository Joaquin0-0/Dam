
public class Persona {
	private String nombre;
	private int edad;
	private  Coche c ;

	public Persona(String nombre) {
		edad = 0;
		this.nombre = nombre;
	}

	public Persona() {

	}

	public void setC(Coche c) {
		this.c = c;
	}

	public Coche getC() {
		return c;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}


