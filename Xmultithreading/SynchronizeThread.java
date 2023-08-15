package Xmultithreading;

class SynchResource { //Shared resource 
 public void display(String str){
    synchronized(this){ // this block becomes the monitor and only one thread is allowed at a time this can be done for the whole method synchronized public void display(String str){};
            for(int i = 0 ; i<str.length();i++){
                System.out.print (str.charAt(i));
                try{Thread.sleep(100);}catch(Exception e){} // even during the sleep time only one thread is allowered at a time .
             }
        }
    }
}
 class Thread1class extends Thread {
    SynchResource sy ;
    public Thread1class(SynchResource sy) {
        this.sy = sy; 
    }
    @Override
    public void run() {
        sy.display("This project is for the ");
    }
 }
 class Thread2class extends Thread {
    SynchResource sy ;
    public Thread2class(SynchResource sy) {
        this.sy = sy; 
    }
    @Override
    public void run (){
        sy.display("topic synchronization in java");
    }
 }
 public class SynchronizeThread{
    public static void main(String[] args){
     SynchResource s = new SynchResource();

     Thread1class t1 = new Thread1class(s);
     Thread2class t2 = new Thread2class(s);
     t1.start();
     t2.start();
    }
 }

