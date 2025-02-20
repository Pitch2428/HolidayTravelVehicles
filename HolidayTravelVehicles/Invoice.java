public class Invoice {
    public String invoiceID;
    public double finalPrice;
    public double tax;
    public double licenseFee;
    public String signature;
    public Customer customer;
    public Salesperson salesperson;
    public Vehicle vehicle;

    public Invoice(String invoiceID, double finalPrice, double tax, double licenseFee, String signature, Customer customer, Salesperson salesperson, Vehicle vehicle) {
        this.invoiceID = invoiceID;
        this.finalPrice = finalPrice;
        this.tax = tax;
        this.licenseFee = licenseFee;
        this.signature = signature;
        this.customer = customer;
        this.salesperson = salesperson;
        this.vehicle = vehicle;
    }

    public void displayInfo() {
        System.out.println("Invoice ID: " + invoiceID);
        System.out.println("Final Price: $" + finalPrice);
        System.out.println("Tax: $" + tax);
        System.out.println("License Fee: $" + licenseFee);
        System.out.println("Signed by: " + signature);
        customer.displayInfo();
        salesperson.displayInfo();
        vehicle.displayInfo();
    }
}