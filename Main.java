public class Main
{
    Intro i1 = new Intro();
    public void introduction()
    {
        
        i1.asciiArt();
        i1.legal();
        i1.gettingStarted();
        //i1.resume();
    }      
    
    public void builder()
    {
        Build b1 = new Build();
        b1.inputBuilder();
        b1.calcBuilder();
    }       
    
    public void government()
    {
        Gov g1 = new Gov();
        g1.inputGovt();
        g1.calcGovt();
    }    
    
    public void banker()
    {
        Bank ba1 = new Bank();
        ba1.inputBank();
    } 
    
    public void printer()
    {
        Print p1 = new Print();
        i1.asciiArt();
        p1.print();
    }   
    
    public static void main(String[]args)
    {
        Main m1 = new Main();
        m1.introduction();
        m1.builder();
        m1.government();
        m1.banker();
        m1.printer();
    }   
}