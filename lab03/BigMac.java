//Kaeli Prevelige
//September 8, 2014
//Lab03
//CSE2
//BigMac Java Program
//
//  first compile the program
//      javac BigMac.java
//  run the program
//      java BigMac//
//
//  Program will: Obtain from user # of Big Macs,
//      cost per Big Mac and the percent tax
//  And it will display the final cost

//import scanner
import java.util.Scanner;

//  define a class
public class BigMac {

//  main method required for every java program
  public static void main(String[] args) {

//declare and instance of the scanner object
Scanner myScanner;

//Tell scanner you're creating an instance that
//  will take input from STDIN
myScanner=new Scanner( System.in );

//Prompt user for number of tickets
    System.out.print(
        "Enter the number of Big Macs (an integer > 0): ");
    
//Accept user input
int nBigMacs = myScanner.nextInt();

//prompt user for cost of Big Mac and % sales tax
    System.out.print("Enter the cost of per Big Mac as "+
    "a double (in the form of xx.xx): " );
    double bigMac$ = myScanner.nextDouble();
    System.out.print(
        "Enter the percent tax as a whole number (xx): ");
    double taxRate = myScanner.nextDouble();
    taxRate/=100; //user enters percent, but I want proportion


double cost$;
int dollars; //whole $ amount of cost
   int dimes, pennies; //  For storing digits
    //  To the right of the decimal point
    //  For cost$
cost$ = nBigMacs*bigMac$* (1+taxRate);
//  get whole amount, dropping decimal fraction
dollars=(int)cost$;
//  get dimes amount, e.g.,
//      (int) (6.73 * 10) % 10 -> 67 % 10 -> 7
//  Where the % (mod) operator returns the remainder
//      after the devision: 583%100-> 83, 27.5% -> 2
dimes=(int)(cost$*10)%10;
pennies=(int)(cost$*100)%10;
    
    System.out.println("The total cost of " +nBigMacs
    +" BigMacs, at $"+bigMac$ +" per bigMac, with a" +
    " sales tax of "+ (int)(taxRate*100) + "%, is $" 
    +dollars+ '.'+dimes+pennies);
    
    }  //end of main method   
} //end of class