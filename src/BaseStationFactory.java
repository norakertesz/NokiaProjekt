public class BaseStationFactory implements Factory {
    @Override
    public Product createProduct(ProductType type, int serialNumber) {
        switch (type) {
            case BASE_STATION_3G:
                return new BaseStation3G(serialNumber);
            case BASE_STATION_4G:
                return new BaseStation4G(serialNumber);
            case BASE_STATION_5G:
                return new BaseStation5G(serialNumber);
            default:
                return null;
        }
    }
}
