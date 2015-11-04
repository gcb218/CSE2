///////////////////////////////////////////////////////////////////////////////////
//Grace Butler
//Check Java Program
//
//      tenth lab assignment
//      javac Arrays.java
//  run the program
//      java Arrays//

import java.util.Scanner; //Scanner class

public class Shuffling{ //defining a class
   public static void printArray(String[] list){ //defining method used to print out the array of 52 strings
       
    
    for (int j=0; j < 52; j++){ //for loop
        System.out.println(" " +list[j]+ " "); //print out the student's names and they're random midterm grade
    }
   }

  public static void shuffle(String[] list){ //defining method
        System.out.println("Shuffled!"); //print out that it will be shuffled
 
    for(int i = 0; i< 60; i++){ //for loop used to shuffle the array of 52 strings
	    int a = (int)(Math.random()*52);
	    int b = (int)(Math.random()*52);
    	String tmp = list[a];
	    list[a] = list[b];
	    list[b] = tmp;
	    System.out.print(" " +list[b]+ " "); //print out the student's names and they're random midterm grade
    }
    System.out.println(); //print out that it will be shuffled
  }
  
  public static void randomizeHand(String[] list){ //defining method to randomly pick 5 strings
        System.out.println("Randomized hand!"); //print out that it will be shuffled
        String[] hand = new String[5]; //creating an array of 5 strings
        for(int i=0; i<5; i++){ //for loop to randomly select 5 cards and create a new array with them
            int a = (int)(Math.random()*52);
            if (list[a].equals("none")){ //checking to make sure that the same string is not selected
                i--;
                continue;
            }
	        hand[i] = list[a];
	        list[a] = "none"; 
	        System.out.print(" " +hand[i]+ " "); //print out the student's names and they're random midterm grade
        }
    
       
       
    System.out.println(); //print out that it will be shuffled
  }
  
  
  public static void main(String[] args) { // main method required for every Java program
      
    Scanner scan = new Scanner(System.in); //declaring use of scanner
    String[] suitNames={"C","H","S","D"}; //suits club, heart, spade or diamond
    String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
    String[] cards = new String[52]; //creating an array of 52 strings
    String[] hand = new String[5]; //creating an array of 5 strings
    for (int i=0; i<52; i++){ //for loop that combine suitnames and ranknames
        cards[i]=rankNames[i%13]+suitNames[i/13];
        System.out.print(cards[i]+" "); //print out array of "cards"
    }
    shuffle(cards); //calling shuffle method
    randomizeHand(cards); //calling randomizeHand method
    }
}
