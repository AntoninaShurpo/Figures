package com.tasks;

class Program {
    public static void main(String[] args) {
        Figures[] a = {
                new Rectangle(1, 10),
                new Triangle(3, 4, 5),
                new Circle(2)
        };

        for (Figures s : a)
            System.out.println("The square of " + s.getClass().getName() + " is " + s.square());
    }
}

public class Figures {
    public double square() {
        return 0;
    }
}

class Rectangle extends Figures {
    protected int width, height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double square() {
        return width * height;
    }
}

class Triangle extends Figures {
    protected int a, b, c;
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double square() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

class Circle extends Figures {
    protected int r;
    public Circle(int r) {
        this.r = r;
    }

    public double square() {
        return Math.PI * r * r;
    }
}