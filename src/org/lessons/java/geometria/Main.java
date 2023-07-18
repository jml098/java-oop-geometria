package org.lessons.java.geometria;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner;
        int widthInput;
        int heightInput;
        Rectangle rectangle;
        String rectangleRender;

        scanner = new Scanner(System.in);

        System.out.println("Inserisci larghezza: ");
        widthInput = Integer.parseInt(scanner.nextLine());

        System.out.println("Inserisci larghezza: ");
        heightInput = Integer.parseInt(scanner.nextLine());

        rectangle = new Rectangle(widthInput, heightInput);

        System.out.println("Rettangolo: ");
        System.out.println("Larghezza: " + rectangle.width);
        System.out.println("Altezza: " + rectangle.height);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimetro: " + rectangle.getPerimeter());


        rectangleRender = "";
        for (int row = 0; row < rectangle.height; row++) {
            String rowString = "";

            for (int col = 0; col < rectangle.width; col++) {
                if (row == 0 || row == rectangle.height - 1) {
                    rowString += "o";
                } else if (col != 0 && col != rectangle.width - 1) {
                    rowString += " ";
                } else {
                    rowString += "o";
                }
            }

            rectangleRender += rowString + "\n";
        }

        System.out.println(rectangleRender);
    }
}
