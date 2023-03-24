package OOPs;
//dynamic method dispatch :- mehthod is called depending updon the object not on the refernce.
// a super class refernce holding an object of subclass and a over rided method is called , the methods of an object is called not the method of reference 
class superclass {
    public void display(){
        System.out.println("super class display");
    }
}
class  subclass extends superclass {
    @Override
    public void display(){
         System.out.println("sub class display");
    }

    // public void display(int x){ 
    //     System.out.println("sub class display 2 "+ x);
    // } 
}
public class overriding {
    public static void main(String[] args)
    {
        superclass su  = new superclass();
        su.display();
        subclass s = new subclass();//parent display method is shadowed 
        s.display();
        //refernce
        superclass sup = new subclass();//display method of object is called not the refernce 
        sup.display();
    }
}
