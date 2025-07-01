import java.util.Scanner;

public class Reverse{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a, r = 0, org = n;
        while(n != 0){
            a = n % 10;
            n = n / 10;
            r = r * 10 + a;
        }
        System.out.print("reverse number of  " + org + "is " + r);
    }
}
