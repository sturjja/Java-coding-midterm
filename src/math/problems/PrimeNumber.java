package math.problems;
import java.util.Arrays;
public class PrimeNumber {
	/*
	 * Find list of Prime numbers from number 2 to 1 million.
	 * Try the best solution as possible.Which will take less CPU life cycle.
	 * Out put number of Prime numbers on the given range.
	 *
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 */
	public static void main(String[] args) {
		int n = 1000000;
		boolean[] prime = new boolean[n+1];
		Arrays.fill(prime, true);

		for (int i = 2; i*i <= n; i++) {
			if (prime[i]) {
				for (int j = i*i; j <= n; j += i) {
					prime[j] = false;
				}
			}
		}

		for (int i = 2; i <= n; i++) {
			if (prime[i]) {
				System.out.println(i);
			}
		}
	}
}

