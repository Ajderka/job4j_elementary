package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        if (index < products.length - 1) {
            products[index] = products[index + 1];
            products[index + 1] = null;
        } else {
            products[index] = null;
        }
        return products;
    }
}
