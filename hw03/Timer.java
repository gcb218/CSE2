///////////////////////////////////////////////////////////////////////////////////
//Grace Butler
//Timer Java Program
//
//      third homework assignment
//      javac Timer.java
//  run the program
//      java Timer//

import java.util.Scanner; //Scanner class


//  define a class
public class Timer{

   public static void main(String [] args) {

            Scanner in = new Scanner(System.in); //declaring use of scanner
            System.out.println("Enter the current time (in the form HHMM): "); //prompt asking user for current time
            int currentTime = in.nextInt();

            System.out.println("Enter the time that you will be eating dinner(in the form HHMM): "); //prompt asking user for time of dinner
            int dinnerTime = in.nextInt();

            int currentHour = currentTime / 100; //

            int currentMinute = currentTime % 100;

            int dinnerHour = dinnerTime / 100;

            int dinnerMinute = dinnerTime % 100;

            System.out.println("You have" + ( dinnerHour - currentHour ) + " hours and " + ( dinnerMinute - currentMinute ) + " minutes until dinner."  ); 
       }
}