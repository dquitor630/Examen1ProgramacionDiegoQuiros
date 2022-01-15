package ejercicio4;

public class Profesor {
	private String nombre;
	private String ape1;
	private String ape2;
	private int horas;
	private int numeroProf;

	public int getNumeroProf() {
		return numeroProf;
	}

	public void setNumeroProf(int numeroProf) {
		this.numeroProf = numeroProf;
	}

	public Profesor() {
		this("Sin datos", "Sin datos", "Sin datos", 0);
	}

	public Profesor(String nombre, String ape1, String ape2, int horas) {
		if (nombre.matches("^[A-Z][a-z\\p{Space}]*")) {
			this.nombre = nombre;
		} else {
			this.nombre = "No válido";
		}

		if (ape1.matches("^[A-Z][a-z\\p{Space}]*")) {
			this.ape1 = ape1;
		} else {
			this.ape1 = "No válido";
		}

		if (ape2.matches("^[A-Z][a-z\\p{Space}]*")) {
			this.ape2 = ape2;
		} else {
			this.ape2 = "No válido";
		}

		this.horas = horas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe1() {
		return ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public String getApe2() {
		return ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	private void sumarHoras(Profesor profesor2) {
		horas += profesor2.horas;
	}

	void duplicarHoras() {
		//al no poner nada esto es friendly
		sumarHoras(this);
	}

	public String numProfe() {
		String cadena = "Soy el profesor número " + this.numeroProf;
		return cadena;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", ape1=" + ape1 + ", ape2=" + ape2 + ", horas=" + horas;
	}
}
