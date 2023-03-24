package OOPs;
class rectangle{

    int length , width ;

    rectangle(){
        length=width=1;
    }
    rectangle(int l,int w){
        this.length = l;
        this.width = w ;
    } 
}
class cuboid extends rectangle{
    int height ;
    cuboid(){
        height=1;
    }
    cuboid(int h){
        this.height = h ; 
    }
    cuboid(int l , int w ,int h){
        super(l,w);
        this.height = h ; 
    }
    public int volume(){
        return length*height*width;
    }
}
public class SuperConst2 {
    public static void main(String[] args){
        cuboid c = new cuboid();
        cuboid c2 = new cuboid(10);
        cuboid c3 = new cuboid(10,10,10);
        System.out.println(c.volume());//1
        System.out.println(c2.volume());//10
        System.out.println(c3.volume());//1000
    } 
}
