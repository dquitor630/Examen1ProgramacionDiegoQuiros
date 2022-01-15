package ejercicio6;

public class Main {

	public static void main(String[] args) {
		new Main().pruebas();
	}

	public void pruebas() {
		Ejercicio6 prueba;
		prueba = new Ejercicio6();
		System.out.println(prueba.buscarFor(
				"public static void piramide(int x) {\r\n" + "		int almacen = -1;\r\n" + "		if (x < 0) {\r\n"
						+ "			throw new IllegalArgumentException(\"Has introducido un caracter no v�lido\");\r\n"
						+ "		}\r\n" + "\r\n" + "		for (int filas = 1; filas <= x; filas++) {\r\n" + "\r\n"
						+ "			for (int espacio = 1; espacio <= (x * 2 - 1 - filas); espacio++) {\r\n"
						+ "				System.out.print(\"    \");\r\n" + "\r\n" + "			}\r\n" + "\r\n"
						+ "			for (int caracter = 1; caracter <= filas * 2 - 1; caracter++) {\r\n" + "\r\n"
						+ "				if (caracter > filas) {\r\n" + "					almacen--;\r\n"
						+ "				} else {\r\n" + "					almacen = caracter;\r\n"
						+ "				}\r\n" + "				System.out.print(almacen);\r\n" + "\r\n"
						+ "				System.out.print(\"   \");\r\n" + "			}\r\n" + "\r\n"
						+ "			System.out.println();\r\n" + "		}\r\n" + ""));
	}
}
