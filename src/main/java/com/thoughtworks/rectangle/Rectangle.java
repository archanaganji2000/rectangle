
package com.thoughtworks.rectangle;

import org.w3c.dom.css.Rect;

import java.awt.*;

class Rectangle {
    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public double area() {
        return length * breadth;
    }
    public double perimeter() {
        return 2*(length + breadth);
    }

}