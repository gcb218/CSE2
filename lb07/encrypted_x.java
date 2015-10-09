///////////////////////////////////////////////////////////////////////////////////
//Grace Butler
//Check Java Program
//
//      seventh lab assignment
//      javac encrypted_x.java
//  run the program
//      java encrypted_x//

import java.util.Scanner; //Scanner class

public class encrypted_x{	// main method required for every Java program
public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in); //declaring use of scanner
    boolean check = true;
    int size = 0;
    while (check){
           System.out.print("Enter a number between 0 and 100: "); //ask user for a number between 0 and 100
            if (myScanner.hasNextInt()){
                size = myScanner.nextInt();
                if(size > 0 && size <= 100){
                    check = false;
                }
                else {
                    System.out.println("That is invalid input. Please try again: ");
                }
            }
            else {
                    System.out.println("That is invalid input. Please try again: ");           
                    
                    myScanner.next();
            }

   for(int i = 0; i < size; i++) {
      for(int j = 0; j < size; j++) {
            if (j==i){
                System.out.print("  ");           
            }
            else if (j==size-i-1){
                System.out.print("  ");           
            }
            else{
                System.out.print("*");           
            }
        }
        System.out.println(" ");
    }
    
}
}
}
