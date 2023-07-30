package demopack1;
//same package sub class
class Demo3 extends Demo1{
 public void show(){
    System.out.println(a+b+c+d); // not allowed since b is private member 
 }
}