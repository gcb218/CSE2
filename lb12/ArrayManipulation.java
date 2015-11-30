///////////////////////////////////////////////////////////////////////////////////
//Grace Butler
//Check Java Program
//
//      twelfth lab assignment
//      javac ArrayManipulation.java
//  run the program
//      java ArrayManipulation//

import java.util.Scanner; //Scanner class

public class ArrayManipulation{ //defining a class

public static int[][] raggedArrray(){
    
    int maxrow = (int)(Math.random()*11+10);
    int maxcol = (int)(Math.random()*11+10);;
    int[][] matrix = new int[maxrow][maxcol];
    int variablerange = (maxrow-10)+1;
    int variablerowcount = 0;
    //System.out.println("MAXROW="+maxrow);
    //System.out.println("MAXCOL="+maxcol);
    
    for (int colnum =0; colnum < maxcol; colnum++){
        variablerowcount = (int)(Math.random()*variablerange+10);
        for (int rownum = 0; rownum <variablerowcount; rownum++) {
            int num = (int)(Math.random()*2001-1000);
            matrix[rownum][colnum] = num;
         //  System.out.print(matrix[i][j]+ " ");
         }
    }
   // System.out.println();
    return matrix;

}

public static void printArray(int matrix[][]){
    for (int row = 0; row < matrix.length; row++) {
        for (int column = 0; column < matrix[row].length;column++) {
            if (matrix[row][column] == 0){ 
                System.out.print(" "+"\t");
            }else {
                System.out.print(matrix[row][column] + "\t");
            }
        }
    System.out.println();
    }
}



public static void printArray(int[] input){ //defining method used to print out the array of 15 strings
    System.out.println("Print 1 demensional array!");

    for (int j=0; j < input.length; j++){ //for loop
        System.out.print(input[j]+"\t"); //print out the input from the user
    }
    System.out.println();
}
   
// public static int[] findSmallest(int matrix[][]){
//     for (int colnum = 0; row < matrix.length; row++) {
//         for (int rownum = 0; column < matrix[row].length;column++) {
//             if (matrix[row][column] == 0){ 
//                 System.out.print(" "+"\t");
//             }else {
//                 System.out.print(matrix[row][column] + "\t");
//             }
//         }
//     System.out.println();
//     }
// }

    public static void main(String[] args) { // main method required for every Java program
        //int a = 0;
        //int b = 0;
        int[][] matrix = raggedArrray();
        printArray(matrix);
        printArray(matrix[0]);
        
       /* int testcol[] = new int[30];
        testcol[0] = 2;
        testcol[1] = 3;
        System.out.println("ARRAY LENGTH ="+testcol.length); */
}
}

