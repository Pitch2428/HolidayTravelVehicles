public class TradeInVehicle {
    private String serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double price;

    public TradeInVehicle(String serialNumber, String name, String model, int year, String manufacturer, double price) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.price = price;
    }
}