/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.no1;

/**
 *
 * @author Acer
 */

import java.util.Scanner;
public class No1 {

    static void show(int n){
    for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n (n >= 1): ");
        int n = input.nextInt();

        if (n >= 1) {
            show(n);
        } else {
            System.out.println("Input harus >= 1.");
        }
    }
}