package Xmultithreading;

class MyThread extends Thread {
    @Override
    public void run(){ //must be overrided from the Thread class. 
        int i =1 ; 
        while(i<100){
            System.out.println(i+" Hello");
            i++;
        }
    }
}
public class ThreadTest {
    public static void main(String[] args){
        MyThread t = new MyThread();//can be donein same class as well as different class 
        t.start(); // this begins the thread . 
        int i = 1; 
        while(i<100){
            System.out.println(i+" world");
            i++;
        }
    }
}
