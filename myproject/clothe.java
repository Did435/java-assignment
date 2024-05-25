import java.util.Scanner;
class clothe{
    public static void main(String[] args) {
        
    
    

    Scanner keybored = new Scanner(System.in);

    double Celsius = 0.0;
    boolean value1,value2,value3;

    System.out.println("enter the number: ");
    
    Celsius = keybored.nextInt();
    
    double Fahrenheit = 0.0;
    
         Fahrenheit = (9.0 / 5) * Celsius + 32;
    
         System.out.println("Fahrenheit: "+ Fahrenheit);

         value1 =  Fahrenheit < 73.4;

         value2 =  Fahrenheit == 73.4;

         value3 =  Fahrenheit > 73.4;

         if (value1) 
            System.out.println("you use Jacket");
            
          else if(value2)
          System.out.println("you use Nike T-shirt");

          else

          System.out.println("you use japoney");


            
         
         


            
                
    }  


         }
    



