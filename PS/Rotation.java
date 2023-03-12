package PS;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int A[] = new int[size];
        for(int i = 0 ; i<A.length; i++){
            A[i]=sc.nextInt();
        }
        int temp = A[0];
        for(int i = 1 ; i<A.length; i++){
            A[i-1]=A[i]; 
        }
        A[A.length-1]=temp;
        for(int x : A){
            System.out.print(" " + x);
        }
    }
}
