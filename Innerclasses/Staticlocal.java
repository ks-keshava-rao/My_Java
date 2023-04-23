package Innerclasses;
abstract class absclass{ //this can also be interface
    abstract public void show();
}
class abstractouter{
    public void absdisplay(){
         new absclass(){ // anonymous class , and overriding the abstract method
            public void show(){
                System.out.println("abstract inner");
            }
        }.show();
        // abs.show();
    }
}
class outer{
    int x = 10 ;
    static int y = 45;
    public void display(){
        class inner{
            public void show(){
                System.out.println("inner show");
            }
        }
        inner i = new inner();
        i.show();
        new inner().show(); //anonymous object 
    }
    static class my{ //static class 
        public void staticdisplay(){
            System.out.println(y); //non static members cannot be accessed 
        }
    }
}
public class Staticlocal {
    public static void main(String args[]){
        outer o = new outer();
        o.display();
        abstractouter ab = new abstractouter();
        ab.absdisplay();
        outer.my m = new outer.my(); //no need of creating outer clas object 
        m.staticdisplay();
    }
}
