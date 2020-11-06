/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan35.objectorientedprogramtunjangan;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan program tunjangan
 * yang berbasis object oriented 
 */

class Gaji {
    public int gapok;
    public int totalGaji;
    public String status;
    
    public int tunjanganGaji(){
        int tunjangan = 0;
         if("Menikah".equals(status) || "menikah".equals(status)) {
                tunjangan=(int) (0.35*gapok);
            } 
        return tunjangan;
    }
    
    public int totalGaji(){
        int total;
            total = tunjanganGaji()+gapok;
        return total;   
    }   
}
