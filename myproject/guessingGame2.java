
import java.util.Scanner;

import java.util.Random;

public class guessingGame2

{

static int numRandom()//custom function numRandom()

{

Random generator=new Random();

int numRandom=generator.nextInt(100)+1;

return numRandom;

}

public static void main(String[] str)

{

//Variable Declaration//

int numRandom;

int numGuess1;

int numGuess2;

int numGuess3;

String display1=" !!!You guessed it right!!!";

String display2= "!!!Sorry, that is not correct!!!";

String display3="    The correct number is ";

String greeting1="             !!!Welcome to the Guessing Game!!!";

String greeting2="  !!!Where you get 3 chances to guess a number from 1 to 100 and see if you’re right!!!";

String prompt1=" Would you like to play?";

String choice1=" 1. Yes";

String choice2=" 2. No";

String prompt2=" Please enter a number 1 to 100:  ";

String second=" Please enter your second quess:  ";

String last=" Please enter your final guess:  ";

String prompt3=" Would you like to play again?";

String goodbye1="     !!!Goodbye!!!";

String goodbye2="     !!!  Thanks for playing!!!";

int reply= 0;
//Scanner object//

Scanner keyboard=new Scanner(System.in);

//Main Program//

System.out.println(greeting1);

System.out.println("");

System.out.println(greeting2);

System.out.println("");

System.out.println(prompt1);System.out.println(choice1);System.out.println(choice2);

reply = keyboard.nextInt();

//Begin while loop//

while (reply==1)

{

numRandom=numRandom();//calling for a random number.// 

System.out.print(prompt2);

numGuess1=keyboard.nextInt();

System.out.println("");System.out.print(second);

numGuess2=keyboard.nextInt();

System.out.println("");System.out.print(last);

numGuess3=keyboard.nextInt();

if (numGuess1==numRandom||numGuess2==numRandom||numGuess3==numRandom)              //if loop1//

{

System.out.println("");

System.out.println(display1);

System.out.println("");

}

else

{

System.out.println("");

System.out.println(display2);

System.out.println("");

System.out.println(display3+numRandom+".");

System.out.println("");

}

System.out.println(prompt3);

System.out.println(choice1);

System.out.println(choice2);

reply=keyboard.nextInt();

if (reply==2)

{

System.out.println(goodbye2);

}

}

while (reply==2)

for(;reply>=2;reply--)

{

System.out.println(goodbye1);

}

}

}