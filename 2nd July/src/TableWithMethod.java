 // with function
public class TableWithMethod
{
  static void printTable()
    {
        int num = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
    public static void main(String [] args){
      TableWithMethod obj = new TableWithMethod();
      obj.printTable();
    }
}
