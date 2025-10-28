// Program for creation of String type array and retrieval of data using "for each" loop


public class ForEachLoop
{
    public static void main(String[] args) {
        String[] employeeName = new String[4];
        employeeName[0] = "Asha";
        employeeName[1] = "Usha";
        employeeName[2] = "Nisha";
        employeeName[3] = "Prisha";
        System.out.println("Below are the employee names list");
        for (String names : employeeName) {
            System.out.println("Employee name: " + names);
        }
    }
    }
