
public class Catalog_double_to_int {
    public static void main(String[] args) {
        double aa = 5.5;
//error int a = aa;
        int a = (int)aa;
//      int a = (int)Math.ceil(aa);  округление вверх
//      int a = (int)Math.floor(aa); округление вниз
        System.out.println(a);
    }
}