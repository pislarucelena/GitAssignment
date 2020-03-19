package temaCTS;

public interface DetaliiAngajat {
	
	    default public void vechimeAngajat(int ani){
	       System.out.println("Vechime angajat: " + ani + " ani");
	   }
	    public void functieAngajat(String name, String functie);
}
