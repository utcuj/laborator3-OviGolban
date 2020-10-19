import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class LoterieSorting {

	

		private long numere;
		
		public void extragere() {
			Random r = new Random();
			while (Long.bitCount(numere)<6) {
				int nrextras=r.nextInt(50);
				numere|=(1L<<nrextras);
			}
		}
		
		public String toString() {
			String rez = "Biletul 6 din 49 cu numerele:";
			for(int i = 0; i<50; i++)
				if((numere & (1L <<i)) != 0)
					rez+=(i+1)+" ";
			return rez;
			
		}
	public static void main(String[] args) {
		LoterieSorting infinity = new LoterieSorting();
		infinity.extragere();
		System.out.println("Numerele de la loterie in ordine crescatoare:");
		System.out.println(infinity);
		
		
		int count = 0;
		
}
}



