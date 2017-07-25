package com.cdk.test;

import com.cdk.car.Car;
import com.cdk.comparators.BrandComparator;
import com.cdk.comparators.IdComparator;
import com.cdk.comparators.PriceComparator;
import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by karodes on 7/25/2017.
 */
public class Testing {
    @Test
    public void test1(){
        System.out.println("=================Default comparison by price===============");
        TreeSet<Car> carSet = Car.createCarData();

        Iterator<Car> iterator = carSet.iterator();
        while (iterator.hasNext()){
            Car car = iterator.next();
            System.out.println(car);
        }

        System.out.println("==============Comparison by Brand=======================");
        carSet = Car.createCarData(new BrandComparator());
        iterator = carSet.iterator();
        while (iterator.hasNext()){
            Car car = iterator.next();
            System.out.println(car);
        }

        System.out.println("==============Comparison by Id=======================");
        carSet = Car.createCarData(new IdComparator());
        iterator = carSet.iterator();
        while (iterator.hasNext()){
            Car car = iterator.next();
            System.out.println(car);
        }


    }
}
