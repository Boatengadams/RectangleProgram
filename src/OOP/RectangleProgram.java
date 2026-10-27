package OOP;
// Create an array of 3 rectangles read from the user and print the attribute of each

import java.util.Scanner;

public class RectangleProgram {
    static void main(String[] args) {
        Rectangle [] rectangles = new Rectangle[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0 ; i < rectangles.length; i++ ){
            System.out.println("Enter the width and height of rectangle(" + (i+1)+"):");
            rectangles[i]= new Rectangle(input.nextDouble(), input.nextDouble());
            System.out.println("Rectangle "+(i+1)+ " created");

        }
        System.out.println("The rectangles are :");
        for (int i = 0 ; i < rectangles.length; i++ ){
            System.out.println("Rectangle "+(i+1) +":"+
                    " Width: "+ rectangles[i].getWidth() +
                    " Height: "+rectangles[i].getHeight() +
                    " Parimeter: "+ rectangles[i].getParimeter() +
                    " Area: " +rectangles[i].getArea());
        }

    }


        public static class Rectangle {
            private double width;
            private double height;

            public Rectangle() {
                this(1, 1);
            }

            public Rectangle(double width, double height) {
                this.width = width;
                this.height = height;
            }

            public double getArea() {
                return this.width * this.height;
            }

            public double getParimeter() {
                return 2 * (this.width + this.height);
            }

            public double getWidth() {
                return width;
            }

            public void setWidth(double width) {
                this.width = width;
            }

            public double getHeight() {
                return height;
            }

            public void setHeight(double height) {
                this.height = height;
            }
        }
    }




