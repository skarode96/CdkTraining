import java.util.Comparator;

/**
 * Created by karodes on 7/20/2017.
 */
public class IDComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
      return (o1.getId() - o2.getId());
    }
}

