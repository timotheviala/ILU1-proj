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
		switch (0) {
		case 0: {
			this.argent+=1399;
			break;
		}
		case 1:{
			this.argent+=1500;
			break;
		}
		case 2:{
			this.argent+=2000;
			break;
		}
		default:
			System.out.println("Erreur echelon");;
		}
	}
}
