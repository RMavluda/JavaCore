
package Generics;
// Generic
public class GenericExample {
    public static void main(String[] args) {
        Integer a = 1;
        Double b = 2.6;
        show(a, b);
        Long c = 3L;
        Long d = 4L;
        show(c, d);
        String s = "press";
        String t = "to 1-2.6-3-4";
        show(s, t);

    }
    public static <T, U> void show(T a, U b){
        System.out.println(a + " " + b);
    }
}