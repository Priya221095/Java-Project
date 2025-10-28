package Day19;

public final class CompanyFinal
{
    final String COMPANY_NAME;   // Final variable

    CompanyFinal(String value){       // variable initialized in constructor
        COMPANY_NAME = value;
    }
    final void displayName(){         // Final method
        System.out.println("Name of the company: " + COMPANY_NAME);
    }
    public static void main(String[] args){
        CompanyFinal obj = new CompanyFinal("TCS");
        obj.displayName();
    }
}
