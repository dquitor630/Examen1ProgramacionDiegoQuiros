package ejercicio5;

public class Ejercicio5 {

	public static String cadenasAlReves(String str, int tamaño) {
		/* iterativo public static void inversordecadenas(String a) {
			int numcharacters = a.length();
			numcharacters = numcharacters - 1;
			for (int i = numcharacters; i >= 0; i--) {
				System.out.print(a.charAt(i));
			}
		*/

		if (tamaño == -1) {
			tamaño = str.length();
			tamaño -= 1;
		}
		String devolver = "";
		if (tamaño == 0) {
			devolver = devolver + Character.toString(str.charAt(tamaño));
		} else {
			devolver = cadenasAlReves(str, tamaño - 1) + devolver;
			devolver = Character.toString(str.charAt(tamaño)) + devolver;
		}
		return devolver;

	}
}
