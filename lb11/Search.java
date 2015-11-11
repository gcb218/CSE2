///////////////////////////////////////////////////////////////////////////////////
//Grace Butler
//Check Java Program
//
//      eleventh lab assignment
//      javac Search.java
//  run the program
//      java Search//

import java.util.Scanner; //Scanner class
import java.util.Random;

public class Search{ //defining a class

   public static void findMinMax(int[] array1){
        int min=array1[0];
        int max=array1[0];
        for(int ii=0;ii<array1.length;ii++){
            if(array1[ii]<min){
                min=array1[ii];
            }
            else if(array1[ii]>max){
                max=array1[ii];
            }
        }
        System.out.println("The minimum in the array1: "+min);
        System.out.println("The maximum in the array1: "+max);
    }
    public static void findMinMax2(int[] array2){
        int min=array2[0];
        int max=array2[0];
        for(int ii=0;ii<array2.length;ii++){
            if(array2[ii]<min){
                min=array2[ii];
            }
            else if(array2[ii]>max){
                max=array2[ii];
            }
        }
        System.out.println("The minimum in the array2: "+min);
        System.out.println("The maximum in the array2: "+max);
    }


public static void main(String[] args) { // main method required for every Java program
      
    Scanner scan = new Scanner(System.in); //declaring use of scanner
    

    int[] array1 = new int[5000]; //declaration
    int[] array2 = new int[5000]; //declaration

    for (int i=0; i<5000; i++){ //for loop that combine suitnames and ranknames
        array1[i] = (int) (Math.random()*100000);  // integer between [0,10000]a;
    }
     findMinMax(array1);
     findMinMax2(array2);
     int number = 0;
     for (int i=0; i<5000; i++){
             array2[i] = (int) (Math.random()*100000-number)+number;  // integer between [0,10000]a;
             number = array2[i];
         }
     }
}
