//Kaeli Prevelige
//September 15, 2014
//Homework 03
//CSE2
//Root Java Program
//
//  first compile the program
//      javac Root.java
//  run the program
//      java Root//

//import scanner
import java.util.Scanner;

//  define a class
public class Root {

//  main method required for every java program
  public static void main(String[] args) {
      
//declare an instance of the scanner object
Scanner myScanner;

//Tell scanner you're creating an instance that
//  will take input from STDIN
myScanner=new Scanner( System.in );

//Prompt user for number they want the cube root of
    System.out.print(
        "Enter the double, and I print its cube root- ");
        
//Accept user input
double x = myScanner.nextDouble();

//Begin by guessing the sqrt is x/3
double guess = x/3;

//Improve estimate 4 more times
double guess2 = (2*guess*guess*guess+x)/(3*guess*guess);
double guess3 = (2*guess2*guess2*guess2+x)/(3*guess2*guess2);
double guess4 = (2*guess3*guess3*guess3+x)/(3*guess3*guess3);
double guess5 = (2*guess4*guess4*guess4+x)/(3*guess4*guess4);
double finalGuess = (2*guess5*guess5*guess5+x)/(3*guess5*guess5);

    System.out.println("The cube root is "+finalGuess+":");
    System.out.println(+finalGuess+"*"+finalGuess+"*"+finalGuess+"=");
    System.out.println(finalGuess*finalGuess*finalGuess);


 }  //end of main method   
} //end of class