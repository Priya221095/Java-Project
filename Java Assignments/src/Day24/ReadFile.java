package Day24;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile
{
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("C:\\STAD Solutions\\Practice\\Java Assignments\\src\\Day24\\Demo.txt");
        int c;
        while((c=fr.read()) != -1){
            System.out.print((char) c);
        }
        fr.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
    }
}
