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
public class sequential_serach_simulation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int data[] = {10, 13, 14, 18, 22, 25, 29, 31, 36, 39};
        int cari;
        boolean ketemu = false;
        System.out.println("Simulasi Seq Search");
        System.out.println("Data: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.println("Cari = ");
        cari = s.nextInt();
        for (int i = 0; i < data.length; i++) {
            System.out.println("apakah " + data[i] + " = " + cari + " ? ");
            if (data[i] == cari) {
                System.out.print("Benar ");
                ketemu= true;
                break;
            }else{
                System.out.print(" Salah ");
            }
        }
        if (ketemu == true) {
            System.out.println("Data ditemukan");
        }else{
            System.out.println("Data tidak ditemukan");
        }
    }
}
