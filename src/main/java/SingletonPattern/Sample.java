package SingletonPattern;

public class Sample {
    static Sample obj = new Sample();
    private Sample(){}
    public static Sample getInstace(){
        return obj  ;
    }
}
