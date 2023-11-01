public class if_statement {
    public static void main(String[] args) {
   /*     int x = 15;
        if(x < 10){
            System.out.println("x is less than 10");
        }else{
            System.out.println("x is more or equal to 10");
        }*/
     /*   int x = 20;
        if(x < 10){
            System.out.println("x is less than 10");
        }else if(x <= 15){
            System.out.println("x is less than 15");
        }else{
            System.out.println("x is more than 15");
        }*/
        int x = 12;
        if(x < 10){
            System.out.println("x is less or equal than 10");
            if(x%2 == 0){
                System.out.println("x is even");
            }else{
                System.out.println("x is odd");
            }
        }else{
            System.out.println("x is more than 10");
            if(x%2 == 0){
                System.out.println("x is even");
            }else{
                System.out.println("x is odd");
            }
        }
    }
}
