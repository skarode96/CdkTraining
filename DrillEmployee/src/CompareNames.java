/**
 * Created by karodes on 7/19/2017.
 */
public class CompareNames implements Compare {
    @Override
    public int compare(Object ob1, Object ob2) {
        Employee employee1 = (Employee) ob1;
        Employee employee2 = (Employee) ob2;
        int compareVal;
        compareVal = employee1.getFirstName().compareTo(employee2.getFirstName());
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
