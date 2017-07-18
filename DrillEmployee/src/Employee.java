import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by karodes on 7/18/2017.
 */
public class Employee {
    private String name;
    int id;
    String dateOfBirth ;
    int depId;
    String location;
    Date date;

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MMM-dd");
        return "Employee{" +
                "name='" + name + '\'' +
                // ", dateOfBirth='" + dateOfBirth + '\'' +
                ", depId=" + depId +
                ", location='" + location + '\'' +
                ", date=" + simpleDateFormat.format(date) +
                '}';
    }

    public Employee(String name, int id, Date date, int depId, String location) {
        this.name = name;
        this.id = id;
        //this.dateOfBirth = dateOfBirth;
        this.date = date;
        this.depId = depId;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    //    public void display() {
//        System.out.println("===========================");
//        System.out.println("Name : " + this.name);
//        System.out.println("Id : " + this.id);
//        System.out.println("Date Of Birth : " + date);
//        System.out.println("Dep ID : " + this.depId);
//        System.out.println("Location : " + this.location);
//        System.out.println("===========================");
//    }
    public static List<Employee> giveTestData() {
        List<Employee> listOfEmployee = new ArrayList<Employee>();
        listOfEmployee.add(new Employee("Sameer",2223,new Date(95,11,12),2,"Pune"));
        listOfEmployee.add(new Employee("Mahesh",2224,new Date(95,11,11),2,"Pune"));
        listOfEmployee.add(new Employee("Nitesh",2225,new Date(95,07,12),2,"Pune"));
        listOfEmployee.add(new Employee("Jaggu",2226,new Date(96,11,12),2,"Pune"));
        listOfEmployee.add(new Employee("Mukta",2227,new Date(95,10,04),2,"Pune"));
        return listOfEmployee;
    }

}
