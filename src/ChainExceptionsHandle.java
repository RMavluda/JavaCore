
import java.io.IOException;

public class ChainExceptionsHandle {
    public static void main(String[] args) {
        try{
            method();
            System.out.println("After method");
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException is cought");
        }
    }

    private static void method(){
        try{
            method2();
            System.out.println("After method2");
        }catch(IOException ex){
            System.out.println("IOException is called");
        }
    }

    private static void method2() throws IOException, ArithmeticException{
        throw new ArithmeticException();
    }
}