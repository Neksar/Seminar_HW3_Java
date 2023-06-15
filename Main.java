import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HotDrink> drinks = new ArrayList<>();
        drinks.add(new HotDrink("Tea", 250, 100));
        drinks.add(new HotDrink("Coffee", 200, 150));
        drinks.add(new HotDrinkWithTemperature("Hot chocolate", 300, 200, 70));

        HotDrinkMachine machine = new HotDrinkMachine(drinks);

        try {
            HotDrink tea = machine.getProduct("Tea", 250);
            System.out.println(tea.getName() + " " + tea.getVolume() + "ml for " + tea.getPrice() + " cents");

            HotDrinkWithTemperature hotChocolate = machine.getProduct("Hot chocolate", 300, 70);
            System.out.println(hotChocolate.getName() + " " + hotChocolate.getVolume() + "ml at " + hotChocolate.getTemperature() + "C for " + hotChocolate.getPrice() + " cents");

            HotDrink coffee = machine.getProduct("Coffee", 200);
            System.out.println(coffee.getName() + " " + coffee.getVolume() + "ml for " + coffee.getPrice() + "cents");
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }

        machine.sortProducts();
        
        System.out.println(machine.getProducts());
    }
}