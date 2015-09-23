///////////////////////////////////////////////////////////////////////////////////
//Grace Butler
//Check Java Program
//
//      fourth lab assignment
//      javac CardGenerator.java
//  run the program
//      java CardGenerator//



public class CardGenerator{	// main method required for every Java program
public static void main(String[] args) {
  

int suitRandom = (int) (Math.random()*4+1);  // integer between [1,4]
int number = (int) (Math.random()*13+1);  // integer between [1,13]
String suit = "";
String rank = "";
//String typeOfCard = "";
switch (suitRandom){
    case 1:
        suit ="Diamonds"; // print out Diamonds if you have a 1
        break;
    case 2:
        suit="Clubs";
        break;
    case 3:
        suit="Hearts"; 
        break;
    case 4:
        suit= "Spades"; 
        break;
}
switch (number){
    case 1:
        rank ="Ace"; // print out Ace if you have a 1
        break;
    case 2:
        rank = "2";
        break;
    case 3:
        rank = "3";
        break;
    case 4:
        rank = "4";
        break;
    case 5:
        rank = "5";
        break;
    case 6:
        rank = "6";
        break;
    case 7:
        rank = "7";
        break;
    case 8:
        rank = "8";
        break;
    case 9:
        rank = "9";
        break;
    case 10:
        rank = "10";
        break;
    case 11:
        rank="Jack";
        break;
    case 12:
        rank="Queen"; 
        break;
    case 13:
        rank= "King"; 
        break;
}
 //typeOfCard = rank && number;
 System.out.println("You have picked the "+rank+" of " +suit); 
   	    
}
}


