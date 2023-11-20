/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bp_1_pencarian_data;

import java.util.Scanner;

/**
 *
 * @author Ilhamstxr
 */
public class sequential_search {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String rumah[] = {"Paidi", "Paijo", "Painem", "Paimin", "Paini", "Paiman", "Pailan"};
        boolean ketemu = false;
        int j = 0;
        System.out.println("Sequential");
        System.out.println("Pemilik rumah");
        for (int i = 0; i < rumah.length; i++) {
            System.out.println(rumah[i] + "");
        }
        System.out.println("");
        System.out.println("Cari Pemilik = ");
        String cari = s.next();
        for (int i = 0; i < rumah.length; i++) {
            if (rumah[i].compareToIgnoreCase(cari) == 0) {
                ketemu = true;
                j = i;
                break;
            }
        }
        if (ketemu == true) {
            System.out.println("ada di nomor " + (j + 1));
        }else{
            System.out.println("Tidak ditemukan");
        }
    }
}
