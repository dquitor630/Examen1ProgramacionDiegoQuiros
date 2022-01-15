package ejercicio4;

public class Main {

	public static void main(String[] args) {
		new Main().pruebas();
	}

	public void pruebas() {
		Profesor prof1;
		prof1 = new Profesor("Juan antonio", "Quiros", "De La torre", 1);
		prof1.setNumeroProf(1);
		System.out.println(prof1.toString());
		System.out.println(prof1.numProfe());
		Profesor prof2 = new Profesor();
		prof1.setNumeroProf(2);
		System.out.println(prof2.numProfe());

	}
}
