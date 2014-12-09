
/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
public class LargestPrimeFactor {

	public static void main(String[] args) {
		System.out.println("Largest prime : " + largestPrimeFactor(600851475143L));
	}
	
	public static long largestPrimeFactor(long n) {
		long l = n;
		
		while (n % 2 == 0) {
			System.out.println("Factor : " + 2);
			n = n / 2;
			l = 2;
		}
		
		// maximum factor of n is the square root of n
		long maxFactor = (long) Math.sqrt(n);
		
		for (int i = 3; i <= n; i = i + 2) {
			while (n % i == 0) {
				System.out.println("Factor : " + i);
				n = n / i;
				l = i;
				maxFactor = (long) Math.sqrt(n);
			}
			
			if (i > maxFactor) {
				System.out.println("Braking the loop at : " + i + " (factor is " + n + ")");
				l = n;
				break;
			}
		}
		return l;
	}
}

