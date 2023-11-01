package Generics;

import java.util.ArrayList;
import java.util.List;
// Wildcards =>   ?, ? extends class, ? super class
public class GenericExample6 {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Animal());
        check2(animals);


        List<Integer> list4 = new ArrayList<>();
//        check3(list4);
//        check2(list4);

        List<Bacteria> bacteriaList = new ArrayList<>();
        check3(bacteriaList);
//        check2(bacteriaList);
    }

    public static void check1(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void check2(List<? extends Animal> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void check3(List<? super Animal> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
        System.out.println();
    }
}
class Bacteria{

}
class Animal extends Bacteria{

}
class Cat extends Animal{

}
