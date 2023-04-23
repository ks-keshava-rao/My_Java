package Innerclasses;

class outer{
    public void display(){
        class inner{
            public void show(){
                System.out.println("inner show");
            }
        }
        inner i = new inner();
        i.show();
    }
}
public class Staticlocal {
    public static void main(String args[]){
        outer o = new outer();
        o.display();
    }
}
