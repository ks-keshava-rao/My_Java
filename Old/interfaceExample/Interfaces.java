package Old.interfaceExample;
interface test {
    void method1();
    void method2();
}
class my implements test {
    @Override
    public void method1(){
        System.out.println("method1");
    }
    @Override
    public void method2(){
        System.out.println("method2");
    }
    public void method3(){
        System.out.println("method3");
    }
}
public class Interfaces {
    public static void main(String[] args){
        test t1 = new my();
        t1.method1();
        t1.method2();
        // t1.method3(); error
    }
}
