class BaseStation4G extends Product {
    public BaseStation4G(int serialNumber) {
        super(serialNumber);
    }

    @Override
    public String getSpeed() {
        return "4G";
    }
}
