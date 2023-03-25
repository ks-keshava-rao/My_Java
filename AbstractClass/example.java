package AbstractClass;

abstract class Super{
    public Super(){
        System.out.println("super constructor");
    }
    public void meth1(){
        System.out.println("meth1 of super");
    }
    abstract public void meth2();
}
class sub extends Super{

    @Override
    public void meth2(){
        System.out.println("sub meth2");
    }
}
public class example {
    public static void main(String[] args){
        // Super s = new Super(); abstract classes cannot be instaciated 
        Super s;
        s = new sub();
        s.meth1();
        s.meth2();

        

    }
}
