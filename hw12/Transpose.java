///////////////////////////////////////////////////////////////////////////////////
//Grace Butler
//Check Java Program
//
//      twelfth homework assignment
//      javac Transpose.java
//  run the program
//      java Transpose//

import java.util.Scanner; //Scanner class

public class Transpose{ //defining a class

public static int[][] randomMatrix(int a, int b){ //defining method used to crete matrix
    
int[][] matrix = new int[b][a]; //declaration
  
    for (int row =0; row < matrix.length; row++){ //for loop that generates random matrix
        for (int column = 0; column < matrix[row].length; column++) {
            matrix[row][column] = (int)(Math.random()*20-10);
    }
}
return matrix; //return the matrix to the main method
}

public static void printMatrix(int[][] matrix, int a, int b){ //defining method used to print out random matrix
    for(int row = 0; row < matrix.length; row++){ //for loop used to print matrix
            System.out.print("["); //print statement
        for (int column = 0; column < matrix[row].length; column++){ 
            if (matrix[row].length != matrix[0].length){
                System.out.println("This matrix is not rectangular!"); //print that matrix is not rectangular
            }
            System.out.print(matrix[row][column] + "  "); //print value of matrix
        }
            System.out.print("]\n"); //print statement
    }
    
}

    


public static int[][] transposeMatrix(int[][] matrix){ //defining method used to transpose matrix

    
  if (matrix == null || matrix.length == 0)//empty or unset array, nothing do to here
  return matrix;

  int width = matrix.length; //defining variables
  int height = matrix[0].length;

  int[][] matrix_new = new int[height][width]; //declaring new matrix

  for (int x = 0; x < width; x++) { //for loop used to transpose matrix
    for (int y = 0; y < height; y++) {
      matrix_new[y][x] = matrix[x][y];
    }
  }
  return matrix_new; //return the transposed matrix to the main method
}
 



public static void main(String[] args) { //defining main method
    Scanner myScanner = new Scanner(System.in); //declaring use of scanner
    boolean check = true;
    boolean check2 = true;
    int width = 0; //how many characters the pattern should spread horizontally 
    int height = 0; //how many characters the pattern should spread vertically 
    while (check){
           System.out.print("Input your desired width: "); //ask user for a width
            if (myScanner.hasNextInt()){
                width = myScanner.nextInt(); //width is equivalent to input from user
                if(width > 0){  //check to ensure that input is valid
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
            System.out.print("Input your desired height: "); //ask user for a width
             if (myScanner.hasNextInt()){
                height = myScanner.nextInt(); //width is equivalent to input from user
                if(height > 0){ //check to ensure that input is valid
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
    final int[][] x = randomMatrix(width, height); //declaring the matrix as final
    System.out.println("Printed Matrix!"); //print statement

    printMatrix(x, width, height); //calling printMatrix method
    System.out.print("Transposed!"); //print statement
    transposeMatrix(x); //calling transposeMatrix method
    int[][] a = transposeMatrix(x); // call
    System.out.println(""); //print a line
    for (int i = 0; i < a.length; i++) { //for loop used to print transposed matrix
        System.out.print("["); //print bracket
    for (int y = 0; y < a[0].length; y++) {
         System.out.print(a[i][y] + "  ");
    }
         System.out.print("]\n"); //print bracket
    } 

}
}