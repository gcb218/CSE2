///////////////////////////////////////////////////////////////////////////////////
//Grace Butler
//Check Java Program
//
//      sixth homework assignment
//      javac BarGraph.java
//  run the program
//      java BarGraph//

import java.util.Scanner; //Scanner class
import java.text.DecimalFormat; //to use later for rounding the decimal place of answers

public class BarGraph{	// main method required for every Java program
public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in); //import scanner
    double expense = 0.0; //defining variables
    double mondayExpenses = 0.0;
    double tuesdayExpenses = 0.0;
    double wednesdayExpenses = 0.0;
    double thursdayExpenses = 0.0;
    double fridayExpenses = 0.0;
    double saturdayExpenses = 0.0;
    double sundayExpenses =0.0;
    int day =0;
    for (day=1; day<=7; day++){ //set range for for loop
        switch (day){
            case 1:
              System.out.print("Expenses for Monday (xx.xx): "); //ask user to enter imput
              while (!myScanner.hasNextDouble()){ //while loop to check that the input is a double
                    System.out.print("That is not an integer. Please try again: "); //tell user that input is not a number and ask them for another input
                    myScanner.next();
               }
               expense = myScanner.nextDouble();
               mondayExpenses = expense;
            break;
            case 2:
              System.out.print("Expenses for Tuesday (xx.xx): "); //ask user to enter imput
              while (!myScanner.hasNextDouble()){  //while loop to check that the input is a double
                    System.out.print("That is not an integer. Please try again: ");  //tell user that input is not a number and ask them for another input
                    myScanner.next();
               }
               expense = myScanner.nextDouble();
               tuesdayExpenses = expense;
            break;
            case 3:
              System.out.print("Expenses for Wednesday (xx.xx): "); //ask user to enter imput
              while (!myScanner.hasNextDouble()){ //while loop to check that the input is a double
                    System.out.print("That is not an integer. Please try again: ");  //tell user that input is not a number and ask them for another input
                    myScanner.next();
               }
               expense = myScanner.nextDouble();
               wednesdayExpenses = expense;
            break;
             case 4:
              System.out.print("Expenses for Thursday (xx.xx): "); //ask user to enter imput
              while (!myScanner.hasNextDouble()){ //while loop to check that the input is a double
                    System.out.print("That is not an integer. Please try again: ");  //tell user that input is not a number and ask them for another input
                    myScanner.next();
               }
               expense = myScanner.nextDouble();
               thursdayExpenses = expense;
            break;
             case 5:
              System.out.print("Expenses for Friday (xx.xx): "); //ask user to enter imput
              while (!myScanner.hasNextDouble()){ //while loop to check that the input is a double
                    System.out.print("That is not an integer. Please try again: ");  //tell user that input is not a number and ask them for another input
                    myScanner.next();
               }
               expense = myScanner.nextDouble();
               fridayExpenses = expense;
            break;
             case 6:
              System.out.print("Expenses for Saturday (xx.xx): "); //ask user to enter imput
              while (!myScanner.hasNextDouble()){ //while loop to check that the input is a double
                    System.out.print("That is not an integer. Please try again: ");  //tell user that input is not a number and ask them for another input
                    myScanner.next();
               }
               expense = myScanner.nextDouble();
               saturdayExpenses = expense;
            break;
             case 7:
              System.out.print("Expenses for Sunday (xx.xx): "); //ask user to enter imput
              while (!myScanner.hasNextDouble()){ //while loop to check that the input is a double
                    System.out.print("That is not an integer. Please try again: "); //tell user that input is not a number and ask them for another input
                    myScanner.next();
               }
               expense = myScanner.nextDouble();
               sundayExpenses = expense;
            break;
            }
            
        if (expense < 0.0){
            System.out.println("Please only enter positive numbers. Try again:  ");  //tell user that input is not positive and ask them for another input
            day--;
        }
    }

  
    
    double avgExpenses = (mondayExpenses + tuesdayExpenses + wednesdayExpenses + thursdayExpenses + fridayExpenses + saturdayExpenses + sundayExpenses)/7 ; //caluclating average weekly expenses


    System.out.print("Mon:    ");
    if ( mondayExpenses <= 100000 && mondayExpenses >= 0 ) {
        
        char myChar = '*';

        // This while loop will run for however long depending on the value of expenses for the specific day of the week
        while(mondayExpenses > 0.01) {
        new Float( Math.round(mondayExpenses));
        System.out.print(myChar);
        mondayExpenses--;   // Decrement the value of `number` by 1.
        }
    }
    System.out.println(""); //Go to next line
    
    System.out.print("Tues:   ");
    if ( tuesdayExpenses <= 100000 && tuesdayExpenses >= 0 ) {
        
        char myChar = '*';

        // This while loop will run for however long depending on the value of expenses for the specific day of the week
        while(tuesdayExpenses > 0.01) {
        new Float( Math.round(tuesdayExpenses));
        System.out.print(myChar);
        tuesdayExpenses--;   // Decrement the value of `number` by 1.
        }
    }
    System.out.println(""); //Go to next line
  
    System.out.print("Wed:    ");
    if ( wednesdayExpenses <= 100000 && wednesdayExpenses >= 0 ) {
        
        char myChar = '*';

        // This while loop will run for however long depending on the value of expenses for the specific day of the week
        while(wednesdayExpenses > 0.01) {
        new Float( Math.round(wednesdayExpenses));
        System.out.print(myChar);
        wednesdayExpenses--;   // Decrement the value of `number` by 1.
        }
    }
    System.out.println(""); //Go to next line
    
    System.out.print("Thurs:  ");
    if ( thursdayExpenses <= 100000 && thursdayExpenses >= 0 ) {
        
        char myChar = '*';

        // This while loop will run for however long depending on the value of expenses for the specific day of the week
        while(thursdayExpenses > 0.01) {
        new Float( Math.round(thursdayExpenses));
        System.out.print(myChar);
        thursdayExpenses--;   // Decrement the value of `number` by 1.
        }
    }
    System.out.println(""); //Go to next line
    
    System.out.print("Fri:    ");
    if ( fridayExpenses <= 100000 && fridayExpenses >= 0 ) {
        
        char myChar = '*';

        // This while loop will run for however long depending on the value of expenses for the specific day of the week
        while(fridayExpenses > 0.01) {
        new Float( Math.round(fridayExpenses));
        System.out.print(myChar);
        fridayExpenses--;   // Decrement the value of `number` by 1.
        }
    }
    System.out.println(""); //Go to next line
    
    System.out.print("Sat:    ");
    if ( saturdayExpenses <= 100000 && saturdayExpenses >= 0 ) {
        
        char myChar = '*';

        // This while loop will run for however long depending on the value of expenses for the specific day of the week
        while(saturdayExpenses > 0.01) {
        new Float( Math.round(saturdayExpenses));
        System.out.print(myChar);
        saturdayExpenses--;   // Decrement the value of `number` by 1.
        }
    }
    System.out.println(""); //Go to next line
    
    System.out.print("Sun:    ");
    if ( sundayExpenses <= 100000 && sundayExpenses >= 0 ) {
        
        char myChar = '*';

        // This while loop will run for however long depending on the value of expenses for the specific day of the week
        while(sundayExpenses > 0.01) {
        new Float( Math.round(sundayExpenses));
        System.out.print(myChar);
        sundayExpenses--;   // Decrement the value of `number` by 1.
        }
    }
    System.out.println(""); //Go to next line
    
    DecimalFormat df = new DecimalFormat("###.##"); //declaring only 2 decimal places
    System.out.println("Your average daily expenses are: $" + df.format(avgExpenses)); //tell user their average expenses for the week
    
    int max = 208;
    double total=avgExpenses;
    
        System.out.print("Estimated expenditure for 4 years: $ "); //tell user their estimated expenditure for 4 years
    
    for (int i = 2; i < max; i++)//start loop at 1 and go for max times
        {
            
            double fluctuate = (Math.random()*41)-20.0;  // integer between [-20,20]
            double x = 1+(fluctuate/100.0);
            double nextWeek = avgExpenses*x;
            total+= nextWeek;
        }
         System.out.print(df.format(total));
         
    System.out.println(""); //Go to next line

        }
}