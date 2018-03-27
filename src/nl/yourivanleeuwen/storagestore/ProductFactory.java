package nl.yourivanleeuwen.storagestore;

public class ProductFactory {

    public Product makeProduct(String newProductType, String optionalSata) {

        optionalSata = optionalSata.toLowerCase();

        switch (newProductType) {
            case "1":
                if (optionalSata.equals("y")) {
                    return new SataCable(new HardDrive());
                }
                return new HardDrive();
            case "2":
                if (optionalSata.equals("y")) {
                    return new SataCable(new HardDrive());
                }
                return new SSD();
            case "3":
                return new USB();
            default:
                return null;
        }

    }
}