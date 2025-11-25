package observer;
import java.util.ArrayList; 

public abstract class Subject {
    /*It contains an array list in which a character can be 
    added, removed, and notified about news in Happy Little City
     * author: Murewa Adebajo
     */

     ArrayList<Observer> observers;//The array lists which stores the characters that register for news

     /*
      * It creates an array list where the characters will be added
      */
     public Subject()
     {
        observers = new ArrayList<Observer>();
     }

     /*
      * It adds/registers a character to the Observer array list
      *@param observer: A character that is stored in the array list
      */
     public void registerObserver(Observer observer)
     {
        observers.add(observer);
     }

     /*
      * It removes a character from the Observer array list
      *@param observer: A character that is currently stored in the array list that is to be removed
      */
     public void removeObserver(Observer observer)
     {
        observers.remove(observer);
     }

     /*
      * It represents the news using either of two trumpet sounds 
      */
     public abstract void issueNotice(int note);

     /*
      * It informs the characters in the Observer array list of the news
      */
     public abstract void notifyObservers(int note);
}
