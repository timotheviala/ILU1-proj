package personnages;

public class Humain {
	//attribut
	protected int age;
	protected String nom;
	protected String prenom;	
	protected int argent;
	
	//constructeur
	public Humain(int age, String nom, String prenom) {
		super();
		this.age = age;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	//methode

	public int getAge() {
		return age;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	
	private void direBonjour() {
		System.out.println("Bonjour!");
	}
	

		
}
