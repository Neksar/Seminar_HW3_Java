public class HotDrink implements Comparable<HotDrink> {
    private String name;
    private int volume;
    private long price;

    public HotDrink(String name, int volume, long price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public int compareTo(HotDrink other) {
        return Long.compare(this.price, other.price);
    }
}