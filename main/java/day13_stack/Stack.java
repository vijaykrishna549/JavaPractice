package day13_stack;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack {
        private LinkedList list = new LinkedList();
        public void push(Object obj) {
            list.addFirst(obj);
        }
        public Object top() {
            return list.getFirst();
        }
        public Object pop() {
            return list.removeFirst();
        }

        public Object peek() {
        return list.removeFirst();
    }

    public void printAll(){
//        System.out.println(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }


}
