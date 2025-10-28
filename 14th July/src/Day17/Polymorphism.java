package Day17;
public class Polymorphism
{
    public int sum(int a, int b)
    {
        return a+b;
    }
    public double add(double a, double b, double c)
    {
        return a+b+c;
    }
    void employee(String name, double salary)
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + salary);
    }
    public static void main(String[] args)
    {
        Polymorphism obj = new Polymorphism();
        System.out.println(obj.sum(14,10));
        System.out.println(obj.add(1.5f,7.8f,5.9f));
        obj.employee("Priyanka", 15000);
     }
    }


