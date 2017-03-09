package com.sda.SortBabel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] tab = {4,7,8,3,5,4};

        for (int j=0; j<tab.length-1; j++) {
            for (int i=0; i<tab.length-1; i++) {
                if (tab[i] > tab[i + 1]) {
                    int temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(tab));
    }
}
