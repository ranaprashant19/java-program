public class Sum{
  int a, b, sum;
  
  Sum(int x, int y){
    a=x;
    b=y;
  }
  
  int add(){
    return a+b;
  }
  
  void displaySum(){
    System.out.println("Sum of "+a+" and "+b+" is "+sum);
  }

  public static void main(String[] args) {
    Sum obj=new Sum(215,48);
    obj.sum=obj.add();
    obj.displaySum();
  }
}
