package web.model;


public class Car {
    private int productionYear;

    private String countryProd;

    private String model;


    public Car(String model, int productionYear, String countryProd) {
        this.model = model;
        this.productionYear = productionYear;
        this.countryProd = countryProd;
    }



    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getCountryProd() {
        return countryProd;
    }

    @Override
    public String toString() {
        return "Car{" +
               "productionYear=" + productionYear +
               ", countryProd='" + countryProd + '\'' +
               ", model='" + model + '\'' +
               '}';
    }
}
