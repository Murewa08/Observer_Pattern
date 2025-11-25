/*
 * Author: Murewa Adebajo
 * A type of ice cream flavor: Blueberry
 */
public class BlueBerry extends ScoopDecorator{

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";


    public BlueBerry(IceCream iceCream, int numScoops) {
        super(iceCream, numScoops);

        if(numScoops == 1)
        {
            result = FlavorLine1 + "\n" + FlavorLine2 +"\n" + FlavorLine3 + "\n" + FlavorLine4 + "\n" + FlavorLine5 + "\n" + ANSI_BLUE + FlavorLine6 + ANSI_RESET+ "\n";
            this.numScoopsAvailable = asciiArt.size() - numScoops;
        }
        else if(numScoops == 2)
        {
            result = FlavorLine1 + "\n" + FlavorLine2 + "\n" + FlavorLine3 + "\n" + FlavorLine4 + "\n" + ANSI_BLUE + FlavorLine5 + "\n" + FlavorLine6 + ANSI_RESET + "\n";
            this.numScoopsAvailable = asciiArt.size() - numScoops;
            
        }
        else if(numScoops == 3)
        {
            result = FlavorLine1 + "\n" + FlavorLine2 +"\n" + FlavorLine3 + "\n" + ANSI_BLUE + FlavorLine4 + "\n" + FlavorLine5 + "\n" + FlavorLine6 + ANSI_RESET+ "\n";
            this.numScoopsAvailable = asciiArt.size() - numScoops;
            
        }
        else if(numScoops == 4)
        {
            result = FlavorLine1 + "\n" + FlavorLine2 +"\n" + ANSI_BLUE+ FlavorLine3 + "\n" + FlavorLine4 + "\n" + FlavorLine5 + "\n" + FlavorLine6 + ANSI_RESET + "\n";
            this.numScoopsAvailable = asciiArt.size() - numScoops;
            
        }
        else if(numScoops == 5)
        {
            result = FlavorLine1 + "\n" + ANSI_BLUE+ FlavorLine2 +"\n" + FlavorLine3 + "\n" + FlavorLine4 + "\n" + FlavorLine5 + "\n" + FlavorLine6 + ANSI_RESET + "\n";
            this.numScoopsAvailable = asciiArt.size() - numScoops;
            
        }
        else if(numScoops == 6)
        {
            result = ANSI_BLUE + FlavorLine1 + "\n" + FlavorLine2 +"\n" + FlavorLine3 + "\n" + FlavorLine4 + "\n" + FlavorLine5 + "\n" + FlavorLine6 + ANSI_RESET+ "\n";
            this.numScoopsAvailable = asciiArt.size() - numScoops;
        }
        

   
    }
    
}
