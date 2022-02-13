package Lessons_4;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    List<Product> productList = new ArrayList<>();

    public Payment() {
    }

    public void showProducts() {
        productList.forEach(System.out::println);
    }


    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(String name, double price) {
        productList.add(new Product(name, price));
    }

    private class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }


        @Override
        public String toString() {
            return name +
                    " цена= " + price;
        }
    }

    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.addProduct("товар_1", 4.3);
        payment.addProduct("товар_2", 5.2);
        payment.addProduct("товар_3", 7.9);
        payment.showProducts();
    }

}

