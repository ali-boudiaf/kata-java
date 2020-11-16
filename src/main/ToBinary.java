package main;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ToBinary {
	public static int toBinary(int n) {
		// Stocker le reste dans un tableau lorsque le nombre est divisible par 2 (donc faire
		// modulo 2)
		// Divise le nombre par 2
		// R�p�ter tant que nombre donn�e > 0
		// Inverser le tableau

		// D�clarer un tableau pour recevoir le reste du nombre modulo 2
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
		StringBuilder tableauBinaireEnChaine = new StringBuilder();

		// Inverser l'ordre du tableau
		for (int j = i - 1; j >= 0; j--) {
			tableauBinaireEnChaine.append(resteNombreModulo2[j]);
			resultat = Integer.parseInt(tableauBinaireEnChaine.toString());
		}
		return resultat;
	}
}
