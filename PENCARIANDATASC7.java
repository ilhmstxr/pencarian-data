/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pencarian.data.sc7;

/**
 *
 * @author HP
 */
import java.util.Arrays;
import java.util.Scanner;
public class PENCARIANDATASC7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int data[]={56,42,12,85,68,93,71,39,57,63};
        System.out.print("Data Awal: ");
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        Arrays.sort(data);
        System.out.print("\nDiurutkan: ");
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.print("\nCari Data: ");
        int key=s.nextInt();
        int bs=Arrays.binarySearch(data,key);
        System.out.print("Hasilnya: ");
        if(bs>=0){
            System.out.println("Ada di indeks "+bs);
        }
        else{
            System.out.println("Tidak Ditemukan");
        }
    }
}
