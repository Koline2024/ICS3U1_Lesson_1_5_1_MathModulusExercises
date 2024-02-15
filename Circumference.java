class Circumference extends ConsoleProgram {

  /**
  * Circumeference of circle from radius
  * @author:
  */
  
  public void run() {
    
   double rad = readDouble("enter the radius: ");
   double circum = 2 * rad * Math.PI;

   System.out.println("circumference is" + circum);
    
  }
}