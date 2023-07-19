package org.lessons.java.geometria;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner;
        int widthInput;
        int heightInput;
        Rectangle rectangle;

        scanner = new Scanner(System.in);

        System.out.print("Inserisci larghezza: ");
        widthInput = Integer.parseInt(scanner.nextLine());

        System.out.print("Inserisci altezza: ");
        heightInput = Integer.parseInt(scanner.nextLine());

        rectangle = new Rectangle(widthInput, heightInput);

        System.out.println("Rettangolo: ");
        System.out.println("Larghezza: " + rectangle.width);
        System.out.println("Altezza: " + rectangle.height);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimetro: " + rectangle.getPerimeter());

        rectangle.render();
    }
}
