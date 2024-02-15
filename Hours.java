class Hours extends ConsoleProgram {

  /**
  * convert hours into days and hours
  * @author: chris
  */
  
  public void run() {

    //var assigning and calculation

    int intHours = readInt("enter hours: ");
    int intDays = intHours / 24;
    int intHoursnew = intHours % 24;

    System.out.println("The time is " + intDays + "days and" + intHoursnew + " hours.");

  

  
    


  }
}