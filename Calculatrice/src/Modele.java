
public class Modele {
	
	
	public Modele() {
		

	}
	
	public static int calcule(int nb1,int nb2,String op) {
		int res = 0;
		if (op == "+"){
			res = nb1+nb2;
		}
		if (op == "-"){
			res = nb2-nb1;	
		}
		if (op == "*"){
			res = nb1*nb2;	
		}
		return res;
	}
}
