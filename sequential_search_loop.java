/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bp_1_pencarian_data;

import java.util.Scanner;

/**
 *
 * @author Ilhamstxr
 */
public class sequential_search_loop {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String rumah[] = {"Paidi", "Paijo", "Painem", "Paimin", "Paini", "Paiman", "Pailan"};
        boolean ketemu;
        int j = 0, pilih = 1;
        do {
            System.out.println("\n Sequential Search Loop");
            System.out.println("Pemilik Rumah : ");
            for (int i = 0; i < rumah.length; i++) {
                System.out.println(rumah[i] + " ");
            }
            ketemu = false;
            System.out.println("");
            System.out.println("Cari Pemilik = ");
            String cari = s.next();
            for (int i = 0; i < rumah.length; i++) {
                if (rumah[i].compareToIgnoreCase(cari) == 0) {
                    ketemu = true;
                    j = i;
                    break;
                }
                if (ketemu == false) {
                    System.out.println("Ada di nomor" + (j + 1));
                } else {
                    System.out.println("Tidak ditemukan");
                }
                System.out.println("Cari lagi?");
                System.out.println("|1.Ya||2.Tidak|");
                System.out.println("Jawab = ");
                pilih = s.nextInt();
            }
        } while (pilih == 1);
        System.out.println("Terima Kasih...");
    }
}
