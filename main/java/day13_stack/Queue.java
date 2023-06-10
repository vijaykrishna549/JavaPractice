package day13_stack;

import java.util.Iterator;
import java.util.LinkedList;

public class Queue {

    private LinkedList list = new LinkedList();

    public void enQueue(Object obj) {
        list.addFirst(obj);
    }

    public Object deQueue() {
        return list.removeLast();
    }

    public void printAll() {
//        System.out.println(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }


}


