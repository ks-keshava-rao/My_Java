package demopack2;
import demopack1.Demo1;
//different package sub-class 
class TestPack2 extends Demo1{
    public void show(){
       System.out.println(c+d); // cannot be accessed since a is defautl and b is private .
   }
}
