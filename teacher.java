package observer;
public class teacher implements Observer{
    
    /*A character from Happy Little City
     * author: Murewa Adebajo
     */


     /*
      * It registers the teacher to receive news from both the greeter and watchman
      * @ params watchman: The character that brings good news , Greeter: The character that brings bad news 
      */
     public teacher(Subject watchman, Subject Greeter)
     {
        watchman.registerObserver(this);
        Greeter.registerObserver(this);
     }

     /*
      * It prints out the actions the teacher would take depending on the situation
      * @ params warning:The type of news (good or bad) , note: The number of times the trumpet was played
      */
     public void update(boolean warning, int note)
     {
        if(warning == false && note == 1)
        {
            System.out.println("Teacher: Engages children in an activity so they do not get distracted.");
        }
        else if(warning == false && note == 2)
        {
            System.out.println("Teacher: Gathers children, and makes way for a formal greeting on the street.");
        }
        else if(warning == true && note == 1)
        {
            System.out.println("Teacher: Helps get every kid home safe.");
        }
        else if(warning == true && note == 2)
        {
            System.out.println("Teacher: Brings all students to the underground shelter.");
        }
     }
}
