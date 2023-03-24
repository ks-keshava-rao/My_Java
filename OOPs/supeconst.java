package OOPs;

import java.lang.*;
class parents{
    parents(){
        System.out.println("parent non paremeterized constructor");
    }
    parents(int x ){
        System.out.println("parent paremetrised constructor"+ x);
    }
}
class children extends parents {
    children(){
        System.out.println("child non paremeterized constructor"); 
    }
    children(int y ){
        System.out.println("child paremetrised constructor"+ y);
    }
    children(int x , int y ){
        super(x); //this will call the parent constructor
        System.out.println("2 child paremetrised constructor"+ x + " "+ y);
    }
}

public class supeconst {
    public static void main(String[] args){
        children c = new children(); // parent and child non param 
        children c1 = new children(10);//parent non param and child param 
        children c2 = new children(22, 40);// param of parent and param of child with super keyword

    } 
}

