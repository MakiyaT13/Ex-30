/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Makiya Thomas
 */

import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        int[][] mT= new int[13][13];

        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                mT[i][j] = i * j;
                if(mT[i][j] >=10 && mT[i][j] <=99){
                    System.out.print("  ");
                    System.out.print(mT[i][j]);
                }
                else if(mT[i][j] >=100 && mT[i][j] <=150){
                    System.out.print(" ");
                    System.out.print(mT[i][j]);
                }
                else {
                    System.out.print("   ");
                    System.out.print(mT[i][j]);
                }
            }
            System.out.println();
        }
    }
}
