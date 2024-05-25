import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num");

        int num = sc.nextInt();

        if(num >= 0 ){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }
    }
    
}
