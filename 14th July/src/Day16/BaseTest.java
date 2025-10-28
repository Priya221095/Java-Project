package Day16;

public class BaseTest
{
    protected String name;
    protected int age;

    public void sum(int a, int b){
        int c=a+b;
        System.out.println("Print value of c: " +c);
    }
    public void sum(String name, int p){
        System.out.println("Print the above: " + name + p);
    }
}
