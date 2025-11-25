/*
 * Author: Murewa Adebajo
 * A type of ice cream flavor: Vanilla 
 */
public class Vanilla extends ScoopDecorator{

    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public Vanilla(IceCream iceCream, int numScoops) 
    {
        super(iceCream, numScoops);
        
        if(this.numScoopsAvailable == 6)
        {
            

            if(numScoops == 1)
            {
                result = FlavorLine1 + "\n" + FlavorLine2 +"\n" + FlavorLine3 + "\n" + FlavorLine4 + "\n" + FlavorLine5 + "\n" + ANSI_RED + FlavorLine6 + ANSI_RESET+ "\n";
            }
            else if(numScoops == 2)
            {
                result = FlavorLine1 + "\n" + FlavorLine2 +"\n" + FlavorLine3 + "\n" + FlavorLine4 + "\n" +ANSI_RED + FlavorLine5 + "\n" + FlavorLine6 + ANSI_RESET +"\n";
            }
            else if(numScoops == 3)
            {
                result = FlavorLine1 + "\n" + FlavorLine2 +"\n" + FlavorLine3 + "\n" + ANSI_RED + FlavorLine4 + "\n" + FlavorLine5 + "\n" + FlavorLine6 + ANSI_RESET+ "\n";
            }
            else if(numScoops == 4)
            {
                result = FlavorLine1 + "\n" + FlavorLine2 +"\n" + ANSI_RED+ FlavorLine3 + "\n" + FlavorLine4 + "\n" + FlavorLine5 + "\n" + FlavorLine6 + ANSI_RESET + "\n";
            }
            else if(numScoops == 5)
            {
                result = FlavorLine1 + "\n" + ANSI_RED+ FlavorLine2 +"\n" + FlavorLine3 + "\n" + FlavorLine4 + "\n" + FlavorLine5 + "\n" + FlavorLine6 + ANSI_RESET + "\n";
            }
            else if(numScoops == 6)
            {
                result = ANSI_RED + FlavorLine1 + "\n" + FlavorLine2 +"\n" + FlavorLine3 + "\n" + FlavorLine4 + "\n" + FlavorLine5 + "\n" + FlavorLine6 + ANSI_RESET+ "\n";
            }
        }
        else if(this.numScoopsAvailable == 5)
        {
            
            if(numScoops == 1)
            {
                result = FlavorLine1 + "\n" + FlavorLine2 +"\n" + FlavorLine3 + "\n" + FlavorLine4 + "\n" + ANSI_RED +FlavorLine5 + ANSI_RESET+ "\n"+ ANSI_BLUE +FlavorLine6+ ANSI_RESET + "\n";
            }
            else if(numScoops == 2)
            {
                result = FlavorLine1 + "\n" + FlavorLine2 +"\n" + FlavorLine3 + "\n" + ANSI_RED + FlavorLine4 + "\n" + FlavorLine5 +"\n" + ANSI_BLUE+ FlavorLine6 + ANSI_RESET +"\n";

            }
            else if(numScoops == 3)
            {
                result = FlavorLine1 + "\n" + FlavorLine2 +"\n" + ANSI_RED +FlavorLine3 + "\n" + FlavorLine4 + "\n" + FlavorLine5 + "\n" + ANSI_BLUE + FlavorLine6 + ANSI_RESET+ "\n";
            }
            else if(numScoops == 4)
            {
                result = FlavorLine1 + "\n" + ANSI_RED+ FlavorLine2 +"\n"+ FlavorLine3 + "\n" + FlavorLine4 + "\n" + FlavorLine5 + "\n" + ANSI_BLUE +FlavorLine6 + ANSI_RESET + "\n";
            
            }
            else if(numScoops == 5)
            {
                result = ANSI_RED + FlavorLine1 + "\n"+ FlavorLine2 +"\n" + FlavorLine3 + "\n" + FlavorLine4 + "\n" + FlavorLine5 + "\n" + ANSI_BLUE + FlavorLine6 + ANSI_RESET + "\n";
            
            }
        }
        else if(this.numScoopsAvailable == 4)
        {
            if(numScoops == 1)
            {
                result = FlavorLine1 + "\n" + FlavorLine2 +"\n" + FlavorLine3 + "\n" + ANSI_RED + FlavorLine4 + "\n" + ANSI_BLUE +FlavorLine5+ "\n"+FlavorLine6+ ANSI_RESET + "\n";
        
            }
            else if(numScoops == 2)
            {
                result = FlavorLine1 + "\n" + FlavorLine2 +"\n" + ANSI_RED + FlavorLine3 + "\n" + FlavorLine4 + "\n"+ ANSI_BLUE + FlavorLine5 +"\n"+ FlavorLine6 + ANSI_RESET +"\n";
            
            }
            else if(numScoops == 3)
            {
                
                result = FlavorLine1 + ANSI_RED + "\n" + FlavorLine2 +"\n" +FlavorLine3 + "\n" + FlavorLine4 + ANSI_RESET + "\n" + ANSI_BLUE + FlavorLine5 + "\n" + FlavorLine6 + ANSI_RESET+ "\n";
            }
            else if(numScoops == 4)
            {
                result = ANSI_RED + FlavorLine1 + "\n"+ FlavorLine2 +"\n"+ FlavorLine3 + "\n" + FlavorLine4 + "\n" + ANSI_BLUE + FlavorLine5 + "\n" +FlavorLine6 + ANSI_RESET + "\n";
            
            }
        }
        else if(this.numScoopsAvailable == 3)
        {
            if(numScoops == 1)
            {
                result = FlavorLine1 + "\n" + FlavorLine2 +"\n" + ANSI_RED + FlavorLine3 + "\n"+ ANSI_BLUE + FlavorLine4 + "\n" +FlavorLine5+ "\n"+FlavorLine6+ ANSI_RESET + "\n";
           
            }
            else if(numScoops == 2)
            {
                result = FlavorLine1 + "\n" + ANSI_RED + FlavorLine2 +"\n" + FlavorLine3 + "\n" + ANSI_BLUE + FlavorLine4 + "\n" + FlavorLine5 +"\n"+ FlavorLine6 + ANSI_RESET +"\n";
            
            }
            else if(numScoops == 3)
            {
                result = ANSI_RED + FlavorLine1 + "\n" + FlavorLine2 +"\n" +FlavorLine3 + "\n" + ANSI_BLUE +FlavorLine4 + "\n" + FlavorLine5 + "\n" + FlavorLine6 + ANSI_RESET+ "\n";
           
            }
        }
        else if(this.numScoopsAvailable == 2)
        {
            if(numScoops == 1)
            {
                result = FlavorLine1 + "\n" + ANSI_RED + FlavorLine2 +"\n" + ANSI_BLUE + FlavorLine3 + "\n"+ FlavorLine4 + "\n" +FlavorLine5+ "\n"+FlavorLine6+ ANSI_RESET + "\n";
           
            }
            else if(numScoops == 2)
            {
                result = ANSI_RED + FlavorLine1 + "\n" + FlavorLine2 +"\n" + ANSI_BLUE + FlavorLine3 + "\n" + FlavorLine4 + "\n" + FlavorLine5 +"\n"+ FlavorLine6 + ANSI_RESET +"\n";
            
            }
        }
        else if(this.numScoopsAvailable == 1)
        {
            if(numScoops == 1)
            {
                result = ANSI_RED + FlavorLine1 + "\n" + ANSI_BLUE + FlavorLine2 +"\n" + FlavorLine3 + "\n"+ FlavorLine4 + "\n" +FlavorLine5+ "\n"+FlavorLine6+ ANSI_RESET + "\n";
            
            }
        }
    }
        
}
