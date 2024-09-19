public class CaffeinatedBeverage
{
    protected String name;
    protected int ounces;
    protected double price;
    
    public CaffeinatedBeverage() {
        this.name = null;
        this.ounces = 0;
        this.price = 0;
    }

    public CaffeinatedBeverage(String name, int ounces, double price) {
        this.name = name;
        this.ounces = ounces;
        this.price = price;
    }

    public CaffeinatedBeverage(CaffeinatedBeverage copyCaffeinatedBeverage) {
        this.name = copyCaffeinatedBeverage.name;
        this.ounces = copyCaffeinatedBeverage.ounces;
        this.price = copyCaffeinatedBeverage.price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOunces() {
        return this.ounces;
    }

    public void setOunces(int ounces) {
        this.ounces = ounces;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass())
            return false;
        CaffeinatedBeverage that = (CaffeinatedBeverage) o;
        return this.ounces == that.ounces &&
                Double.compare(this.price, that.price) == 0 &&
                this.name.equals(that.name);
    }

    public boolean sip(int ounces, int sipAmount) {
        sipAmount = 1;
        ounces = ounces - sipAmount;
        if (ounces <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isEmpty(int ounces, double price) {
        if (ounces >= 0 && price >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return super.toString() + "Tea: " + this.name + " " + this.ounces + " " + this.price;
    }
}