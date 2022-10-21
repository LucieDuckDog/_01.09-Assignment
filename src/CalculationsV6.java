/**
 * Purpose: The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals. This is an updated version that enhances the user experience
 * when reading the output.
 *
 * @author Curt Wheeler
 * @version September 10, 2022
 */
public class CalculationsV6
{
    public static void main(String[] args)
    {
        // Declare integer variables
        int int1 = 25;
        int int2 = 9;
        int int3 = 11;

        // Declare double variables
        double doub1 = 43.21;
        double doub2 = 3.14;
        double doub3 = 10.0;

        // Addition
        System.out.println("Addition");
        System.out.println(int1 + " + " + int2 + " = "  + (int1 + int2));
        System.out.println(doub1 + " + " + doub2 + " = "  + (doub1 + doub2));
        System.out.println();

        // Subtraction
        System.out.println("Subtraction");
        System.out.println(int3 + " - " + int2 + " - " + int1 + " = " + (int3 - int2 - int1));
        System.out.println(doub2 + " - " + doub3 + " = " + (doub2 - doub3));
        System.out.println();

        // Multiplication
        System.out.println("Multiplication");
        System.out.println(int1 + " * " + int2 + " = " + (int1 * int2));
        System.out.println(doub2 + " * " + doub3 + " * " + doub3 + " = " + (doub2 * doub3 * doub3));
        System.out.println();

        // Division
        System.out.println("Division");
        System.out.println(int2 + " / " + int1 + " = " + (int2 / int1));
        System.out.println(doub1 + " / " + doub3 + " = " + (doub1 / doub3));
        System.out.println();

        // Modulus operator
        System.out.println("Modulus");
        System.out.println(int3 + " % " + int2 + " = "  + (int3 % int2));
        System.out.println(doub3 + " % " + doub2 + " = " + (doub3 % doub2));
        System.out.println();

        // 1.08 Additional int Equations


        // 1.09 Additional double Equations


    } // end of main method
} // end of class
