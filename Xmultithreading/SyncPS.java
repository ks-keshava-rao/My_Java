package Xmultithreading;

class ATM {

    synchronized public void checkBalance(String name){
        System.out.println("balance for " + name + " $1000");
    }
   synchronized public void withdraw(String name,int amount){
        System.out.println("withdrawing the amount $"+amount + "for "+ name );
     }
}
class customer1 extends Thread {
    ATM a ;
    String name ;
    int amount ;
    public customer1(ATM a , String name ,int amount ){
        this.a = a;
        this.name = name;
        this.amount = amount ;

    }
    public void useAtm(){
        a.checkBalance(name);
        a.withdraw(name, amount);
    }
    @Override
    public void run(){
        useAtm();
    }
}
public class SyncPS {
    public static void main(String[] args){
        ATM a = new ATM();
        customer1 c1 = new customer1(a, "Keshav", 2330);
        customer1 c2 = new customer1(a, "ramesh", 3445);
        c1.start();
        c2.start();
    }
}
