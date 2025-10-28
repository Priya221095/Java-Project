package Day24;
import java.io.File;
public class CreateFile
{
    public static void main(String[] args){
        File file = new File("C:\\STAD Solutions\\Practice\\Java Assignments\\src\\Day24");
        try{
            if(file.createNewFile()){
                System.out.println("File created: " + file.getName());
            }else{
                System.out.println("File already exists.");
            }
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Can read: " + file.canRead());
            System.out.println("Can write: " + file.canWrite());
        } catch (Exception e)
        {
            e.printStackTrace();        }
    }
}
