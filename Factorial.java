import java.util.Scanner;
public class Factorial{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int fact = 1, i = 1;
        while(i <= num){
            fact *= i;
            i++;
        }

        System.out.println("Factorial: " + fact);
    }
}
