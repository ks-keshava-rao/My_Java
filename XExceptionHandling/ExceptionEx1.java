package XExceptionHandling;

public class ExceptionEx1 {
    public static void main(String args[]){
        int a =10 , b=0 , c ;
        try{
        c=a/b; //this will stop here in case of exception and go to catch block 
        System.out.println(c);
        System.out.println("Flag-1");
        }
        catch(ArithmeticException e){ 
            System.out.println("Shoudl not be zero "+e);
        }
       System.out.println("Flag-2");// this will be executed 
    }
}
