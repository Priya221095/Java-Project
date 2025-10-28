package Day18;

abstract class Animal
{
    String name;
    Animal(String name){
        this.name = name;
    }
    abstract void eats();
    abstract void function();
    void displayAnimal(){
        System.out.println("Name of the animal: " + name);
    }
}
