package XAnnotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS) //This will be available in the class , when the code is compiled in the compiles the annotatin will be availble with the class file. then the metadata can be fetched using reflection.
// @Retention(Retention.RUNTIME)
@Documented // this gives the documenataion support for the annotation
@Target(value={ElementType.LOCAL_VARIABLE,ElementType.METHOD}) // This mentions the target where the annotaion should be used , construcrtor , field , local varialble , class , parameter etc
@Inherited //if the annotation is used on a class then it is also applicable on the subclasses
@Repeatable(myanno2.class) // should be in a separate file with the interface as public then to be used here 

@interface myanno2{
    String data();
}
public class BuiltInAnn {
    public static void main(String args[]){

    }
}
