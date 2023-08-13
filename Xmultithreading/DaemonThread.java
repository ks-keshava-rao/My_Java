package Xmultithreading;

class MyThread3 extends Thread {
    @Override
    public void run(){ 
        int i =1 ; 
        while(i<1000){
            System.out.println(i+" Hello");
            i++;
        }
    }
}
public class DaemonThread {
    public static void main(String[] args) throws InterruptedException{
        MyThread3 t = new MyThread3();
        t.setDaemon(true);
        t.start(); //if main thread ends and setDaemon is set to false then it waits for thread t to end . 
                  //if main thread ends and setDaemon is set to true then it will not wait for the thread t to complete . 
        // try{Thread.sleep(300);}catch(Exception e){System.out.println(e);} // just to test the daemon thread main method will sleep for a while and t thread can continue 
        Thread mainThread = Thread.currentThread();
        mainThread.join(); // it will join anyother thread whichever is runnin and wait for them to continue;
    }
}

