import java.math.BigDecimal;

public class Probability {
	static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		else {
			return(n * factorial(n - 1));
		}
		
	}
	static int combinari(int n, int k) {
		if(k == 0) {
			return 1;
		}
		else if(k > n) {
			return 0;
		}
		else return combinari(n-1, k) + combinari(n-1, k-1);
	}

	public static void main(String[] args) {
		int n = 49, k = 6, comb;
		
		
		//per = factorial(n) / factorial(n-k);
		comb = combinari(n,k);
		System.out.println("Combinari:" + comb);
		BigDecimal bd1 = new BigDecimal("1.00");
		BigDecimal bd2 = new BigDecimal("13983816.00");
		 bd1 = bd1.divide(bd2); 
		    System.out.println("Probabilitatea de a castiga la loto = " + bd1); 

		//system.out.println("Probabilitatea de a castiga la loto:" + quotient);
	}

}
