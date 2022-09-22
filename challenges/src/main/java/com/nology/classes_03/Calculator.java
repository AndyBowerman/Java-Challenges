package com.nology.classes_03;

/**
 * -------------- Intermediate -----------------
 *
 * The Calculator class represents a simple calculator.
 *
 * This is a skeleton of a class you will have to complete it by following these steps.
 * - Adding data fields / properties
 * - Adding a constructor
 * - Implement getters and setters
 * - Implementing methods
 *
 * Each step is documented through the class.
 *
 */

public class Calculator {

    private boolean hasBattery;
    private double firstInput;
    private double secondInput;

    public Calculator(double firstInput, double secondInput) {
        this.hasBattery = true;
        this.firstInput = firstInput;
        this.secondInput = secondInput;
    }

    public boolean getHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public double getFirstInput() {
        return firstInput;
    }

    public void setFirstInput(double firstInput) {
        this.firstInput = firstInput;
    }

    public double getSecondInput() {
        return secondInput;
    }

    public void setSecondInput(double secondInput) {
        this.secondInput = secondInput;
    }

    /**
     * Create a calculateAddition method below
     *
     * This should:
     * - be a public method
     * - return a double
     * - be called calculateAddition
     *
     * The method should add the two inputs together and return the result
     *
     * If hasBattery is false it should return -1
     *
     * @return double result of firstInput + secondInput
     */

    public double calculateAddition() {
        return hasBattery ? firstInput + secondInput : -1;
    }

    /**
     * Create a calculateDivision method below
     *
     * This should:
     * - be a public method
     * - return a double
     * - be called calculateDivision
     *
     * The method should divide the first input by the second and return the result
     *
     * If hasBattery is false it should return -1
     * If the second input is 0 it should return 0
     *
     * @return double result of firstInput / secondInput
     */

    public double calculateDivision() {
        if(hasBattery) {
            if(secondInput != 0) {
                return firstInput / secondInput;
            } else {
                return 0;
            }
        } else {
            return -1;
        }
    }
}
