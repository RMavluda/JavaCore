public class Wrapper {
    public static void main(String[] args) {
        // int, double, float, char, boolean
        // Integer, Double, Float, Character, Boolean

        int x = 5;
        Integer xx = new Integer(10);

        System.out.println(x);
        System.out.println(xx);

        int y = xx.intValue();
        System.out.println("y " + y);

        Integer yy = (Integer)x;
        System.out.println("yy " + yy);


    }
}
