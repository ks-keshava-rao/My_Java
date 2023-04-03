package Interfaces;
interface Member{
void Callback();
}
class store {
    Member M[] = new Member[100];
    int count=0;
    public void register(Member m){
        M[count++] = m;
    }
    public void invitesale(){
        for(int i = 0 ; i<count;i++){
            M[i].Callback();
        }
    }
}
class customer implements Member{
    String name; 
    customer(String s ){
        this.name = s;
    }
    public void Callback(){
        System.out.println("Callback initiated "+ name);

    }
}
public class Callbackex {
    public static void main(String[] args){
        store s = new store();
        customer c = new customer("john");
        customer c2 = new customer("wick");
        s.register(c2);
        s.register(c);
        s.invitesale();
    }
}
