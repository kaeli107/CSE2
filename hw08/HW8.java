//Kaeli Prevelige
//October 27, 2014
//HW 08
//CSE2
//HW08 Java Program
//
//  first compile the program
//      javac HW08.java
//  run the program
//      java HW08//

//Purpose:giving you practice in writing methods,
//overloading methods, and in forcing the user to enter good input//

//import scanner
import java.util.Scanner;
//  define a class
public class HW8 {
    //  main method required for every java program
    public static void main(String[] arg) {

            char input; 
            Scanner scan = new Scanner(System.in); //define scanner
            System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
            input = getInput(scan, "Cc");
            System.out.println("You entered '" + input + "'");
            System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
            input = getInput(scan, "yYnN", 5); //give up after 5 attempts
            if (input != ' ') {
                System.out.println("You entered '" + input + "'");
            }
            input = getInput(scan, "Choose a digit.", "0123456789");
            System.out.println("You entered '" + input + "'");

        } //end main method

    public static char getInput(Scanner scan1, String c) { //new method
            String inputs = scan1.next(); //create scanner
            while (true) {
                while (inputs.length() != 1) { //if input is more than one character
                    System.out.println("You should only enter exactly one character- ");
                    inputs = scan1.next(); //ask user for new input
                }
                int a = 0;
                while (a < c.length()) { //runs length of string
                    char number = c.charAt(a);
                    if (number == inputs.charAt(0)) {
                        return inputs.charAt(0);
                    }
                    a++;
                }
                System.out.println("You did not enter a character from the list 'Cc'; try again- "); //prompt user to retry
                inputs = scan1.next(); //accept user input
            }
        } //end of get input1 

    //begin input2
    public static char getInput(Scanner scan2, String d, int n) { //new method
            String inputss = scan2.next(); //create scanner
            int i = 1;
            while (i < n) { //to limit the loop to only allowing 5 wrong answers
                while (inputss.length() != 1) { //if input is more than one character
                    System.out.print("You should only enter exactly one character- ");
                    inputss = scan2.next(); //ask user for new input
                    i++;
                }
                int b = 0;
                while (b < d.length()) { //runs length of string
                    char number = d.charAt(b);
                    if (number == inputss.charAt(0)) {
                        return inputss.charAt(0);
                    }
                    b++;
                }
                System.out.print("You did not enter a character from the list 'yYnN'; try again- "); //prompt user to retry
                inputss = scan2.next(); //accept user input
                i++;
            }
            System.out.println("You failed after 5 tries"); //tell user they failed
            return ' ';
        } //end of get input2 

    //begin input3
    public static char getInput(Scanner scan3, String e, String g) { //new method
            System.out.println(e);
            System.out.println("Enter one of: "+g);
            String inputsss = scan3.next(); //create scanner
            while (true) {
                while (inputsss.length() != 1) { //if input is more than one character
                    System.out.print("Enter exactly one character- ");
                    inputsss = scan3.next(); //ask user for new input
                }
                int f = 0;
                while (f < g.length()) { //runs length of string
                    char number = g.charAt(f);
                    if (number == inputsss.charAt(0)) {
                        return inputsss.charAt(0);
                    }
                    f++;
                }
                System.out.println("You did not enter an acceptable character"); //tell user they chose bad input
                System.out.println("Choose a digit."); //prompt new input
                inputsss = scan3.next(); //accept new input
            }
        } //end of get input3 


} //end of class
