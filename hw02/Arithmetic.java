//Kaeli Prevelige
//September 8, 2014
//HW 02
//CSE2
//Arithmetic Java Program
//
//  first compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//

//  define a class
public class Arithmetic {

//  main method required for every java program
  public static void main(String[] args) {
      
//  Assumptions Below (input variables)

//Number of pairs of socks
int nSocks=3;
//Cost per pair of socks
//('$' is part of the variable name)
double sockCost$=2.58;

//Number of drinking glasses
int nGlasses=6;
//Cost per glass
double glassCost$=2.29;
      
//Number of boxes of envelopes
int nEnvelopes=1;
//Cost per box of envelopes
double envelopeCost$=3.25;
//Sales tax in PA
double taxPercent=0.06;

double totalSockCost$;  //total cost of socks
double totalGlassCost$; //total cost of glasses
double totalEnvelopeCost$; //total cost of envelopes
double salesTaxSocks$;  //sales tax of socks
double salesTaxGlass$;  //sales tax of glasses
double salesTaxEnvelope$;  //sales tax of envelopes
double fullSockCost$;   //cost of socks and tax
double fullGlassCost$;  //cost of glass and tax
double fullEnvelopeCost$;   //cost of envelope and tax
double totalCost$;  // cost of socks, glasses, and envelopes
double totalTax$;  // cost of sales tax of socks, glasses, and envelopes 
double totalCostAll$;  //cost of all items together with sales tax

totalSockCost$=nSocks*sockCost$;    //equation to find cost of buying three pairs of socks
totalGlassCost$=nGlasses*glassCost$; //equation to find cost of buying six pairs of glasses
totalEnvelopeCost$=nEnvelopes*envelopeCost$;  //equation to find cost of buying one envelope

salesTaxSocks$=totalSockCost$*taxPercent;   //equation to find sales tax of socks
salesTaxGlass$=totalGlassCost$*taxPercent;  //equation to find sales tax of glass
salesTaxEnvelope$=totalEnvelopeCost$*taxPercent;    //equation to find sales tax of envelope

fullSockCost$=totalSockCost$+salesTaxSocks$; //equation to find cost of socks and tax
fullGlassCost$=totalGlassCost$+salesTaxGlass$;  //equation to find cost of glass and tax   
fullEnvelopeCost$=totalEnvelopeCost$+salesTaxEnvelope$; //equation to find cost of envelope and tax

totalCost$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$; //equation to find cost of socks, glass, and envelopes
totalTax$=salesTaxSocks$+salesTaxGlass$+salesTaxEnvelope$; //equation to find sales tax of socks, glass, and envelopes
totalCostAll$=totalTax$+totalCost$; //equation to find cost+tax of socks, glass, and envelopes

//  Print out the output data

    System.out.println("The total cost of three socks at $2.58 each is $ "+totalSockCost$+" ");
    System.out.println("The total cost of six glasses at $2.29 each is $ "+totalGlassCost$+" ");
    System.out.println("The total cost of one envelope at $3.25 each is $ "+totalEnvelopeCost$+" ");
    
    System.out.println("The total sales tax of three socks at $2.58 each is $ "+Math.round(salesTaxSocks$ * 100)/100.0+" ");
    System.out.println("The total sales tax of six glasses at $2.29 each is $ "+Math.round(salesTaxGlass$ * 100)/100.0+" ");
    System.out.println("The total sales tax of one envelope at $3.25 each is $ "+Math.round(salesTaxEnvelope$ * 100)/100.0+" ");
    
    System.out.println("The total cost plus sales tax of three socks at $2.58 each is $ "+Math.round(fullSockCost$ * 100)/100.0+" ");
    System.out.println("The total cost plus sales tax of six glasses at $2.29 each is $ "+Math.round(fullGlassCost$ * 100)/100.0+" ");
    System.out.println("The total cost plus sales tax of one envelope at $3.25 each is $ "+Math.round(fullEnvelopeCost$ * 100)/100.0+" ");

    System.out.println("The total cost of 3 socks, 6 glasses, and 1 envelope is $ "+Math.round(totalCost$ * 100)/100.0+" ");
    System.out.println("The total sales tax of 3 socks, 6 glasses, and 1 envelope is $ "+Math.round(totalTax$ * 100)/100.0+" ");
    System.out.println("The total cost of everything is $ "+Math.round(totalCostAll$ * 100)/100.0+" ");
  

    }  //end of main method
} //end of class