import java.util.*;
public class Arrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size ;
        size = sc.nextInt();
        int[] intArray = new int[size];
        for(int i=0;i<size;i++){
            intArray[i]=sc.nextInt();
        }
        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

    }
}
