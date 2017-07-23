/**
 * Created by karodes on 7/20/2017.
 */
public class DepIdExtractor implements IntExtractor {
    @Override
    public int extractInt(Object ob1) {
        return ((Employee) ob1).getDepId();
    }
}
