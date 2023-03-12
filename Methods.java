public class Methods {
    // if objects are passed as parameters then the refernce is passed and modification inside the method will modified the object as well .
    // contents of actual parameters is copied into formal parameters 
    static void update(int A[]){
        A[0]=25;
    }
    static String userName(String email){
        int index = email.indexOf('@');
        String name = email.substring(0, index);
        return name;
    }
    static void show(int ...x){
        for(int a:x){
            System.out.println(a);
        }
    }
    static void showList(String ...s){
        for(int i=0; i<s.length;i++){
            System.out.println(i+1+"."+s[i]);
        }
    }
    public static void main(String ...args){
        int A[] = {2,3,4,5,5,6};
        update(A);
        System.out.println(A[0]); // 25
        String emailid = new String("keshava.balaji@anywhere.co");
        System.out.println(userName(emailid));// passing object as parameter

    //Variable arguments :- method with many parameters
    show(10,20,30,50);
    show(new int[]{1,2,3,4,5,5,6});//anonymous array
    showList("hello","my","name","is","keshav");
    for(String w:args){ //command line arguments
        System.out.println(w);
     }
    }
}
