// Here I will be creating a java program that calculates the BMI 
// The units this program uses are Kilograms and Metres

// I start by importing all the modules from java.util
import java.util.*;

// here I create the main driver class
class UserBMI {
    public static void main(String[] args) {
        // System.in is a standard input stream
        // creates a new Scanner instance which points to the input stream passed as
        Scanner sc = new Scanner(System.in);
        // here I collect the first user input which is the weight
        System.out.print("Enter Your Weight in Kilograms (KG):  ");
        double Weight = sc.nextDouble();

        // here I collect the first user input which is the weight
        System.out.print("Enter Your Height in Meters (M):  ");
        double Height = sc.nextDouble();

        double c = Height * Height;
        double d = Weight / c;
        // here i print out the BMI of the person
        System.out.println("Your BMI is :  " + d);
    }
}
