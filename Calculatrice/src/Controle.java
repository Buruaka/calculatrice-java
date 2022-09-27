
public class Controle {
	
	public Controle() {
	Vue vue = new Vue(this);
	vue.setVisible(true);
	}
	
	public void afficheResult(int resultat){
		Vue.aff_Res(resultat);
	}
	
	public int demandeCalcul(int nombre1,int nombre2,String op)	{

		int resultat = Modele.calcule(nombre1,nombre2,op);
		afficheResult(resultat);
		return resultat;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controle controle = new Controle();
	}


}
