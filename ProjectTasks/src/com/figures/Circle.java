package com.tasks;

class Circle extends Figure {
    protected int r;
    public Circle(int r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }
}
