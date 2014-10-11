//Kaeli Prevelige
//September 26, 2014
//Lab05
//CSE2
//RandomGames Java Program
//
//  first compile the program
//      javac RandomGames.java
//  run the program
//      java RandomGames//

//Obtain from user 1/3 game choices 
//Run the game, have random solutions//

//import scanner
import java.util.Scanner;

//  define a class
public class RandomGames {

//  main method required for every java program
  public static void main(String[] args) {

//declare and instance of the scanner object
Scanner myScanner;

//Tell scanner you're creating an instance that
//  will take input from STDIN
myScanner=new Scanner( System.in );

//Prompt user to choose game
    System.out.print(
            "Enter R or r for Roulette, C or c for Craps, P or p for pick a card- ");

//Accept user input
String game=myScanner.next();

    if (game.length()>1){
        System.out.println("single character expected");
    }
    
//For Roulette

    if(game.equals("R") || game.equals("r")){
            int number=0 + (int) (Math.random()*37);
            if (number==37){
                System.out.println("roulette= 00");
            }
            else{
                System.out.println("roulette= "+number);
            }
            
                if (number==0 || number==37){
                    System.out.println("blue");
                }
                else if (number % 2 == 0){
                    System.out.println("black");
                }
                else{
                    System.out.println("red");
                }
    }
    
//For Craps
    
    if(game.equals("C") || game.equals("c")){
        int roll1=0 + (int) (Math.random()*6);
        int roll2=0 + (int) (Math.random()*6);
        int total= roll1+roll2;
        System.out.println("Picking a card option is yet to be implemented");
    }

//For Pick a Card
    if(game.equals("P") || game.equals("p")){
        System.out.println("Picking a card option is yet to be implemented");
    }

    }  //end of main method   
} //end of class

