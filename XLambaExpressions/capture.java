package XLambaExpressions;

interface newLambda{

    public void displa();

}
class lambdaDemo{

    int temp = 10;
    public void method1(){
    int count = 0;

    newLambda n = () -> {
     System.out.println(count); //lambda expression can onlyh access local varialbles out it's context only final or effectively final(never modified inside the method)
     System.out.println("instance vairabe" + (++temp)); // can access instance variables and modify as well
    };
    n.displa();
 }
}

class uselambda{

    public void calllambda(newLambda ne){
        ne.displa();
    }
}

class demomethod{
    public void methods2(){
        uselambda u = new uselambda();
        u.calllambda(()->{System.out.println("passing lambda");}); //passed as a parameter
    }
}
public class capture {
    public static void main(String args[]){
    demomethod d = new demomethod();
    d.methods2();
    }
}
