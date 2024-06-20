package personnages;

public class Client extends Humain {
	//attribut
	private int numClient;
	
	//constructeur
	public Client(int age, String nom, String prenom) {
		super(age, nom, prenom);
	}
	
	//méthode
	public int getNumClient() {
		return numClient;
	}	
	
	public Boolean client() {
		if (numClient>0) {
			return false;
		} else {
			return true;
		}
	}
	
	//achat produit

}
