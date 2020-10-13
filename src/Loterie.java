import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Loterie {

	
		private int[] numereCastigatoare =  new int[6];
		private int[] extragere() {
			
			Random rand = new Random();
			
			for(int i=0;i<6;i++) {
				numereCastigatoare[i] = rand.nextInt(50);
			}
			return numereCastigatoare;
			
		}
	public static void main(String[] args) {
		Loterie infinity = new Loterie();
	
		int numereCastigatoare[] = infinity.extragere();
		
		int count = 0;
		
		//Tema:Implementare cu citire de la tastatura 
		Scanner in = new Scanner(System.in);
		int[] numereAlese = new int[6];
		System.out.println("Introduceti nr alese:\n");
		for(int i = 0; i < 6; i++)
		{
			numereAlese[i] = in.nextInt();
		}
		//int[] numereAlese = {5,17,25,30,15,21}; 
		Bilet biletulMeu = new Bilet(numereAlese);
		
		int[] numereDePeBilet = biletulMeu.getNumere();
		for(int i = 0; i<6;i++) {
			
			for(int j=0 ;j<6; j++) {
				if(numereDePeBilet[j] == numereCastigatoare[i])
					count++;
			}
			
		}
		if(count == 6)
			System.out.println("Am castigat!");
			else
				System.out.println("Am pierdut!");
	}
}



