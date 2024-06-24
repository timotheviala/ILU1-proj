package personnages;

import java.util.Iterator;

public class Client extends Humain {
	//attribut
	private int numClient;
	
	//constructeur
	public Client(int age, String nom, String prenom,int argent) {
		super(age, nom, prenom,argent);
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
	
	public void achatProd(Magasin magasin,Produit produit) {
		for (int i=0;i<=magasin.getNbProduit();i++) {
			System.out.println(magasin.getProduits()[i]);
			if(produit==magasin.getProduits()[i]) {
				this.argent=this.argent-magasin.getProduits()[i].getPrix();
				for(int j=i;j<magasin.getNbProduit()-1;i++) {
					magasin.getProduits()[j]=magasin.getProduits()[j+1];
					magasin.ajouterSous(magasin.getProduits()[i].getPrix());
				}
			}	
		}
	}
	
}
