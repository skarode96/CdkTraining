import java.util.List;

/**
 * Created by karodes on 7/19/2017.
 */
public class MyUtil {
    public static void sort(List<Object> objectList, Compare compareBehaviour){

        Object tempInstance;
//        CompareImpl compareImpl = new CompareImpl();
        for (int i = 0; i < objectList.size(); i++) {
            for (int j = 0; j < objectList.size() - 1; j++) {
//                if (employeeList.get(j).getId() > employeeList.get(j+1).getId()) {
                int compareVal = compareBehaviour.compare(objectList.get(j),objectList.get(j+1));
                if(compareVal == 1) {
                    tempInstance = objectList.get(j);
                    objectList.set(j, objectList.get(j + 1));
                    objectList.set(j + 1, tempInstance);
                }
            }
        }
//        return employeeList;
    }
}
