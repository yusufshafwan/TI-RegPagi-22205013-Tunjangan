/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanner;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class latihan17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek Scanner untuk menerima masukan dari pengguna
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        
        //Input gaji pokok//
        System.out.println("========Program Tunjangan========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = scanner.nextDouble();

        //Input status pernikahan
        System.out.print("Status Anda? (Menikah/Belum) ");
        String statusMenikah = scanner.next();

        //Input tunjangan
        double tunjangan = 0;
        if (statusMenikah.equalsIgnoreCase("Menikah")) {
            tunjangan = gajiPokok * 0.35;
        }

        //Tampilkan Tunjangan
        double totalGaji = gajiPokok + tunjangan;

        System.out.println("--------Hasil Perhitungan Gaji Anda------");
        System.out.println("Gaji Pokok : Rp. " + gajiPokok);
        System.out.println("Tunjangan : Rp. " + tunjangan);
        System.out.println("Total Gaji : Rp. " + totalGaji);
        System.out.println("Developed by : Rizki Adam Kurniawan");
    }

}
    
