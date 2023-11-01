
public class For_loop {
    public static void main(String[] args) {
        int count  = 8;
        for(int i = 0; i < 10; ++i){
//            if(i == count) break;
                if(i == count)continue;
                System.out.println(i + " Hello World");
        }
    }
}