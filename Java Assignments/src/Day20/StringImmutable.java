package Day20;

public class StringImmutable
{
    public static void main(String[] args)
    {
        String name = "Priyanka";
        name.concat("Chaudhari");
        System.out.println("Print the original string: " + name);
        String newName = name.concat(" Chaudhari");
        System.out.println("Print the modified string: " + newName);
    }
}
