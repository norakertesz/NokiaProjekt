public class Main {
    public static void main(String[] args) {
        Factory nokiaFactory = new NokiaFactory();

        // Erzeugung der Produkte
        Product boots = nokiaFactory.createProduct(ProductType.BOOTS, 1001);
        Product baseStation3G = nokiaFactory.createProduct(ProductType.BASE_STATION_3G, 2001);
        Product baseStation4G = nokiaFactory.createProduct(ProductType.BASE_STATION_4G, 2002);
        Product baseStation5G = nokiaFactory.createProduct(ProductType.BASE_STATION_5G, 2003);

        // Ausgabe der Produktinformationen
        System.out.println("Boots Speed: " + boots.getSpeed() + ", Serial Number: " + boots.getSerialNumber());
        System.out.println("BaseStation3G Speed: " + baseStation3G.getSpeed() + ", Serial Number: " + baseStation3G.getSerialNumber());
        System.out.println("BaseStation4G Speed: " + baseStation4G.getSpeed() + ", Serial Number: " + baseStation4G.getSerialNumber());
        System.out.println("BaseStation5G Speed: " + baseStation5G.getSpeed() + ", Serial Number: " + baseStation5G.getSerialNumber());
    }
}