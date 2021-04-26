
public class Estudiante extends Persona {

	private int numeroExpediente;
	private String cursosActuaal;
	private double[] notas = new double[7];

	public Estudiante(String nombre, int numeroExpediente, String cursosActuaal) {
		super(nombre);
		this.numeroExpediente = numeroExpediente;
		this.cursosActuaal = cursosActuaal;
		
	}

	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	public String getCursosActuaal() {
		return cursosActuaal;
	}

	public void setCursosActuaal(String cursosActuaal) {
		this.cursosActuaal = cursosActuaal;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double media(double[] notas) {
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			media = notas[i] + media;
		}
		media = media / notas.length;
		return media;
	}
}
