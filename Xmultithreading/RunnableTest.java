package Xmultithreading;

class MyThread2 implements Runnable {
    @Override
    public void run(){ //must be overrided from the Thread class. 
        int i =1 ; 
        while(i<100){
            System.out.println(i+" Hello");
            i++;
        }
    }
}
public class RunnableTest {
    public static void main(String[] args){
        MyThread2 t = new MyThread2();//can be donein same class as well as different class 
        Thread th = new Thread(t); // this executes the run method of the class that implements runnable interface
        th.start(); // this begins the thread . 
        int i = 1; 
        while(i<100){
            System.out.println(i+" world");
            i++;
        }
    }
}
