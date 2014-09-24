//Kaeli Prevelige
//September 22, 2014
//Lab04
//CSE2
//CourseNumber Java Program
//
//  first compile the program
//      javac CourseNumber.java
//  run the program
//      java CourseNumber//

//Program to find the tax on income 
//given a certain input by the user//

//import scanner
import java.util.Scanner;

//  define a class
public class CourseNumber {

//  main method required for every java program
  public static void main(String[] args) {

//declare and instance of the scanner object
Scanner myScanner;

//Tell scanner you're creating an instance that
//  will take input from STDIN
myScanner=new Scanner( System.in );

//Prompt user for 6 digit number giving the course semester
    System.out.print(
            "Enter a 6 digit number giving the course semester- ");
//Accept user input
int nSix=myScanner.nextInt();

int year= (nSix/100);
int course= nSix % 100;

    if (year > 2014 || year <1865) {
        System.out.println(
        "The number was outside the range [186510,201440]");
        return;
        
    }
    

    if (course == 10) {
        System.out.println(
        "The course was offered in the Spring semester of "+year+"");
    }

    else if (course == 20) {
        System.out.println(
        "The course was offered in the Summer 1 semester of "+year+"");
    }

    else if (course == 30) {
        System.out.println(
        "The course was offered in the Summer 2 semester of "+year+"");
    }

    else if (course == 40) {
        System.out.println(
        "The course was offered in the Fall semester of "+year+"");
    }
    else{
        System.out.println(+course+" is not a legitimate semester");
    }


    }  //end of main method   
} //end of class