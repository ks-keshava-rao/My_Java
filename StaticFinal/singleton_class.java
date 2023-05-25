package StaticFinal;
// a class that can create a single object , more than one object of a class is not allowed  
//
class coffeemachine {
    private float cofeqty;
    private float waterqty;
    static private coffeemachine our = null;
    private coffeemachine(){
        cofeqty = 1;
        waterqty = 1;
    }
    public float getcoffee(){
        return 0.3f;
    } 
    static public coffeemachine getInstance(){
        //this method will only create an object of coffee machine only when it is not existing 
        if(our==null) our = new coffeemachine();
        return our;
    }
}
public class singleton_class {
    public static void main(String args[]){
        coffeemachine m1 = coffeemachine.getInstance();
        coffeemachine m2 = coffeemachine.getInstance();
        coffeemachine m3 = coffeemachine.getInstance();
        System.out.println(m1 + " " + m2 + " " +  m3); // all are same instances because they are holding the same object 
        if(m1==m2 && m2 == m3) System.out.println("same");
    }
}
