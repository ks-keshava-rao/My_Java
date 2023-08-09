package Xmultithreading;
class Myrun implements Runnable{
    public void run(){}
}
class Myrun2 extends Thread{

    public Myrun2(String name){
        super(name); //giving thread name to the extending class
        // setPriority(Thread.MIN_PRIORITY+2);
    }
    public void run(){
        int i = 1 ; 
        while(i < 100){
            System.out.println(i++);
            try{
            Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class ThreadMethods {
    public static void main(String args[]){
        Thread t = new Thread(new Myrun(),  "my name");
        Myrun2 m = new Myrun2("thread-1");

        /*Thread methods */
        // System.out.println("ID "+ m.getId());
        // System.out.println("Name " + m.getName());
        // System.out.println("Priority "+ m.getPriority());
        m.start();
        m.interrupt(); // this will thorw interrupt exception 
        // System.out.println("State "+ m.getState());//b4 m.start() shows new 
        // System.out.println("is alive "+ m.isAlive());

    }
}
