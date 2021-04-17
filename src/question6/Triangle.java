/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author Sharada Devi Noothalpati
 */
public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;
    private String color;
    private boolean sideCheck;

    public Triangle(double side1, double side2, double side3, String color, boolean sideCheck) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
        this.sideCheck = sideCheck;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSideCheck() {
        return sideCheck;
    }

    public void setSideCheck(boolean sideCheck) {
        this.sideCheck = sideCheck;
    }

    @Override
    public String toString() {
        return "Side1: " + side1 + ", Side2: " + side2 + ", Side3: " + side3 + ", color: " + color + ", Triangle is Filled: " + sideCheck;
    }

    @Override
    public double traingleArea() {
        double peri = trianglePerimeter();
        double area = Math.round(Math.sqrt(peri * (peri - side1) * (peri - side2) * (peri - side3)) * 100.0) / 100.0;
        return area;
    }

    @Override
    public double trianglePerimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }

}
