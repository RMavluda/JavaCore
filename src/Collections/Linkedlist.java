package Collections;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(4);
        linkedlist.add(5);

        for(int i = 0; i < linkedlist.size(); i++)
            System.out.print(linkedlist.get(i) + " ");

        System.out.println();

        for (int x : linkedlist)
            System.out.print(x + " ");
        System.out.println();

    }

}
