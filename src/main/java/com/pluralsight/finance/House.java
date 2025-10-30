package com.pluralsight.finance;

public class House extends FixedAsset {
    private int yearBuild;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double marketValue, int yearBuild, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuild = yearBuild;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return super.getValue();
    }

    public int getYearBuild() {
        return yearBuild;
    }

    public void setYearBuild(int yearBuild) {
        this.yearBuild = yearBuild;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }
}
