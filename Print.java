public class Print
{
    public void print()
    {
        double famt = Build.buildamt+Gov.govtamt+Bank.bankamt;
        
        System.out.println("_______________________________________________________"+Build.buildername+"________________________________________________________");
        System.out.println("Carpet Area: "+Build.carpetarea);
        System.out.println("Price/sqft: ₹"+Build.rspersqft);
        System.out.printf("Basic Sale Price: ₹"+Build.bsp);
        System.out.println("\nLocation: "+Build.location);
        System.out.println("PLC: ₹"+Build.plc);
        System.out.println("FLC: ₹"+Build.flc);
        System.out.printf("Brokerage Fees: ₹"+Build.brokerfee);
        System.out.println("\nEEC/ECC: ₹"+Build.electrification);
        System.out.println("IDC/EDC: ₹"+Build.infradev);
        System.out.println("FFEC: ₹"+Build.ffec);
        System.out.println("CPC: ₹"+Build.cpc);
        System.out.println("WDSC: ₹"+Build.sewage);
        System.out.println("Club Membership: ₹"+Build.club);
        System.out.println("PBC: ₹"+Build.powbackup);
        System.out.println("Advance Maintenance: ₹"+Build.advmaintenance);
        System.out.println("________________________________________________________THE GOVERNMENT_________________________________________________________");
        System.out.println("Stamp Duty %: "+Gov.stamp);
        System.out.println("Registration Charge: ₹"+Gov.registration);
        System.out.println("Legal Documentation/Miscellaneous Charges: ₹"+Gov.legalmisc);
        System.out.println("GST: ₹"+Gov.gst);
        System.out.println("___________________________________________________________THE BANK___________________________________________________________");
        System.out.println("Home Loan Sanction %: "+Bank.loanpercent);
        System.out.println("Down Payment Amount: ₹"+Bank.downpayment);
        System.out.println("MODT: ₹"+Bank.modt);
        System.out.println("Interest Charges: ₹"+Bank.interestcharge);
        System.out.println("Loan Processing Fee: ₹"+Bank.processingfee);
        System.out.println("Miscellaneous Charge: ₹"+Bank.misccharge);
        System.out.println("_____________________________________________________________FINAL_____________________________________________________________");
        System.out.printf("Basic Sale Price: ₹"+Build.bsp);
        System.out.printf("\nTotal Apartment Cost (Payable to Builder): ₹"+Build.buildamt);
        System.out.println("\nStamp Duty: ₹"+Gov.stamp);
        System.out.println("Registration Charge: ₹"+Gov.registration);
        System.out.println("GST: ₹"+Gov.gst);
        System.out.println("________________________________________________________________________________________________________________________________");
        System.out.printf("FINAL AMOUNT FOR THE PROPERTY (PAYABLE TO EVERYONE YOU OWE MONEY TO): ₹"+famt);
        System.out.println("\n________________________________________________________________________________________________________________________________");
        System.out.println("  \t                                                   FINANCING");
        System.out.printf("Down Payment: ₹"+Bank.downpayment);
        System.out.printf("\nEMI: ₹"+Bank.emi);
        System.out.println("\n________________________________________________________________________________________________________________________________");
        System.out.println("\t\t\t\t         Wishing you a hassle-free home buying experience!\n");
        System.out.println("\t\t\t            PLEASE DO NOT EXCHANGE BRIBES. BE A RESPONSIBLE CITIZEN.");
        System.out.println("\t\t\t           REPORT ANY SUCH EXCHANGE TO THE NEAREST VIGILANCE OFFICER.\n\n");
        System.out.println("\t        If you liked this project, please consider donating to the developer :) (helps us serve you better)");
        System.out.println("\t\t\t\tBitcoin Wallet Address: 0xA49c4F9277E9C80Dc9176700bF6Dd845313ab");
            
    }    
}    
