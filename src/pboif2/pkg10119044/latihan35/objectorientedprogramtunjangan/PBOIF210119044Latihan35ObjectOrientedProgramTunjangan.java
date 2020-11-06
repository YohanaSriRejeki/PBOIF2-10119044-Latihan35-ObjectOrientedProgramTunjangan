/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan35.objectorientedprogramtunjangan;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan program tunjangan
 * yang berbasis object oriented 
 */
public class PBOIF210119044Latihan35ObjectOrientedProgramTunjangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===========Program Tunjangan===========");
        Gaji gj = new Gaji();
        
            System.out.print("Berapa gaji pokok anda per bulan?: Rp. ");
            gj.gapok = input.nextInt();
            
            System.out.print("Status Anda? (Menikah/Belum)     : ");
            gj.status = input.next();
            
        System.out.println();
            System.out.println("===========Hasil Perhitungan Gaji Anda===========");
            System.out.println("Gaji Anda       : Rp " + gj.gapok);
            System.out.println("Tunjangan       : Rp " + gj.tunjanganGaji());
            System.out.println("Total Gaji      : Rp " + gj.totalGaji());
            System.out.println("(Developed by : Yohana Sri Rejeki)");
    } 
}
