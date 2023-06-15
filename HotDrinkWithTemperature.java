public class HotDrinkWithTemperature extends HotDrink {
    private int temperature;

    public HotDrinkWithTemperature(String name, int volume, long price, int temperature) {
        super(name, volume, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}