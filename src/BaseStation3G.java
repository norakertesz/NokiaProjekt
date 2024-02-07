class BaseStation3G extends Product {
    public BaseStation3G(int serialNumber) {
        super(serialNumber);
    }

    @Override
    public String getSpeed() {
        return "3G";
    }
}
