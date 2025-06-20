public class PrintData{
  String name;
  int age;
  String address;

  PrintData(String n, int a, String addr){
    name=n;
    age=a;
    address=addr;
}

void display(){
  System.out.println("Name: "+name);
  System.out.println("Age: "+a);
  System.out.println("Address: "+addr);
}

public static void main(String[] args){
  PrintData p=new PrintData("Prashant Rana", 25, "Saharanpur, uttarpradesh");
  p.display();
  }
}
