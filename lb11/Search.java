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
    public static void findNumber(int[] input, int number){ //defining method used to search the array of 15 strings for a number
       
            int low = 0; //defining variables
            int high = input.length - 1;
           
            
            while(low <= high){ //while loop
                int mid = low + (high - low) / 2;
                if (number < input[mid]){
                    high = mid - 1;
                } else if (number > input[mid]){
                    low = mid + 1;
    
                } else if (number == input [mid]){
                   System.out.println(number+" was found in the list."); //print out that number has been found
                   break;
                } else{
                System.out.println(number+" was not found in the list."); //print out that number has not been found
                if(input[mid+1] != 0){
                System.out.println("The number above was: " +input[mid+1]); 
                } else{
                    System.out.println("None");
                }
                if(input[mid-1] != 0){
                System.out.println("The number below was: " +input[mid-1]); 
                } else{
                    System.out.println("None");
                }
         
                break;
            }
                
            }

            
}     
            
        


public static void main(String[] args) { // main method required for every Java program
      
    Scanner myScanner = new Scanner(System.in); //declaring use of scanner
    

    int[] array1 = new int[5000]; //declaration
    int[] array2 = new int[5000]; //declaration

    for (int i=0; i<5000; i++){ //for loop that combine suitnames and ranknames
        array1[i] = (int) (Math.random()*100001);  // integer between [0,10000]a;
    }
     findMinMax(array1);
    
     int number = 0;
     int maxrange = 100000+1;
     int variablerange;
     for (int i=0; i<5000; i++){
        variablerange = maxrange-number;
        array2[i] = (int) (Math.random()*variablerange+number);  // integer between [0,10000]a;
        number = array2[i];
        //System.out.print(array2[i]+ "  ");

     }
     //System.out.print(array2[i]);
     findMinMax2(array2);
     
     System.out.print("Please enter an input greater than or equal to zero: ");
        int input = myScanner.nextInt();
        int x = findNumber(array2, input);
        System.out.println(x);

}
     
}
