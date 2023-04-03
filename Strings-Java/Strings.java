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
        System.out.println(string.toLowerCase());// won't effect the existing str it will create new object in heap and return it 
        string = string.toLowerCase();//this will create new object and string will point to new object in heap. 
        System.out.println(string.toLowerCase()); 
        string = "string with space"; 
        System.out.println("trim" + string.trim()); // remove blank spaces 
        System.out.println("substring" + string.substring(3));//index to end
        System.out.println("substring" + string.substring(3,5));//index to end 
        String string2 = "welcome";
        System.out.println("replace " + string2.replace('e','k'));
        string2 = "www.fullcreative.com";
        System.out.println(string2.startsWith("www")); //checks starts with .
        System.out.println(string2.endsWith(".com")); //checks starts with .
        System.out.println(string2.charAt(4)); // givesa index position
        System.out.println(string2.indexOf('.')); // character or string both check. if not found returns -1
        System.out.println(string2.indexOf('.',4)); //starting point can also be given.
        System.out.println(string2.indexOf("full")); // character or string both check.
        System.out.println(string2.lastIndexOf("full"));  
        String s1 = "JAVA" ;
        String s2 = "java" ;
        String s3 = "python";
        String s4 = "python";
        System.out.println(s3.equals(s4));  
        System.out.println(s4.equals(s3));  
        System.out.println(s2.equals(s1)); // case sensitive
        System.out.println(s2.equalsIgnoreCase(s1));
        System.out.println(s2.compareTo(s3));//checks in dicionary order , s2<s3 , -1 
        System.out.println(s3.compareTo(s2));//checks in dicionary order , s3<s2 , +1 if same 0  
        System.out.println(s1.compareTo(s2));//-1 uppercase < lowecase , ascii , also returns the differnce b/w ascii codes 
        s1 = "java" ;
        String s5 = new String("java");
        System.out.println(s1.equals(s2)); // true because same referce to literal in pool 
        System.out.println(s1.equals(s5)); // true because same referce to literal in pool 
        System.out.println(s1==s5); // false because s5 is refernce to the objec not the literal in pool 
        int tem = 2 ; 
        String temp = String.valueOf(tem);
        System.out.println((temp)); // converts any type of data to string type of data
    }
}
 