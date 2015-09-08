///////////////////////////////////////////////////////////////////////////////////
//Grace Butler
//Arithmetic Java Program
//
//      second homework assignment
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//

import java.text.DecimalFormat; //to use later for rounding the decimal place of answers

//  define a class
public class Arithmetic{
   
//  add main method
public static void main(String[] args) {


double taxPercent=1.06;
double taxPercent2 = (int)Math.round(taxPercent * 100)/(double)100; //converting a double to an integer and back to a double so that the decimal place is truncated
//number of pairs of socks
int nSocks=3;
//Cost per pair of socks
// ('$' is part of the variable name)
double sockCost$=2.58;

//number of drinking glasses
int nGlasses=6;
//cost per glass
double glassCost$=2.29;

//number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost$=3.25;
double totalSockCost$, totalTaxSockCost$, totalGlassCost$, totalTaxGlassCost$, totalEnvelopeCost$, totalTaxEnvelopeCost$, totalCostPurchases$, totalCostTax$, totalCostTaxPurchases$;
DecimalFormat df = new DecimalFormat("###.##"); //declaring only 2 decimal places

//run the calculations; store the values
totalSockCost$=nSocks*(sockCost$); //total cost of socks
totalTaxSockCost$=totalSockCost$*(taxPercent2); //total cost of socks + tax
totalGlassCost$=nGlasses*(glassCost$); //total cost of glasses
totalTaxGlassCost$=totalGlassCost$*(taxPercent2); //total cost of glasses + tax
totalEnvelopeCost$=nEnvelopes*(envelopeCost$); //total cost of envelopes
totalTaxEnvelopeCost$=totalEnvelopeCost$*(taxPercent2); //total cost of envelopes + tax
totalCostPurchases$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$; //total cost of purchases without tax
totalCostTaxPurchases$=totalTaxSockCost$+totalTaxGlassCost$+totalTaxEnvelopeCost$; //total cost of purchases + tax
totalCostTax$=totalCostTaxPurchases$-totalCostPurchases$; //total tax for purchases


 //print out the output data
    System.out.println("The total amount of socks bought is "+nSocks+"");
    System.out.println("Each pair of socks costs $"+sockCost$+"");
    System.out.println("The total that socks cost without tax is $"+totalSockCost$+"");
    System.out.println("The total that socks cost with tax is $" + df.format(totalTaxSockCost$));
    
    System.out.println("The total amount of glasses bought is "+nGlasses+"");
    System.out.println("Each drinking glass costs $"+glassCost$+"");
    System.out.println("The total that glasses cost without tax is $"+totalGlassCost$+"");
    System.out.println("The total that glasses cost with tax is $"+ df.format(totalTaxGlassCost$));
    
     System.out.println("The total amount of envelopes bought is "+nEnvelopes+"");
    System.out.println("Each box of envelopes costs $"+envelopeCost$+"");
    System.out.println("The total that envelopes cost without tax is $"+totalEnvelopeCost$+"");
    System.out.println("The total that envelopes cost with tax is $" + df.format(totalTaxEnvelopeCost$));
    
    System.out.println("The total cost of purchases without tax is $"+totalCostPurchases$+"");
    System.out.println("The total sales tax is $" + df.format(totalCostTax$));
    System.out.println("The total cost of purchases with tax is $"+ df.format(totalCostTaxPurchases$));

    } //end of main method
} // end of class


