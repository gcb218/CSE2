//  define a class
public class randomQuestions{ //  define a class
    
public static int[] resize(int[] myArray, int newsize){
    int[] x = new int[newsize];
    if (newsize < myArray.length){
        for (int i =0; i <newsize; i++){
        
        x[i] = myArray[i];
    }
    }if (newsize == myArray.length){
        for (int i =0; i <newsize; i++){
        
        x[i] = myArray[i];
    }    
    
    }if (newsize > myArray.length){
        for (int i =0; i <newsize; i++){
        
        x[i] = myArray[i];
    } for (int i = myArray.length + 1; i<newsize; i++)    {
        x[i]=0;
    }
    }
    return x;
}
        
        

	public static void main(String[] args) {
	int[] x = new int[] {1,2,4,5,2,3};
    int[] z = resize(x, 15);
    for (int j = 0; j < z.length; j++){
        System.out.print(z[j]+ " ");
    }
        System.out.println();
	}
}
