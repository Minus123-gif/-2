import java.util.Scanner;

public class dd {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Numder:");
        int a = sc.nextInt();
        switch(a){
            case(1):
            System.out.println("monday");
            break;
            case(2):
            System.out.println("Tusday");
            break;
            case(3):
            System.out.println("Wednesday");
            break;
            case(4):
            System.out.println("Thursday");
            break;
            case(5):
            System.out.println("Friday");
            break;
            case(6):
            System.out.println("Saturday");
            break;
            case(7):
            System.out.println("Sunday");
            break;
        }
    }

}
