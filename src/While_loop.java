public class While_loop {
    public static void main(String[] args) {
        int i = 0;
        while(true) {
            System.out.println("Hello World");
            i++;
            if(i == 5) break;
        }

        int x = 3;
        do{
            System.out.println("Hi");
        }while(++x < 5);
        System.out.println(x);
    }
}
