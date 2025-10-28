class LeapYearWM // PascalCase naming for class
{
    int year= 2030;
    void printLine() { // camelCase for method naming
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a Leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
    public static void main(String[] args){
        LeapYearWM obj = new LeapYearWM();
        obj.printLine();
    }
}

