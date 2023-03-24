package OOPs;
class rect{

    int length , width ;
    int x = 10;

     rect(){
        length=width=1;
    }
     rect(int l,int w){
        this.length = l;
        this.width = w ;
    } 
}
class cube extends rect {
    int height ;
    int x = 20 ; 
    cube(){
        height=1;
    }
    cube(int h){
        this.height = h ; 
    }
    cube(int l , int w ,int h){
        super(l,w);
        this.height = h ; 
    }
    public int volume(){
        return length*height*width;
    }
    public void display(){
        System.out.println(x);//20
        System.out.println(this.x);//20
        System.out.println(this.length);//1 , this refers to whole cube object in this case 
        System.out.println(super.x);//10
    }
}
public class Superex {
    public static void main(String[] args){
        cube c = new cube();
        c.display();
    } 
}
