package web.model;

public class Car {
    private String model;
    private String manufacturer;
    private int year;
    private String color;
    private double price;

    public Car() {
    }

    public Car(String model, String manufacturer, int year, String color, double price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
