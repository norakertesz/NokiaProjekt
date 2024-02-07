public class BootFactory implements Factory {
    @Override
    public Product createProduct(ProductType type, int serialNumber) {
        if (type == ProductType.BOOTS) {
            return new Boots(serialNumber);
        }
        return null;
    }
}
