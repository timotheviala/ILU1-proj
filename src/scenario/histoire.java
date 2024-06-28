package scenario;

import personnages.Client;
import personnages.Magasin;
import personnages.Produit;
import personnages.Salarié;

public class histoire {

	public static void main(String[] args) {
		Client fstclient=new Client(18,"Tim","VIALA",20);
		Magasin magasin=new Magasin(20);
		Produit produit=new Produit("Bonbon",123,2);
		magasin.ajouterProduit(produit);
		Salarié salarie=new Salarié(18, "Juan", "Don", 0);
		fstclient.achatProd(magasin, produit,salarie);
		System.out.println("N° client 1:"+fstclient.getNumClient());
		Client scndClient=new Client(19,"Julie","MAUJOIN",32);
		Produit produit2=new Produit("Chaussettes",1234,3);
		magasin.ajouterProduit(produit2);
		scndClient.achatProd(magasin, produit2,salarie);
		System.out.println("N°Client 2:"+scndClient.getNumClient());
		salarie.paieMois();
		System.out.println(salarie.getArgent());
		salarie.augmentation();
		salarie.paieMois();
		System.out.println(salarie.getArgent());
	}

}
