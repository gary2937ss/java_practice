package com.financeblog;

public class Main {
//     ---------------造成 StackOverflowError 的狀況-------
//    public static void printHello() {
//        printHello();
//    }
//
//    public static void main(String[] args) {
//        printHello();
//
//    }
//    --------------------------------------------------
    public static void printHello(int i) {
        // 當 i 為 0 停止該遞迴
        if (i == 0) {
            return;
        }
        // 每一次遞迴減少一次
        System.out.println("開始堆疊倒數!" + i);
        printHello(i - 1);
        System.out.println("開始拿出stack預備!" + i);
    }
    public static void main(String[] args) {
        printHello(10);
    }
}