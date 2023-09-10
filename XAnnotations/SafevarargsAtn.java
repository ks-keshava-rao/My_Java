package XAnnotations;

class My<T>{
    @SafeVarargs // to remove variable argument waring and method must be private or final
    private void show(T...arg){
        for(T x:arg) System.out.println(x);
    }
}
@FunctionalInterface
interface sample{ // for lambda expression interface must have a single method so this annotion will give error if 
                 // interface has more than one mehtod
    public void show(); 
    public int add(int x, int w);
}
public class SafevarargsAtn {
    public static void main(String[] args){

    }
}
