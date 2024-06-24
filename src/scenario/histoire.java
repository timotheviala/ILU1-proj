package scenario;

import personnages.Client;
import personnages.Magasin;
import personnages.Produit;

public class histoire {

	public static void main(String[] args) {
		Client fstclient=new Client(18,"Tim","VIALA",20);
		Magasin magasin=new Magasin(20);
		Produit produit=new Produit("Bonbon",123,2);
		magasin.ajouterProduit(produit);
		fstclient.achatProd(magasin, produit);
		System.out.println(fstclient.getArgent());
	}

}
