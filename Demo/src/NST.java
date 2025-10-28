 class NonStatic // PascalCase naming for class
{
  void printLine(){   //non static variable & camelCase naming for method
      System.out.println("STAD solution is a testing institute");
  }
  public static void main(String[] args){
      NonStatic obj = new NonStatic(); // creation of object
      obj.printLine(); // calling method
  }
}
