package Products;

public class HotDrink extends Product {

    private int temperature;
    private Double volume;

    public HotDrink(String name, Double price, int temperature, Double volume)
    {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;

    }

    public int getTemperature() {
        return temperature;
    }

    public Double getVolume() {
        return volume;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
    /**
     * переопределение вывода продукта
     */
    @Override
    public String toString()
    {
        return  "Product{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getPrice() +
                ", temperature=" + temperature +
                ", volume=" + volume +
                '}';
    }
}
