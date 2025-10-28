public class LeapYear // PascalCase naming for class
{
    public static void main(String[] args){
        int year= 2030;
        if((year % 4 == 0 && year % 100 !=0) || year % 400 == 0){
            System.out.println(year + " is a Leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
    }
}
