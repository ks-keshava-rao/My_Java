package OOPs;
class Subject{
     private String subId ;
     private String name ;
     public  int maxMarks;
     public int  marksObtain ;

     public Subject(String subId, String name , int maxMarks){
        this.subId = subId;
        this.name = name ; 
        this.maxMarks = maxMarks ;  
     }
     public String getSubId(){
        return subId;
     }
     public String getName(){
        return name;
     }
     public int getMaxMarks(){
        return maxMarks;
     }
     public int getMarksObtain(){
        return marksObtain;
     }
     public void setMaxMarks(int mm){
        maxMarks = mm ; 
     }
     public void setMarksObtain(int marks){
        marksObtain = marks ; 
     }
     public boolean isQualified(){
        return marksObtain>=maxMarks/10*4;
     }
     public String toString(){
        return "\n SubjectId: "+subId+"\n name : "+name+"\n Marks obtained: " + marksObtain;
     }
}
public class ObjectArray{
    public static void main(String[] args){
      Subject subs[] = new Subject[3];
      subs[0] = new Subject("S01","Dsa",100);
      subs[1] = new Subject("S02","OS",100);
      subs[2] = new Subject("S03","DB",100);
      for(Subject s:subs){
        System.out.println(s);
      }
    }
}