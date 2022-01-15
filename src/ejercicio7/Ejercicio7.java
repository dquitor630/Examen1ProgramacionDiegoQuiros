package ejercicio7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio7 {
	public void buscarFuncion(String str, String fun) {
		int count = 0;
		Pattern patternFun = Pattern.compile("(public|private)\\s(static)?(.*)\\s" + fun + "\\((.*)\\)");
		Matcher matcher = patternFun.matcher(str);

		while (matcher.find()) {
			System.out.println("función: " + fun);
			System.out.println(matcher.group(1));
			if (matcher.group(2) == "null") {
				System.out.println("es estática");
			} else {
				System.out.println("es dinámica");
			}
			String devuelve = "";
			devuelve = matcher.group(3);
			if (devuelve.equals("void")) {
				System.out.println("no devuelve nada, es un void");
			} else {
				System.out.println("devuelve un: " + matcher.group(3));
			}
			System.out.println("parametros: " + matcher.group(4));
		}
	}
}
