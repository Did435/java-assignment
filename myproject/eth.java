public class eth {
    int ethiopianMultiplicatoin(int n1, int n2){

        int result = 0;
        while(n1 != 1){
            if(n1 % 2 != 0) {
              result += n2;
              

            }

           n1 = n1 / 2;

n2 = n2 * 2;

}

result += n2; // Adding the final multiplication when num1 is 1

return result; 

        }
        }
    