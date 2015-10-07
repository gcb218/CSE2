/*Grace Butler
  October 2nd, 2015
    Getting Loopy Program
    sixth lab assignment
    javac GettingLoopy.java
    run the program
    java GettingLoopy*/
    
//  define a class
public class GettingLoopy{

   public static void main(String [] args) {
       int numberToSeven = 1;
       int seven =7;
       int x = 1;
       while (numberToSeven < 8){
           System.out.print(numberToSeven);
           numberToSeven++;
       }
     
      while (x < 8 ){
          System.out.print(seven);
          x++;
      }
    System.out.println("");
    

        int random =10; 
        System.out.print("WHILE LOOP:");
        // loop through the numbers one by one
        while (random <101) {
            if ((random%2!=0) && (random%3!=0) && (random%5!=0) && (random%7!=0)) {
            System.out.print(" "+random+" ");}
            random++;
        }
        System.out.println("");
        
        int max = 100;
        System.out.print("FOR LOOP:");
        // loop through the numbers one by one
        for (int i = 10; i<max; i++) {
            boolean isPrimeNumber = true;

            // check to see if the number is prime
            for (int j = 11; i > j; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break; // exit the inner for loop
                }
            }
            // print the number if prime
            if (isPrimeNumber) {
                System.out.print(i + " ");
            }
        }   
        System.out.println("");
        
     
         int random1 =10; 
        System.out.print("DO-WHILE LOOP:");
        // loop through the numbers one by one
        do {
            if ((random1%2!=0) && (random1%3!=0) && (random1%5!=0) && (random1%7!=0)) {
            System.out.print(" "+random1+" ");}
            random1++;
        } while(random1<101);
    System.out.print(random1 +  " ");

  //  for ( p = 5; p < 200; p++ ) {
   // String randNum =  "ツ";
   // String output = Math.random();
    
    int symbol  = Math.random();//add one because you want to jump between 1 and 6
    for (int jumps = 5; jumps < max; jumps++)//start loop at 1 and go for max times
        {
            System.out.print("ツ");}

  int max = 100;
        System.out.print("FOR LOOP:");
        // loop through the numbers one by one
        for (int i = 10; i<max; i++) {
            boolean isPrimeNumber = true;

            // check to see if the number is prime
            for (int j = 11; i > j; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break; // exit the inner for loop
                }
            }
            // print the number if prime
            if (isPrimeNumber) {
                System.out.print(i + " ");
            }
        }   
        System.out.println("");
        }
}

