package FactoryPattern;

public class OperatingSystemFactory {
    public OS getInstance(String os){
        if(os.equals("Use android"))
            return new Android();
        else if(os.equals("use iOS"))
            return new Ios();
        else
            return new  Windows();
    }
}
