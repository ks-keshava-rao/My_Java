package XExceptionHandling;

public class FinallyDemo {
    static void meth1() throws Exception{
        try{
        throw new Exception();
        }
        finally{
        System.out.println("Final message"); // unreachable if this statement is without try finally block .
        }
    }
    public static void main(String[] args) throws Exception{
        try{
        System.out.println(10/2);
        }
        catch(ArithmeticException e){
            System.out.print(e);
        }
        finally{
        System.out.println("final message main"); // without finally this won't be executed , without                          //catch block finally excutes first then exception , with catch exception first , finally in the last . 
        }
        meth1();
    }
}
