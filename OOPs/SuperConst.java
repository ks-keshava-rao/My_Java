package OOPs;
import java.lang.*;
class parent{
    parent(){
        System.out.println("parent non paremeterized constructor");
    }
    parent(int x ){
        System.out.println("parent paremetrised constructor"+x);
    }
}
class child extends parent{
    child(){
        System.out.println("child non paremeterized constructor");
    }
    child(int y ){
        System.out.println("child paremetrised constructor"+y);
    }
}

public class SuperConst {
    public static void main(String[] args){
        child c = new child();
    } 
}
