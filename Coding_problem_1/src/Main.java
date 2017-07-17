/**
 * Created by karodes on 7/17/2017.
 */
public class Main {
    public static void main(String[] args) {
        int upperBound = 20;
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
                System.out.println("Prime number : " + n);
        }
    }
}