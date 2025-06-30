import java.util.Scanner;

public class Fabonacci{
    public static void main(String []agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int fab = sc.nextInt();
        
        int a = 0, b = 1;
        for(int i = 1; i <= fab; i++){
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
        
