package com.gmail.dissa.vadim.superkid.domain;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShoppingCartTest {

    private ShoppingCart shoppingCart;

    @Before
    public void setup() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(10.0));
        products.add(new Product(10.0));
        products.add(new Product(10.0));
        shoppingCart = new ShoppingCart(products);
    }

    @Test
    public void testAddProduct() {
        shoppingCart.addProduct(new Product());
        assertEquals(4, shoppingCart.getProducts().size());
    }

    @Test
    public void testRemoveProducts() {
        shoppingCart.removeProducts();
        assertEquals(0, shoppingCart.getProducts().size());
    }

    @Test
    public void testGetProducts() {
        assertEquals(3, shoppingCart.getProducts().size());
    }

    @Test
    public void testGetAmountOfGoodsInCart() {
        assertEquals((int) 30.0, (int) shoppingCart.getAmountOfGoodsInCart());
    }
}
