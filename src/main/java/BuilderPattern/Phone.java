package BuilderPattern;

public class Phone {

    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;
    private int frontCamera;
    private int noOfSimCards;

    public Phone(String os, int ram, String processor, double screenSize, int battery, int frontCamera, int noOfSimCards) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
        this.frontCamera = frontCamera;
        this.noOfSimCards = noOfSimCards;
    }

    @Override
    public String toString() {
        return "Phone{" + "os='" + os + '\'' + ", ram=" + ram + ", processor='" + processor + '\'' + ", screenSize=" + screenSize + ", battery=" + battery + ", frontCamera='" + frontCamera +" MP" + '\'' + ", noOfSimCards=" + noOfSimCards + '}';
    }


}
