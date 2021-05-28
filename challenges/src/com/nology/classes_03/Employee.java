package com.nology.classes_03;

public class Employee {

    // -------------- Foundation -----------------

    // Create a class of an Employee that has four properties ....
    // name: string
    // position: string
    // rating: int
    // completedDeals: array

    // With three methods ....
    // isPromotable(): checks if rating is over 7, if so return true... else false
    // calculateCompletedDealsSum(): loops through completedDeals array and totals all the deals completed.. returns an int which is the total
    // hasBonusQualification: checks if rating is 9 or greater and if the dealsDone total is over £100,000

    public String name;
    public String position;
    public int rating;
    public int[] completedDeals;

    public Employee(String name, String position, int rating, int[] completedDeals) {
        this.name = name;
        this.position = position;
        this.rating = rating;
        this.completedDeals = completedDeals;
    }

    public boolean isPromotable() {
        return rating > 7;
    }

    public int calculateCompletedDealsSum() {
        int total = 0;
        for (int i = 0; i < completedDeals.length; i++) {
            total += completedDeals[i];
        }
        return total;
    }

    public boolean hasBonusQualification() {
        int totalDealsFigure = calculateCompletedDealsSum();
        if (rating >= 9 && totalDealsFigure > 100000) {
            return true;
        } else {
            return false;
        }
    }
}