//Kaeli Prevelige
//September 15, 2014
//Homework 03
//CSE2
//FourDigits Java Program
//
//  first compile the program
//      javac FourDigits.java
//  run the program
//      java FourDigits//

//import scanner
import java.util.Scanner;

//  define a class
public class FourDigits {

//  main method required for every java program
  public static void main(String[] args) {

//Tell scanner you're creating an instance that
//  will take input from STDIN
Scanner myScanner=new Scanner( System.in );

//Prompt user for the double
    System.out.print(
        "Enter a double and I display the four digits to the right of the decimal point- ");

//Accept user input
double number = myScanner.nextDouble();

int number1= (int) (number*10000);

//get last four digits individually
int number2= (int) (number1 % 10);
int number3= (int) (number1/10) % 10;
int number4= (int) (number1/100) % 10;
int number5= (int) (number1/1000) % 10;

//combine last four digits to print
    System.out.println("The last four digits are "+number5+number4+number3+number2+".");
    

 }  //end of main method   
} //end of class


