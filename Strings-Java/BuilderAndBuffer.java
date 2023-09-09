//for a mutable string we use string buffer - all string methods + extra 
// String thread safe i.e no two threads can cannot use a same string buffer as it's synchronized and its slower.
// String builder is faster and not a thread safe
// by default capacity is 16
public class BuilderAndBuffer {
    public static void main(String[] args){
        String s1 = new String("Hello");
        s1.concat("orignial"); // this will remain same as it creates a new object 
        StringBuffer s2 = new StringBuffer("Hello again").append("stringbuffer"); // this will modify
        StringBuilder s3 = new StringBuilder("Hello again").append("String builder"); // this will also modify
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
