package personnages;

public class Magasin {
	//attribut
	private int nombreClient=0;
	private int nbProduit=0;
	protected Produit[] produits=new Produit[200];
	private int solde;
	
	//constructeur
	public Magasin(int solde) {
		this.solde=solde;
	}	
	
	//methode
	public int nouvClients() {
		nombreClient+=1;
		return (nombreClient);
	}
	
	public void ajouterProduit(Produit prodAAjouter) {
		if(nbProduit<200) {
			produits[nbProduit]=prodAAjouter;
		}else {
			System.out.println("Stock Plein");
		}
	}
	
	public void ajouterSous(int prix) {
		this.solde+=prix;
	}

	public int getNombreClient() {
		return nombreClient;
	}

	public int getNbProduit() {
		return nbProduit;
	}

	public Produit[] getProduits() {
		return produits;
	}

	public int getSolde() {
		return solde;
	}
}
