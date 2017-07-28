package com.sameer.hashsetimpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by karodes on 7/22/2017.
 */
public class Node {
    int nodeValue;
    ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();

    public Node(int nodeValue) {
        this.nodeValue = nodeValue;
    }
    public void addElements(int element) {
       if(searchElement(element))
           System.out.println("Element already present");
       else {
           listOfIntegers.add(element);
       }
    }

    public boolean searchElement(int element) {
        for (int i:listOfIntegers) {
            if(element == i) {
                System.out.println("Element found");
                return true;
            }
        }
        return false;
    }
    public void deleteElement(int element) {
        if(searchElement(element)){
            listOfIntegers.remove(listOfIntegers.indexOf(element));
            System.out.println("Removed : " + " " + element);
        }
    }
    public void display(){
        System.out.print("Node : " + this.nodeValue + "  ");
        for (int i:listOfIntegers) {
            System.out.print("  -> "+ i);

        }
        System.out.println(" ");

    }

}
