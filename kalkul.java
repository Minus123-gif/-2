import java.util.Scanner;

public class kalkul {
    public static void main(String[] args) {
        GetMeliKukold(2,3);
        
    }
    public static void GetMeliKukold(int firstkukold, int secondkukold){
        int MeliKukold = firstkukold + secondkukold;
        System.out.print("Сума куколдов:" + MeliKukold);
    }
    public static void GetMnoj(int firstkukold, int secondkukold){
        int Mnoj = firstkukold * secondkukold;
        System.out.print("Сума куколдов:" + Mnoj);
    }
    public static void GetRiz(int firstkukold, int secondkukold){
        int Riz = firstkukold / secondkukold;
        System.out.print("Сума куколдов:" + Riz);
    }
    public static void GetPid(int firstkukold, int secondkukold){
        int Pid = firstkukold - secondkukold;
        System.out.print("Сума куколдов:" + Pid);
    }
}
