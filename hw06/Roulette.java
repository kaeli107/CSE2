//Kaeli Prevelige
//October 14, 2014
//HW 06
//CSE2
//Roulette Java Program
//
//  first compile the program
//      javac Roulette.java
//  run the program
//      java Roulette//

//Program to//

//import scanner
import java.util.Scanner;

//  define a class
public class Roulette {

//  main method required for every java program
public static void main(String[] args) {


int loser = 0;
int winner = 0;
int winnings=0;


for (int i= 0; i<1000; i++){
    int timesWon = 0;
    int number=0 + (int) (Math.random()*38);
        for (int j=0; j < 100; j++) {
            int random = 0 + (int) (Math.random()*38);
            if (number==random) {
                timesWon++;
                
            }
           
        }
        winnings += timesWon*36;
        
            if (timesWon ==0) {
                loser++;
            }
            else if (timesWon >= 3) {
                winner++;
            }
        
}

System.out.println("You won $"+winnings);
System.out.println("You lose everything "+loser+" times");
System.out.println("You made a profit "+winner+" times");

    
    }  //end of main method   
} //end of class

