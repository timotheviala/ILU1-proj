package personnages;

public class Produit {
	//attribut
	private String nom;
	private int codeBarre;
	private int prix;
		
	//constructeur
	public Produit(String nom, int codeBarre, int prix) {
		this.nom = nom;
		this.codeBarre = codeBarre;
		this.prix = prix;
	}

	//methode

	public String getNom() {
		return nom;
	}

	public int getCodeBarre() {
		return codeBarre;
	}

	public int getPrix() {
		return prix;
	}
		
}
