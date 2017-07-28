package com.sameer.hashsetimpl;

import org.junit.Test;

/**
 * Created by karodes on 7/23/2017.
 */
public class TestClass {
    @Test
    public void test1(){
        HashSetImpl hashSet = new HashSetImpl();
        for (int i = 0; i < 500; i++) {
            hashSet.addElement(i);
        }
//        for (int i = 0; i < 10; i++) {
//            hashSet.display();
//        }
//        hashSet.display();
        hashSet.addElement(200);
        hashSet.deleteElement(100);
        hashSet.deleteElement(101);
        hashSet.display();
    }
}
