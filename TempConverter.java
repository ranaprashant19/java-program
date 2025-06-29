import java.util.Scanner;
public class TempConverter{
    static double convertToFahrenheit(double C){
		return (C* 9/5)+32;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temprature in Celsius: ");
		double cel = sc.nextDouble();
		double fah convertToFahrenheit(cel);
		System.out.println("Fahrenheit: "+fah);
	}
}
		
