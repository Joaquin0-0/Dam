package Herencia;

import java.util.Scanner;

public abstract class Profesor extends MiembroUPV {

	private String despacho;
	private String horarioTutoria;
	private int nomina;

	public Profesor(String nombre, String despacho, int edad, String horarioTutoria, int nomina) {
		super(horarioTutoria, nomina, edad);
		this.despacho = despacho;
		this.horarioTutoria = horarioTutoria;
		this.nomina = nomina;
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

	public int getNomina() {
		return nomina;
	}

	public void setNomina(int nomina) {
		this.nomina = nomina;
	}

	public void setHorarioTutoria(String horarioTutoria) {
		this.horarioTutoria = horarioTutoria;
	}

	public String consultas() {

		String horario = "";

		return horario;
	}

	@Override
	public void menuIntranet() {
		Scanner sc = new Scanner(System.in);

		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			nombre = nombre;
			despacho = despacho;
			horarioTutoria = horarioTutoria;
			break;
		case 2:
			nomina = nomina;
			break;
		case 3:
			System.out.println("Introduzca las actividades a las que se quiere apuntar");
			break;
		case 4:
			System.out.println("HASTA LUEGO! Gracias por utulizar la intranet del profesor");
			break;
		default:
			break;
		}
	}

}
