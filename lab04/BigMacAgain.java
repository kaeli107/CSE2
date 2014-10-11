//Kaeli Prevelige
//September 19, 2014
//Lab04
//CSE2
//BigMacAgain Java Program
//
//  first compile the program
//      javac BigMacAgain.java
//  run the program
//      java BigMacAgain//

//Program to find customer orders
//How many Big Macs do they want? Do they want fries?
//Give cost of Big Macs and fries both together and separately
//Don't accept int inputs//

//import scanner
import java.util.Scanner;

//  define a class
public class BigMacAgain {

//  main method required for every java program
  public static void main(String[] args) {

//declare and instance of the scanner object
Scanner myScanner;

//Tell scanner you're creating an instance that
//  will take input from STDIN
myScanner=new Scanner( System.in );
     
//Prompt user for number of Big Macs they want
    System.out.print(
        "Enter the number of Big Macs: ");
  
//Accept user input
int nBigMacs = myScanner.nextInt();

    if (nBigMacs < 0) {
        System.out.println("You did not enter an int > 0");
    return;    
    }


double allBigMacs= nBigMacs*2.22;

//show user total price of Big Macs when they're $2.22 each
   if (nBigMacs >= 0) {
       System.out.println("You ordered "+nBigMacs+" for a cost of "+nBigMacs+"*2.22=$"+
        (Math.round(100*allBigMacs))/100.00+" ");
   
   }
  
//create string for fries input
String fries;

//Ask user if they want fries
    System.out.print(
        "Do you want an order of fries (Y/y/N/n)? ");

//Accept user input
fries = myScanner.next();

        if (fries.equals("Y") || fries.equals("y")) {
            System.out.println(
            "You ordered fries at a cost of $2.15");
            System.out.println(
            "The total cost of the meal is $"+((Math.round(100*allBigMacs+2.15))/100.00)+"");
     
    }
 
       else if (fries.equals("N") || fries.equals("n")) {
            System.out.println(
            "The total cost of the meal is $"+(Math.round(100*allBigMacs))/100.00+"");
     
    }





    }  //end of main method   
} //end of class

