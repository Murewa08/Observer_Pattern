package observer;
public class Watchman extends Subject {
    
    /*A character in Happy Little City that informs the Observers 
     *knght, teacher, and shop owner of one of two bad news
     * author: Murewa Adebajo
     */

     /*
      * It plays the trumpet sound once to inform of an army coming , 
      * and twice about the city being breached
      * @param note: The number of times the trumpet is played 
      */
     public void issueNotice(int note)
     {
        if(note == 1)
        {
            System.out.println("Trumpet is honked 1 time(s).");
            Trumpet.play(true,1);
            notifyObservers(note);
        }
        else if(note == 2)
        {
            System.out.println("Trumpet is honked 2 time(s).");
            Trumpet.play(true, 2);
            notifyObservers(note);
        }
     }

     /*
      * It sends out the news to the knight, teacher, and shop owner from the watchman from the wall
      * @ param note: The number of times the trumpet is played
      */
     public void notifyObservers(int note)
     {
        if(note == 1)
        {
            for(Observer observer: observers)
            {
                observer.update(true, 1);
            }
        }
        else if(note == 2)
        {
            for(Observer observer: observers)
            {
                observer.update(true, 2);
            }
        }
     }
}
