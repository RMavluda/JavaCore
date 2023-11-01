package Collections;

import java.util.Vector;
public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(10);
        vector.add(34);
        vector.add(9);
        vector.remove(2);

        for(int i = 0; i < vector.size(); i++)
            System.out.print(vector.get(i) + " ");
        System.out.println();
        for(int x : vector)
            System.out.print(x + " ");

    }
}
