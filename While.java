import java.util.Scanner;

public class While {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       while(a<=10){
        System.out.println("Task" + a);
        a++;
      }

    }
}
