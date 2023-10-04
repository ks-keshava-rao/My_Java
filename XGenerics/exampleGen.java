package XGenerics;

class Data<T>{
    private T obj;
    public void setData(T v){
        obj=v;
    }
    public T getData(){
        return obj;
    }

}
class myarrayg<T>{
    T a[] = (T[]) new Object[10];
    int len = 0 ;
    public void append(T v ){
        a[len++] = v;
    }
    public void display(){
        for(int i =0;i<len;i++){
            System.out.println(a[i]);
        }
    }
}
class myarrayg2 extends myarrayg<String>{
     
}
@SuppressWarnings("unchecked")
public class exampleGen {
    public static void main(String[] args){
        Data<Integer> d = new Data<>();
        d.setData(10);
        System.out.println(d.getData());
        myarrayg<Integer> ma = new myarrayg<>();
        ma.append(1);
        ma.append(2);
        ma.append(4);
        ma.display();
    }
}
