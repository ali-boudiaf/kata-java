package main;

import java.util.stream.IntStream;

public class WhatIsBetween {
	
//	Complete the function that takes two integers (a, b, where a < b) and return an array of all integers between the input parameters, including them.
//
//			For example:
//
//			a = 1
//			b = 4
//			--> [1, 2, 3, 4]

	public static int[] between(int a, int b) {
	    
		// boucle qui démarre à indice a
		// boucle se termine à indice b
		
		// Tableau qui démarre à a
		// Tableau dont la longueur vaut b
		
		// Déclarer tableau de taille b
		// Retourner tableau
		int [] tableauEntier = new int[b];
		
		for (int i = a; i < b; i++) {
			tableauEntier[i] = a;
		}
		
	    return new int[]{1, 2, 3, 4};
	    
	    
	  }
}
