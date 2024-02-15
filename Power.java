class Power extends ConsoleProgram {

  /**
  * exponentiate two numbers
  * @author:chris
  */
  
  public void run() {
    
    double  intA = readInt("A: ");
    double  intB = readInt("B:");
    double intResult = Math.pow(intA, intB);
    System.out.println(intResult);


    
  }
}