//  define a class
public class randomQuestions{
    
public static void main(String[] args) {

int size = 9;
int i =0;
while(size>0) {
      for(int j = 0; j < size; j++) {
            if (j==size-i-1){
                System.out.print(size);  
            }
            else{
                System.out.print(" ");           
            }
        }
        System.out.println(" ");
        size--;
    }
}
}
