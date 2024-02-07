public abstract class Product {
    private int serialNumber;

    public Product(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    // Abstrakte Methode für die Geschwindigkeit des Produkts
    public abstract String getSpeed();
}
