package com.Natalman;

import java.util.AbstractList;
import java.util.LinkedList;

public class InsectManager {

    public static void main(String[] args) {
	// Creating butterflies
        LinkedList<Insect> insects = new LinkedList<Insect>();

        butterfly monarch = new butterfly("Monarch", "Orange and black", 4, "Milkweed");
        insects.add(monarch);

        butterfly Swallowtail = new butterfly("Yellow Swallowtail", "Yellow and black", 4, "Milk parsley");
        insects.add(Swallowtail);

    //Creating bees
        bee HoneyBee = new bee("Honey Bee", "Yellow and black", "Jasmine", true, 4);
        insects.add(HoneyBee);

        bee Bumble = new bee("Bumble bee", "Yellow, black and white", "Clover",false, 4);
        insects.add(Bumble);

    //Printing out the data
        for (Insect i : insects){
            i.printSpeciesData();
        }
    }
}
