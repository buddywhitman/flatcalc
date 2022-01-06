import java.util.Scanner;
public class Gov
{
    String statename;
    static double stamp;
    static double registration;
    static double legalmisc;
    String propertytype;
    static double gst;
    static double govtamt;
    String stampduty[][]={{"andhra pradesh","5"},
                          {"arunachal pradesh","6"},
                          {"assam","8.25"},
                          {"bihar","6"},
                          {"chattisgarh","5"},
                          {"goa","4.25"},
                          {"gujarat","4.9"},
                          {"harayana","6"},
                          {"himachal pradesh","5"},
                          {"jammu and kashmir","5"},
                          {"jharkhand","4"},
                          {"karnataka","4"},
                          {"kerela","8"},
                          {"madhya pradesh","7.5"},
                          {"maharashtra","4.5"},
                          {"manipur","7"},
                          {"meghalaya","9.9"},
                          {"mizoram","9"},
                          {"nagaland","8.25"},
                          {"odisha","4.5"},
                          {"punjab","6"},
                          {"rajasthan","4.5"},
                          {"sikkim","7.5"},
                          {"tamil nadu","7"},
                          {"telangana","5"},
                          {"tripura","5"},
                          {"uttar pradesh","7"},
                          {"uttarakhand","5"},
                          {"west bengal","6.5"}};
    
    public void getState()
    {
        for(int i=0;i<stampduty.length;i++)
        {
            if(stampduty[i][0].equalsIgnoreCase(statename))
            {
                stamp = Double.parseDouble(stampduty[i][1])/100;
                break;
            }    
        }
    }    
    
    public void inputGovt()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter FULL state name: ");
        statename=sc.nextLine();
        getState();
        
        System.out.println("Is "+ stamp*100 +"% your state's stamp duty rate? (y/n): ");
        String r = sc.nextLine();
        if(r.equalsIgnoreCase("n"))
        {
            System.out.println("Enter your state's stamp duty rate (ONLY refer to the official state government website): ");
            String s = sc.nextLine();
            stamp = Double.parseDouble(s)/100;
        }    
        
        System.out.println("Enter Registration Charges: ");
        registration = sc.nextDouble();
        
        System.out.println("Enter Legal Documentation & Miscellaneous (Eg: Khata Liasion ;) Charges: ");
        legalmisc = sc.nextDouble();
        
        System.out.println("Is the property: ");
        System.out.println("1. An under-construction project with the completion certificate NOT issued yet");
        System.out.println("2. An affordable housing project under the Pradhan Mantri Awas Yojna (PMAY)");
        System.out.println("3. A ready-to-move-in property with the completion certificate issued");
        
        System.out.println("Enter the respective serial number: ");
        int sno = sc.nextInt();
        if(sno==1) gst = 1d;
        else if(sno==2) gst = 5d;
        else gst = 0;                  
        System.out.println("The GST rate for your property type is "+gst+"%. ");
        
        sc.close();
    }    
    
    public void calcGovt()
    {
        stamp = stamp*Build.bsp/100;
        gst = gst*Build.bsp/100;
        govtamt = stamp + registration + legalmisc + gst;
    }
}    