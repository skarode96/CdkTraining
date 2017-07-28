import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by karodes on 7/18/2017.
 */
public class Employee {
    private String firstName;
    private String lastName;
    int id;
    String dateOfBirth ;
    int depId;
    String location;
    Date date;

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MMM-dd");
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                "lastName='" + lastName + '\'' +
                ", Id=" + id +
                // ", dateOfBirth='" + dateOfBirth + '\'' +
                ", depId=" + depId +
                ", location='" + location + '\'' +
                ", date=" + simpleDateFormat.format(date) +
                '}';
    }

    public Employee(String firstName, String lastName, int id, Date date, int depId, String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        //this.dateOfBirth = dateOfBirth;
        this.date = date;
        this.depId = depId;
        this.location = location;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
//        System.out.println("Name : " + this.firstName);
//        System.out.println("Id : " + this.id);
//        System.out.println("Date Of Birth : " + date);
//        System.out.println("Dep ID : " + this.depId);
//        System.out.println("Location : " + this.location);
//        System.out.println("===========================");
//    }
    public static List<Object> giveTestData() {
        List<Object> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(new Employee("Sameer", "Karode", 2,new Date(95,11,12),2,"Pune"));
        listOfEmployee.add(new Employee("Mahesh", "Jagtap", 9,new Date(95,11,11),99,"Pune"));
        listOfEmployee.add(new Employee("Nitesh", "Bagle", 99,new Date(95,07,12),1,"Pune"));
        listOfEmployee.add(new Employee("Jaggu", "Jasoos", 0,new Date(96,11,12),45,"Pune"));
        listOfEmployee.add(new Employee("Mukta", "Kulkarni", 7,new Date(95,10,04),32,"Pune"));
        return listOfEmployee;
    }

}
