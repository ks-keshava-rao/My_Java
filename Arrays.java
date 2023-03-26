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
        System.out.
        println(x);
       }
       // 2D arrays 
       int H[][] = new int[5][5];
       int I[][] = {{1,2,3},{5,6,7},{4,2,1}};
       int J[][];
       J= new int[5][5];
       int [][]K = new int[5][5];
       int[] L,M[] ; // L-1D , M-2D
       L = new int[5];
       M = new int[5][5];
       for(int x[]:I){
        for(int y:x){
            System.out.print(y);
        }
        System.out.println(" ");
       }
       //Jagged array - rows same but coloumns different 
       int U[][] = new int[3][];
       U[0]=new int[5];
       U[1]=new int[3];
       U[2]=new int[8];
       for(int i =0 ; i<U.length;i++){
        for(int j=0;j<U[i].length;j++){
            System.out.print(U[i][j]+" ");
        }
        System.out.println(" ");

       }
    }
}
