/*
*  Energy.java
*
* @author  Malcolm Tompkins
* @version 1.0
* @since 2020-11-18
*/

// Imports the scanner class
import java.util.Scanner;
/**
* Calculates the amount of energy produced from a mass
* moving at the speed of light.
*/

final class Energy {
    /**
    * Constant for the speed of light.
    */
    public static final long SPEED_OF_LIGHT = 299792458;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Energy() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Input and scanner
        final Scanner myObj = new Scanner(System.in);
        try {

            System.out.println("Input the mass of the object in kg: ");
            final long mass = myObj.nextLong();

            // Process
            final long energy = mass * (SPEED_OF_LIGHT * SPEED_OF_LIGHT);

            // Output

            System.out.println("The energy produced is: " + energy + " MJ");
        } catch (java.util.inputMismatchException ex) {
            System.out.println("Invalid input");
        }
        System.out.println("\nDone.");
    }
}
