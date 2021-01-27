package main;

public class XOR {
	public static boolean xor1(boolean a, boolean b) {
        
		
		
		// renvoyant true si exactement l'une des deux expressions est évaluée à true, false dans le cas contraire.
		
		// Au moins une des deux expressions doit être à true
		// Si true n'existe pas alors false
		// Si total true > 1 alors false
		
		// Initialiser CompteurTrue = 0
		// Si compteur = 0, alors false
		// Si compteur > 1, alors false
		// Sinon returne true
		
		int compteurTrue = 0;
		
		if (a) {
			compteurTrue++;
		}
		if (b) {
			compteurTrue++;
		}
		if (compteurTrue == 0) {
			return false;
		}
		
		if (compteurTrue > 1) {
			return false;
		}
		
		System.out.println("compteurTrue: " + compteurTrue);
		return true;
    }
	
	public static boolean xor(boolean a, boolean b) {
        
		return a!=b;
        
        // return a^b;
        
        // return !(a==b);
        
        // return a!=b?true:false;
    }
}
