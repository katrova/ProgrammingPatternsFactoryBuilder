package com.company;

/**
 * @author Vasylkivska Kateryna KNTEU
 *
 * @varsion 1.0 17.06.2020
 *
 * Classname Factory
 *
 * Module 2 task 4
 *
 * Develop for your class
1. Factory.
2. Abstract factory.
3. Create a class Student  - 25 fields.
4. Create a builder for the class Student
 */

public class Factory {
    /**
     * Class constructor with parameters
     * @param  sideA side that wiil be set to rectangular triangle
     * @param sideB side that wiil be set to rectangular triangle
     */
    public static RectangularTriangle create(double sideA, double sideB, double sideC){
        if(sideA>0 && sideB>0){
            return new RectangularTriangle(sideA,sideB);
        }else{
            return null;
        }
    }
}

