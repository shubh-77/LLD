package com.tuf.kiss;

class CheckEven {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}

public class KissExample {
    public static void main(String[] args) {

        System.out.println(CheckEven.isEven(10));
    }
}
