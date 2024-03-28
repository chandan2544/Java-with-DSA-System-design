// custom Annotation

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

@interface cricketPlayer{

    String country() default "India";
    int age() default 35;

}

@cricketPlayer
class virat{

    @cricketPlayer
    private int inning;
    private int runs;

    @cricketPlayer
    public void setInning(int inning){
        this.inning=inning;
    }

    public int getInning() {
        return inning;
    }

    public void setRun(int runs) {
        this.runs =runs;
    }

    public int getRuns(){
        return runs;
    }
}

public class customAnnotation10 {
    public static void main(String[] args) {
        virat v=new virat();
        v.setInning(300);
        v.setRun(30000);

        System.out.println("Inning : "+v.getInning());
        System.out.println("Runs : "+v.getRuns());

        Class c =v.getClass();
        Annotation a=c.getAnnotation(cricketPlayer.class);
        cricketPlayer cp=(cricketPlayer)a;

        String country=cp.country();
        System.out.println(country);
        int age=cp.age();
        System.out.println(age);

    }
}
