package com.cdk.test;

import com.cdk.DuplicateFinder.DuplicateFinder;
import com.cdk.person.Person;
import com.sun.org.apache.bcel.internal.generic.DUP;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by karodes on 7/20/2017.
 */
public class TestClass {

    @Test
    public void test1() {
        List<Person> listOfPerson = Person.getListOfPerson();
        System.out.println("-----Populating List-----------");
        for(Person person : listOfPerson) {
            System.out.println(person.toString());
        }
        System.out.println("--------------------------------");
        DuplicateFinder.getDuplicateNames();
    }
}
