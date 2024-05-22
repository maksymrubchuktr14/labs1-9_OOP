package Lab7;

class Car {
    String car_brand;
    Float engine_power;
    String name;
    Float price;
    int graduation_yers;

    public Car(String car_brand, Float engine_power, String name, Float price, int graduation_yers) {
        this.car_brand = car_brand;
        this.engine_power = engine_power;
        this.name = name;
        this.price = price;
        this.graduation_yers = graduation_yers;
    }

    public Float getPrice() {
        return price;
    }

    public Float getPower() {
        return engine_power;
    }

    public String getName() {
        return name;
    }
}