import java.lang.reflect.Field;

class reflectDemo{
    private int a ;
    protected int b;
    public int c ;
    int d;
    public reflectDemo(){};
    public reflectDemo(int x , int y){};
    public void display(String s1, String s2 ){}
    public int show(int x,int y){return 0;}
}
public class reflections {
    public static void main(String[] args){
        Class c = reflectDemo.class; // Class is used to get the defination of any other class
        // reflectDemo d = new reflectDemo();
        // Class c1 = d.getClass(); //another way to get the class
        System.out.println(c.getName());
        Field field[] = c.getDeclaredFields(); // this gets the varialbles similarly getConstructors() and getMethods() will get the constructors and methods
        for(Field f:field){
            System.out.println(f);
        }
    }
}
