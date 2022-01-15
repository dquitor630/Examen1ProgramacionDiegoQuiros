package ejercicio6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio6 {

	public String buscarFor(String str) {
		String cadena = "";
		int count = 0;
		Pattern patternFor = Pattern.compile("\\bfor\\b\\s\\((.*);(.*);(.*)\\)");
		Matcher matcher = patternFor.matcher(str);
		while (matcher.find()) {
			count++;
			cadena = cadena + "For " + count + " Inicialización: " + matcher.group(1) + " Condición: "
					+ matcher.group(2) + " Incremento: " + matcher.group(3) + "\n";
		}
		return cadena;
	}
}
