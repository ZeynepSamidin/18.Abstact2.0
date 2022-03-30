package com.company;

public class Farm {
    private String adress;
    private int cows;
    private int horses;
    private int sheep;
    private String OwherName;

    public Farm(String adress, int cows,int horses, int sheep, String owherName) {
        this.adress = adress;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        OwherName = owherName;
    }
    public Farm() {

    }

    @Override
    public String toString() {
        return "Farm:" + "adress='" + adress  + ", cows=" + cows +
                ", horses=" + horses + ", sheep" + sheep + ", OwherName" + OwherName + '\'' ;
    }
}
