import java.util.List;

public class HotDrinkMachine implements VendingMachine<HotDrink> {
    private List<HotDrink> drinks;

    public HotDrinkMachine(List<HotDrink> drinks) {
        this.drinks = drinks;
    }

    @Override
    public HotDrink getProduct(String name, int volume) throws ProductNotFoundException {
        for (HotDrink drink : drinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume) {
                return drink;
            }
        }
        throw new ProductNotFoundException("Product not found");
    }

    public HotDrinkWithTemperature getProduct(String name, int volume, int temperature) throws ProductNotFoundException {
        for (HotDrink drink : drinks) {
            if (drink instanceof HotDrinkWithTemperature &&
                    drink.getName().equals(name) &&
                    drink.getVolume() == volume &&
                    ((HotDrinkWithTemperature) drink).getTemperature() == temperature) {
                return (HotDrinkWithTemperature) drink;
            }
        }
        throw new ProductNotFoundException("Product not found");
    }

    @Override
    public List<HotDrink> getProducts() {
        return drinks;
    }

    @Override
    public void addProduct(HotDrink product) {
        drinks.add(product);
    }

    @Override
    public void removeProduct(HotDrink product) {
        drinks.remove(product);
    }

    @Override
    public void sortProducts() {
        drinks.sort(HotDrink::compareTo);
    }

    
}
