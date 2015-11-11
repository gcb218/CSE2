///////////////////////////////////////////////////////////////////////////////////
//Grace Butler
//Check Java Program
//
//      eleventh homework assignment
//      javac CSE2Linear.java
//  run the program
//      java CSE2Linear//

import java.util.Scanner; //Scanner class
import java.util.Random; //Random class

public class CSE2Linear{ //defining a class
 
public static void printArray(int[] input){ //defining method used to print out the array of 15 strings
    
    for (int j=0; j < 15; j++){ //for loop
        System.out.print(" " +input[j]+ " "); //print out the input from the user
    }
   }
   
public static void findNumber(int[] input, int number){ //defining method used to search the array of 15 strings for a number
        int iteration = 0;
        for(int i=0; ; i++){ //for loop
            int x = input[i];
            iteration++; //incremend
            if (x == number){ //if statement
                System.out.println(number+" was found in the list with " +iteration+ " iterations."); //print out that number has been found
                break;
            }
            while (x > number){ //while loop
                System.out.println(number+" was not found in the list with " +iteration+ " iterations."); //print out that number has not been found
                break;
            }
            
        }
}
public static void scrambled(int[] input){ //defining method
	Random r = new Random();  // Random number generator
	int index, tmp;
    for (int i = input.length - 1; i > 0; i--){ //for loop used to shuffle the array of 15 strings
	    index = r.nextInt(i + 1);
        tmp = input[index];
	    input[index] = input[i];
	    input[i] = tmp;
	    System.out.print(" " +input[i]+ " "); //print out the scrambled array of 15 strings
    }
    System.out.print(""); //print out a line

}

public static void findNumber2(int[] input, int number2){ //defining method
       int loc = 0;
       for ( ; loc <input.length; loc++){ //for loop to go through each integer in the array
        if(number2 == input[loc]){ //if statement
            System.out.println(number2+" was found in the list with " +loc+ " iterations."); //print out that number has been found
            break;
        }
        }
        System.out.println(number2+" was not found in the list with " +loc+ " iterations."); //print out that number has not been found
               

}

public static void main(String[] args) { // main method required for every Java program
      
    Scanner myScanner = new Scanner(System.in); //declaring use of scanner
    boolean check = true; //definining variables
    int input1 = 15;
    int[] input;	// declaration
    input = new int[input1];
    int previous = 0;
    
    
   while (check){ //while loop to check input from user
    System.out.println("Enter 15 integers for the students' final grades in CSE2: "); //print statement asking for input
    for (int i=0; i < 15; i++){ //for loop
        if (myScanner.hasNextInt()){ //if statement checking that the input is an integer
            input[i] = myScanner.nextInt(); //input is defined as the input from the user
            int x = input[i];
            
            if (x < previous){ //if statement checking that input is increasing
                 System.out.println("The input you entered is not an increasing integer. Please try again: "); //tell user that input is invalid
                    myScanner.next();
            }else{
                check = false; //if input is valid, keep going
            }
            
            previous = input[i];
            
            if(x > 0 && x <= 100){ //if statement checking that numbers are withing the range of 0 to 100
               check = false; //if input is valid, keep going
            }
        
            else {
             System.out.println("The input you entered is out of the range from 0-100. Please try again: "); //tell user that input is invalid
                    myScanner.next();
            }
        }
        else {
             System.out.println("That is invalid input. Please try again: ");  //tell user that input is invalid          
                    myScanner.next();
            }
        }
   }
        System.out.println("Sorted:");  //tell user that input is invalid          
        printArray(input); //calling the print method
        System.out.println("");  //tell user that input is invalid
        System.out.println("Enter a number to be searched for: ");  //tell user that input is invalid          
                    int num = myScanner.nextInt();
        findNumber(input, num); //calling the find number method
        System.out.println("Screambled:");  //tell user that input is invalid          
        scrambled(input); //calling the find number method
        System.out.println("");  //tell user that input is invalid
        System.out.println("Enter a number to be searched for: ");  //tell user that input is invalid          
                    int num2 = myScanner.nextInt();
       findNumber2(input, num2); //calling the find number method
        
}
}