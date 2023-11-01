package Collections;

import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(7);
        list.add(5);

        list.remove(2);
        System.out.println(list.contains(9));

        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println();

        for(int x : list)
            System.out.print(x + " ");
        System.out.println();

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
