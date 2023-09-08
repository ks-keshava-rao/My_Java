//Classes for creating objects for primitive data types
// Wrapping around a varialble it becomes an object its called boxing
// Getting a primitive out of the object is called unboxing
public class wrapperclasses{
public static void main(String[] args){
        Integer i = new Integer(10);
        Integer a = Integer.valueOf(10);
        Integer b = 10;

        Byte c =13;
        Byte  d = Byte.valueOf("433");
        byte bb = 14;
        Byte  ff = Byte.valueOf(bb);
        Float g = 12.3f;
        Float h = Float.valueOf("123.44");
        Character k = Character.valueOf('A');
        Boolean l = Boolean.valueOf("true");
   }
}