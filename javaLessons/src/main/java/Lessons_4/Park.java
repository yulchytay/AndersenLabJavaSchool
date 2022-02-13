package Lessons_4;

import java.util.ArrayList;
import java.util.List;


public class Park {
    List<Product> productList = new ArrayList<>();

    public Park() {
    }

   public void showPark() {
        productList.forEach(System.out::println);

   }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(String name, String timework, double price) {
        productList.add(new Product(name, timework, price));
    }

    private class Product {
        private String name;
        private String timework;
        private double price;

        public Product(String name, String timework, double price) {
            this.name = name;
            this.timework = timework;
            this.price = price;

        }

        @Override
        public String toString() {
            return ("Атракцион:" + name + "Время работы:" + timework + " Стоимость:" + price);
        }

    }

    public static void main(String[] args) {
        Park park = new Park();
        park.addProduct("Колесо смотровое ", " 9.00-21.00", 200);
        park.addProduct("Карусель ", " 9.00-18.00", 150);
        park.addProduct("Паравозик детский ", "9.00-17.00", 100);
        park.addProduct("Горка ", " 9.00-17.00", 100);
        park.addProduct("Зеркальная комната", " 9.00-20.00", 150);
      park.showPark();
    }

}
