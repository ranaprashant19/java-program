import java.util.Scanner;
public class LeapYear{
    public static void main (String[] args){
        Scanner sc = new Scanner(Sytem.in);
        System.out.print("Enter the year: ");
        int yr = sc.nextInt();
        if(isLeapYear(yr))
            System.out.println(yr + " is a leap year");
        else
            System.out.println(yr + " is not a leap year");
    }
    
    static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
