enum Dept{
    CS,IT,CIVIL,EEE ;//every identifier here is static and final.
    private Dept(){
        System.out.print("ge");
    }
}
public class enums {
    public static void main(String[] args){
        Dept d = Dept.CS; // d can only be assinged which are defined .\
        Dept list[] = Dept.values();
        System.out.println(d.name());
        System.out.println(Dept.valueOf("CIVIL"));
        for(Dept x: list){
            System.out.println(x);
        }
    }
}
