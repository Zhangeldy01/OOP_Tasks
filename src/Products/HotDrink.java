package Products;

/**
 * A subclass of a superclass Product
 */
public class HotDrink extends Product {

    /**
     * Field names
     */
    private int temperature;
    private Double volume;

    /**
     * Class Constructor
     * @param name product
     * @param price product
     * @param temperature product
     * @param volume product
     */
    public HotDrink(String name, Double price, int temperature, Double volume)
    {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;

    }

    /**
     * get temperature
     * @return temperature
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * get volume
     * @return volume
     */
    public Double getVolume() {
        return volume;
    }

    /**
     * set a new temperature product
     * @param temperature
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * set a new volume product
     * @param volume
     */
    public void setVolume(Double volume) {
        this.volume = volume;
    }
    /**
     * Override the product output
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
