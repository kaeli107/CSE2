//Kaeli Prevelige
//September 22, 2014
//Lab04
//CSE2
//IncomeTax Java Program
//
//  first compile the program
//      javac IncomeTax.java
//  run the program
//      java IncomeTax//

//import scanner
import java.util.Scanner;

//  define a class
public class IncomeTax {

//  main method required for every java program
  public static void main(String[] args) {

//declare and instance of the scanner object
Scanner myScanner;

//Tell scanner you're creating an instance that
//  will take input from STDIN
myScanner=new Scanner( System.in );

//Prompt user for int in thousands of dollars of income
    System.out.print(
        "Enter an int giving the number of thousands- ");


//Assign tax rates to inputs
double taxFive=5.0;
double taxSeven=7.0;
double taxTwelve=12.0;
double taxFourteen=14.0;

//Define schedule

    if(myScanner.hasNextInt()){
      
        //Accept user input
        int nThousands = myScanner.nextInt();
        

        if (nThousands < 0) {
            System.out.println("You did not enter a positive int");
            
        }
    
       
        else if (nThousands < 20) {
          System.out.println("The tax rate on $"+nThousands*1000+" is "
            +taxFive+"%, and the tax is $"+nThousands*taxFive*100/10.0+"");
    
        }
        
        else if (nThousands >= 20 && nThousands< 40) {
          System.out.println("The tax rate on $"+nThousands*1000+" is "
            +taxSeven+"%, and the tax is $"+nThousands*taxSeven*100/10.0+"");
    
        }
            
        else if (nThousands >=40 && nThousands <78) {
          System.out.println("The tax rate on $"+nThousands*1000+" is "
            +taxTwelve+"%, and the tax is $"+nThousands*taxTwelve*100/10.0+"");
    
        }
        
        else if (nThousands >=78) {
          System.out.println("The tax rate on $"+nThousands*1000+" is "
            +taxFourteen+"%, and the tax is $"+nThousands*taxFourteen*100/10.0+"");

     }
    }
    else {System.out.println("You did not enter an int");
    }


    }  //end of main method   
} //end of class