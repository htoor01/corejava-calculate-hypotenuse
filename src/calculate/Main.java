package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for the base: ");
        double inputBase = scanner.nextDouble();

        System.out.println("Enter the value for the height: ");
        double inputHeight = scanner.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(inputBase,2) + Math.pow(inputHeight,2));
        System.out.println("The value of the hypotenuse is: "+hypotenuse);


    }
}