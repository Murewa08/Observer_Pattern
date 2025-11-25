/*
 * Author: Murewa Adebajo
 * The class that adds the layers of different flavors of ice cream. It is the parent of Blueberry, Strawberry, and Vanilla
 */
public abstract class ScoopDecorator extends IceCream 
{
    
    protected IceCream iceCream;
    protected int numFlavorScoops;
    protected int numScoopsAvailable;


    public ScoopDecorator(IceCream iceCream, int numScoops)
    {
        this.iceCream = iceCream;
        numFlavorScoops = numScoops;
        this.numScoops = iceCream.numScoops + numScoops;
        this.asciiArt = iceCream.asciiArt;
        numScoopsAvailable = asciiArt.size();

        //now in children add the ascii art for the scoopes too
    } 
    

            
}



