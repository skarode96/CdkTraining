/**
 * Created by karodes on 7/20/2017.
 */
public class FirstNameExtractor implements StringExtractor {

    @Override
    public String extractString(Object ob1) {
        return ((Book) ob1).getName();
    }
}
