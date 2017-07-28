import java.util.ArrayList;

/**
 * Created by karodes on 7/17/2017.
 */
public class PrimeGeneratorOptimize {
    public static ArrayList<Integer> generatePrime(int n) {
        ArrayList<Integer> arrayListInt = new ArrayList<>(1000);
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i < n; i++)
            prime[i] = true;

        for (int p = 2; p <= n / 2; p++) {
            if (prime[p] == true) {
                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                arrayListInt.add(i);
        }
        return arrayListInt;
    }
}
