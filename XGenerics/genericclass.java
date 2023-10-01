package XGenerics;

public class genericclass<T> {
    T data[] = (T[]) new Object[3];
    public static void main(String[] args){
        genericclass<String> gd = new genericclass<>();
        gd.data[0] = "hi";
        gd.data[1] = "helo";
        // gd.data[9] = 3; // not allowed as the type is String
    }
}
