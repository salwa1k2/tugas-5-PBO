/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.no2;

/**
 *
 * @author Acer
 */

import java.util.Scanner;

public class No2 {

    static void cek(int d, int e, int f) {
        if (d == e && e == f) {
            System.out.println("termasuk Kubus");
        } else {
            System.out.println("bukan termasuk Kubus");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan sisi panjang: ");
        int a = input.nextInt();
        
        System.out.print("masukkan sisi lebar: ");
        int b = input.nextInt();
        
        System.out.print("masukkan sisi tinggi: ");
        int c = input.nextInt();

        cek(a, b, c);

    }
}
