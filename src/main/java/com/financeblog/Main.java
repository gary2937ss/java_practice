package com.financeblog;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        // change a and b value.
        // 1. 先設定一個暫存變數
        int temp = 0;
        // 2. 將 a 先指向 temp 此時 temp 是 5
        temp = a;
        // 3. 將著將 b 指向給 a 即完成 a值轉 b值 的交換
        a = b;
        // 4.目前確定 a 是 6 了，再將 temp=6值給b
        b = temp;

        int[] array = {1,2,3,4,5,6,7,8};
        int tempArray = array[0];
        array[0] = array[3];
        array[3] = tempArray;

        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}