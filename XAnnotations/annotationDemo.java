package XAnnotations;

import java.util.List;

abstract class Parent{
    abstract public void display();
}
class Child extends Parent{
    @Override   // will show warning in case if the overrided method is mistaked or not present in parent class
    public void display(){};
}
class Oldclass{
    public void display(){
        System.out.println("display method");
    }
    @Deprecated
    public void show(){
        System.out.println("show method");
    }
}
public  class annotationDemo {
    static List l; //interface list

    @SuppressWarnings("deprecation")
    // @SuppressWarnings("unchecked")
    public static void main(String[] args){
        Oldclass oc = new Oldclass();
        oc.show(); // deprecation warning will be show by striken off nethod and while compiling it will give warning as deprecation
    }
}
