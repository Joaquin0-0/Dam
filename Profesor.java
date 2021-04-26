
public class Profesor extends Persona {

	private String despacho;
	private String horarioTutoria;

	public Profesor(String nombre, String despacho, String horarioTutoria) {
		super(nombre);
		this.despacho = despacho;
		this.horarioTutoria = horarioTutoria;
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public String getHorarioTutoria() {
		return horarioTutoria;
	}

	public void setHorarioTutoria(String horarioTutoria) {
		this.horarioTutoria = horarioTutoria;
	}

	public String consultas() {

		String horario = "";

		return horario;
	}

}
