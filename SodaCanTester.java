package SodaCan;

import java.util.Scanner;

/**
 * Created by wzha1379 on 10/24/2017.
 */
public class SodaCanTester {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height!");
        double height = scanner.nextDouble();
        System.out.println("Enter the diameter!");
        double diameter = scanner.nextDouble();

        SodaCan sodaCan = new SodaCan(height, diameter);
        System.out.println("The surface area is " + sodaCan.getSurfaceArea());
        System.out.println("The volume is " + sodaCan.getVolume());
    }
}
