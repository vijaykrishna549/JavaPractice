package day13_stack;

public class StackAndQueueImplementation {
    public static void main(String[] args) {
        Stack stack = new Stack();
//UC1 => Ability to create a Stack of 56->30->70
        stack.push(56);
        stack.push(30);
        stack.push(70);
//        stack.push(50);
        System.out.println("UC 1");
        stack.printAll();

// UC2 => Ability to peak and pop from the Stack till it is empty
        System.out.println("UC 2");
        stack.printAll();
        stack.pop();
        stack.peek();
        stack.pop();
        System.out.println("Empty Stack Below");
        stack.printAll();

// UC3 =>Ability to create a Queue of 56->30->70
        Queue queue = new Queue();
        queue.enQueue(56);
        queue.enQueue(30);
        queue.enQueue(70);
        System.out.println("Printing all Queue");
        queue.printAll();

// UC4 => Ability to dequeue from the beginning

        System.out.println("Print queue elements after removing  element from beginning");
        queue.deQueue();
        queue.printAll();
    }
}
