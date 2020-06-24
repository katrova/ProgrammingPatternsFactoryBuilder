package com.company;

/**
 * @author Vasylkivska Kateryna KNTEU
 *
 * @varsion 1.0 17.06.2020
 *
 * Classname RectangularTriangle
 *
 * Module 2 task 4
 *
 * Develop for your class
    1. Factory.
    2. Abstract factory.
    3. Create a class Student  - 25 fields.
    4. Create a builder for the class Student
 */

import java.util.Objects;

public class RectangularTriangle implements IGeometry, IPackaging {
    private double sideA;
    private double sideB;

    /**
     * Class constructor with parameters
     * @param  sideA side that wiil be set to rectangular triangle
     * @param sideB side that wiil be set to rectangular triangle
     */
//____________________________________________________________

    // 1. Constructor
    // Full constructor
    public RectangularTriangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    // Empty constructor
    public RectangularTriangle() {
    }
    //____________________________________________________________

    // 2. Getters/Setters
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    /**
     * Method to get formatted RectangularTriangle object
     *
     * @return Returns info about RectangularTriangle object
     */
    //____________________________________________________________

   // 3. 5 methods.
    //
    public double getHypotenuse(){
        return Math.sqrt(this.getSideA()*this.getSideA() +
                this.getSideB()*this.getSideB());

    }

    public double getPerimeter(){
      return  this.getSideA() + this.getSideB() +
              this.getHypotenuse();
    }

    public double getArea(){
        return 0.5 * this.getSideA()
                * this.getSideB();
    }

    public double getHeight(){
        return this.getSideA() *
                this.getSideB() / this.getHypotenuse();
    }

    public boolean isTriangle(){
        return (this.getSideA()>0 &&
                this.getSideB()>0);
    }
    //____________________________________________________________

    //4. Override toString() method
    @Override
    public String toString() {
        return "RectangularTriangle{" +
                "sideA=" + sideA +
                ",\n sideB=" + sideB +
                ",\n Hypotenuse=" + this.getHypotenuse() +
                ",\n Perimeter=" + this.getPerimeter() +
                ",\n Area=" + this.getArea() +
                ",\n Height=" + this.getHeight() +
                ",\n Triangle=" + this.isTriangle() +
                '}';
    }

    @Override
    public String toJSON() {
        String json = "RectangularTriangle{"
                + "\""  + "sideA\":" + this.getSideA()
                + ","
                + "\""  + "sideB\":" + this.getSideB()
                + ","
                + "\""  + "hypotenuse\":" + this.getHypotenuse()
                + "}";
        return json;
    }

    @Override
    public String toXML() {
        String xml = "<RectangularTriangle>"
                + "<sideA>" + this.getSideA() + "</sideA>"
                + "<sideB>" + this.getSideB() + "</sideB>"
                + "<hypotenuse>" + this.getHypotenuse() + "</hypotenuse>"
                +  "</Rectangle>";

        return xml;
    }

    @Override
    public void toConsole() {
        System.out.println("RectangularTriangle{" +
                "sideA=" + sideA +
                ",\n sideB=" + sideB +
                ",\n Hypotenuse=" + this.getHypotenuse() +
                ",\n Perimeter=" + this.getPerimeter() +
                ",\n Area=" + this.getArea() +
                ",\n Height=" + this.getHeight() +
                ",\n Triangle=" + this.isTriangle() +
                '}');


    }
    //____________________________________________________________

    //5. Override hash() and equals() methods
    /**
     * Method to check whether object equals by value
     *
     * @param o Object as parameter
     * @return Return boolean value as a result
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangularTriangle that = (RectangularTriangle) o;
        return Double.compare(that.getSideA(), getSideA()) == 0 &&
                Double.compare(that.getSideB(), getSideB()) == 0;
    }
    /**
     * Method to get object hash
     *
     * @return hash of RectangularTriangle
     */
    @Override
    public int hashCode() {
        return Objects.hash(getSideA(), getSideB());
    }
}