//Kaeli Prevelige
//October 20, 2014
//HW 07
//CSE2
//NumberStack Java Program
//
//  first compile the program
//      javac NumberStack.java
//  run the program
//      java NumberStack//

//Program to use for, while, and do-while loops for the same purpose//

//import scanner
import java.util.Scanner;
//  define a class
public class NumberStack {
    //  main method required for every java program
    public static void main(String[] args) {
            //declare and instance of the scanner object
            Scanner myScanner;
            //Tell scanner you're creating an instance that
            //  will take input from STDIN
            Scanner user_input = new Scanner(System.in);

            System.out.print("Enter a number between 1 and 9- ");
            int number = user_input.nextInt();

            //For Loop Program
            for (int row = 1; row <= number; row++) {
                if (number < 1 || number > 9) {
                    System.out.println("You did not enter a number between 1 and 9");
                    return;
                }
                //below is to print out the correct repetition of lines
                for (int i = 0; i < number + (row - number); i++) {
                    //below is to print out n-row spaces
                    for (int column = 1; column <= number - row; column++) {
                        System.out.print(" ");
                    }
                    //below is to print out digits = 2*row-1 # of digits printed
                    for (int dig = 1; dig <= 2 * row - 1; dig++) {
                        System.out.print(row + "");
                    }
                    System.out.println();
                }
                //below is to print out the correct repetition of lines
                for (int column = 1; column <= number - row; column++) {
                    System.out.print(" ");
                }
                for (int dig = 1; dig <= 2 * row - 1; dig++) {
                    System.out.print("-");
                }
                System.out.println();
            }

            //While Loop Program
            int row = 1;
            while (row <= number) {
                int i = 0;
                while (i < number + (row - number)) {
                    int column = 1;
                    while (column <= number - row) {
                        System.out.print(" ");
                        column++;
                    }
                    int dig = 1;
                    while (dig <= 2 * row - 1) {
                        System.out.print(row + "");
                        dig++;
                    }
                    System.out.println();
                    i++;
                }
                int column = 1;
                while (column <= number - row) {
                    System.out.print(" ");
                    column++;
                }
                int dig = 1;
                while (dig <= 2 * row - 1) {
                    System.out.print("-");
                    dig++;
                }
                row++;
                System.out.println();
            }


            //Do-While Program

            int row1 = 1;
            do {
                int i = 0;
                do {
                    int column = 1;
                    do {
                        System.out.print(" ");
                        column++;
                    } while (column <= number - row1);
                    System.out.println();
                    i++;
                    int dig = 1;
                    do {
                        System.out.print(row1 + "");
                        dig++;
                    } while (dig <= 2 * row1 - 1);
                } while (i < number + (row1 - number));
                int column = 1;
                do {
                    System.out.print(" ");
                    column++;
                } while (column <= number - row1);
                int dig = 1;
                System.out.println(" ");
                do {
                    System.out.print("-");
                    dig++;
                    System.out.print("");
                } while (dig <= 2 * row1 - 1);
                row1++;
            } while (row1 <= number);
            System.out.println();

        } //end of main method   
} //end of class
