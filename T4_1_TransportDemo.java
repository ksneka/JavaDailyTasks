package dailyTasks;

// Parent class
class Transport {              
    String brand;
    double price;

    Transport(String brand, double price) {   // Constructor
        this.brand = brand;
        this.price = price;
    }

    void displayInfo() {      // Common method
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

// Child class 1
class Sedan extends Transport {  
    int numberOfDoors;

    Sedan(String brand, double price, int numberOfDoors) {
        super(brand, price);  // Call parent constructor
        this.numberOfDoors = numberOfDoors;
    }

    void showDetails() {
        displayInfo();  // Parent details
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Child class 2
class Motorcycle extends Transport { 
    boolean hasGear;

    Motorcycle(String brand, double price, boolean hasGear) {
        super(brand, price);  // Parent constructor
        this.hasGear = hasGear;
    }

    void showDetails() {
        displayInfo();
        System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
    }
}

// Child class 3
class Lorry extends Transport { 
    int loadCapacity;

    Lorry(String brand, double price, int loadCapacity) {
        super(brand, price);
        this.loadCapacity = loadCapacity;
    }

    void showDetails() {
        displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " KG");
    }
}

// Main class
public class T4_1_TransportDemo {
    public static void main(String[] args) {
        // Creating objects
        Sedan sedan = new Sedan("Toyota", 1500000, 4);
        Motorcycle bike = new Motorcycle("Yamaha", 95000, true);
        Lorry truck = new Lorry("Tata", 2000000, 18000);

        // Displaying details
        System.out.println("Sedan Details:");
        sedan.showDetails();

        System.out.println("\nMotorcycle Details:");
        bike.showDetails();

        System.out.println("\nLorry Details:");
        truck.showDetails();
    }
}

