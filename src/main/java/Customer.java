import products.Product;

import java.util.LinkedList;
import java.util.List;

public class Customer {
    private double money;
    private List<Product> productList = new LinkedList<Product>();

    public Customer(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void add (Product product){
        productList.add(product);
    }

    @Override
    public String toString() {
        return "Castomer{" +
                "money=" + money +
                ", productList=" + productList +
                '}';
    }
}
