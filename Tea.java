public class Tea extends CaffeinatedBeverage {
    protected int brewTemp;

    public Tea() {
        this.brewTemp = 0;
    }

    public Tea(String name, int ounces, double price, int brewTemp) {
        super(name, ounces, price);
        this.brewTemp = brewTemp;
    }

    public Tea(Tea copyTea) {
        this.brewTemp = copyTea.brewTemp;
    }

    public int getBrewTemp() {
        return brewTemp;
    }

    public boolean setBrewTemp(int brewTemp) {
        if (brewTemp >= 0) {
            return true;
        }
        else {
            return false;
        }
        
    }

    public boolean setAll(int brewTemp) {
        boolean returnBrewTemp = setBrewTemp(brewTemp);
        return returnBrewTemp;
    }

    public boolean equals(Object other) {
        if (other instanceof Tea && super.equals(other)) {
            Tea otherTea = (Tea) other;
            return this.brewTemp == otherTea.brewTemp;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "Tea: " + this.name + ", " + this.ounces + " ounces, brewed @ " + this.brewTemp + "°C, $" + this.price;
    }
}
