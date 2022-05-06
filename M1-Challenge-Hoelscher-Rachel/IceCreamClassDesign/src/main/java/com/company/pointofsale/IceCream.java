package com.company.pointofsale;

import java.util.Objects;

public class IceCream {
    protected String brand;
    protected String flavor;
    protected double costPerScoop;
    protected double pricePerScoop;
    protected boolean hasSprinkles = false;
    protected boolean inWaffleCone = false;

    public double calculateProfit() {
        double profit = (pricePerScoop - costPerScoop);
        return profit;
    }

    public Object addingSprinkles() {
        System.out.println("Sprinkles are the best!");
        hasSprinkles = true;
        return true;
    }

    public void useWaffleCone() {
        System.out.println("Waffle cones all day, every day!");
        inWaffleCone = true;
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

    public double getCostPerScoop() {
        return costPerScoop;
    }

    public void setCostPerScoop(double costPerScoop) {
        this.costPerScoop = costPerScoop;
    }

    public double getPricePerScoop() {
        return pricePerScoop;
    }

    public void setPricePerScoop(double pricePerScoop) {
        this.pricePerScoop = pricePerScoop;
    }

    public boolean isHasSprinkles() {
        return hasSprinkles;
    }

    public void setHasSprinkles(boolean hasSprinkles) {
        this.hasSprinkles = hasSprinkles;
    }

    public boolean isInWaffleCone() {
        return inWaffleCone;
    }

    public void setInWaffleCone(boolean inWaffleCone) {
        this.inWaffleCone = inWaffleCone;
    }

    public IceCream(String brand, String flavor, double costPerScoop, double pricePerScoop, boolean hasSprinkles, boolean inWaffleCone) {
        this.brand = brand;
        this.flavor = flavor;
        this.costPerScoop = costPerScoop;
        this.pricePerScoop = pricePerScoop;
        this.hasSprinkles = hasSprinkles;
        this.inWaffleCone = inWaffleCone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.costPerScoop, costPerScoop) == 0 && Double.compare(iceCream.pricePerScoop, pricePerScoop) == 0 && hasSprinkles == iceCream.hasSprinkles && inWaffleCone == iceCream.inWaffleCone && Objects.equals(brand, iceCream.brand) && Objects.equals(flavor, iceCream.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, flavor, costPerScoop, pricePerScoop, hasSprinkles, inWaffleCone);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "brand='" + brand + '\'' +
                ", flavor='" + flavor + '\'' +
                ", costPerScoop=" + costPerScoop +
                ", pricePerScoop=" + pricePerScoop +
                ", hasSprinkles=" + hasSprinkles +
                ", inWaffleCone=" + inWaffleCone +
                '}';
    }
}
