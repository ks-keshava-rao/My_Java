package XExceptionHandling;

class negetiveDimesionException extends Exception {
    public String toString(){
        return "values cannot be negetive";
    }
}
public class ThrowsThrow {
    static int areacalc(int l , int b) throws Exception{
        if(l<0||b<0)
        throw new Exception();
       return l*b;
    }
    static int pericalc(int l , int b ) throws negetiveDimesionException{
        if(l<0 || b<0){
            throw new negetiveDimesionException();
        }
        return 2*(l+b);
    }
    static void  periprint(){
        try{
         System.out.println("perimeter is "+ pericalc(4, -5));
        }
        catch(negetiveDimesionException e){
            System.out.println(e);
        }
    }
    static void areaprint() throws Exception{
        System.out.println("Area is " + areacalc(8, 5));
    }

    public static void main(String[] args) {
        try {
        areaprint();
        periprint();
        }
        catch(Exception e){
            System.out.println("Handled"+e);
        }
    }
}
