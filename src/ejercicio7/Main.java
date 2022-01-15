package ejercicio7;

public class Main {

	public static void main(String[] args) {
		new Main().pruebas();
	}

	public void pruebas() {
		Ejercicio7 prueba;
		prueba = new Ejercicio7();
		prueba.buscarFuncion("package ejercicio4;\r\n" + "\r\n" + "public class Profesor {\r\n"
				+ "	private String nombre;\r\n" + "	private String ape1;\r\n" + "	private String ape2;\r\n"
				+ "	private int horas;\r\n" + "	private int numeroProf;\r\n" + "\r\n"
				+ "	public int getNumeroProf() {\r\n" + "		return numeroProf;\r\n" + "	}\r\n" + "\r\n"
				+ "	public void setNumeroProf(int numeroProf) {\r\n" + "		this.numeroProf = numeroProf;\r\n"
				+ "	}\r\n" + "\r\n" + "	public Profesor() {\r\n"
				+ "		this(\"Sin datos\", \"Sin datos\", \"Sin datos\", 0);\r\n" + "	}\r\n" + "\r\n"
				+ "	public Profesor(String nombre, String ape1, String ape2, int horas) {\r\n"
				+ "		if (nombre.matches(\"^[A-Z][a-z\\\\p{Space}]*\")) {\r\n"
				+ "			this.nombre = nombre;\r\n" + "		} else {\r\n"
				+ "			this.nombre = \"No válido\";\r\n" + "		}\r\n" + "\r\n"
				+ "		if (ape1.matches(\"^[A-Z][a-z\\\\p{Space}]*\")) {\r\n" + "			this.ape1 = ape1;\r\n"
				+ "		} else {\r\n" + "			this.ape1 = \"No válido\";\r\n" + "		}\r\n" + "\r\n"
				+ "		if (ape2.matches(\"^[A-Z][a-z\\\\p{Space}]*\")) {\r\n" + "			this.ape2 = ape2;\r\n"
				+ "		} else {\r\n" + "			this.ape2 = \"No válido\";\r\n" + "		}\r\n" + "\r\n"
				+ "		this.horas = horas;\r\n" + "	}\r\n" + "\r\n" + "	public String getNombre() {\r\n"
				+ "		return nombre;\r\n" + "	}\r\n" + "\r\n" + "	public void setNombre(String nombre) {\r\n"
				+ "		this.nombre = nombre;\r\n" + "	}\r\n" + "\r\n" + "	public String getApe1() {\r\n"
				+ "		return ape1;\r\n" + "	}\r\n" + "\r\n" + "	public void setApe1(String ape1) {\r\n"
				+ "		this.ape1 = ape1;\r\n" + "	}\r\n" + "\r\n" + "	public String getApe2() {\r\n"
				+ "		return ape2;\r\n" + "	}\r\n" + "\r\n" + "	public void setApe2(String ape2) {\r\n"
				+ "		this.ape2 = ape2;\r\n" + "	}\r\n" + "\r\n" + "	public int getHoras() {\r\n"
				+ "		return horas;\r\n" + "	}\r\n" + "\r\n" + "	public void setHoras(int horas) {\r\n"
				+ "		this.horas = horas;\r\n" + "	}\r\n" + "\r\n"
				+ "	private void sumarHoras(Profesor profesor2) {\r\n" + "		horas += profesor2.horas;\r\n"
				+ "	}\r\n" + "\r\n" + "	void duplicarHoras() {\r\n" + "		//al no poner nada esto es friendly\r\n"
				+ "		sumarHoras(this);\r\n" + "	}\r\n" + "\r\n" + "	public String numProfe() {\r\n"
				+ "		String cadena = \"Soy el profesor número \" + this.numeroProf;\r\n" + "		return cadena;\r\n"
				+ "	}\r\n" + "\r\n" + "	@Override\r\n" + "	public String toString() {\r\n"
				+ "		return \"Profesor [nombre=\" + nombre + \", ape1=\" + ape1 + \", ape2=\" + ape2 + \", horas=\" + horas;\r\n"
				+ "	}\r\n" + "}", "sumarHoras");
	}
}
