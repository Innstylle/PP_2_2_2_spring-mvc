package web.model;


public record Car(String model, int productionYear, String countryProd) {

    @Override
    public String toString() {
        return "Car{" +
               "productionYear=" + productionYear +
               ", countryProd='" + countryProd + '\'' +
               ", model='" + model + '\'' +
               '}';
    }
}
