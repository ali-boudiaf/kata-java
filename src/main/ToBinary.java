package main;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ToBinary {
	public static int toBinary(int n) {
		// Diviser le nombre par 2 (n modulo 2)
		// Stocker le reste de la division dans un tableau
		// Répéter jusqu'à 0 ou > 0
		// Inverser le tableau

		ArrayList<Integer> tableauBinaire = new ArrayList<Integer>();

		for (int i = 0; i > 0; i++) {
			Integer binaire = n % 2;
			tableauBinaire.add(binaire);
			System.out.println(tableauBinaire);
		}

		return n;
	}
}
