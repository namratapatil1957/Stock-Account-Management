package com.bridgelabz.stockaccountmanagement;
import java.util.*;

public class Stock {
	
    ArrayList<value> arr = new ArrayList<value>();
    double totalValue = 0;

    class value {
    	
    	String n;
        int share;
        String name;
        float price;
    }

    public double totalValue() {
        for (int i = 0; i < arr.size(); i++) {
            totalValue += arr.get(i).price * arr.get(i).share;
        }
        System.out.println(" The total value is of stock is: ");
		return totalValue;
    }
}
