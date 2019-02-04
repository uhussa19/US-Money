/************************************************************
 *                                                          *
 *  CSCI 470/680          Assignment 3 - P2    Summer 2018  *
 *                                                          *
 *  Programmers: Usman Hussain                              *
 *                                                          *   
 *                                                          *
 *  Date Due:   07/03/18                                    *
 *                                                          *
 *  Purpose:    Driver program to test USMoney Class        *
 *                                                          *
 ***********************************************************/
import java.util.Scanner;
import java.text.DecimalFormat;

class USMoneyDemo
{
  public static void main(String [] args)
  {
    Scanner keyInput = new Scanner(System.in);//Keyboard input
    //Variables
    int dollars,
        cents;
    
    DecimalFormat totalMoney = new DecimalFormat("$###,##0.00");
    
    //Make first request for dollars and cents
    System.out.println("*** CSCI Assignment 3 - Currency Calculator - Start ***");
    
    System.out.println("Please enter a value for dollars for first Object: ");
    
    dollars = keyInput.nextInt();//user entered dollars
    
    System.out.println("Please enter a value for cents for first Object: ");
    
    cents = keyInput.nextInt();//user entered cents
    
    USMoney x = new USMoney(dollars,cents);//Create first object with values
    
    System.out.printf("The value entered is $%s\n",totalMoney.format(x.convertMoney(x)));
    
    //Make second request for dollars and cents
    System.out.println("Please enter a value for dollars for second Object: ");
    
    dollars = keyInput.nextInt();//user entered dollars
    
    System.out.println("Please enter a value for cents for second Object: ");
    
    cents = keyInput.nextInt();//user entered cents
    
    USMoney y = new USMoney(dollars,cents);//Create second object with values
    
    System.out.printf("The value entered is %s\n",totalMoney.format(y.convertMoney(y)));
    
    //DecimalFormat totalMoney = new DecimalFormat("$###,##0.00");
    //x.plus(y);//Add x and y together
    
    //Print out results - calcuate with plus convert to double then format string
    System.out.printf("The combined value is: %s\n",totalMoney.format(x.convertMoney(x.plus(y))));
    //System.out.printf("The combined value is: $%2d.%2d", x.getDollars(),x.getCents());
    
    keyInput.close();
    
  }
}