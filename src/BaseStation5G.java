class BaseStation5G extends Product {
    public BaseStation5G(int serialNumber) {
        super(serialNumber);
    }

    @Override
    public String getSpeed() {
        return "5G";
    }
}
