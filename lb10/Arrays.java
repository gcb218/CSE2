///////////////////////////////////////////////////////////////////////////////////
//Grace Butler
//Check Java Program
//
//      tenth lab assignment
//      javac Arrays.java
//  run the program
//      java Arrays//

import java.util.Scanner; //Scanner class

public class Arrays{ //defining a class
public static void main(String[] args) { // main method required for every Java program

    Scanner myScanner = new Scanner(System.in); //declaring use of scanner

    int students1 = (int) (Math.random()*5+5);  // integer between [5,10]

    String[] students;	// declaration
    students = new String[students1];
    System.out.println("Enter " +students1+ " student names: "); 
   
    for (int i=0; i < students1; i++){ //for loop
            students[i] = myScanner.nextLine(); //input is defined as the input from the user
    }

    int[] midterm;	// declaration
    midterm = new int[students1];
    
    for (int j=0; j < students1; j++){ //for loop
        midterm[j] = (int)(Math.random()*100); // integer between [0,100]
        System.out.println(students[j]+ ":" +midterm[j]); //print out the student's names and they're random midterm grade
    }
}
}