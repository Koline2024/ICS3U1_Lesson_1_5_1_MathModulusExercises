class AreaSin extends ConsoleProgram {

  /**
  * Area of triangle from sin
  * @author: Chris
  */
  
  public void run() {
    
    //var assignment
    double sidea = readDouble("enter side a ");
    double sideb = readDouble ("enter side b ");
    double theta = readDouble ("enter angle c ");

    double thetarad = Math.toRadians(theta);
    double sintheta = Math.sin (thetarad);

    //area calculation
    double area = (sidea * sideb * sintheta)/2;

    System.out.println ("area is " + area);


    
  }
}