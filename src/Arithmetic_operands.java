
public class Arithmetic_operands {
    public static void main(String[] args) {
//        +,-,*,/,       %=, !=,        &, |, ^, <, >, <=, >=, ?:, <<, >>
        int a = 2;
        int b = 4;
        int c = 7;
        int d = 3;
        int sum = (a + b + c) * d;
        System.out.println("Sum " + sum);
        int substraction = b - a;
        System.out.println("Substr " + substraction);

        int mult = a * b;
        int div = b / a;
        System.out.println("Mult " + mult);
        System.out.println("Div " + div);
    }
}