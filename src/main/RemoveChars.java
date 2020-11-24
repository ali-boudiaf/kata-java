package main;

import java.util.Arrays;

public class RemoveChars {
	public static String remove(String str) {

		/*
		 * if (str.length() > 2) {
		 * 
		 * // Définission de la range du tableau final, début et fin int startIndex = 1;
		 * int endIndex = str.length() - 1;
		 * 
		 * // Création d'un tableau de la longueur de la chaîne char[] tableauDeChar =
		 * new char[str.length()];
		 * 
		 * // Copie lettre par lettre dans le tableau // On parcourt la chaîne for (int
		 * i = 0; i < str.length(); i++) { tableauDeChar[i] = str.charAt(i); }
		 * 
		 * // On créé une nouvelle version du tableau sans le premier et dernier élément
		 * tableauDeChar = Arrays.copyOfRange(tableauDeChar, startIndex, endIndex);
		 * 
		 * // Chaîne de caractère depuis nouveau tableau str =
		 * String.valueOf(tableauDeChar);
		 * 
		 * return str;
		 * 
		 * } else { return str; }
		 */
		
		
		// AUTRE SOLUTION ATTENTION LA VIOLENCE
		return str.substring(1, str.length() - 1);
	}
}