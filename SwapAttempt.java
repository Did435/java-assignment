
    import java.util.Scanner;
public class SwapAttempt
{
public static void main(String[] args)
{
    Scanner keyboard = new Scanner(System.in);

// declare variables
int x, y;
// enter values
System.out.print("Enter value for x ");

x = keyboard.nextInt();
System.out.print("Enter value for y ");
y = keyboard.nextInt();
// code attempting to swap two variables
x = y;
y = x;
//display results
System.out.println("x = " + x);
System.out.println("y = " + y);
}
}