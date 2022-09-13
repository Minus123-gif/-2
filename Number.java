import java.util.Scanner;
public class Number {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        if(a<10){
         System.out.println("Позитивне число менше 10 або нуль");
        }else{
            System.out.println("Позитивне число больше 10 або негативне");
        }
    }
}