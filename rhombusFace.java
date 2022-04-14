package com.company;

public class rhombusFace {
    public static void main(String[] args) {
        int a = 5;
        pat1(a);
    }

    public static void pat1(int n) {
        for (int row = 1; row <= (n); row++) {
            int spaces = (row - 1) * 2;
            for (int i = 0; i < n - (row - 1); i++) {
                System.out.print('*');
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print(' ');
            }
            for (int t = 0; t < n - (row - 1); t++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            int spaces = (n - row) * 2;
            for (int i = 0; i < row; i++) {
                System.out.print('*');
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print(' ');
            }
            for (int t = 0; t < (row); t++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
