package ExceptionHandling;

public class ExceptionEx1 {
    public static void main(String args[]){
        int a =10 , b=0 , c ;
        try{
        c=a/b; //this should not stop the executing the program from further 
        System.out.println(c);
        System.out.println("Flag-1");
        }
        catch(ArithmeticException e){ 
            System.out.println("Shoudl not be zero ");
        }
       System.out.println("lastest");
    }
}
