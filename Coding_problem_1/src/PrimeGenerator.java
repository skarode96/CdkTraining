import java.util.ArrayList;
import java.util.List;

/**
 * Created by karodes on 7/17/2017.
 */
public class PrimeGenerator {

    public static List<Integer> generatePrime(int upperBound) {
        ArrayList<Integer> primeList = new ArrayList<Integer>(1000);
        boolean flag = false;

        for(int n=2; n<upperBound; n++)
        {
            flag = true;
            for(int i=2; i<=n/2; i++)
                if( n % i == 0)
                {
                    flag = false;
                    break;
                }
            if(flag)
                primeList.add(n);
        }
        return primeList;
    }

}