package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(45);
        queue.add(36);
        queue.add(8);

        while(!queue.isEmpty())
            System.out.println(queue.poll() + " ");
    }
}
