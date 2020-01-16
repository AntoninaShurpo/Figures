package com.tasks;

class Square extends Figure {
    protected int x;
    public Square(int x) {
        this.x = x;
    }

    public double area() {
        return x * x;
    }
}