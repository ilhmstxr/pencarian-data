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
public class sequential_search_total {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int data[] = {10, 13, 14, 18, 22, 25, 29, 31, 36, 39};
        boolean ketemu = false;
        int j, pilih;
        do {
            int count = 0;
            System.out.println("Sequntial Search Loop");
            System.out.println("Data: ");
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println("");
            System.out.println("Cari angka");
            int cari = s.nextInt();
            for (int i = 0; i < data.length; i++) {
                count++;
                if (data[i] == cari) {
                    ketemu = true;
                    break;
                }
            }
            if (ketemu == true) {
                System.out.println("Ditemuan setelah");
                System.out.println(count + " kali pencarian");
            } else {
                System.out.println("Tidak Ditemukan");
                System.out.println("Meski sudah" + count);
                System.out.println(" kali pencarian");
            }
            System.out.println("Cari lagi?");
            System.out.println("[1. Ya][2. Tidak]");
            System.out.println("Jawab = ");
            pilih = s.nextInt();
        } while (pilih == 1);
        System.out.println("Terima kasih");
    }
}
