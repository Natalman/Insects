package com.Natalman;

/**
 * Created by TheKingNat on 3/23/16.
 */
public class butterfly extends Insect {
    //butterfly variables
    private String WingColor;
    private String favoriteFlower;


    //Constructor
    public butterfly (String Bname, String BColor, int Bnumber, String Bflower){
        this.name = Bname;
        this.WingColor =BColor;
        this.numberOfWings = Bnumber;
        this.favoriteFlower = Bflower;

    }

    //Printing out the data
    public void printSpeciesData(){
        System.out.println("A " + this.name + " is a butterfly with " + leg + " legs:");
        System.out.println("*******************");
        System.out.println("It has " + this.WingColor + " color, " + this.numberOfWings + " wings, and " + this.favoriteFlower + " as favorite flower" );
    }

    //Creating a setter and getter
    public String getWingColor() {
        return WingColor;
    }

    public void setWingColor(String wingColor) {
        WingColor = wingColor;
    }

    public String getFavoriteFlower() {
        return favoriteFlower;
    }

    public void setFavoriteFlower(String favoriteFlower) {
        this.favoriteFlower = favoriteFlower;
    }
}
