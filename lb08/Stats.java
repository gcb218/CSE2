///////////////////////////////////////////////////////////////////////////////////
//Grace Butler
//Check Java Program
//
//      eigth lab assignment
//      javac Stats.java
//  run the program
//      java Stats//

import java.util.Scanner; //Scanner class

public class Stats{	// main method required for every Java program

   public static double mean(double input1, double input2, double input3, double input4, double input5) {
        double meanValue = ((input1 + input2 + input3 + input4 + input5)/5);
        return meanValue;
    }
    public static double median(double input1, double input2, double input3, double input4, double input5) {
        double medianValue = input3;
        return medianValue;
    }
     public static void print(double meanValue, double medianValue) {
        System.out.println("The mean is "+meanValue+ " and the median is "+medianValue);
    }
    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in); //declaring use of scannerpublic double findAvg( int a, int b ){
	boolean check = true;
	boolean check1 = true;
	boolean check2 = true;
	boolean check3 = true;

    double a = 0; 
    double b = 0;
    double c = 0;
    double d = 0;
    double e = 0;
    while (check){
           System.out.print("Input the 1st of 5 doubles that will have increasing value: "); //ask user for 5 inputs with increasing values
           a = myScanner.nextDouble();
           System.out.print("Input the 2nd of 5 doubles that will have increasing value: "); //ask user for 5 inputs with increasing values
            if (myScanner.hasNextDouble()){
                b = myScanner.nextDouble(); //b is equivalent to input from user
                if(b > a){  //check to ensure that input is valid
                    check = false;
                }
                else{
                    System.out.println("This is not greater than the 1st input. Please try again: "); //tell user that input is invalid
                    myScanner.next();
                }
             }
             else{
                    System.out.println("This is not greater than the 1st input. Please try again: "); //tell user that input is invalid
                    myScanner.next();
               }
            }
        while (check1){
           System.out.print("Input the 3rd of 5 doubles that will have increasing value: "); //ask user for 5 inputs with increasing values
            if (myScanner.hasNextDouble()){
                c = myScanner.nextDouble(); //c is equivalent to input from user
                if(c > b){  //check to ensure that input is valid
                    check1 = false;
                }
                else{
                    System.out.println("This is not greater than the 2nd input. Please try again: "); //tell user that input is invalid
                    myScanner.next();
                }
             }
             else{
                    System.out.println("This is not greater than the 2nd input. Please try again: "); //tell user that input is invalid
                    myScanner.next();
               }
            }
        while (check2){
           System.out.print("Input the 4th of 5 doubles that will have increasing value: "); //ask user for 5 inputs with increasing values
            if (myScanner.hasNextDouble()){
                d = myScanner.nextDouble(); //length is equivalent to input from user
                if(d > c){  //check to ensure that input is valid
                    check2 = false;
                }
                else{
                    System.out.println("This is not greater than the 4th input. Please try again: "); //tell user that input is invalid
                    myScanner.next();
                }
             }
             else{
                    System.out.println("This is not greater than the 4th input. Please try again: "); //tell user that input is invalid
                    myScanner.next();
               }
            }
        while (check3){
           System.out.print("Input the 5th of 5 doubles that will have increasing value: "); //ask user for 5 inputs with increasing values
            if (myScanner.hasNextDouble()){
                e = myScanner.nextDouble(); //length is equivalent to input from user
                if(e > d){  //check to ensure that input is valid
                    check3 = false;
                }
                else{
                    System.out.println("This is not greater than the 4th input. Please try again: "); //tell user that input is invalid
                    myScanner.next();
                }
             }
             else{
                    System.out.println("This is not greater than the 4th input. Please try again: "); //tell user that input is invalid
                    myScanner.next();
               }
            }
            
            double mean = mean(a, b, c, d, e);
            double median = median(a, b, c, d, e);
            print(mean, median);

   

}
}
