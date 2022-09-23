import mypack1.Demo;
import mypack1.inner.Demo3;
public class UsePackage {
    public static void main(String[] args){
        Demo d = new Demo();
        Demo3 d3 = new Demo3();
        d.display();
        d3.display();
    }
}
