/**
 * Created by karodes on 7/20/2017.
 */
public class CompareIdsBooks implements Compare {
    @Override
    public int compare(Object ob1, Object ob2) {
        Book book1 = (Book) ob1;
        Book book2 = (Book) ob2;
        if (book1.getIsbn() > book2.getIsbn())
            return 1;
        else if (book2.getIsbn() == book2.getIsbn())
            return 2;
        else
            return 0;
    }
}
