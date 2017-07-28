/**
 * Created by karodes on 7/19/2017.
 */
public class CompareIds implements Compare {

    @Override
    public int compare(Object ob1, Object ob2) {
        Employee employee1 = (Employee) ob1;
        Employee employee2 = (Employee) ob2;
        if (employee1.getId() > employee2.getId())
            return 1;
        else if (employee1.getId() == employee2.getId())
            return 2;
        else
            return 0;
    }
}

