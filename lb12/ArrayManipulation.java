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

public static void raggedArrray(int[][] memArray, int a, int b){
    
    int x = (int)(Math.random()*20+10);
    int y = (int)(Math.random()*20+10);;
    int[][] matrix = new int[x][y];
    //int[][] stuff = new int[x][num];
    
    for (int i =0; i < x; i++){
        for (int j = 0; j <y; j++) {
            int num = (int)(Math.random()*1000-2000);
            matrix[i][j] = num;
            System.out.print(matrix[i][j]);

    }
}
    System.out.println();

}

public static int[][] printArray(int matrix[][]){
    for (int row = 0; row < matrix.length; row++) {
        for (int column = 0; column < matrix[row].length;column++) {
        System.out.println(matrix[row][column] + " ");
    }
    System.out.println();
}
return printArray(matrix);
}

public static void printArray(int[] input){ //defining method used to print out the array of 15 strings
    
    for (int j=0; j < input.length; j++){ //for loop
        System.out.print(" " +input[j]+ " "); //print out the input from the user
    }
   }
   
    public static void main(String[] args) { // main method required for every Java program
        int a = 0;
        int b = 0;
        int[][] matrix = new int[a][b];
        

    
    raggedArrray(matrix, a, b);
    printArray(matrix);
}
}
