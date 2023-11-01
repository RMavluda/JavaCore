
package FilePrograms;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileEx {
    public static void main(String[] args) throws IOException{
        File file = new File("out.txt");
        Scanner in = new Scanner(file);
        while(in.hasNext()){
            String s = in.next();
            System.out.print(s + ' ');
        }
        in.close();



        /*

        PrintWriter writer = new PrintWriter(file);

        writer.println("Hello");
        writer.println("World");

        writer.close();
    }*/


    }
}