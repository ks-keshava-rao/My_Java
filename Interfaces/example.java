package Interfaces ;

class phone {
    public void call(){
        System.out.println("Phone call");
    }
    public void sms(){
        System.out.println("Phone sms   ");
    }
}
interface Icamera{
    void picture();
    void record();
}
interface Imusicplayer{
    void play();
    void pause();
}
class smartphone extends phone implements Icamera,Imusicplayer{
    public void picture(){
        System.out.println("Picture taken ");
    }
    public void record(){
        System.out.println("recording");
    }
    public void play(){
        System.out.println("music playing");
    }
    public void pause(){
        System.out.println("musics paused");
    }
    public void videocall(){
        System.out.println("video call");
    }
}
public class example { //smartphone class
    public static void main(String[] args){
        smartphone s = new smartphone();
        phone p = s ;
        Icamera c = s;
        Imusicplayer m = s;
        p.call();
        p.sms();
        c.picture();
        c.record();
        m.play();
        m.pause();
    } 
}