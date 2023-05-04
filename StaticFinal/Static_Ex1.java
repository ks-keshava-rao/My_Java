package StaticFinal;

/* 
 * 1. static keyword is used for representing meta data 
 * 2. representing a information or data related to a class not a object
 * 3. if one object manipulates a static member it's reflected in other members too 
 * 4. it can be used as shared data 
 * 5. Classname.staticMember
 * 6. Static members are created inside a method area not heap 
 * 7. Static methods can access only static members not other members of class .
 * 
*/
class staticdemo{
    static int i=10 ;
    int y = 33 ;
    void show(){
        System.out.println(i + " " + y);
    }
    static void display(){
        System.out.println(i); // cannot access non-static y
    }
}
public class Static_Ex1 {
    public static void main(String[] args){
    staticdemo d = new staticdemo();
    d.show();
    d.display();
    d.y=3;
    d.i=24;
    // staticdemo.i = 34;
    staticdemo d2 = new staticdemo();
    d2.show();
    d2.display();
    }

}
