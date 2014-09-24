//Kaeli Prevelige
//September 22, 2014
//Lab04
//CSE2
//TimePadding Java Program
//
//  first compile the program
//      javac TimePadding.java
//  run the program
//      java TimePadding//

//import scanner
import java.util.Scanner;

//  define a class
public class TimePadding {

//  main method required for every java program
  public static void main(String[] args) {

//declare and instance of the scanner object
Scanner myScanner;

//Tell scanner you're creating an instance that
//  will take input from STDIN
myScanner=new Scanner( System.in );

//Have user enter number of seconds that have passed during the day
    System.out.print(
        "Enter the time in seconds: ");
//Accept user input
int nSeconds = myScanner.nextInt();

//remaining seconds
int rSeconds = nSeconds %60;
//remaining minutes
int rMinutes = (nSeconds/60) %60;
//remaining hours
int rHours = (nSeconds/60/60) %60;

    if (rSeconds < 10 && rMinutes > 10) {
         System.out.println(
        "The time is "+rHours+":"+rMinutes+":0"+rSeconds+"");
     
    }
   
    else if (rMinutes < 10 && rSeconds >10) {
         System.out.println(
         "The time is "+rHours+":0"+rMinutes+":"+rSeconds+"");

    }
    
    else if (rSeconds<10 && rMinutes < 10) {
         System.out.println(
         "The time is "+rHours+":0"+rMinutes+":0"+rSeconds+"");

    }
    else if (rSeconds>10 && rMinutes >10) {
        System.out.println(
        "The time is "+rHours+":"+rMinutes+":"+rSeconds+"");
    }
 }  //end of main method   
} //end of class
