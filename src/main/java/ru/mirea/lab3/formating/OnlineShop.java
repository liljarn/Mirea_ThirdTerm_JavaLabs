package ru.mirea.lab3.formating;

import java.text.NumberFormat;
import java.util.*;

public class OnlineShop {
    static String country = Converter.US;
    static NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
    static Map<String, Double> products = new HashMap<>();
    static Double sum = 0.0;

    static {
        products.put("Худи", 70.0);
        products.put("Кроссовки", 100.0);
        products.put("Брюки", 50.0);
        products.put("Футболка", 20.0);
        products.put("Панама", 9.59);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cart = new ArrayList<>();
        System.out.println("__________Магазин одежды__________");
        showProducts(products);
        System.out.println("1 - Сменить валюту.\n2 - Добавить товар в корзину.\n3 - Оплатить покупку.");
        System.out.println("Выберите действие: ");
        int n = scanner.nextInt();
        while (n != 3) {
            if (n == 1) {
                System.out.println("Валюты:\n1 - Доллар.\n2 - Евро.\n3 - Юань");
                System.out.println("Выберите валюту: ");
                int v = scanner.nextInt();
                if (v == 1)
                    changeCurrency(Converter.US);
                else if (v == 2)
                    changeCurrency(Converter.FRANCE);
                else if (v == 3)
                    changeCurrency(Converter.CHINA);
                showProducts(products);
            }
            else if (n == 2) {
                System.out.println("Введите название товара: ");
                String product = scanner.next();
                if (products.containsKey(product)) {
                    cart.add(product);
                    sum += products.get(product);
                    System.out.println("Товар добавлен!");
                }
                else
                    System.out.println("Товар не найден!");
            }
            System.out.println("Выберите действие: ");
            n = scanner.nextInt();
        }
        System.out.println("Ваша корзина");
        System.out.println(cart);
        System.out.println("Сумма к оплате: " + numberFormat.format(sum.intValue()));
    }

    public static void showProducts(Map<String, Double> products) {
        System.out.println("Товары: ");
        for (Map.Entry<String, Double> product : products.entrySet()) {
            System.out.println(product.getKey() + "|" + numberFormat.format(product.getValue().intValue()));
        }
    }

    public static void changeCurrency(String newCountry) {
        for (Map.Entry<String, Double> product : products.entrySet()) {
            product.setValue(Converter.convert(country, newCountry, product.getValue()));
        }
        sum = Converter.convert(country, newCountry, sum);
        country = newCountry;
        numberFormat = Converter.getFormat(newCountry);
    }
}
