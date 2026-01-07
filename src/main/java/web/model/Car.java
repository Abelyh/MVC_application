package web.model;

public class Car {
    private String stamp;
    private String model;
    private String color;

    public Car(String stamp, String model, String color) {
        this.stamp = stamp;
        this.model = model;
        this.color = color;
    }

    public String getStamp() {
        return stamp;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
