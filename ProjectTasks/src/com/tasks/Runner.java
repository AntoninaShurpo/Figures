package com.tasks;

class Program {
    public static void main(String[] args) {
        Figure[] a = {
                new Rectangle(1, 10),
                new Triangle(3, 4, 5),
                new Circle(2),
                new Square(5)
        };

        for (Figure s : a)
            System.out.println("The area of " + s.getClass().getName() + " is " + s.area());
    }
}









