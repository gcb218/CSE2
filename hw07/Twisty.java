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
           System.out.print("Input your desired length: "); //ask user for a number between 0 and 100
            if (myScanner.hasNextInt()){
                length = myScanner.nextInt();
                if(length > 0 && length <= 80){
                    check = false;
                }
                else {
                    System.out.println("That is invalid input. Please try again: ");
                    myScanner.next();

                }
            }
            else {
                    System.out.println("That is invalid input. Please try again: ");           
                    myScanner.next();
            }
            }
    while (check2){
            System.out.print("Input your desired width: "); //ask user for a number between 0 and 100
             if (myScanner.hasNextInt()){
                width = myScanner.nextInt();
                if(width > 0 && width < length){
                    check2 = false;
                }
                else {
                    System.out.println("That is invalid input. Please try again: ");
                    myScanner.next();
                }
            }
            else {
                    System.out.println("That is invalid input. Please try again: ");           
                    myScanner.next();
            }
        }
    int hash1 = 1;
    int forwardSlash = width;
    int backSlash = width+1;
    int hash2 = (width*2);
    
        for(int i = 1; i <= width; i++) {
            for(int j = 1; j <= length; j++) {
                if (j%(width*2) == hash1) {
                    System.out.print("#");           
                }
                else if (j% (width*2) == forwardSlash) {
                    System.out.print("/");           
                }
                else if (j% (width*2) == backSlash) {
                    System.out.print("\\");           
                }
                else if (j% (width*2) == hash2) {
                    System.out.print("#");  
                }
                else{
                    System.out.print(" ");
                }
            }
            hash1++;
            forwardSlash--;
            backSlash++;
            hash2--;
            System.out.print("\n");
            
        }
    }
}