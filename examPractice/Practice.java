//Kaeli Prevelige
//October 20, 2014
//HW 07
//CSE2
//Practice Java Program
//
//  first compile the program
//      javac Practice.java
//  run the program
//      java Practice//

//Program to use for, while, and do-while loops for the same purpose//

//import scanner
import java.util.Scanner;
//  define a class
public class Practice {
    //  main method required for every java program
    public static void main(String[] args) {
        //declare an instance of the scanner object
        Scanner myScanner;
        //Tell scanner you're creating an instance that
        //  will take input from STDIN
        Scanner scan = new Scanner( System.in );
 
 System.out.print("Enter an int- ");       
 int n=scan.nextInt();
int j=0;
int k=0;
while(j<n && j<40){
    while(k<(j+1)){
    System.out.print('*');
    k++;
    }
    System.out.println();
}



//	for(int j=0;j<n && j<40;j++){
//	    for(int k=0;k<j+1;k++){
//		System.out.print('*');
//	    }
//	    System.out.println();
//	}
	//COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH 
	//WHILE STATEMENTS
	
    }  //end of main method   
} //end of class

SAMPLE RUNS:
Enter 'C' or 'c' to continue, anything else to quit- 7
You did not enter a character from the list 'Cc'; try again- ths
You should enter exactly one character- c
You entered 'c'
Enter 'y', 'Y', 'n', or 'N'- r
You did not enter a character from the list 'yYnN'; try again- r
You did not enter a character from the list 'yYnN'; try again- r
You did not enter a character from the list 'yYnN'; try again- r
You did not enter a character from the list 'yYnN'; try again- r
You did not enter a character from the list 'yYnN'; try again-
You failed after 5 tries
Choose a digit.
Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- yu
Enter exactly one character
Choose a digit.
Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- u
You did not enter an acceptable character
Choose a digit.
Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- 2
You entered '2’
-----------------------
Enter 'C' or 'c' to continue, anything else to quit- c
You entered 'c'
Enter 'y', 'Y', 'n', or 'N'- N
You entered 'N'
Choose a digit.
Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- 9
You entered '9’

    public static String getInput(String y){
        int times=1;
        while(times<=5){
            while(input.equals("Y") || input.equals("y") || (input.equals("N") || input.equals("n"))){
            
            }
            times++;