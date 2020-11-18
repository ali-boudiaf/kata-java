package main;

public class EvenOrOdd {
	
	public static String even_or_odd(int number) {
        System.out.println("entrée : " + number);
        // Soit nombre modulo 2 = 0
        // Alors "Even"
        // Soit nombre modulo 2 = 1
        // Alors "Odd"
       
       return number%2 != 0 ? "Odd" : "Even";
   	}     
}
