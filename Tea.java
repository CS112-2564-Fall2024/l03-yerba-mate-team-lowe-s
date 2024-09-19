public class Tea extends CaffeinatedBeverage {
    private int brewTemp;

    public Tea() {
        this.brewTemp = brewTemp;
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
}
