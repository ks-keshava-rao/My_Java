package XAnnotations;

@interface Myanno{
 String name(); //elements of annotation
 String project() default "sample"; // default value incase value not provided
 String date();
 float version(); // these are the meta data for the class
}

@Myanno(name = "Keshav",project = "example" , date = "todat" ,version = 0.2f)
public class UserdefinedAnnotation {
    @Myanno(name = "Keshav",project = "example" , date = "todat" ,version = 0.2f)
    int data ;
    @Myanno(name = "Keshav",project = "example" , date = "todat" ,version = 0.2f)
    public static void main( @Myanno(name = "Keshav",project = "example" , date = "todat" ,version = 0.2f) String[] args){
        
    }
}
