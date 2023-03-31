package Interfaces;

interface Test
{
    int X=10;
    public abstract void meth1();
    public abstract void meth2();
    public static void meth3()
    {
        System.out.println("Meth3 of Test");
    }
}

interface Test2 extends Test
{
    void meth4();
}

class My implements Test2
{
    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
    public void meth4(){System.out.println("Meth4");}
}
public class Example1 
{
    public static void main(String[] args) 
    {
        My n = new My();
        n.meth4();
        Test t2;
        t2.meth1();
        System.out.println(Test.X);
        Test.meth3();
        
    }
}