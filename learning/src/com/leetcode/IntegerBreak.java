package com.leetcode;

public class IntegerBreak {

    public  static void main(String[] args) {
        System.out.println(Recursion(8));
    }
    public static int Recursion(int n){
        if (n == 2){
            return 1;
        }
        int max =-1;
        for (int i = 1; i < n - 1; i ++){
            max = Math.max((n - i) * i, i * Recursion(n - i));
        }
        return max;
    }
}
