import demopack1.Demo1;
//different package non-subclass 
class Testpack{
    public static void main(String args[]){
        Demo1 d1 = new Demo1();
        d1.display();
        // System.out.println(d1.a+d1.b+d1.c+d1.c); cannot access the object since they are default private protected . 
    }
}