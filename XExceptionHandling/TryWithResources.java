package XExceptionHandling;
import java.io.*;
import java.util.*;

public class TryWithResources {
    static FileInputStream fi;
    static Scanner sc ; 
    static void Divide() throws FileNotFoundException,IOException,ArithmeticException{
        try{
        fi = new FileInputStream("/Users/keshav/Desktop/javaPrac/XExceptionHandling/sample.txt");
        sc = new Scanner(fi);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a/c); //dividing with zero
        }
        finally{
        fi.close();//will definately execute even if there's an exception , 
        sc.close(); // not accessible after this instance 
        }
    }
    static void resourceExceptionHandling() throws FileNotFoundException , IOException{ // .close not required in finally 
        try(FileInputStream f2 = new FileInputStream("/Users/keshav/Desktop/javaPrac/XExceptionHandling/sample.txt");Scanner st=new Scanner(f2)){
        int a = st.nextInt();
        int b = st.nextInt();
        int c = st.nextInt();
        System.out.println(a/b);
        }
    }
    public static void main(String[] args) throws FileNotFoundException,IOException,ArithmeticException{
        try{
        Divide();
        }
        catch(ArithmeticException e){
            System.out.println("Airthematic exeption raised" + e);
        }
        // int x = sc.nextInt(); // trying to access the fourth number here even after the file is closed , if file is not closed it will still read even after raising the exception . 
        // System.out.println(x); // since the scanner is closed it can't read from file , not closing it will allow it to read  44 .
        resourceExceptionHandling();
    }
}
