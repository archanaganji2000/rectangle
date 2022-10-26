
package com.thoughtworks.rectangle;

public class Rectangle {
    private final int length;
    private final int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return this.length * this.breadth;
    }
}
