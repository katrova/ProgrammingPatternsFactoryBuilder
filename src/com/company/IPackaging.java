package com.company;

/**
 * @author Vasylkivska Kateryna KNTEU
 *
 * @varsion 1.0 17.06.2020
 *
 * Classname IPackaging
 *
 * Description: Interface
 *
 * Module 2 task 4
 *
 * Develop for your class
    1. Factory.
    2. Abstract factory.
    3. Create a class Student  - 25 fields.
    4. Create a builder for the class Student
 */

public interface IPackaging {
    String toString();
    String toJSON();
    String toXML();
    void toConsole();
}
