class FtoC extends ConsoleProgram {

  /**
  * farenheit to celcius
  * @author: chris
  */
  
  public void run() {
    
    double farenheit = readDouble("Enter farenheit: ");
    double celcius = 5*(farenheit - 32)/9;

    System.out.println("The temperature is " + celcius + "degrees celcius. ");


    
  }
}