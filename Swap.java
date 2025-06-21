pulbic class Swap{
  int a,b;

  Swap(int a,int b){
    this.a=a;
    this.b=b;
  }

  void performSwap(){
    int temp=a;
    a=b;
    b=temp;
  }
  
  void display(){
    System.out.println("a = "+a);
    System.out.println("b = "+b);
  }
  
  public static void main(String[] args){
    Swap obj=new Swap(5,10);
    obj.performSwap();
    obj.display();
  }
}

