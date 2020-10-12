package main;

import java.util.Arrays;

/*
 * https://www.codewars.com/kata/545afd0761aa4c3055001386/train/java
 * 
 * Create a method take that accepts a list/array and a number n,
 * and returns a list/array array of the first n elements from the list/array.
 */

// Creer et une variable tableau appelé "resultat"
// Vérifier que le tableau en entrée n'est pas vide
// Boucler sur le tableau en entrée avec pour iterateur "n"
// Chaque itération ajouter la valeur courante dans le tableau "resultat"
// Retourner le tableau "resultat"
// 
// Ou
//
// Utiliser la fonction copyOfRange qui prend 3 paramètres :
// Le tableau sur lequel travailler
// L'indice de départ de la plage
// L'indice de fin

// https://docs.oracle.com/javase/6/docs/api/java/util/Arrays.html#copyOfRange(int%5B%5D,%20int,%20int)

public class ZywOo {
	public static int[] take(int[] arr, int n) {
		if (arr.length == 0) {
			int[] resultat = null;
			return resultat;
		}
		int[] resultat = Arrays.copyOfRange(arr, 0, n);
		return resultat; // your code;
	}
}
