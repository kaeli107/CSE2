//Kaeli Prevelige
//September 27, 2014
//HW 05
//CSE2
//BurgerKing Java Program
//
//  first compile the program
//      javac BurgerKing.java
//  run the program
//      java BurgerKing//

//Program to find customer orders
//How many Big Macs do they want? Do they want fries?
//Give cost of Big Macs and fries both together and separately
//Don't accept int inputs//

//import scanner
import java.util.Scanner;

//  define a class
public class BurgerKing {

//  main method required for every java program
public static void main(String[] args) {

//declare and instance of the scanner object
Scanner myScanner;

//Tell scanner you're creating an instance that
//  will take input from STDIN
Scanner user_input = new Scanner( System.in );

//Prompt user for number for burger, soda, or fries
    System.out.println(
        "Enter a letter to indicate a choice of");
    System.out.println(
        "Burgers (B or b)");
    System.out.println(
        "Soda (S or s)");
    System.out.println(
        "Fries (F or f)");

//Ask user to input their choice of meal
String mealchoice;
mealchoice=user_input.nextLine();

//if burgers are chosen, give options of toppings
    if (mealchoice.equals ("B") || mealchoice.equals("b")) {
        System.out.println("Enter A or a for \"all the fixins\"" );
        System.out.println("Enter C or c for cheese");
        System.out.println("Enter N or n for none of the above");
        
        String topping;
        topping= user_input.nextLine();
    
        if (topping.equals("A") || topping.equals("a")){
            System.out.println("You ordered a burger with \"all the fixins\"" );
            
        }
        
        else if (topping.equals("C") || topping.equals("c")){
            System.out.println("You ordered a burger with cheese" );
        }
       
        else if (topping.equals("N") || topping.equals("n")){
            System.out.println("You ordered a burger with none of  the above" );
        }
       
        else{
            System.out.println(
            "You did not enter any of A, a, C, c, N, n" );
        }
     
        return;
           
    }
//end of options for burgers
//if soda is chosen, give options of drink
    if (mealchoice.equals("S") || mealchoice.equals("s")) {
        System.out.println("Enter P or p for pepsi" );
        System.out.println("Enter C or c for coke");
        System.out.println("Enter S or s for sprite");
        System.out.println("Enter M or m for Mountain Dew");

        String soda;
        soda= user_input.nextLine();
        
        if (soda.equals("P") || soda.equals("p")){
            System.out.println("You ordered a Pepsi");
            
        }
        
        else if (soda.equals("C") || soda.equals("c")){
            System.out.println("You ordered a Coke" );
        }
       
        else if (soda.equals("S") || soda.equals("s")){
            System.out.println("You ordered a Sprite" );
        }
        
        else if (soda.equals("M") || soda.equals("m")){
            System.out.println("You ordered a Mountain Dew" );
        }
        
        else{
            System.out.println(
            "You did not enter any of P, p, C, c, S, s, M, m" );
        }
        
        return;
           
    }
//end of options of sodas
//if fries are chosen, give options of size
    if (mealchoice.equals("F") || mealchoice.equals("f")) {
        System.out.println("Enter L or l for large fries" );
        System.out.println("Enter S or s for small fries");
      
        String fries; 
        fries= user_input.nextLine();
        
        if (fries.equals("L") || fries.equals("l")){
            System.out.println("You ordered large fries");
            
        }
        
        else if (fries.equals("S") || fries.equals("s")){
            System.out.println("You ordered small fries" );
        }
        
        else{
            System.out.println(
            "You did not enter any of L, l, S, s");
        }
     
        return;
           
    }
//end of options for fries

    if(mealchoice.length()>1);{
        System.out.println("A single String character expected");
        return;
        }
      


    }  //end of main method
} //end of class

