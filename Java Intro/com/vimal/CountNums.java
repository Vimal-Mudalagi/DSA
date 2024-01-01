package com.vimal;

public class CountNums {
    public static void main(String[] args) {
        int n = 48422;

        int count = 0;
        while(n>0){
            int rem = n%10;
            if (rem == 2){
                count++;
            }
            n = n/10; //n/=10
        }
        System.out.println(count);
    }
}
