///////////////////////////////////////////////////////////////////////////////////
//Grace Butler
//Block Java Program
//
//      third homework assignment
//      javac Block.java
//  run the program
//      java Block//

import java.util.Scanner; //Scanner class


    public class Block{
    			// main method required for every Java program
   	public static void main(String[] args) {
   	    
    Scanner myScanner = new Scanner( System.in ); //declaring use of scanner

System.out.print("Enter the length of the block: "); //prompt asks the user for the length of block
double blockLength = myScanner.nextDouble();

System.out.print("Enter the width of the block: ");
double blockWidth = myScanner.nextDouble();

System.out.print("Enter the height of the block: ");
double blockHeight = myScanner.nextDouble();

double volume; //defining volume as a double
double surfaceArea; //defining surfaceArea as a double
volume = blockLength*blockWidth*blockHeight; //Calculating the volume of a block
surfaceArea = 6*(blockLength*blockWidth); //Calculating surface area of a block

        System.out.print("The volume of the block of dimensions " +blockLength+ 'x' +blockWidth+ 'x' +blockHeight+ " is "+volume+". "); //calculates volume of block with given dimensions
        System.out.println("\n"); //printing onto the next line
        System.out.print("The surface area of the block is " +surfaceArea+"."); //printing out the calculated surface area of the block
        System.out.println("\n");

}  //end of main method   
  	} //end of class

