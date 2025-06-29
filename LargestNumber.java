public class LargestNumber{

  public static void main (String []args){
    int max = findMax(10,24,20);
    int Max = maxOfThree(43,54,32);
    System.out.println("largest number is "+ max);
    System.out.println("largest number is "+ Max);
  }
  
  static int findMax(int a, int b, int c){
  return Math.max(a, Math.max(b,c));
  }
  
  static int maxOfThree(int a, int b, int c){
    return (a<b)?(b>c?b:c):(a>c?a:c);
  }
}
