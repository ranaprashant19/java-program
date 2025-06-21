import java.util.Scanner;

public class AsciiValue{

  static void printAscii(char c){
    System.out.println("ASCII value of "+c+"is "+(int)c);
  }

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the character: ");
    char ch=sc.next().charAt(0);
    printAscii(ch);
  }
}
