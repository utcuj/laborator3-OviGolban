import java.util.*;
public class Vowels2 {
	public static void main(String[] args) {
		String enunt, enunt_nou,linie;
		int vowels = 0, consonants = 0;
		char caracter;
		Scanner in = new Scanner(System.in);
		System.out.println("dati un string:");
		enunt = in.nextLine();
		
		enunt_nou = enunt.toLowerCase();
		
		for(int i = 0; i < enunt.length(); i++) {
			char ch = enunt.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			}
			else if(ch >= 'a' && ch <='z') {
				consonants++;
			}
		}
		System.out.println("Vocale: "+ vowels + "\nConsoane: "+ consonants);
		linie = in.nextLine();
		caracter = linie.charAt(0);
		for(int i = 0; i < enunt.length(); i++) {
			char ch = enunt.charAt(i);
			if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') && (caracter == ch))
			{
				System.out.println("Vocala "+ caracter + " se afla la pozitia " + i);
				}
		
	}
  }
}

