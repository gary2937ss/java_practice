package com.financeblog;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public Main() {

    }

    public int caculate(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Main main = new Main();
        System.out.println(main.caculate(15, 3));
        // Java Swing 裡面用來跳出「輸入視窗」 的方法
        JOptionPane.showInputDialog("");


    }
}