
public class Principal {

	public static void main(String[] args) {
		
		Coche c1 = new Coche("Ferrari", "Panda", "Verde");
		Coche c2 = new Coche("Fiat", "Fiesta", "Azul");

		Persona persona1 = new Persona("Juan");
		persona1.setEdad(45);
		persona1.setC(c1);
		
		Persona persona2 = new Persona("Antonio");
		persona2.setEdad(25);
		persona2.setC(c2);
		
		Persona persona3 = new Persona("Lusi");
		persona3.setEdad(30);
		
		System.out.println(persona1.getC().getMarca());
		System.out.println(persona1.getC().getModelo());
		System.out.println(persona1.getC().getColor());
		System.out.println("");
		System.out.println(persona2.getC().getMarca());
		System.out.println(persona2.getC().getModelo());
		System.out.println(persona2.getC().getColor());
	}

}