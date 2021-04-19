package Productos;

public class Main {

	public static void main(String[] args) {
		Producto[] Productos = new Producto[10];
		Productos[0] = new Perecedero("Limon", 2, 3);
		Productos[1] = new Perecedero("Fresa", 2.8, 4);
		Productos[2] = new Perecedero("Manzana", 1, 3);
		Productos[3] = new Perecedero("Pomelo", 10.2, 4);
		Productos[4] = new Perecedero("Cerezas", 7, 2);
		Productos[5] = new noPerecedero("Kiwi", 25.99, "Perecedero");
		Productos[6] = new noPerecedero("Piña", 4, "Perecerero");
		Productos[7] = new noPerecedero("Pera", 9.05, "No perecedero");
		Productos[8] = new noPerecedero("Papaya", 55.25, "Perecerero");
		Productos[9] = new noPerecedero("Aguacate", 0.5, "Perecerero");

		for (int i = 0; i < Productos.length; i++) {
			System.out.println(Productos[i].toString());
			System.out.println(Productos[i].calcular(5));
			
		}

		
	}
}
