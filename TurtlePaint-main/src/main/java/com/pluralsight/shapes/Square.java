package com.pluralsight.shapes;



import com.pluralsight.Turtle;

import java.awt.*;

public class Square extends Shape {

    int side; // all sides are equal

    public Square(Point location, Color color, int border, Turtle userTurtle, int side) {
        super(location, color, border, userTurtle);
        this.side = side;
    }



    @Override
    public void paint(Graphics g) {

    }

}

