package Collections;

import java.util.Stack;

public class StaCk {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(15);
        stack.push(98);
        stack.push(8);
        System.out.println(stack.peek() + " ");
        while(!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }
}
