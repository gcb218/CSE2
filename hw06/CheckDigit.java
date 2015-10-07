///////////////////////////////////////////////////////////////////////////////////
//Grace Butler
//Check Java Program
//
//      sixth homework assignment
//      javac CheckDigit.java
//  run the program
//      java CheckDigit//

import java.util.Scanner; //Scanner class

public class CheckDigit{	// main method required for every Java program
public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in); //declaring use of scanner
    System.out.print("Enter a 10 digit number: "); //ask user for 10 digit number
        String isbn = myScanner.next();
    while(isbn.length()!=10){ //loop to determine whether input is 10 digits
        System.out.print("That is invalid input. Please try again: "); //if input was not 10 digits, tell user to input another number
        myScanner.next();
    }
    char A = '+'; //defining variables
    int one = 0;
    int two = 0;
    int three = 0;
    int four = 0;
    int five = 0;
    int six = 0;
    int seven = 0;
    int eight = 0;
    int nine = 0;
    int ten = 0;
    int x = 10; 
    int summation = 0;
    for (int i=0; i<=9; i++){ //for loop to go through each digit from the 10 digit input
        switch (i){
            case 0:
                A = (isbn.charAt(i));
                one = Character.getNumericValue(A); //find out the numerical value of the 1st number in the 10 digit number
                summation += (x*one); 
                x--; //decrement
                break;
            case 1:
                A = (isbn.charAt(i));
                two = Character.getNumericValue(A); //find out the numerical value of the 2nd number in the 10 digit number
                summation += (x*two);
                x--;
                break;
            case 2:
                A = (isbn.charAt(i));
                three = Character.getNumericValue(A); //find out the numerical value of the 3rd number in the 10 digit number
                summation += (x*three);
                x--; //decrement
                break;
            case 3:
                A = (isbn.charAt(i));
                four = Character.getNumericValue(A); //find out the numerical value of the 4th number in the 10 digit number
                summation += (x*four);
                x--; //decrement
                break;
            case 4:
                A = (isbn.charAt(i));
                five = Character.getNumericValue(A); //find out the numerical value of the 5th number in the 10 digit number
                summation += (x*five);
                x--; //decrement
                break;
            case 5:
                A = (isbn.charAt(i));
                six = Character.getNumericValue(A); //find out the numerical value of the 6th number in the 10 digit number
                summation += (x*six);
                x--; //decrement
                break;
            case 6:
                A = (isbn.charAt(i));
                seven = Character.getNumericValue(A); //find out the numerical value of the 7th number in the 10 digit number
                summation += (x*seven);
                x--; //decrement
                break;
            case 7:
                A = (isbn.charAt(i));
                eight = Character.getNumericValue(A); //find out the numerical value of the 8th number in the 10 digit number
                summation += (x*eight);
                x--; //decrement
                break;
            case 8:
                A = (isbn.charAt(i));
                nine = Character.getNumericValue(A); //find out the numerical value of the 9th number in the 10 digit number
                summation += (x*nine);
                x--; //decrement
                break;
            case 9:
                A = (isbn.charAt(i));
                if (A=='X'){ //if a digit inputed was X
                    ten=10; //the value of X is 10
                }
                else{
                    ten = Character.getNumericValue(A); 
                }
                break;
            }
            
        }
        int checkValue = (summation%11); //determining remainder of summation mod 11
        if (checkValue == ten){ 
            System.out.println("This IS a valid ISBN!"); //tell user that the 10 digit number they inputed is not a valid ISBN number 
        } else {
            if (checkValue==10){
                System.out.println("This IS NOT a valid ISBN! The Check Digit should be X"); //tell user of the Check Digit that will make the input a valid ISBN
            } else{
            System.out.println("This IS NOT a valid ISBN! The Check Digit should be " + checkValue); //tell user of the Check Digit that will make the input a valid ISBN
            
        }
    }
    }
}