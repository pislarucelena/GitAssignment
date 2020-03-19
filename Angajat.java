package temaCTS;

public class Angajat implements DetaliiAngajat {

	private String nume;
	private int vechime;
	private String functie;
	
	public Angajat() {
		super();
		this.nume = nume;
		this.vechime = vechime;
		this.functie = functie;
	}

	@Override
	public void functieAngajat(String name, String functie) {
		System.out.println("Nume angajat: " + name + "\n"+ "Functie: " + functie);
	}
	
}
