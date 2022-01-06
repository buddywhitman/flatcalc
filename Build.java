import java.util.Scanner;
public class Build
{
    static double carpetarea;
    static double rspersqft;
    static double bsp;
    static double plc;
    static double flc;
    static double brokerfee;
    static double electrification;
    static double infradev;
    static double ffec;
    static double cpc;
    static double sewage;
    static double club;
    static double powbackup;
    static double advmaintenance;
    static double buildamt;
    static String location;
    static String buildername;
        
    public void inputBuilder()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Carpet Area (RERA mandates te calculation of BSP based on it): ");
        carpetarea = sc.nextInt();
        System.out.println("Enter price/sqft: ");
        rspersqft = sc.nextDouble();
        
        sc=new Scanner(System.in);
        System.out.println("Enter Builder Name: ");
        buildername=sc.nextLine();

        sc=new Scanner(System.in);
        System.out.println("Enter Location: ");
        location=sc.nextLine();
        
        sc=new Scanner(System.in);
        System.out.println("Enter Preferential Location Charge (PLC): ");
        plc = sc.nextDouble();
        System.out.println("Enter Floor Rise Charge: ");
        flc = sc.nextDouble();
        
        System.out.println("Enter Brokerage Fee Percentage: ");
        brokerfee = sc.nextDouble();
        
        System.out.println("Enter Electrification and Connection Charge (EEC & ECC): ");
        electrification = sc.nextDouble();
        System.out.println("Enter Amenities and Infrastructure Developement Charge (IDC/EDC): ");
        infradev = sc.nextDouble();
        System.out.println("Enter Firefighting Equipment Charge (FFEC): ");
        ffec = sc.nextDouble();
        System.out.println("Enter Car Parking Charge (CPC): ");
        cpc = sc.nextDouble();
        
        System.out.println("Is your property located in the National Capital Region (NCR)? (y/n): ");
        char c = sc.next().charAt(0);        
        
        if(c == 'n')
        {
            System.out.println("Enter Drainage and Sewage Charge: ");
            sewage = sc.nextDouble();
        }    
        else
        {
            System.out.println("Enter Water Connection Charge: ");
            sewage = sc.nextDouble();
            System.out.println("Enter Drainage and Sewage Charge: ");
            sewage += sc.nextDouble();
        }   
        
        System.out.println("Enter Clubhouse Charge: ");
        club = sc.nextDouble();
        System.out.println("Enter Power Backup Charge: ");
        powbackup = sc.nextDouble();
        System.out.println("Enter Advance (Maintenance) Deposit: ");
        advmaintenance = sc.nextDouble(); 
        
        sc.close();
    }
    
    public void calcBuilder()
    {
        bsp = carpetarea*rspersqft;
        brokerfee = (brokerfee*bsp)/100;
        buildamt = bsp + plc + flc + brokerfee + electrification + infradev + ffec + cpc + sewage + club + powbackup + advmaintenance;
    }  
}