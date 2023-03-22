package OOPs;

class Parent {
    public Parent(){
        System.out.println("Parent constructor");
    }
}
class Child extends Parent{
    public Child(){
    System.out.println("Child constructor");
    }
}
public class InheritConstruct {
    public static void main(String args[]){
        Parent p = new Parent(); //Parent constructor 
        Child c = new Child(); //Parent constructor is executed first and then child class constructor is executed . 
    }
}
 