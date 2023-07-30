package demopack1;
//same package non-subclass 
public class Demoo2{
    Demo1 d = new Demo1();
    public void show(){
        System.out.println(d.a+d.b+d.c+d.d);//private member-b not allowed to access 
    }
}