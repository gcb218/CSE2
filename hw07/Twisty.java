///////////////////////////////////////////////////////////////////////////////////
//Grace Butler
//Check Java Program
//
//      seventh homework assignment
//      javac Twisty.java
//  run the program
//      java Twisty//

import java.util.Scanner; //Scanner class

public class Twisty{	// main method required for every Java program
public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in); //declaring use of scanner
    boolean check = true;
    boolean check2 = true;
    int length = 0; //how many characters the pattern should spread horizontally 
    int width = 0; //how many characters the pattern should spread vertically 
    while (check){
           System.out.print("Input your desired length: "); //ask user for a length
            if (myScanner.hasNextInt()){
                length = myScanner.nextInt(); //length is equivalent to input from user
                if(length > 0 && length <= 80){  //check to ensure that input is valid
                    check = false;
                }
                else {
                    System.out.println("That is invalid input. Please try again: "); //tell user that input is invalid
                    myScanner.next();

                }
            }
            else {
                    System.out.println("That is invalid input. Please try again: ");  //tell user that input is invalid          
                    myScanner.next();
            }
            }
    while (check2){
            System.out.print("Input your desired width: "); //ask user for a width
             if (myScanner.hasNextInt()){
                width = myScanner.nextInt(); //width is equivalent to input from user
                if(width > 0 && width < length){ //check to ensure that input is valid
                    check2 = false;
                }
                else {
                    System.out.println("That is invalid input. Please try again: "); //tell user that input is invalid
                    myScanner.next();
                }
            }
            else {
                    System.out.println("That is invalid input. Please try again: "); //tell user that input is invalid
                    myScanner.next();
            }
        }
    int hash1 = 1; //declare variables
    int forwardSlash = width;
    int backSlash = width+1;
    int hash2 = (width*2);
    
        for(int i = 1; i <= width; i++) { //for loop to set up pattern of hashes and slashes
            for(int j = 1; j <= length; j++) {
                if (j%(width*2) == hash1) {
                    System.out.print("#"); //print out a hashtag        
                }
                else if (j% (width*2) == forwardSlash) {
                    System.out.print("/"); //print out a forward slash
                }
                else if (j% (width*2) == backSlash) {
                    System.out.print("\\"); //print out a backwards slash
                }
                else if (j% (width*2) == hash2) {
                    System.out.print("#"); //print out a hashtag
                }
                else{
                    System.out.print(" "); //print out a space
                }
            }
            hash1++; //increment by 1 
            forwardSlash--; //decrement by 1
            backSlash++; //increment by 1
            hash2--; //decrement by 1
            System.out.print("\n"); //go to next line 
            
        }
    }
}