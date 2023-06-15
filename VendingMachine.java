import java.util.List;

public interface VendingMachine<T> {
    T getProduct(String name, int volume) throws ProductNotFoundException;

    List<T> getProducts();

    void addProduct(T product);

    void removeProduct(T product);

    void sortProducts();
}