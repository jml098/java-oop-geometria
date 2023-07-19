package org.lessons.java.geometria;

public class Rectangle {
    int width;
    int height;


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    int getArea() {
        return this.width * this.height;
    }

    int getPerimeter() {
        return (this.width + this.height) * 2;
    }


    void render() {
        String rectangleRender = "";
        for (int row = 0; row < this.height; row++) {
            String rowString = "";

            for (int col = 0; col < this.width; col++) {
                if (row == 0 || row == this.height - 1) {
                    rowString += "o ";
                } else if (col != 0 && col != this.width - 1) {
                    rowString += "  ";
                } else {
                    rowString += "o ";
                }
            }

            rectangleRender += rowString + "\n";
        }

        System.out.println(rectangleRender);
    }
}
