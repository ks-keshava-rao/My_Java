package XGenerics;
public class generic1{
    public static void main(String args[]){
        // Object obj = new String("Hello");
        // obj = new Integer(10);
        // String str =  (String)obj;

        Object obj1[] = new Object[3]; //any object in array can be a any datatype 
        obj1[0] = "hi";
        obj1[1] = "hello";
        obj1[2] = new Integer(23); // no type safety 
        for(int i =0; i <3;i++){
            String str = (String )obj1[i];
            System.out.println(str);
        }


    }
}