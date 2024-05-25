import java.util.Scanner;

public class TestProg {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter choice");
        choice = sc.nextInt();
        switch (
            choice
        ) {
            case 1: System.out.println("gum");
            case 2: System.out.println("coke");
            case 3: System.out.println("hsbsh");
            case 4: System.out.println("hdhdhd");
                
                
        
            default: System.out.println("error");
                
        }

        System.out.println("goodbye");
    }


    }
    

