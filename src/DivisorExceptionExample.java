
// исключение
import java.io.IOException;
import java.util.Scanner;
public class DivisorExceptionExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // try catch
        // throw
        // throws
        // finally

        while (true) {
            int a = in.nextInt();
            int b = in.nextInt();
            try {
                // if(b == 0) throw new ArithmeticException();
                // int div = a / b;
                int div = divide(a, b);
                System.out.println("a / b = " + div);
            } catch (ArithmeticException ex) {
                System.out.println("You are trying to divide by zero. Pleace, enter new number!");
            } catch (IOException ex2) {
                System.out.println("You are trying to divide by zero. Pleace, enter new number!");
            } catch (RuntimeException ex3) {
                System.out.println("You are trying to divide by zero. Pleace, enter new number!");
            }

        }
    }

    // declare, catch, handle
    public static int divide(int a, int b) throws ArithmeticException, IOException, RuntimeException {
        if (b == 0) throw new ArithmeticException();
        return a / b;
    }
}