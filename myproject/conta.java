import java.util.Scanner;

public class conta {
    // this method receives no parameters but returns an array of doubles
static double[] enterTemps()
{
Scanner keyboard = new Scanner(System.in);
// create an array within this method
double[] temperatureOut = new double[7];
// fill up the array created in this method
for (int i = 0; i < temperatureOut.length; i++)
{
System.out.println("enter max temperature for day " + (i+1));
temperatureOut[i] = keyboard.nextDouble();
}
// send back the array created in this method
return temperatureOut;
}
    
}
