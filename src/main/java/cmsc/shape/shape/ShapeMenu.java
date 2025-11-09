/**
 * Name: Matthew Lukenich
 * Class: CMSC 335
 * File: ShapeMenu.java
 * Date: 10/28/2025
 */
package cmsc.shape.shape;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class to build the front end of the Shape Project
 */
public class ShapeMenu {

        private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---------- Shapes Program -------------");
        boolean continueProgram = true;

        do {
            printMenu();
            int choice = getMenuChoice();

            switch (choice) {
                case 1:
                    handleCircle();
                    break;
                case 2:
                    handleRectangle();
                    break;
                case 3:
                    handleSquare();
                    break;
                case 4:
                    handleTriangle();
                    break;
                case 5:
                    handleSphere();
                    break;
                case 6:
                    handleCube();
                    break;
                case 7:
                    handleCone();
                    break;
                case 8:
                    handleCylinder();
                    break;
                case 9:
                    handleTorus();
                    break;
                case 10:
                    continueProgram = false;
                    handleExit();
                    break;
                default:
                    // default should not happen
                    System.out.println("Invalid choice. Please try again.");
            }

            if (continueProgram) {
                continueProgram = askToContinue();
            }

        } while (continueProgram);

        scanner.close();
    }

    /**
     * Prints the main menu options to the console.
     */
    private static void printMenu() {
        System.out.println("Select from the menu below:");
        System.out.println("1. Construct a Circle");
        System.out.println("2. Construct a Rectangle");
        System.out.println("3. Construct a Square");
        System.out.println("4. Construct a Triangle");
        System.out.println("5. Construct a Sphere");
        System.out.println("6. Construct a Cube");
        System.out.println("7. Construct a Cone");
        System.out.println("8. Construct a Cylinder");
        System.out.println("9. Construct a Torus");
        System.out.println("10. Exit the program");
    }

    /*
     * Gets and validates the user's menu choice
     * @return int between 1 and 10
     */
    private static int getMenuChoice() {
        int choice = -1;
        while (choice < 1 || choice > 10) {
            try {
                System.out.print("Enter your choice (1-10): ");
                choice = scanner.nextInt();
                if (choice < 1 || choice > 10) {
                    System.out.println("Error: Please enter a number between 1 and 10.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a number.");
                scanner.next(); // Clear the scanner
            }
        }
        return choice;
    }

    /*
     * Private method to enforce postiive double value from user.
     * @param prompt
     * @return value
     */
    private static double getPositiveDoubleInput(String prompt) {
        
        double value = -1;
        while(value < 0) {
            try {
                System.out.println(prompt);
                                value = scanner.nextDouble();
                if (value <= 0) {
                    System.out.println("Error: Please enter a positive number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        }
        return value;
    }

    /**
     * Asks the user if they want to continue.
     * @return true/false Y/N
     */
    private static boolean askToContinue() {
        while (true) {
            System.out.print("Continue? (Y or N)\n");
            String input = scanner.next().trim().toUpperCase();
            if (input.equals("Y")) {
                return true;
            } else if (input.equals("N")) {
                return false;
            } else {
                System.out.println("Invalid input. Enter Y or N");
            }
        }
    }

    // shape handler methods

    private static void handleCircle() {
        
        System.out.println("You have selected a Circle");
        
        double radius = getPositiveDoubleInput("What is the radius? ");
        Circle circle = new Circle(radius);
        
        System.out.printf("The area of the Circle is %.2f\n", circle.getArea());
    }

    private static void handleRectangle() {
        
        System.out.println("You have selected a Rectangle");
        
        double length = getPositiveDoubleInput("What is the length? ");
        double width = getPositiveDoubleInput("What is the width? ");
        Rectangle rectangle = new Rectangle(length, width);
        
        System.out.printf("The area of the Rectangle is %.2f\n", rectangle.getArea());
    }

    private static void handleSquare() {
        
        System.out.println("You have selected a Square");
        
        double side = getPositiveDoubleInput("What is the side length? ");
        Square square = new Square(side);
        
        System.out.printf("The area of the Square is %.2f\n", square.getArea());
    }

    private static void handleTriangle() {
        
        System.out.println("You have selected a Triangle");
        
        double base = getPositiveDoubleInput("What is the base? ");
        double height = getPositiveDoubleInput("What is the height? ");
        Triangle triangle = new Triangle(base, height);
        
        System.out.printf("The area of the Triangle is %.2f\n", triangle.getArea());
    }

    private static void handleSphere() {
        
        System.out.println("You have selected a Sphere");
        
        double radius = getPositiveDoubleInput("What is the radius? ");
        Sphere sphere = new Sphere(radius);
        
        System.out.printf("The volume of the Sphere is %.2f\n", sphere.getVolume());
    }

    private static void handleCube() {
        
        System.out.println("You have selected a Cube");
        
        double side = getPositiveDoubleInput("What is the side length? ");
        Cube cube = new Cube(side);
        
        System.out.printf("The volume of the Cube is %.2f\n", cube.getVolume());
    }

    private static void handleCone() {
        
        System.out.println("You have selected a Cone");
        
        double radius = getPositiveDoubleInput("What is the radius? ");
        double height = getPositiveDoubleInput("What is the height? ");
        Cone cone = new Cone(radius, height);
        
        System.out.printf("The volume of the Cone is %.2f\n", cone.getVolume());
    }

    private static void handleCylinder() {
        System.out.println("You have selected a Cylinder");
        
        double radius = getPositiveDoubleInput("What is the radius? ");
        double height = getPositiveDoubleInput("What is the height? ");
        Cylinder cylinder = new Cylinder(radius, height);
        
        System.out.printf("The volume of the Cylinder is %.2f\n", cylinder.getVolume());
    }

    private static void handleTorus() {

        System.out.println("You have selected a Torus");

        double majorRadius = getPositiveDoubleInput("What is the major radius? ");
        double minorRadius = getPositiveDoubleInput("What is the minor radius? ");
        Torus torus = new Torus(majorRadius, minorRadius);

        System.out.printf("The volume of the Torus is %.2f\n", torus.getVolume());
    }

    /**
     * Prints the exit message with the current date and time.
     */
    private static void handleExit() {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d 'at' h:mm a");
        String formattedDate = now.format(formatter);

        System.out.println("Thanks for using the program. Today is " + formattedDate + ".");
    }

}
