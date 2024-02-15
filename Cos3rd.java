class Cos3rd extends ConsoleProgram {

  /**
  * Using cosine law to find third side 
  * @author: chris
  */
  
  public void run() {
    

    //assign var 

   double dblSidea = readDouble("enter side A: ");
   double dblSideb = readDouble ("enter side B: ");
   double dbltheta = readDouble ("enter angle ");

    //convert theta to rad
    
    double dblrad = Math.toRadians(dbltheta);

    // cosine law input

    double output = Math.sqrt(Math.pow(dblSidea, 2)+Math.pow(dblSideb, 2)-2*dblSidea*dblSideb*Math.cos(dblrad));

    System.out.println("Side C is " + output);
  }
}