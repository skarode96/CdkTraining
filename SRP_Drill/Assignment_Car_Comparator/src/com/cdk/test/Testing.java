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
        TreeSet<Car> carSet = Car.createCarData(new BrandComparator());
        Iterator<Car> iterator = carSet.iterator();

        while (iterator.hasNext()){
            Car car = iterator.next();
            System.out.println(car);
        }

    }
}
