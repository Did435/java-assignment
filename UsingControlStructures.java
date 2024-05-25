public class UsingControlStructures {
    public static void main(String[] args) {
        int[] greads = {68,87,90,89};
        for(int i = 0; i <= greads.length; i++);
            int sum = 0;
            for (double gread : greads){
                sum += gread;
            }
            int average;

            average = sum / greads.length;
            

            switch (greads) {
                case average >=90:
                System.out.println("You got an A.");
                 break;
                case average >= 80:
                 System.out.println("You got an B.");
                 break;
                 case average >= 70:
                  System.out.println("You got an c.");


            
                default:
                    break;
            }
           // System.out.printf("Your average gread is %f ",average );
            
       // System.out.printf("gread[%d]: %.1f\n",  i , gread[i]);
        

    

               

        

                
                
    }
}           
               
               


            
        
        
    
    

