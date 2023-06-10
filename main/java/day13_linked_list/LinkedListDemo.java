package day13_linked_list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer>numbers = new LinkedList<>();
//UC 1 => Create a simple linked list 56,30,70
        numbers.add(56);
        numbers.add(30);
        numbers.add(70);
        System.out.println(numbers);
        numbers.clear();
        System.out.println(numbers);
//UC 2 => Ability to create Linked List by adding 30 and 56 to 70
        numbers.add(70);
        numbers.add(30);
        numbers.add(56);
        System.out.println(numbers);
//UC 3 =>   Ability to create Linked List by adding 56 and 30 to 70
        numbers.clear();
        System.out.println(numbers);
        numbers.add(30);
        numbers.add(70);
        numbers.add(56);
        System.out.println(numbers);

//UC 4 => Ability to insert 30 between 56 and 70
        numbers.clear();
        System.out.println(numbers);
        numbers.add(70);
        numbers.add(56);
        System.out.println(numbers);
        numbers.add(1,30);
        System.out.println(numbers+ "after adding 30 between 56 and 70");

//UC 5 => Ability to delete the first element in the LinkedList of sequence 56->30->70 - Write pop method
        numbers.pop();
        System.out.println(numbers+" after popping the first element ");
        numbers.add(0,70);

//UC 6 => Ability to delete the last element in the LinkedList of sequence 56->30->70 - Write popLast method
        System.out.println(numbers);
        numbers.pollLast();
        System.out.println(numbers);
    }
}
