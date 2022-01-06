import java.util.Scanner;
public class Bank
{
    static double loanpercent;
    static double downpayment;
    static double interestcharge;
    static double processingfee;
    static double misccharge;
    static double modt;
    int months;
    int years;
    double interestrate;
    static double emi;
    static double bankamt;
    double principalamt;
    
    public void inputBank()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Home Loan Sanction Percentage: ");
        loanpercent = sc.nextDouble();
        
        calcDownPayment();
        System.out.printf("Is the Down Payment Amount (y/n): "+ downpayment);
        sc=new Scanner(System.in);
        String r = sc.nextLine();
        if(r.equalsIgnoreCase("n"))
        {
            System.out.println("Enter Down Payment Amount: ");
            downpayment = sc.nextDouble();
        }    
        
        System.out.println("Enter MODT (Memorandum of Deposit of the Title Deed Charges): ");
        modt = sc.nextDouble();
        
        System.out.println("Enter Interest Charge (type 0 if not applicable): ");
        interestcharge = sc.nextDouble();
        
        System.out.println("Enter Loan Processing Fee: ");
        processingfee = sc.nextDouble();
        
        System.out.println("Enter Miscellaneous Charge: ");
        misccharge = sc.nextDouble();
        
        System.out.println("Do you want to calculate EMI? (y/n): ");
        sc=new Scanner(System.in);
        String r2 = sc.nextLine();
        if(r2.equalsIgnoreCase("y"))
        {
            System.out.println("Enter time period (in years): ");
            years = sc.nextInt();
            months = years*12;
            System.out.println("Enter rate of interest (in %): ");
            interestrate = sc.nextInt();
            
            emi = (principalamt*interestrate*Math.pow(1+interestrate,months))/(Math.pow(1+interestrate,months)-1);
        } 
        bankamt = modt+interestcharge+processingfee+misccharge;
    }
    
    public void calcDownPayment()
    {
        downpayment = loanpercent*Build.bsp/100;
        principalamt = Build.bsp - downpayment;
    }    
}