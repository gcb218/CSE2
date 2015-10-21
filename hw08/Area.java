///////////////////////////////////////////////////////////////////////////////////
//Grace Butler
//Check Java Program
//
//      eigth homework assignment
//      javac Area.java
//  run the program
//      java Area//

import java.util.Scanner; //Scanner class

public class Area{ //defining a class

    public static void PrintCircleArea(double radius) { //defining method used to print the area of a circle
        System.out.println("The area of the circle = " + Math.PI*radius*radius); //Printing out the area of a circle
    }
    public static void PrintRectangleArea(double length, double width) {  //defining method used to print the area of a rectangle
        System.out.println("The area of the rectangle = " + length*width); //Prints out the area of a rectangle
    }
     public static void PrintTriangleArea(double height, double lengthBase) {  //defining method used to print the area of a triangle
        System.out.println("The area of the triangle = " + ((height*lengthBase)/2)); //prints out the area of a triangle
    }
    public static void main(String[] args) { // main method required for every Java program
        Scanner myScanner = new Scanner(System.in); //declaring use of scanner
        boolean check = true; //define check as true
        
        System.out.print("Enter the name of your desired shape: "); //print out message asking for input from user
            String area = myScanner.next(); //defining area as the user's input
        while (check){ //while loop to check the validity of input
            if (area.equals("circle") || area.equals("rectangle") || area.equals("triangle")){ //checking that user inputed the right string
                check = false;
            }
            else {
                System.out.println("Invalid input. Please try again: "); //tell user that input is invalid
                area = myScanner.next();
                check = true;
            }
        }
        double rad = 0; //defining variables
        double len = 0;
        double wid = 0;
        double height = 0;
        double lenBase = 0;
        
        if (area.equals("circle")){ 
            System.out.print("Input the radius of the circle: "); //print statement asking for input for radius from the user
                rad = myScanner.nextDouble(); 
            PrintCircleArea(rad); //print the area of the circle as definined in PrintTriangleArea method
        }
        else if (area.equals("rectangle")){
            System.out.print("Input the length of the rectangle: "); //print statement asking for input for length from the user
                len = myScanner.nextDouble();
            System.out.print("Input the width of the rectangle: "); //print statement asking for input for width from the user
                wid = myScanner.nextDouble();
            PrintRectangleArea(len, wid); //print the area of the rectangle as definined in PrintTriangleArea method

        }
        else {
            System.out.print("Input the height of the triangle: "); //print statement asking for input for height from the user
                height = myScanner.nextDouble();
            System.out.print("Input the length of the base of the triangle: "); //print statement asking for input for length from the user
                lenBase = myScanner.nextDouble();
            PrintTriangleArea(height,lenBase); //print the area of the triangle as definined in PrintTriangleArea method

        }

    }
}
