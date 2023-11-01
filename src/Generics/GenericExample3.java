package Generics;
import java.util.ArrayList;
import java.util.Date;

public class GenericExample3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(123);
//        list.add(345.6);
//        list.add("ABS");
//        list.add(new Date());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
//        String s = (String)list.get(0);
//        System.out.println(s);
    }
}
