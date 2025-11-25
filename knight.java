package observer;

public class knight implements Observer{
    
    /*A character from Happy Little City
     * author: Murewa Adebajo
     */


     /*
      * It registers the knight to receive news from both the greeter and watchman
      * @ params watchman: The character that brings good news , Greeter: The character that brings bad news 
      */

     public knight(Subject watchman, Subject Greeter)
     {
        watchman.registerObserver(this);
        Greeter.registerObserver(this);
     }

     /*
      * It prints out the actions the knight would take depending on the situation
      * @ params warning:The type of news (good or bad) , note: The number of times the trumpet was played
      */
     public void update(boolean warning, int note)
     {
        if(warning == false && note == 1)
        {
            System.out.println("Knight: Meet the messenger and direct them to the castle.");
        }
        else if(warning == false && note == 2)
        {
            System.out.println("Knight: Gather the charriot for a formal entry.");
        }
        else if(warning == true && note == 1)
        {
            System.out.println("Knight: Helps everyone get home safe.");
        }
        else if(warning == true && note == 2)
        {
            System.out.println("Knight: Prepares for battle.");
        }
     }
}
