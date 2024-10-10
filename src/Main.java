public class Main {
    // Creating vehicle instances
    static Vehicle bmw = new Vehicle("BMW", "M4", 2020);
    static Vehicle ford = new Vehicle(1.8F, 110, "USA");

    // Array of Vehicle objects
    static Vehicle[] vehicles = {bmw, ford};

    // Method to print vehicle makes
    public String printVehicleMakes()
    {
        StringBuilder brands = new StringBuilder(); // Use StringBuilder for better performance
        for (Vehicle v : vehicles)
        {
            brands.append("Vehicle brand: ").append(v.make).append("\n"); // Accessing the 'make' field
        }
        return brands.toString(); // Return the accumulated string
    }

    public static void main(String[] args)
    {
        Main main = new Main(); // Create an instance of Main
        System.out.printf("My car is a: %s\n", bmw.make); // Output the BMW make
        Vehicle.numberGen(2); // Assuming this method is defined in Vehicle

        System.out.println(ford.finerDetailsDisplay("horsePower")); // Assuming this method is defined in Vehicle

        // Print the vehicle makes
        System.out.println(main.printVehicleMakes()); // Call the method to print makes
    }
}
