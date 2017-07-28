import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by karodes on 7/20/2017.
 */
public class TestClass {
    @Test
    public void test1() {
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
        System.out.println("========After Sorting by Dep Ids==============");
        Comparator depIdComparator = new DepIdComparator();
        Collections.sort(listOfEmployee,depIdComparator);
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

    }
    @Test
    public void test2() {

        List<Object> listOfBooks = Book.giveTestData();
        Compare compareImpl = new CompareIdsBooks();
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
    @Test
    public void test3() {
        List<Object> listOfEmployee = Employee.giveTestData();
        Comparator idComparator = new IntComparator(new IdExtractor());
        Collections.sort(listOfEmployee,idComparator);
        for (Object employee: listOfEmployee) {
            System.out.println(employee.toString());
        }

    }


}
