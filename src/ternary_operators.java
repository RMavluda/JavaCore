public class ternary_operators {
    public static void main(String[] args) {
        int x = 7;
        int y;

/*
        if(x % 2 == 1)
            y = x - 1;
        else y = x;
*/
    y = x % 2 == 1 ? x - 1 : x;
    System.out.println(y);

    }
}
