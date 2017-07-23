/**
 * Created by karodes on 7/20/2017.
 */
public class LastNameExtractor implements StringExtractor {
    @Override
    public String extractString(Object ob1) {
        return ((Employee)ob1).getLastName();
    }
}
