//****************************************************//
//* Author:1717859                                    *//
//* Week:2                                           *//
//*                                                  *//
//* Description: This class tests the functionality  *//
//*              of the Vehicle, VehicleEngine, and  *//
//*              Tyres classes. It creates instances *//
//*              of these classes and prints out     *//
//*              their details to demonstrate the    *//
//*              relationships between them.         *//
//*                                                  *//
//* Date: 05/10/2024                                 *//
//****************************************************//

public class VehicleTest {
    public static void main(String[] args) {
        // Create 3 VehicleEngine objects with different attributes
        VehicleEngine engine1 = new VehicleEngine(2000, "V6", 2015); // Engine with 2000cc capacity, V6 type, manufactured in 2015
        VehicleEngine engine2 = new VehicleEngine(1800, "I4", 2018); // Engine with 1800cc capacity, Inline 4 type, manufactured in 2018
        VehicleEngine engine3 = new VehicleEngine(2500, "V8", 2020); // Engine with 2500cc capacity, V8 type, manufactured in 2020

        // Create 3 Tyres objects with different attributes
        Tyres tyres1 = new Tyres(200.50, "HighRange", 225); // High range tyres with width of 225 and price of 200.50
        Tyres tyres2 = new Tyres(150.75, "MidRange", 215); // Mid range tyres with width of 215 and price of 150.75
        Tyres tyres3 = new Tyres(100.00, "LowRange", 205); // Low range tyres with width of 205 and price of 100.00

        // Create 3 Vehicle objects using the engines and tyres created above
        Vehicle vehicle1 = new Vehicle("Toyota", 2016, "Red", engine1, tyres1); // Toyota vehicle purchased in 2016, color red, with engine1 and tyres1
        Vehicle vehicle2 = new Vehicle("Honda", 2019, "Blue", engine2, tyres2); // Honda vehicle purchased in 2019, color blue, with engine2 and tyres2
        Vehicle vehicle3 = new Vehicle("Ford", 2021, "Black", engine3, tyres3); // Ford vehicle purchased in 2021, color black, with engine3 and tyres3

        // Print out the details of each vehicle
        System.out.println(vehicle1); // Print details of vehicle1
        System.out.println("-------------------------"); // Separator for readability
        System.out.println(vehicle2); // Print details of vehicle2
        System.out.println("-------------------------"); // Separator for readability
        System.out.println(vehicle3); // Print details of vehicle3
    }
}
