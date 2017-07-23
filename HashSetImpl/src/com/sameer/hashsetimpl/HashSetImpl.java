package com.sameer.hashsetimpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by karodes on 7/22/2017.
 */
public class HashSetImpl {
    int setSize = 100;
    ArrayList<Node> arrayList = new ArrayList<Node>(setSize);

    public HashSetImpl() {
        for (int i = 0; i < setSize; i++) {
            arrayList.add(new Node(i));
        }
    }

    public void addElement(int element) {

        if (isPresent(element)) {
            System.out.println("Element already present");
        }
        else{
            int hashCode = getHash(element);
            Node node = arrayList.get(hashCode);
            node.addElements(element);
        }
    }

    private boolean isPresent(int element) {
        int hashCode = getHash(element);
        Node node = arrayList.get(hashCode);
        if (arrayList.get(hashCode).equals(element)) {
            return true;
        } else {
            return false;
        }
    }

    private int getHash(long element) {
        return (int) (element % setSize);
    }

    public void display() {
        for (int i = 0; i < this.setSize; i++) {
            Node node = arrayList.get(i);
            node.display();
        }
    }

    public void deleteElement(int element) {
        Node node = arrayList.get(getHash(element));
        node.deleteElement(element);
    }

}
