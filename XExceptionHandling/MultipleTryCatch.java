package XExceptionHandling;

public class MultipleTryCatch {
    public static void main(String[] args){
        try{
        int A[] = {30,20,434,55,345,0};
        int c=A[0]/A[1];
        // int g = A[0]/A[5];
        System.out.println(c);
        System.out.println(A[6]);
        }
        catch(ArithmeticException e){
            System.out.println("Should not be zero"+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index invalid"+e);
        }
        System.out.println("Flag-1");
    }
}
