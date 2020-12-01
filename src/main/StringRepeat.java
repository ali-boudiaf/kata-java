package main;

public class StringRepeat {
	public static String repeatStr(final int repeat, final String string) {
		String resultat = "";
		for (int i = 0; i < repeat; i++) {
			resultat += string;
		}
        return resultat;
    }
}
