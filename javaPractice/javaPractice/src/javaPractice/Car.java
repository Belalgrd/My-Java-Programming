package javaPractice;

public class Car {
    // Variables (instance fields)
    private String brand;
    private String model;
    private int year;
    private double price;
    
    // Constructor method
    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
    // Methods
    public void displayInfo() {
        System.out.println("Car: " + year + " " + brand + " " + model);
        System.out.println("Price: $" + price);
    }
    
    public void applyDiscount(double percentage) {
        price = price * (1 - percentage / 100);
    }
    
    // Getter methods
    public String getBrand() {
        return brand;
    }
    
    public double getPrice() {
        return price;
    }
    
    // ADD THIS MAIN METHOD TO RUN THE CODE
    public static void main(String[] args) {
        // Create a car object
        Car myCar = new Car("Toyota", "Camry", 2023, 25000.00);
        
        // Display car information
        myCar.displayInfo();
        
        // Apply a discount
        System.out.println("\nApplying 10% discount...");
        myCar.applyDiscount(10);
        
        // Display updated information
        myCar.displayInfo();
        
        // Create another car
        Car anotherCar = new Car("Honda", "Civic", 2022, 22000.00);
        anotherCar.displayInfo();
    }
}
