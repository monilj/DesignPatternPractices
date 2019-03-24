package FactoryPattern;

public class MainClass {
    public static void main(String[] args) {
//        OS osAndroid = new Android();
//        osAndroid.spec();
//        OS osIos = new Ios();
//        osIos.spec();
//        OS osWindows = new Windows();
//        osWindows.spec();

        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS oo= osf.getInstance("Use android");
        oo.spec();
    }
}
