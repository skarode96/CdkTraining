
package com.cdk.employee;

import com.cdk.Annotations.Company;
import com.cdk.Annotations.TimeStamp;
import com.cdk.enums.Day;
import com.cdk.enums.Month;
import com.cdk.enums.Year;


/**
 * Created by karodes on 7/24/2017.
 */
@Company(name = "CDK global",location = "Pune")
@TimeStamp(year = Year.YEAR2015,month = Month.JUL,day = Day.MON)

public class Employee {

    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
