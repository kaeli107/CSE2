//Kaeli Prevelige
//September 5, 2014
//Lab 02
//CSE2
//Cyclometer Java Program
//
//  first compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//

//  define a class
public class Cyclometer {

//  main method required for every java program
  public static void main(String[] args) {

//input data 
int secsTrip1=480;  //Trip 1 takes 480 seconds
int secsTrip2=3220; //Trip 2 takes 3220 seconds
int countsTrip1=1561; //1561 counts in Trip 1
int countsTrip2=9037; //9037 counts in Trip 2

//  Our intermediate variables and output data
double wheelDiameter=27.0, //The diameter of the wheel is 27
PI=3.14159, //The value of pi
feetPerMile=5280, //There are 5280 feet per mile
inchesPerFoot=12, //There are 12 inches per foot
secondsPerMinute=60; //There are 60 seconds per minute
double distanceTrip1, distanceTrip2, totalDistance; //Declare the variables: distances of trips 1 and 2 and the total distance

//  Print numbers that were stored in variables that store number
//   of seconds and the counts
    System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
    System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
    
distanceTrip1=countsTrip1*wheelDiameter*PI;
//  Above gives distance in inches
//      (for each count, a rotation of the wheel travels
//  the diameter in inches times PI)
distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile;   //Converts to distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;   //Converts distance into miles
totalDistance=distanceTrip1+distanceTrip2; //Find the total distance of Trips 1 and 2

//  Print out the output data
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    
    }  //end of main method
} //end of class