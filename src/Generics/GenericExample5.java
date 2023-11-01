package Generics;

public class GenericExample5 {
    public static void main(String[] args) {
        Person p = new Person();
        show(p);
    }
    public static <T extends Comparable<T> & Cloneable> void show(T a){

    }
}
class Person implements Comparable<Person>, Cloneable{
    public int compareTo(Person o){
        return 0;
    }
        }