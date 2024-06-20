package personnages;

public class Magasin {
	//attribut
	private int nombreClient=0;

	//constructeur
	public Magasin() {
		
	}	
	
	//methode
	public int nouvClients() {
		nombreClient+=1;
		return nombreClient-1;
	}

}
