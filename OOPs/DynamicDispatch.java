package OOPs;
//dynamic dispatch method is used to acheive runtime polymorphism 
class superedclass {

     public void meth1(){
        System.out.println("super meth1");
    }
     public void meth2(){
        System.out.println("super meth2");
    }
}
class subedclass extends superedclass{

    @Override
     public void meth2(){
        System.out.println("sub meth2");
    }
     public void meth3(){
        System.out.println("sub meth3");
    }
}
public class DynamicDispatch {
    public static void main(String[] args){
        superedclass su = new subedclass(); //the reference has only access to super class methods and methods which are overrided in subclass
        su.meth1();
        su.meth2(); //overrided meth2 is called because superclass meth2 is shadowed 
        // su.meth3(); not possible 
    }
}
