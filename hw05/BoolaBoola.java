//Kaeli Prevelige
//September 27, 2014
//HW 05
//CSE2
//BoolaBoola Java Program
//
//  first compile the program
//      javac BoolaBoola.java
//  run the program
//      java BoolaBoola//

//Program to randomly generate true or false
//and to generate || and && randomly
//ask user whether the overall value will be true or false//

//import scanner
import java.util.Scanner;

//  define a class
public class BoolaBoola {

//  main method required for every java program
public static void main(String[] args) {

//declare and instance of the scanner object
Scanner myScanner;

//Tell scanner you're creating an instance that
//  will take input from STDIN
Scanner reader = new Scanner(System.in);

//set three variables to randomly print true or false
boolean a= Math.random() < 0.5;
boolean b= Math.random() < 0.5;
boolean c= Math.random() < 0.5;

//set two variables to print || or &&
boolean x = Math.random() <0.5;
boolean y = Math.random() <0.5;

//print output of randomly generated outputs
System.out.print("Does " +a);
    
    if(x==true){
        System.out.print(" || ");
    } else {
        System.out.print(" && ");
    }
System.out.print(b);
   
    if(y==true){
        System.out.print(" || ");   
    } else {
        System.out.print(" && ");
    
    }
System.out.println(c+ " have the value true (T/t) or false (F/f)?");

//accept user input
char trueOrFalse = reader.next(".").charAt(0);

boolean trueOrFalseBoolean =false;

//turn the char into a boolean
if (trueOrFalse == 't'){
    trueOrFalseBoolean = true;
} else if (trueOrFalse == 'T'){

    trueOrFalseBoolean = true;
} else {
    trueOrFalseBoolean = false;
}

//sets the variable for the final answer
boolean answer = false;

//calculates final answer
if(x == true && y == true){
    answer = (a || b) || c ;
    
}else if (x== false && y == true){
        answer = (a && b) || c; 

} else if (x == true && y == false){
        answer = (a || b) && c ;

}else if (x == false && y == false){
    answer = (a && b) && c ;

}

//outputs whether or not you're correct based on above guidelines
if (trueOrFalseBoolean==answer){
    
    System.out.println("Correct");
} else {
    System.out.println("Wrong; Try Again");
    
}


    }  //end of main method
} //end of class
