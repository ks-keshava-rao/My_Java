package XExceptionHandling;
import java.io;
import java.io.FileInputStream.*;

class customBalanceCheckException extends Exception{
    @Override
    public String toString(){
        return "minimum balace should be 80rs";
    }
}
public class CheckedAndUnchecked {
    static void func1(){
        // try{
        // System.out.println(10/0); // checked
        // }
        // catch(Exception e){
        //     System.out.println(e.getMessage());
        //     e.printStackTrace();
        // }
            // FileInputStream f = new FileInputStream("My.txt"); checked exceptions 
            try{
                throw new customBalanceCheckException(); //because it is inherited from Exception class it has become checked exception
            }
            catch(customBalanceCheckException e){
                System.out.println(e);
            }
    }
    static void func2(){
        func1();
    }
    static void func3(){
        func2();
    }
    public static void main(String[] args){
        func3();
    }
}
