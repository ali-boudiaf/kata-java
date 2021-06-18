package main;

import java.util.stream.IntStream;

public class Sum {

//	I'm new to coding and now I want to get the sum of two arrays...actually the sum of all their elements. I'll appreciate for your help.
//
//	P.S. Each array includes only integer numbers. Output is a number too.	
//	public static int arrayPlusArray(int[] arr1, int[] arr2) {
//
//		int somme1 = 0;
//		int somme2 = 0;
//		for (int nombre : arr1) {
//			somme1 = nombre + somme1;
//		}
//		for (int nombre : arr2) {
//			somme2 = nombre + somme2;
//		}
//		
//
//		return somme1 + somme2;
//	}
	
	// Best practices
	public static int arrayPlusArray(int[] arr1, int[] arr2) {
	    return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
	  }
	
	
	
	
	
}
