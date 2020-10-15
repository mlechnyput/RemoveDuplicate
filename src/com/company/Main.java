package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many words are there: ");
        int num = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Put the word " + (i + 1) + " : ");
            arr[i] = sc2.nextLine();
        }

        removeDuplicate(arr);
    }

    public static void removeDuplicate(String[] arr) {
        String[] arrNew = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 0) {
                String wordNew = String.valueOf(arr[i].charAt(0));
                for (int j = 1; j < arr[i].length(); j++) {
                    if (wordNew.charAt(wordNew.length() - 1) != arr[i].charAt(j))
                        wordNew += arr[i].charAt(j);
                }
                arrNew[i] = wordNew;
            }else arrNew[i]="";
        }
        System.out.print(Arrays.toString(arr) + "-->" + Arrays.toString(arrNew));
    }
}
