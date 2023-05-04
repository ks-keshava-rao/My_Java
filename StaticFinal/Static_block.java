package StaticFinal;
//Static block is executred when the class is loaded , before the creation of any object
class staticblock{
    static {
        System.out.println("block 1 class"); // this will only execute when the object is created 
    }
    static {
        System.out.println("block 2 class");
    }
}
public class Static_block {
    static {
        System.out.println("block 1");
    }
    static {
        System.out.println("block 2");
    }
    public static void main(String[] args){
        System.out.println("Main"); //static blocks are executed first 
        staticblock s = new staticblock();
   }
}
