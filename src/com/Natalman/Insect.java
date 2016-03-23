package com.Natalman;

/**
 * Created by TheKingNat on 3/23/16.
 */

public abstract class Insect {
    // Superclass of butterfly and bee
    //Creating variables and a constant
    protected String name;
    protected int numberOfWings;
    protected static int leg = 6;

    //Creating a setter and getter for name and number of wings

    public abstract void printSpeciesData();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }


}
