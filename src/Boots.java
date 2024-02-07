class Boots extends Product {
    public Boots(int serialNumber) {
        super(serialNumber);
    }

    @Override
    public String getSpeed() {
        return "by foot";
    }
}
