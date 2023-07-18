package org.lessons.java.geometria;

public class Rectangle {
    int width;
    int height;


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    double getArea() {
        return this.width * this.height;
    }

    double getPerimeter() {
        return this.width * 2 + this.height * 2;
    }
}
