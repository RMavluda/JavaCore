
package FilePrograms;

import java.io.*;

public class ReadWriterStream {
    public static void main(String[] args) throws Exception{

        // PrintWiter, FileReader, InputStream, DataInputStream, ObjectInputStream

        // Writer, Reader
        // InputStream, OutputStream
        File file = new File("output.txt");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));

        String s = "ABC";
        int[] a = {3, 4, 5};

        out.writeObject(s);
        out.writeObject(a);
        out.close();

        String ss = (String)in.readObject();
        int[] aa = (int[])in.readObject();
        in.close();

        System.out.println(ss);
        for(int i = 0; i < aa.length; i++)
            System.out.print(aa[i] + " ");

/*
        File file = new File("output.txt");
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));

        out.writeUTF("Hi");
        out.writeInt(670);
        out.close();

        System.out.println(in.readUTF());
        System.out.println(in.readInt());
        in.close();*/

    }
}

