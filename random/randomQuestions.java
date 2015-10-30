//  define a class
public class randomQuestions{ //  define a class
    


	public static void main(String[] args) {
    int i =4;
    System.out.println("i: "+i);
    for (i=4; i<5 ; ){
        for (int j=2; j<9;j++){
            if(j%2==0){
                i+=j;
                System.out.println("i: "+i);
            }else{
                i-=j;
                System.out.println("i: "+i);
            }
        }
    }
	}
}
