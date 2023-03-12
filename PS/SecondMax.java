package PS;
import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int size;
            size = sc.nextInt();
            int[] array = new int[size];
            for(int i=0; i<array.length ; i++){
                array[i]=sc.nextInt();
            }
            int max2;
            int max=max2=array[0];
            for(int i=0; i<array.length ; i++){
                if(array[i]>max ){
                    max2 = max;
                    max = array[i];
                }
                else if(array[i]>max2){
                    max2 = array[i];
                }
            }
            System.out.println(max2);
        }
    }
}
