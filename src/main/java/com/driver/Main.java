package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        
        int ans = p.product(5,10);
        int ans1 = p.product(7,9,1);
        double ans2 = p.product(1.2,0.2);
        
        System.out.print(ans+" "+ans1+" "+ans2);
    }

    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
}