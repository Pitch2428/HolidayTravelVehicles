public class Invoice {
    private String invoiceID;
    private double finalPrice;
    private double tax;
    private double licenseFee;
    private String signature;

    public Invoice(String invoiceID, double finalPrice, double tax, double licenseFee, String signature) {
        this.invoiceID = invoiceID;
        this.finalPrice = finalPrice;
        this.tax = tax;
        this.licenseFee = licenseFee;
        this.signature = signature;
    }
}