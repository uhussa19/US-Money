/************************************************************
 *                                                          *
 *  CSCI 470/680          Assignment 3 - P1    Summer 2018  *
 *                                                          *
 *  Programmers: Usman Hussain                              *
 *                                                          *  
 *                                                          *
 *  Date Due:   07/03/18                                    *
 *                                                          *
 *  Purpose:    Date Class - Constructs and Sets Date       *
 *              Checks how many days Object is from Jan 1   *
 *                                                          *
 ***********************************************************/
class Date
{
  //Variables
  private int day,
              month,
              year;
  
  // Constructor: Date()
  // Args: int, int, int
  // Notes: Instantiates the Date object with day, month year
  public Date(int days, int months, int years)
  {
    day = days;
    month = months;
    year = years;
  }
  //Get Methods
  public int getDay()
  {
    return day;//Returns object date
  }
  public int getMonth()
  {
    return month;//Returns object month
  }
  public int getYear()
  {
    return year;//Returns object year
  }
  
  // Method: daysSince Jan1()
  // Args: Nothing
  // Returns: int
  // Notes: This Method Calcualtes the number of Days since January 1 of the same year
  //        checks if the year is a leap year to adjust the number fo days returned
  public int daysSinceJan1()
  {
    int numOfDays = 0;//calculated number of days
    int i;
    for(i = 1; i <= this.month; i++)
    {
      //Months with 30 days - april 4, june 6, sept 9, november 11
      if(i == 4 || i == 6 || i == 9 || i == 11)
      {
        numOfDays += 30;
      }
      else if(i == 2)//February
      {
        //If the year is divisable by 400 or the year is divisable by 4 but not 100 it is a leap year
        if (( year % 400 == 0) || (( year % 4 == 0 ) && ( year % 100 != 0)))
        {
          numOfDays += 29;
        }
        else//not a leap year
        {
          numOfDays += 28;
        }
      }
      else//All other months
      {
        numOfDays += 31;
      }
    }
    //After total Days are established we want the exact days of current month
    if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11)//30 days
    {
      numOfDays -= 30;
      numOfDays += this.day;
    }
    else if(this.month == 2)//February
    {
      if(this.year % 4 == 0 && this.year % 100 == 0 && this.year % 400 != 0)//If the year is divisable by 4
      {
        numOfDays -= 29;
        numOfDays += this.day;
      }
      else//not a leap year
      {
        numOfDays -= 28;
        numOfDays += this.day;
      }
    }
    else//All other months
    {
      numOfDays -= 31;
      numOfDays += this.day;
    }
    return numOfDays;
  }
}