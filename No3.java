/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.no3;

/**
 *
 * @author Acer
 */

import java.util.Scanner;
public class No3 {
    
    static void segitiga(int a, int b, int c) {
            int a2 = a * a;
            int b2 = b * b;
            int c2 = c * c;

            if (a2 + b2 == c2) {
                System.out.println("segitiga siku siku");
            } else if (a2 + b2 > c2) {
                System.out.println("segitiga lancip");
            } else {
                System.out.println("segitiga tumpul");
            }
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan c: ");
        int a = input.nextInt();

        System.out.print("Masukkan b: ");
        int b = input.nextInt();

        System.out.print("Masukkan c: ");
        int c = input.nextInt();


    }
}