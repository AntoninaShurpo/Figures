package com.tasks;

class Rectangle extends Figure {
    protected int width, height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}