//Kaeli Prevelige
//September 15, 2014
//Homework 03
//CSE2
//Bicycle Java Program
//
//  first compile the program
//      javac Bicycle.java
//  run the program
//      java Bicycle//

//import scanner
import java.util.Scanner;

//  define a class
public class Bicycle {

//  main method required for every java program
  public static void main(String[] args) {

//declare an instance of the scanner object
Scanner myScanner;

//Tell scanner you're creating an instance that
//  will take input from STDIN
myScanner=new Scanner( System.in );

//  Our intermediate variables and output data
double wheelDiameter=27.0, //The diameter of the wheel is 27
PI=3.14159, //The value of pi
feetPerMile=5280, //There are 5280 feet per mile
inchesPerFoot=12, //There are 12 inches per foot
secondsPerMinute=60; //There are 60 seconds per minute

//Prompt user for number of seconds
    System.out.print(
        "Enter the number of seconds: ");

//Accept user input
int nSeconds = myScanner.nextInt();

//Prompt user for the number of counts
    System.out.print(
        "Enter the number of counts: ");

//Accept user input
int nCounts = myScanner.nextInt();

double distanceTrip=nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile;

//  Print out the output data
    System.out.println("The distance was "+
     (Math.round(100*distanceTrip))/100.00+" miles and took "+(nSeconds/secondsPerMinute)+" minutes." );

double milesPerHour=distanceTrip/((nSeconds/secondsPerMinute)/60);
    
    System.out.println("The average mph was "+
        (Math.round(100*milesPerHour))/100.00+" " );
    
 }  //end of main method   
} //end of class