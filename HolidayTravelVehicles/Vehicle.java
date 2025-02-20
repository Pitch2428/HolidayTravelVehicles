public class Vehicle {
    public String serialNumber;
    public String name;
    public String model;
    public int year;
    public String manufacturer;
    public double price;

    public Vehicle(String serialNumber, String name, String model, int year, String manufacturer, double price) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Vehicle Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Serial: " + serialNumber);
        System.out.println("Price: $" + price);
    }
}