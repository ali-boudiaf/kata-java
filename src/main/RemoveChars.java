package main;

import java.util.Arrays;

public class RemoveChars {
	public static String remove(String str) {
		
		/*
		 * Si str > 2
		 * Alors 
		 * 	transforme la chaîne en tableau
		 * 	supprime premier élément du tableau
		 * 	supprime dernier élément du tableau
		 * 	convertir tableau en chaine
		 * 	revoyer la chaine str
		 * Sinon
		 * 	renvoyer str
		 */
		if (str.length() > 2) {
			// Transforme la chaîne en tableau
			
			
			// Création d'un tableau de la longueur de la chaîne
			char[] tableauDeChar = new char[str.length()];
			
			// Copie lettre par lettre dans le tableau
			// On parcourt la chaîne
//			for (int i = 0; i < str.length(); i++) {
//				tableauDeChar[i] = str.charAt(i);
//			}
			
			for (int i = 1; i < str.length() -1; i++) {
				tableauDeChar[i] = str.charAt(i);
			}
			
			for (char el : tableauDeChar) {
				System.out.println(el);
			}
			
			// Convertir tableau en chaîne de charactère
			str = Arrays.toString(tableauDeChar)
					.replace("[", "")
					.replace(",", "")
					.replace("]", "");
			
			str = String.join(" ", str);
			
			System.out.println(str);
			
		} else {

		}
		return str;
    }
}
