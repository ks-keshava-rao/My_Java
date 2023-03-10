import java.util.*;
public class Arrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size ;
        size = sc.nextInt();
        //initializations 
        int A[] = {1,2,3,4,8,5}; 
        int intArray[] = new int[size];
        int c[];
        c = new int[10];
        int []d = new int[5];
        int[] e = new int[5];
        for(int i=0;i<size;i++){
            intArray[i]=sc.nextInt();
        }
        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
       for(int x : intArray){ //foreach loop 
        System.out.println(x);
       }
    }
}
