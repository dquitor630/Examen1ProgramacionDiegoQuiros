package ejercicio3;

public class Ejercicio3 {

	public String ejercicio3(String str1, String str2) {
		int veces = 0;
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		int tamañoCadena1 = str1.length();
		int tamañoCadena2 = str2.length();
		for (int i = 0; i <= tamañoCadena1 - 1; i++) {
			if (str1.charAt(i) == str2.charAt(0)) {
				boolean coincide = true;
				for (int ch = 0; ch <= tamañoCadena2 - 1; ch++) {
					if (str1.charAt(i + ch) == str2.charAt(ch)) {

					} else {
						coincide = false;
					}

				}
				if (coincide == true) {
					veces += 1;
				}
			}
		}
		return "La cadena dos ha aparecido: " + veces + " veces";

	}
}
