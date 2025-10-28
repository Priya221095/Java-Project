package Day24;
import java.io.FileWriter;
public class WriteFile
{
    public static void main(String[] args){
       try{
        FileWriter fw = new FileWriter("C:\\STAD Solutions\\Practice\\Java Assignments\\src\\Day24\\Demo.txt");
        fw.write("I am a student at STAD Solutions");
        fw.close();
           System.out.println("Successfully written to the file");
       } catch (Exception e) {
           e.printStackTrace();
       }
}
}