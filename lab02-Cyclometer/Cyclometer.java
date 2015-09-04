//Grace Butler
//September 5th, 2015
//CSE 002 - Brian Chen

//      second homework assignment
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//

//  define a class
public class Cyclometer {
    // main method required for every Java program
    public static void main(String[] args)  {
    
    // out input data
    int secsTrip1=480; //time of trip 1
    int secsTrip2=3220; //time of trip 2
    int countsTrip1= 1561; //rotations of trip 1
    int countsTrip2=9037; //totations of trip 2
    
    double wheelDiameter=27.0, 
    PI=3.14159, //value of pi
    feetPerMile=5280, //feet in a mile
    inchesPerFoot=12, //inches in a foot
    secondsPerMinute=60;
    double distanceTrip1, distanceTrip2, totalDistance;
    
    System.out.println("Trip 2 took  " +
         (secsTrip2/secondsPerMinute) +"  minutes and had  "+
         countsTrip2+"  counts.");
         
    //run the calculations; store the values
    distanceTrip1=countsTrip1*wheelDiameter*PI; //gives distance in inches
    distanceTrip1/=inchesPerFoot*feetPerMile; //gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    
    //pint out the output data
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    
    } //end of main method
} // end of class
