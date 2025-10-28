public class DifferenceWithParaNonpara // PascalCase naming for class
{
        public void diffWithoutParameter() // without parameter //camelCase naming for method
        {
        int a = 80;
        int b = 45;
        int result = a - b;
        System.out.println("Difference without parameters: " + result);
    }
     public void diffWithParameter(int x, int y) // with parameter
     {
        int result = x - y;
        System.out.println("Difference with parameters: " + result);
    }
    public static void main(String[] args)
    {
    DifferenceWithParaNonpara obj = new DifferenceWithParaNonpara();
        obj.diffWithoutParameter();
        obj.diffWithParameter(95, 15);
    }
}
