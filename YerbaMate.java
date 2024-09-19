public class YerbaMate extends Tea {
    private int numPasses;

    public YerbaMate() {
        this.numPasses = 0;
    }

    public YerbaMate(String name, int ounces, double price, int numPasses, int brewTemp) {
        super(name, ounces, price, brewTemp);
        this.numPasses = numPasses;
    }

    public YerbaMate(YerbaMate copyYerbaMate) {
        this.numPasses = copyYerbaMate.numPasses;
    }

    public int getNumPasses() {
        return numPasses;
    }

    public void passMate() {
        numPasses++;
    }

    public int refill(int ounces) {
        return this.ounces = this.ounces + ounces;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof YerbaMate && super.equals(other)) {
            YerbaMate otherTea = (YerbaMate) other;
            return this.numPasses == otherTea.numPasses;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "Tea: " + this.name + ", " + this.ounces + " ounces, brewed @ " + this.brewTemp + "°C, $" + this.price + ", " + numPasses + " so far";
    }
}
