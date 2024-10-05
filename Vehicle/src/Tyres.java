//****************************************************//
//* Author:1717859                                    *//
//* Week:2                                           *//
//*                                                  *//
//* Description: This class represents Tyres,        *//
//*              containing properties such as       *//
//*              price, category, and width. It      *//
//*              includes a constructor for          *//
//*              initializing these attributes and   *//
//*              a toString method for displaying    *//
//*              tyre details.                       *//
//*                                                  *//
//* Date: 05/10/2024                                 *//
//****************************************************//

public class Tyres {
    // Price of the tyres
    private double price;
    // Category of the tyres (e.g., "HighRange", "MidRange", "LowRange")
    private String cat;
    // Width of the tyres
    private int width;

    // Constructor to initialize the Tyres object with given attributes
    public Tyres(double price, String cat, int width) {
        this.price = price;  // Set the price of the tyres
        this.cat = cat;  // Set the category of the tyres
        this.width = width;  // Set the width of the tyres
    }

    // toString method to return a string representation of tyre details
    @Override
    public String toString() {
        return String.format("Tyres:\nPrice: %.2f\nCategory: %s\nWidth: %d", price, cat, width);
    }
}
