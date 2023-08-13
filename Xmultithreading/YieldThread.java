package Xmultithreading;

class MyThread4 extends Thread {
    @Override
    public void run(){ 
        System.out.println("Started");
        int i =1 ; 
        while(i<000){
            System.out.println(i+" Hello");
            i++;
        }
    }
}
public class YieldThread {
    public static void main(String[] args) throws InterruptedException{
        MyThread4 t = new MyThread4();
        t.start();
         int i =1 ; 
        while(i<2000){
            System.out.println(i+" main");
            Thread.yield(); // this will give more execution tiime to MyThread4 
            i+=2;
        }
    }
}

