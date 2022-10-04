package abstractexample;
abstract class Super {
    public Super(){
        System.out.println("abstracts constructors ");
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
 s.method();
    }
}