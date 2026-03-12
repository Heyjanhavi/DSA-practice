/* Problem: You are given an array of prices where prices[i] is the price of a given stock on an ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0*/

//best time to buy and sell stock

import java.util.Scanner;

public class buySellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("enter the prices");
        for (int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }
        int min_price = prices[0];
        int max_profit = 0;

        for (int i=1; i<n; i++){
            int profit = prices[i] - min_price;
            if (profit > max_profit){
                max_profit = profit;
            }
            if (prices[i] < min_price){
                min_price = prices[i];
            }
        }
        System.out.println("maximum profit is " + max_profit);
    }
}
