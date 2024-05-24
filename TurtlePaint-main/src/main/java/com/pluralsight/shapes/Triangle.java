package com.pluralsight.shapes;

import com.pluralsight.Turtle;

import java.awt.*;

public class Triangle extends Shape {
    int base; // getting base length of triangle
    int height; // getting height of triangle

    public Triangle (Point location, Color color, int border, Turtle userTurtle) {
        super(location, color, border, userTurtle);
    }

    @Override
    public void paint(Graphics g) {


    }
}
