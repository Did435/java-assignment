
        import java.util.Scanner;
public class SomeProg
{
public static void main (String[] args)
{
Scanner keyboard = new Scanner(System.in);
final int YEAR = 45;
int age, bornIn;
System.out.print("How old are you this year?" );
age = keyboard.nextInt();
bornIn = YEAR - age;
System.out.println("I think you were born in " + bornIn);
    }
    
}
