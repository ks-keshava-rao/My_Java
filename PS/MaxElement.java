package PS;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int size;
            size = sc.nextInt();
            int[] array = new int[size];
            for(int i=0; i<array.length ; i++){
                array[i]=sc.nextInt();
            }
            int temp=0;
            for(int i=0; i<array.length ; i++){
                if(array[i]>temp){
                   temp = array[i];
                }
            }
            System.out.println(temp);
        }
    }
}
