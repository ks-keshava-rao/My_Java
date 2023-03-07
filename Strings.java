import java.util.*;
public class Strings {
    public static void main(String[] args){
        // String is a class used as a datatype 
        // String str1(reference) = "Java program"(String object,literal)  
        // constructors String(char[] or byte[] or string)
        char c[] = {'A','B','C','D','E','F','G'}; // arry of characters .
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();        
        System.out.println(str.charAt(3));
        System.out.println(str.length());
        String bytestring = new String(c,2,5); // offset and count 
        System.out.println(bytestring);
        // Method - II 
        // new object in heap and string literal in constants pool 
        String str2 = new String("second method");
        // it will point to the same pool object to which str2 point because literal is same 
        String str1 = "second method" ; 
        String str3 = "second method" ; 
        System.out.println(str1==str2);//false because str2 refers to heap object
        System.out.println(str1==str3);// true

        /******************************************************/
        //METHODS OF STRING CLASS

        //strings are immutable , a string object cannot be modified ,  
        String string = "samplestring";  
        System.out.println(string.length());
        // System.println();
        // System.println();
        // System.println();
        // System.println();
        // System.println();
        // System.println();
        // System.println();
        // System.println();

    }
}
 