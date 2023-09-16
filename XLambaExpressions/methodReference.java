package XLambaExpressions;

interface referenceInterface{
    public void display(String str);
}
public class methodReference {
    public static void reverse(String str){
        StringBuffer strRev = new StringBuffer("hello");
        strRev.reverse();
        System.out.println(strRev);
    }
    public static void main(String args[]){
        // referenceInterface rf = System.out::println;//passing the refernce of the println method using scope resolution
        referenceInterface rf = methodReference::reverse; // use object in case of non static member
        rf.display("hello");
    }
}
