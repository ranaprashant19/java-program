import java.util.Scanner;
public class FloatToInt{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the demincal number: ");
        float f = sc.nextFloat();
        int i = (int) f;
        System.out.println("The float number is " + f + "integer " + i);
    }
}
