//Kaeli Prevelige
//September 22, 2014
//Lab04
//CSE2
//Month Java Program
//
//  first compile the program
//      javac Month.java
//  run the program
//      java Month//

//import scanner
import java.util.Scanner;

//  define a class
public class Month {

//  main method required for every java program
  public static void main(String[] args) {

//declare and instance of the scanner object
Scanner myScanner;

//Tell scanner you're creating an instance that
//  will take input from STDIN
myScanner=new Scanner( System.in );

//Prompt user for int that signifies a month
    System.out.print(
        "Enter an int giving the number of the month (1-12)- ");

//Accept user input
int nMonth= myScanner.nextInt();


    if (nMonth < 1) {
            System.out.println("You did not enter an int between 1 and 12");
            
    }
    
    if (nMonth > 12) {
            System.out.println("You did not enter an int between 1 and 12");
            
    }
   
    
    else if (nMonth == 1 || nMonth == 3 || nMonth == 5 || nMonth == 7 || nMonth ==8 || nMonth ==10 || nMonth ==12){
            System.out.println("The month has 31 days");
    }
    
    else if (nMonth == 4 || nMonth == 6 || nMonth == 9 || nMonth == 11){
            System.out.println("The month has 30 days");
    }

    else if (nMonth ==2){
            System.out.print("Enter an int giving the year:");
        //Accept user input 
        int nYear=myScanner.nextInt();

            if ((nYear % 4 == 0) && (nYear % 100 != 0) || (nYear % 400 == 0)){
                    System.out.println("The month has 29 days");
            }
            else{
                    System.out.println("The month has 28 days");
            }
    }



    }  //end of main method   
} //end of class