//Kaeli Prevelige
//October 14, 2014
//HW 06
//CSE2
//Root Java Program
//
//  first compile the program
//      javac Root.java
//  run the program
//      java Root//

//Program to//

//import scanner
import java.util.Scanner;

//  define a class
public class Root {

//  main method required for every java program
public static void main(String[] args) {

//declare and instance of the scanner object
Scanner myScanner;

//Tell scanner you're creating an instance that
//  will take input from STDIN
Scanner reader = new Scanner(System.in);

System.out.print("Enter a number>0 you wish to use the bisection method on: ");

double x= reader.nextDouble();
double low = 0;
double high = 1+x;

    if (x<=0){
        System.out.println("You did not enter a number greater than zero");
        return;
    }


double middle = (low+high)/2;
while((high-low)>((1+x)*0.0000001)){
    if (x < (middle*middle)){
        high=(middle);
    }
    else{
        low=(middle);
    }
    middle=(low+high)/2;
}

System.out.println(high);

    }  //end of main method   
} //end of class
