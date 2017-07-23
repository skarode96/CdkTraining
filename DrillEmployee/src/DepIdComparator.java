import java.util.Comparator;

public class DepIdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (o1.getDepId() - o2.getDepId());
    }
}