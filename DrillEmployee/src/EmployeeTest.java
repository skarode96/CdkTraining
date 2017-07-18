import java.util.List;

/**
 * Created by karodes on 7/18/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> listOfEmployee = Employee.giveTestData();
        for (Employee employee: listOfEmployee) {
            System.out.println(employee.toString());
        }
    }
}
