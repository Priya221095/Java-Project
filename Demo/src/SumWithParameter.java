
   class SumWithParameter // PascalCase naming for class
{
    void sumToNumber(int i,int j)  // camelCase naming for method
    {
        int c = i+ j;
        System.out.println("Sum of Two number:-" + " " +c);
    }
    public static void main(String [] sum)
    {
        SumWithParameter obj = new SumWithParameter(); // Object creation
        obj.sumToNumber(15,20); // Calling object
    }
}