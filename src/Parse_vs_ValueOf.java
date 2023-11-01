public class Parse_vs_ValueOf {
    public static void main(String[] args) {
        // Integer.parseInt() vs Integer.ValueOf()
        int x = Integer.parseInt("123");
        Integer xx = Integer.valueOf("123");
        int yy = Integer.valueOf(123);

        System.out.println(x);
        System.out.println(xx);
        System.out.println(yy);

    }
}
