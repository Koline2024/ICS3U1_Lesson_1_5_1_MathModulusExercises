import java.util.concurrent.TimeUnit;

class Minutes extends ConsoleProgram {

  /**
  * minutes to days, hours and mins
  * @author: chris
  */
  
  public void run() {
    
  int intInput = readInt("minutes: ");
  
  
  int intDays = intInput/1440;
  int intHours = intInput/60%24;
  int intMinutes = intInput%60;


  System.out.println(intDays + " days, " + intHours + " hours, " + intMinutes + " minutes,");


  }
}