import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/0;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * You can use the java.lang exception to identify the error because
 * it tells you that the error is Arithmetic Exception. It also says you 
 * divided by zero where you shouldn't be able to, so you go back
 * to the program and find where there is an issue (40/0) and you can then
 * figure out how to fix the issue.
 */

