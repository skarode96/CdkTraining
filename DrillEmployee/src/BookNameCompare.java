/**
 * Created by karodes on 7/19/2017.
 */
public class BookNameCompare implements Compare {

    @Override
    public int compare(Object ob1, Object ob2) {
        Book book1 = (Book)ob1;
        Book book2 = (Book)ob2;
        int compareVal = book1.getName().compareTo(book2.getName());
        if (compareVal < 0){
            return 0;
        }
        else if (compareVal > 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
