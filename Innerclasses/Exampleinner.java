package Innerclasses;

import javax.naming.InvalidNameException;

class outerclass{
    int x=10;
    innerclass i = new innerclass(); //is accessible by whole outer class 
    class innerclass{
        int y=23;
        public void innerdisplay(){
            System.out.println("innerdisplay "+y+" "+x);
        }
    }
    public void outerdisplay(){
        i.innerdisplay();
        System.out.println(i.y);
    }
}
public class Exampleinner {
    public static void main(String args[]){
        outerclass o = new outerclass();
        o.outerdisplay();
        outerclass.innerclass oi = new outerclass().new innerclass();//directly access the inner class object 
        oi.innerdisplay();
    }
}
