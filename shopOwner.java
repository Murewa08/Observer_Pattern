package observer;
public class shopOwner implements Observer {
    
    /*A character from Happy Little City
     * author: Murewa Adebajo
     */


     /*
      * It registers the shop owner to receive news from both the greeter and watchman
      * @ params watchman: The character that brings good news , Greeter: The character that brings bad news 
      */
     public shopOwner(Subject watchman, Subject Greeter)
     {
        watchman.registerObserver(this);
        Greeter.registerObserver(this);
     }

     /*
      * It prints out the actions the shop owner would take depending on the situation
      * @ params warning:The type of news (good or bad) , note: The number of times the trumpet was played
      */
     public void update(boolean warning, int note)
     {
        if(warning == false && note == 1)
        {
            System.out.println("Shop Owner: Add finest displays in shop window to attract the messengers attention.");
        }
        else if(warning == false && note == 2)
        {
            System.out.println("Shop Owner: Make way for a formal greeting on the street.");
        }
        else if(warning == true && note == 1)
        {
            System.out.println("Shop Owner: Close down shop and head home.");
        }
        else if(warning == true && note == 2)
        {
            System.out.println("Shop Owner: Drops everything and find nearest hideout.");
        }
     }
}
