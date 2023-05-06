package StaticFinal;

//final variable , final method , final class
// same as constant , once asssinged cannot be changed 
// written in capital letters
// They can be directly inintialized  , inside static block , inside the constructor .
// final methods cannot be overrided in sub class
// final class cannot be extended 
// final members can be initialized directly , inside constructor , and inside a block 
class test {
    public final void show(){
        System.out.println("lmao");
    }
}
final class test3 {
    //cannot be inherited or extennded
}
public class Final_key extends test{
    static final int c = 23; // must be initialized if it is a member of class
    // final int d ; // cannot be initialized later also 
    // d=33;
    final int d ; 
    {
        d=44; // can be initilized inside a block
    }
    // public void show(){} cannot override final method
    public static void main(String[] args){
        final int a = 10 ; //doesnt matter if initialized or not inside a method 
        System.out.println(c);
    }
    
}
