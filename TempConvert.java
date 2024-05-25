import java.util.Scanner;
public class TempConvert {
    public static void main(String[] args) {
        Scanner keybored = new Scanner(System.in);

double Celsius = 0.0;
System.out.println("enter the number: ");

Celsius = keybored.nextInt();

double Fahrenheit = 0.0;

	 Fahrenheit = (9.0 / 5) * Celsius + 32;

     System.out.println("Fahrenheit: "+ Fahrenheit);

    }
}
