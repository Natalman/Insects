package com.Natalman;

/**
 * Created by TheKingNat on 3/23/16.
 */
public class bee extends Insect{
    //bee's variables
    private String beeColor;
    private String favoriteFlower;
    boolean honeyMaking;

    //Constructor
    public bee(String BEname, String BEColor, String BEFlower, boolean BEhoney, int BEwing){
        this.name = BEname;
        this.beeColor = BEColor;
        this.numberOfWings = BEwing;
        this.favoriteFlower = BEFlower;
        this.honeyMaking=BEhoney;
    }

    //Creating a setter and a getter
    public String getBeeColor() {
        return beeColor;
    }

    public void setBeeColor(String beeColor) {
        this.beeColor = beeColor;
    }

    public String getFavoriteFlower() {
        return favoriteFlower;
    }

    public void setFavoriteFlower(String favoriteFlower) {
        this.favoriteFlower = favoriteFlower;
    }

    //Printing out the data
   public void printSpeciesData(){
        System.out.println("A " + this.name + " is a Bee with " + leg + " legs:");
        System.out.println("*************************");
        System.out.println("It has " + this.beeColor + " color, " + this.numberOfWings + " wings, and " + this.favoriteFlower + " as favorite flower");

        if (this.honeyMaking == true){
            System.out.println(this.getName() + " can make honey");
        }else {
            System.out.println(this.getName() + " cannot make honey");
        }
    }
}
