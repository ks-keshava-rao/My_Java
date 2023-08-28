package Xmultithreading;

class MyData{
    int value;
    boolean flag=true;
    synchronized public void set(int v){
        while(flag!=true){ // producer should wait until it gets its turn i.e true
            try{
                wait();
            }catch(Exception e){} 
        }
        this.value = v;
        flag=false;
        notify();
    }
    synchronized public int get(){
        int x=0;
        while(flag!=false){ //consumer should wait until it gets its turn i.e false
        try{
            wait();
        }
        catch(Exception e){}
      }
        x=this.value;
        flag = true;
        return x ; 
    }
}
class producer extends Thread{
    MyData data;
    public producer(MyData d){
        this.data = d;
    }
    public void run(){
        int count = 1;
        while(true){
            data.set(count);
            System.out.println("Producer " + count);
            count++;
        }
    }
}
class consumer extends Thread{
    MyData data;
    public consumer(MyData d){
     this.data = d; 
    }
    public void run(){ 
        while(true){
            int value;
            value = data.get();
            System.out.println("consumer "+ value);
        }
    }
}
public class InterThreadCommunication {
    public static void main(String[] args){
        MyData d = new MyData();
        producer p = new producer(d);
        consumer c = new consumer(d);
        p.start();
        c.start();
    }
}
