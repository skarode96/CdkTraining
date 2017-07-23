import java.util.Comparator;

/**
 * Created by karodes on 7/20/2017.
 */
public class IntComparator implements Comparator<Object> {
    private IntExtractor extractor;
    public IntComparator(IntExtractor extractor) {
        this.extractor = extractor;
    }
    @Override
    public int compare(Object o1, Object o2) {
        return extractor.extractInt(o1) - extractor.extractInt(o2);
    }
}
