package XLambaExpressions;

@FunctionalInterface
interface MyLambda{ // if a interface is have a single abstract method then it is called as functioinal interface
 public void display(String str);
}

// class demoLambda implements MyLambda{ // this process is eliminated by lambda expression
//     public void display(){
//         System.out.println("live");
//     }
// }
public class lambda {
    public static void main(String[] args){
        // MyLambda m = new MyLambda() {
        //     public void display(){
        //         System.out.println("anonymous class"); //this process is also eliminated by lambda expression
        //     }
        // };
        // converting the anonymous class to lambda .
        MyLambda m = (s) -> System.out.println(s); // this referes to the display mehtod since the refernce is to the interface andthere is only one method in the interface . 
        m.display("lambda expression");
    }
}
