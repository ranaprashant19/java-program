pulbic class SwapNumber{
  public static void main(String[] args){
    int a=5,b=8;
    a=a^b;
    b=a^b;
    a=a^b;

    System.out.println("a= "+a);
    System.out.println("b= "+b);
  }
}
