package com.series;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
	    StockItem temp = new StockItem("bread", 0.86, 100);
	    stockList.addStock(temp);

	    temp = new StockItem("cake", 1.10, 7);
	    stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.5, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.1, 100);
        stockList.addStock(temp);

        temp = new StockItem("door", 55.0, 2);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 10);
        stockList.addStock(temp);

        temp = new StockItem("phone", 110.97, 1);
        stockList.addStock(temp);

        temp = new StockItem("nails", 0.75, 22);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket basket = new Basket("basket");
        reserveItem(basket, "cup", 200);
        reserveItem(basket, "phone", 1);
        reserveItem(basket, "nails", 10);
        reserveItem(basket, "spam", 1);
        reserveItem(basket, "phone", 1);
        reserveItem(basket, "phone", 2);
        reserveItem(basket, "phone", 2);
        reserveItem(basket, "cup", 20);
        reserveItem(basket, "bread", 50);
        System.out.println(basket);
        System.out.println(stockList);

        System.out.println("===remove from basket===");
        unreserveItem(basket, "cup", 40);
        unreserveItem(basket, "phone", 2);
        System.out.println(basket);
        System.out.println(stockList);


        System.out.println("===checkout===");
        checkout(basket);
        System.out.println(basket);
        System.out.println(stockList);


//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);
//        stockList.Items().get("car").adjustStock(2000);
//        stockList.get("car").adjustStock(-1000);
//        System.out.println(stockList);
//        for(Map.Entry<String, Double> price : stockList.PriceList().entrySet()) {
//            System.out.println(price.getKey() + " costs " + price.getValue());
//        }

        ArrayList<Integer> memp = new ArrayList<>();
        for(int i = 0; i < 11; i++) {
            memp.add(i);
        }
        System.out.println(memp);

    }

    public static int reserveItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int unreserveItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if( basket.removeFromBasket(stockItem, quantity) == 0) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkout(Basket basket) {
        Map<StockItem, Integer> items = basket.items();
        for(StockItem i : items.keySet()) {
            stockList.sellStock(i.getName(), items.get(i));
        }
        basket.clearBasket();
    }
}
