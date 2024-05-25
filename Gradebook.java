import java.util.Scanner;

public class Gradebook {
    public static void main(String[] args) {
       
        double[] greads ;
        Scanner sc = new Scanner(System.in);

        

        

        
        
        System.out.print("Enter the first number: ");

        int num = sc.nextInt();
        if(num <= 0) return;
        greads = new double[num];
        for(int i=0; i<num; i++){

        

        System.out.printf("greads[%d]: ", i);

        greads[i] = sc.nextDouble();


        }
         
        


     
        printGreads(greads);
        
        
        double average;

        average = averageGread(greads );
    

        System.out.printf("Your Average Gread is %f\n ", average);
    
    
    if(average >= 90 )
        System.out.println("you got A ");
    
        else if(average >= 80)
            System.out.println("You got B");

        
           else if(average >= 70 )
        System.out.println("you got C ");
    
        else if(average >= 60 )
        System.out.println("you got D ");
    
    else
            
        System.out.println("you got F ");
    }
    
    public static void printGreads(double[] greads ){
        for(int i = 0;i < greads.length;i++){

        

        System.out.printf("greads[%d]: %f\n " , i , greads[i]);

    }
}

    public static double averageGread(double[] greads ){

        double sum = 0.0;
    
        

        for(double gread: greads){

            sum += gread;
             
            


        }
       // System.out.printf("sum = %f ",  sum );
        
        return (sum / greads.length);
    

    }

    



        
    }
      

