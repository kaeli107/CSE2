//Kaeli Prevelige
//October 10, 2014
//Lab 7
//CSE2
//Enigma0 Java Program//s

//import scanner
import java.util.Scanner;
//define a class
public class Enigma0{
//main method required for every java program
public static void main(String arg []){

Scanner scan=new Scanner(System.in);

System.out.print("Enter an int- ");

int n;
n=scan.nextInt();
System.out.println("You entered "+n);
    

int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 25: System.out.println("sum is 25");
      default:
    }
        System.out.println("To repeat, you entered "+n);
    }
    }


// Error report: when defining ints after the if else statements, n was not defined
//Also, if/else statement was unnecessary as long as we create an int in the beginning and allow for a user to input a val
//Case 24 was unnecessary as it printed nothing
