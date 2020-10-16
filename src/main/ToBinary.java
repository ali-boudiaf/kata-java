package main;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ToBinary {
	public static int toBinary(int n) {
		// Stocker le reste dans un tableau lorsque le nombre est par 2 (donc faire
		// modulo 2)
		// Divise le nombre par 2
		// Répéter tant que nombre donnée > 0
		// Inverser le tableau

		// Déclarer un tableau pour recevoir le reste du nombre modulo 2
		int[] resteNombreModulo2 = new int[32];

		int i = 0;
		while (n > 0) {

			// Stocker le reste dans un tableau (modulo 2)
			resteNombreModulo2[i] = n % 2;

			// Diviser le nombre par 2
			n = n / 2;
			i++;
		}

		int resultat = 0;

		// Inverser l'ordre du tableau
		for (int j = i - 1; j >= 0; j--) {
			StringBuilder tableauBinaireEnChaine = new StringBuilder();
			tableauBinaireEnChaine.append(resteNombreModulo2[j]);
			resultat = Integer.parseInt(tableauBinaireEnChaine.toString());
		}
		// System.out.println(resultat);
		return resultat;
	}

	// public static void main(String[] args) {
	// int n = 10;
	// toBinary(n);
	// }
}
