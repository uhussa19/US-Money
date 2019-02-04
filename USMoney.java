/************************************************************
 *                                                          *
 *  CSCI 470/680          Assignment 3 - P2    Summer 2018  *
 *                                                          *
 *  Programmers: Usman Hussain                              *
 *                                                          *  
 *                                                          *
 *  Date Due:   07/03/18                                    *
 *                                                          *
 *  Purpose:    USMoney class for instantiating Money       *
 *              Creates Objects, Adds Money,                *
 *              Sets/Gets dolalrs and cents                 *
 *                                                          *
 ***********************************************************/
class USMoney
{
  //private variables
  private int dollars,
              residual,
              cents;
  
  //Constructor: USMoney()
  //Arguments: int, int
  //Notes: Instantiates USmoney
  public USMoney(int dollar, int cent)
  {
    if(cent >= 0 && cent <= 99)
    {
      dollars = dollar;
      cents = cent;
    }
    else
    {
        dollars = dollar;
        cents = cent;
        dollars-=1;
        residual=cents+100;
        //residule*=(-1);
        cents=residual;
    }
  }
  
  //Method: plus()
  //Arguements: USMoney
  //Returns: USMoney
  //Notes: Adds two money values together
  public USMoney plus(USMoney value)
  {
    //If the added values is between 0 and 99 calc and return
    if((value.cents + this.cents) >= 0 && (value.cents + this.cents) <= 99)
    {
      setDollars(this.dollars + value.dollars);//Set dollars
      setCents( this.cents + value.cents);//Set cents
      return this;
    }
    else//otherwise remove from cents and add to dollars
    {
      int temp = this.cents + value.cents;//Create temp to hold values to add
      temp -= 100;
      setDollars(this.dollars + value.dollars + 1);//Set values of dollars
      setCents(temp);//Set values of cents
      return this;
    }
  }
  //Method: convertMoney()
  //Args: USMoney
  //Returns: Double
  //Notes: Converts dollars and cents to a single double
  public double convertMoney(USMoney value)
  {
    return (double)value.dollars + ((double)value.cents/100);
  }
  
  //Set Methods
  public void setDollars(int value)
  {
    dollars = value;
  }
  public void setCents(int value)
  {
    cents = value;
  }
  
  //Get Methods
  public int getDollars()
  {
    return dollars;
  }
  public int getCents()
  {
    return cents;
  }
}