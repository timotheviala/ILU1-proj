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
		System.out.println("N° client 1:"+fstclient.getNumClient());
		Client scndClient=new Client(19,"Julie","MAUJOIN",32);
		Produit produit2=new Produit("Chaussettes",1234,3);
		magasin.ajouterProduit(produit2);
		scndClient.achatProd(magasin, produit2);
		System.out.println("N°Client 2:"+scndClient.getNumClient());
	}

}
