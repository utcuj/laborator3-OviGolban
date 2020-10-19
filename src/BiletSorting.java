import java.util.Random;

public class BiletSorting {
	private long numere;
	
	
	public long getNumere() {
		return numere;
	}
	
	public BiletSorting(int numere) {
		this.numere = numere;
		puneNumere();
	}
	
	private void puneNumere() {
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
}
