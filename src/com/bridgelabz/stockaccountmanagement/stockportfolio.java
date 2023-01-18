package com.bridgelabz.stockaccountmanagement;
import java.util.*;

public class stockportfolio extends Stock {

	public static void main( String[] args) {
	
		Stock stock = new Stock();
		Scanner sc = new Scanner (System.in);
		Stock.value val = stock.new value();
		
		System.out.println(" Enter the name of stock you want: ");
		val.n = sc.next();
		
		System.out.println(" Enter the share name: ");
		val.name = sc.next();
		
		System.out.println(" Enter the number of share u want: ");
		val.share = sc.nextInt();
		
		System.out.println(" Enter the price of the share: ");
		val.price = sc.nextFloat();
		
		stock.arr.add(val);

		for (int i = 0; i < stock.arr.size(); i++) {
	        System.out.println(stock.totalValue());
	
	    }
	}
}
