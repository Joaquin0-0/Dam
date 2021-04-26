package Entregables;

/**
 * 
 * @author Joaquin Peris Gonzalez Ejercicio 2 Tema 9 - Interfaces DAM
 *
 */
public class Main {
	public static void main(String[] args) {

		// Creamos un array conn 8
		Publicacion[] Publicaciones = new Publicacion[8];
		// Rellenamos la array con datos para comprobar lo que nos pide el ejrcicio
		Publicaciones[0] = new Revista(11, "1998", true, 2);
		Publicaciones[1] = new Revista(02, "2000", false, 9);
		Publicaciones[2] = new Revista(03, "1000", true, 19);
		Publicaciones[3] = new Revista(02, "1478", false, 4);
		Publicaciones[4] = new libro(05, "2021", true, "Jorge");
		Publicaciones[5] = new libro(07, "2010", false, "Ximo");
		Publicaciones[6] = new libro(01, "2045", true, "Diego");
		Publicaciones[7] = new libro(15, "2099", false, "Ripoll");

		// Recorremos el array
		for (int i = 0; i < Publicaciones.length; i++) {
			System.out.println(Publicaciones[i].toString());

		}
		// Utilizamos los metodos que hemos creado en la clase Publicacion
		Publicaciones[0].devolver();
		Publicaciones[1].devolver();
		Publicaciones[2].prestar();
		Publicaciones[3].prestar();
		Publicaciones[4].devolver();
		Publicaciones[5].devolver();
		Publicaciones[6].prestar();
		Publicaciones[7].prestar();

	}
}