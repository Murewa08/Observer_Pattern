/*
 * Author: Murewa Adebajo
 * The ice cream structure (cone + 6 layers of ice cream)
 */
import java.util.ArrayList;

public abstract class IceCream {
    
    protected ArrayList<String> asciiArt = new ArrayList<String>(); 
    protected int numScoops;
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_WHITE = "\u001B[37m";

    String FlavorLine6 = "(----------)";
    String FlavorLine5 = " (--------)";
    String FlavorLine4 = "  (------)";
    String FlavorLine3 = "   (----)";
    String FlavorLine2 = "    (--)";
    String FlavorLine1 = "     ()";

    String result = FlavorLine1 + "\n" + FlavorLine2 +"\n" + FlavorLine3 + "\n" + FlavorLine4 + "\n" + FlavorLine5 + "\n" + FlavorLine6 + "\n";
    public String toString()
    {

        for(int i=0; i<asciiArt.size(); i++)
        {
            result += asciiArt.get(i) + "\n";   
        }
        return result;
    }

    



}
