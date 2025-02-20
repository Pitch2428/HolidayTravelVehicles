public class Salesperson {
    public String salespersonID;
    public String name;
    public int yearsOfExperience;

    public Salesperson(String salespersonID, String name, int yearsOfExperience) {
        this.salespersonID = salespersonID;
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void displayInfo() {
        System.out.println("Salesperson ID: " + salespersonID);
        System.out.println("Name: " + name);
        System.out.println("Experience: " + yearsOfExperience + " years");
    }
}