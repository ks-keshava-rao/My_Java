package abstractexample;
abstract class Super {
    public Super(){
        System.out.println("abstracts constructors ");
    }
     public void metod0(){
        System.out.println("Method0");
    }
    abstract public void method();
}
class sub extends Super{
 @Override
 public void method(){
    System.out.println("sub method ");
 }
}
public class abstracts{
    public static void main(String[] args){
 Super s = new sub();
 Super p = new sub();
 s.method();
 p.metod0();
    }
}