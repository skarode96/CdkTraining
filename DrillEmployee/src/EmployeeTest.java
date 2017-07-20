import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by karodes on 7/18/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        List<Object> listOfEmployee = Employee.giveTestData();
        Comparator idComparator = new IDComparator();
        System.out.println("========Before Sorting==============");
        for (Object employee: listOfEmployee) {
            System.out.println(employee.toString());
        }
        System.out.println("========After Sorting by Ids==============");

        Collections.sort(listOfEmployee,idComparator);
        //MyUtil.sort(listOfEmployee,compareImpl);
        for (Object employee: listOfEmployee) {
            System.out.println(employee.toString());
        }
        System.out.println("========After Sorting by Names==============");
        Compare compareImpl = new CompareNames();
        MyUtil.sort(listOfEmployee,compareImpl);
        for (Object employee: listOfEmployee) {
            System.out.println(employee.toString());
        }

        List<Object> listOfBooks = Book.giveTestData();
        compareImpl = new CompareIdsBooks();
        System.out.println("========Before Sorting==============");
        for (Object bookItr: listOfBooks) {
            System.out.println(bookItr.toString());
        }
        System.out.println("========After Sorting by Ids==============");

        MyUtil.sort(listOfBooks,compareImpl);
        for (Object bookItr: listOfBooks) {
            System.out.println(bookItr.toString());
        }
        System.out.println("========After Sorting by Names==============");
        compareImpl = new BookNameCompare();
        MyUtil.sort(listOfBooks,compareImpl);
        for (Object bookItr: listOfBooks) {
            System.out.println(bookItr.toString());
        }

    }
}
