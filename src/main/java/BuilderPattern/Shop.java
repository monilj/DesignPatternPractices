package BuilderPattern;

public class Shop {
    public static void main(String[] args) {
     //   Phone p = new Phone("android",2,"Quakcomm",5.5,31000,13,2);
       Phone p = new PhoneBuilder().setBattery(78).setFrontCamera(8).setOs("android").setProcessor("intel core").getPhone();
        System.out.println(p);
    }
}
