

    


import java.util.Scanner;
public class conta3 {

public static void main (String[] args)
{
Scanner keyboard = new Scanner(System.in);
int[] someArray; // declare an integer array
// ask user to determine size of array
System.out.println("How many elements to store?");
int size = keyboard.nextInt();
// size array now
someArray = new int[size];
for(int a : someArray){
    System.out.println(a);
}
// call methods here
}
// methods to process an array here
}
    
