package com.cdk.test;

import com.cdk.employee.Employee;
import com.cdk.file.ObjectReader;
import com.cdk.file.ObjectWriter;
import com.cdk.operation.Filter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by karodes on 7/27/2017.
 */
public class TestClass {
    @Test
    public void test1() {
        ArrayList<Employee> employeeArrayList = Employee.getEmployeeData();
        Filter.filterData(employeeArrayList);
        Collections.sort(employeeArrayList);
        Iterator<Employee> iterator = employeeArrayList.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee);
        }
        ObjectWriter.writeData(employeeArrayList);

    }

    @Test
    public void test2() {
        ArrayList<Employee> employeeList = Employee.getEmployeeData();
        Filter.filterData(employeeList);
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee);
        }
    }
    @Test
    public void test3(){
        ObjectReader.readData();
    }


}