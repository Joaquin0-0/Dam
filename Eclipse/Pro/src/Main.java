
public class Main {

	public static void main(String[] args) {
		Estudiante estu;
		Coche c1 = new Coche("Ferrari", "20", "Rojo");
		estu = new Estudiante("Pepe", 789, "1DAM");

		System.out.print("Los datos del Estudiantes son:");
		estu.setNombre("Juan");
		System.out.print(" Nombre " + estu.getNombre());
		System.out.print(",");
		estu.setEdad(20);
		System.out.print(estu.getEdad());
		c1.setColor("Rojo");
		System.out.print(",");
		System.out.print(" Coche " + c1.getColor());
		c1.setMarca("Renault");
		System.out.print(" ");
		System.out.print(c1.getMarca());
		System.out.print(" ");
		;
		c1.setModelo("Clio");
		System.out.print(c1.getModelo());
		System.out.print(",");
		estu.setNumeroExpediente(12345);
		System.out.print(" Expediente " + estu.getNumeroExpediente());
		System.out.print(",");
		estu.setCursosActuaal("1ºDam");
		System.out.println(" Curso " + estu.getCursosActuaal());

	}

}
