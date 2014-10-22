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
        //declare and instance of the scanner object
        Scanner myScanner;
        //Tell scanner you're creating an instance that
        //  will take input from STDIN
        Scanner user_input = new Scanner( System.in );
        
        System.out.print("Enter a number between 1 and 9- ");
        int number= user_input.nextInt();

        if (number<1 || number>9){
                System.out.println("You did not enter a number between 1 and 9");
                return;
        }
                
//Do-While Program
  
int row=1;
do{
    int i=0;
    do{
        int column=1;
        do{
            System.out.print(" ");
            column++;   
        } while(column<=number-row);
            System.out.println();
            i++;
        int dig=1;
        do{
            System.out.print(row+"");
            dig++;
        } while(dig<=2*row-1);
    } while(i<number+(row-number));
    int column=1;
    do{
        System.out.print(" ");
        column++;
    } while(column<=number-row);
    int dig=1;
    System.out.println(" ");
    do{
        System.out.print("-");
        dig++;
         System.out.print("");
    } while(dig<=2*row-1);
        row++;
} while (row<=number);
System.out.println();


 

    }  //end of main method   
} //end of class

