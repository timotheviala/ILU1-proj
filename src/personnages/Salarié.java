package personnages;

public class Salarié extends Humain {
	//attribut
	private int echelon=0;
	
	//constructeur
	public Salarié(int age, String nom, String prenom,int argent) {
		super(age, nom, prenom,argent);
		// TODO Auto-generated constructor stub
	}
	
	//methode
	public int creationCompteFid(Magasin magasin) {
		return magasin.nouvClients();
	}

	public int getEchelon() {
		return echelon;
	}

	public void augmentation() {
		if (echelon<3) {
			echelon+=1;
		}
	}
	
	public void paieMois() {
		switch (echelon) {
		case 0: {
			
			argent+=1399;
		}
		case 1:{
			argent+=1500;
		}
		case 2:{
			argent+=2000;
		}
		default:
			System.out.println("Erreur");;
		}
	
	}
}
