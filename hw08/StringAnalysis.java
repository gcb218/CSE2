///////////////////////////////////////////////////////////////////////////////////
//Grace Butler
//Check Java Program
//
//      eigth homework assignment
//      javac StringAnalysis.java
//  run the program
//      java StringAnalysis//

import java.util.Scanner; //Scanner class

public class StringAnalysis{ //defining a class

    public static int analysis(String a) { //defining method used to analyze all of the string
        int count = 0; //define variable
        for (int i=0; i < a.length(); i++){ //for loop used to analyze each character of the String input from the user
            if (Character.isLetter(a.charAt(i))){
                count++; //increment count
            }
        }
        return count; 
    }
    
    public static int analysis(String a, int number) { //defining method used to analyze a certain amount of the string
        int count = 0; //define variable
        for (int i=0; i < number; i++){ //for loop used to analyze a specific number of characters of the String input from the user
            if (Character.isLetter(a.charAt(i))){
                count++; //increment count
            }
        }
        return count;
    }
       
public static void main(String[] args) { // main method required for every Java program
    Scanner myScanner = new Scanner(System.in); //declaring use of scanner
        boolean check = true;  //define variable
    System.out.println("If you want to evaluate all characters type all, if you want to evalute only some characters type some: "); //print statement asking for input from user
     String input = myScanner.next(); //input is defined as the input from the user
        while (check){ //while loop to check that the string inputed is equal to 'all' or 'some'
            if (input.equals("all") || input.equals("some")){ 
                check = false; 
            }
            else {
                System.out.println("Invalid input. Please enter some or all: "); //tell user that input is invalid
                input = myScanner.next();
                check = true;
            }
        }
        
    if (input.equals("all")){ 
            System.out.print("Please enter a string: "); //print statement asking for a string from the user
                String a = myScanner.next(); //a is defined as the input from the user
                System.out.println("The number of letters is " + analysis(a)); //print statement that tells user the number of letters in their string

        }
        else {
            System.out.print("Please enter a string: "); //print statement asking for a string from the user
                String a = myScanner.next(); //a is defined as the input from the user
            System.out.print("Please enter a number: "); //print statement asking for a number from the user
                int number = myScanner.nextInt();
            System.out.println("The number of letters is " + analysis(a, number)); //print statement that tells user the number of letters in their string depending on how many characters were evaluated 

        }    
        
    }
}