package com.company.factory;

import java.util.List;
import java.util.Objects;

public class IceCream {
    protected String brand;
    protected String flavor;
    protected double costPerPint;
    protected double pricePerPint;
    protected boolean freezersBroken = false;

    public double calculateProfit(double pricePerPint, double costPerPint) {
        double profit = (pricePerPint - costPerPint);
        return profit;
    }

    public void churning() {
        System.out.println("Mix...mix...mix...This " + flavor + " ice cream is going to be delicious!");
    }

    public boolean checkTheFreezers() {
        System.out.println("We're ruined if these break! Better check them out.");
        return false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getCostPerPint() {
        return costPerPint;
    }

    public void setCostPerPint(double costPerPint) {
        this.costPerPint = costPerPint;
    }

    public double getPricePerPint() {
        return pricePerPint;
    }

    public void setPricePerPint(double pricePerPint) {
        this.pricePerPint = pricePerPint;
    }

    public boolean isFreezersBroken() {
        return freezersBroken;
    }

    public void setFreezersBroken(boolean freezersBroken) {
        this.freezersBroken = freezersBroken;
    }

    public IceCream(String brand, String flavor, double costPerPint, double pricePerPint, boolean freezersBroken) {
        this.brand = brand;
        this.flavor = flavor;
        this.costPerPint = costPerPint;
        this.pricePerPint = pricePerPint;
        this.freezersBroken = freezersBroken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.costPerPint, costPerPint) == 0 && Double.compare(iceCream.pricePerPint, pricePerPint) == 0 && freezersBroken == iceCream.freezersBroken && Objects.equals(brand, iceCream.brand) && Objects.equals(flavor, iceCream.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, flavor, costPerPint, pricePerPint, freezersBroken);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "brand='" + brand + '\'' +
                ", flavor='" + flavor + '\'' +
                ", costPerPint=" + costPerPint +
                ", pricePerPint=" + pricePerPint +
                ", freezersBroken=" + freezersBroken +
                '}';
    }
}
