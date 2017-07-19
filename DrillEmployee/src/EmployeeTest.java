import java.util.Date;
import java.util.List;

/**
 * Created by karodes on 7/18/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> listOfEmployee = Employee.giveTestData();
        Compare compareImpl = new CompareIds();
        System.out.println("========Before Sorting==============");
        for (Employee employee: listOfEmployee) {
            System.out.println(employee.toString());
        }
        System.out.println("========After Sorting by Ids==============");

        MyUtil.sort(listOfEmployee,compareImpl);
        for (Employee employee: listOfEmployee) {
            System.out.println(employee.toString());
        }
        System.out.println("========After Sorting by Names==============");
        compareImpl = new CompareNames();
        MyUtil.sort(listOfEmployee,compareImpl);
        for (Employee employee: listOfEmployee) {
            System.out.println(employee.toString());
        }

    }
}
