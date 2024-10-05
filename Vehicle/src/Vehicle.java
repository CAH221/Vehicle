//****************************************************//
//* Author:1717859                                    *//
//* Week:2                                           *//
//*                                                  *//
//* Description: This class represents a Vehicle,    *//
//*              containing properties such as       *//
//*              brand, year of purchase, colour,    *//
//*              engine, and tyres. It includes a    *//
//*              constructor for initializing these  *//
//*              attributes and a toString method    *//
//*              for displaying vehicle details.     *//
//*                                                  *//
//* Date: 05/10/2024                                 *//
//****************************************************//

public class Vehicle {
    // Brand of the vehicle
    private String brand;
    // Year the vehicle was purchased
    private int yearOfPurchase;
    // Colour of the vehicle
    private String colour;
    // Engine details of the vehicle (object of VehicleEngine)
    private VehicleEngine engine;
    // Tyre details of the vehicle (object of Tyres)
    private Tyres tyres;

    // Constructor to initialize the Vehicle object with given attributes
    public Vehicle(String brand, int yearOfPurchase, String colour, VehicleEngine engine, Tyres tyres) {
        this.brand = brand;  // Set the brand of the vehicle
        this.yearOfPurchase = yearOfPurchase;  // Set the year of purchase
        this.colour = colour;  // Set the colour of the vehicle
        this.engine = engine;  // Set the engine details
        this.tyres = tyres;  // Set the tyre details
    }

    // toString method to return a string representation of vehicle details
    @Override
    public String toString() {
        return String.format("Vehicle Brand: %s\nYear of Purchase: %d\nColour: %s\n%s\n%s",
                brand, yearOfPurchase, colour, engine.toString(), tyres.toString());
    }
}
