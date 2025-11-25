package observer;
public class Greeter extends Subject {
    
    /*A character in Happy Little City that informs the Observers 
     *knght, teacher, and shop owner of one of two good news
     * author: Murewa Adebajo
     */

     /*
      * It plays the trumpet fanfare sound once to inform of a messenger, 
      * and twice for the Royal family approaching
      * @param note: The number of times the trumpet is played 
      */
     public void issueNotice(int note)
     {
        if(note == 1)
        {
            System.out.println("Trumpet fanfare is played 1 time(s).");
            Trumpet.play(false,1);
            notifyObservers(note);
        }
        else if(note == 2)
        {
            System.out.println("Trumpet fanfare is played 2 time(s).");
            Trumpet.play(false, 2);
            notifyObservers(note);
        }
        
     }

     /*
      * It sends out the news to the knight, teacher, and shop owner from the greeter from the wall
      * @ param note: The number of times the trumpet is played
      */
     public void notifyObservers(int note)
     {
        if(note == 1)
        {
            for(Observer observer: observers)
            {
                observer.update(false, 1);
            }
        }
        else if(note == 2)
        {
            for(Observer observer: observers)
            {
                observer.update(false, 2);
            }
        }
        
     }
}
