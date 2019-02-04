/************************************************************
 *                                                          *
 *  CSCI 470/680          Assignment 3 - P1    Summer 2018  *
 *                                                          *
 *  Programmers: Usman Hussain                              *
 *               Nicholas Swanson                           *  
 *                                                          *
 *  Date Due:   07/03/18                                    *
 *                                                          *
 *  Purpose:    Driver program to test the Date Class       *
 *                                                          *
 ***********************************************************/
import java.util.Scanner;

class DateDemo
{
  public static void main(String [] args)
  {
    //Variables
    Scanner keyScan = new Scanner(System.in);//User input
    int days,//user entered days
        months,//user entered months
        years;//user entered years
    
    System.out.println("*** CSCI Assignment 3 - Date Checker - Start ***");
    //Prompt user for first input
    System.out.println("Enter an integer for the day: ");
    days = keyScan.nextInt();
    
    //Prompt user for second input
    System.out.println("Enter an integer for the month: ");
    months = keyScan.nextInt();
    
    //Prompt user for thrid input
    System.out.println("Enter and integer for the year: ");
    years = keyScan.nextInt();
    
    //Instantiation of the Date Object
    Date userDate = new Date(days,months,years);
    
    //Check how many days since January 1
    int numDays = userDate.daysSinceJan1();
    
    //Print out the information about the number fo days since the start of the year
    System.out.printf("The number of Days between 1/1/%4d and %1d/%1d/%4d is %3d\n",userDate.getYear(),
                      userDate.getDay(),userDate.getMonth(),userDate.getYear(),numDays);
    
    //close the Scanner object
    keyScan.close();
  }
}