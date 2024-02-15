class Rads extends ConsoleProgram {

  /**
  * deg to rad
  * @author:
  */
  
  public void run() {
    
    double degrees = readDouble("Enter degrees: ");
    double radians = Math.toRadians(degrees);
    System.out.println("Radians: " + radians);
    

  }
}