package observer;
public interface Observer {
    
    /*It contains an update method which its children, shop owner, teacher, and knight must implement
     * author: Murewa Adebajo
     * @ params warning:The type of news (good or bad) , note: The number of times the trumpet was played 
     */

     public void update(boolean warning, int note);
}
