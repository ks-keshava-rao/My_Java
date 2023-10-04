package XcollectionFramework;
import java.util.*;
public class ArryaList {
    public static void main(String[] args)
    {
        ArrayList<Integer> all = new ArrayList<>(20);
        ArrayList<Integer> all2 = new ArrayList<>(List.of(40,484,343,454,343,666));
        all.add(3);
        all.add(0,4);
        all.addAll(0,all2); // can be done without index as well , will add at last 
        System.out.println(all);
        System.out.println(all.indexOf(666));
        all.set(0,41);
        System.out.println(all);

        //Iteration
        for(int i = 0;i<all.size();i++){
            System.out.print(" " +all.get(i));
        }
        for(var x:all){
             System.out.println(x);
        }
        Iterator<Integer> it = all.iterator();//unidirectional 
        while(it.hasNext()){
            System.out.println(it.next());
        }
         ListIterator<Integer> it2 = all.listIterator(); //bi directional.
          while(it2.hasNext()){
            System.out.println(it2.next());
        }
        all.forEach(n->System.out.println(n));
        all.forEach(System.out::println);
    }
}
