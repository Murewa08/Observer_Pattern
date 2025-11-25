/*
 * Author: mMurewa Adebajo
 * The class that retrieves the structure of the ice cream from the cone.txt file
 */
import java.text.Annotation;

public class Cone extends IceCream{
    public static final String ANSI_BROWN = "\u001B[38;5;130m";
    public static final String ANSI_RESET = "\u001B[0m";

    public Cone()
    {
        asciiArt = FileReader.getLines("decorator/txt/cone.txt");
        String firstLine = ANSI_BROWN + asciiArt.get(0);
        asciiArt.set(0, firstLine);
        String lastLine = asciiArt.get(asciiArt.size()-1) + ANSI_RESET;
        asciiArt.set(asciiArt.size() - 1, lastLine);
    }

    
}
