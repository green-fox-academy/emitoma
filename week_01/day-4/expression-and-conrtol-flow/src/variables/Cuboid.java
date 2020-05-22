package variables;

public class Cuboid {
    public static void main(String[] args){

        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600 - > 2*(a*b + a*c + b*c)
        // Volume: 1000 - > a * b * c
        short a = 5;
        short b = 4;
        short c = 2;
        int surfaceArea = 2 * (a * b + a * c + b * c);
        int volume = a * b * c;

        System.out.println("Surface Area:" + surfaceArea);
        System.out.println("Volume:" + volume);

    }
}
