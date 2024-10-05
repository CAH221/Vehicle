//****************************************************//
//* Author:1717859                                    *//
//* Week:2                                           *//
//*                                                  *//
//* Description: This class represents a Vehicle     *//
//*              Engine, containing properties such  *//
//*              as cylinder size, cylinder type,    *//
//*              and year of production. It includes *//
//*              a constructor for initializing these*//
//*              attributes and a toString method    *//
//*              for displaying engine details.      *//
//*                                                  *//
//* Date: 05/10/2024                                 *//
//****************************************************//

public class VehicleEngine {
    // Size of the engine cylinders (in cubic centimeters, cc)
    private int cylinderSize;
    // Type of engine cylinders (e.g., V6, I4, V8)
    private String cylinderType;
    // Year the engine was produced
    private int yearOfProduction;

    // Constructor to initialize the VehicleEngine object with given attributes
    public VehicleEngine(int cylinderSize, String cylinderType, int yearOfProduction) {
        this.cylinderSize = cylinderSize;  // Set the size of the engine cylinders
        this.cylinderType = cylinderType;  // Set the type of the engine cylinders
        this.yearOfProduction = yearOfProduction;  // Set the year of production for the engine
    }

    // toString method to return a string representation of the engine details
    @Override
    public String toString() {
        return String.format("Vehicle Engine:\nCylinder Size: %d\nCylinder Type: %s\nYear of Production: %d",
                cylinderSize, cylinderType, yearOfProduction);
    }
}
