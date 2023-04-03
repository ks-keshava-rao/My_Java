package Interfaces;
interface testing{
    int X = 10 ; //idetifiers must be capital , they are by default static 
    public abstract void methods1(); //by default public and abstract , cannot be private
    public static void metjods3(){ 
        System.out.println("Static methods are allowed ");
    }
    private void methprivate(){
        System.out.println("private interface method"); // can be used inside interface
    }
    default void methods5(){  // usefull incase of modifying the existing interfaces . 
        methprivate();
        System.out.println("this is defautl method");
    }
}
interface testing2 extends testing{ // interface can extend other interfaces
    void method4();
}
class interfacetest implements testing2{ //all methods of parent and child interface must be over rided
    public void methods1(){};
    public void metjods3(){};
    public void method4(){};
}
public class rules {
    public static void main(String[] args){
        System.out.println(testing.X);
        testing.metjods3();
        interfacetest i = new interfacetest();
        i.methods5();
    }
}
