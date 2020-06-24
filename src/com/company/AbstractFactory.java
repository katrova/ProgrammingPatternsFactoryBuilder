package com.company;

/**
 * @author Vasylkivska Kateryna KNTEU
 *
 * @varsion 1.0 17.06.2020
 *
 * Classname AbstractFactory
 *
 * Module 2 task 4
 *
 * Develop for your class
    1. Factory.
    2. Abstract factory.
    3. Create a class Student  - 25 fields.
    4. Create a builder for the class Student
 */
public class AbstractFactory {

    /*
     * Method of abstract factory which build objects
     *
     * @param sideA - one of the side
     * @param sideB - one of the side
     * @param figure - enumeration element from class Figure
     */
    public static IGeometry create(double sideA, double sideB, Figure figure){

        switch (figure) {
            case RECTANGULARTRIANGLE: return new RectangularTriangle(sideA, sideB);
            default: return null;
        }
    }
}


