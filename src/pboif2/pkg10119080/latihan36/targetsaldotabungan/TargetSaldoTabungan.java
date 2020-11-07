/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan36.targetsaldotabungan;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Target Saldo Tabungan
 */
class TargetSaldoTabungan {
    private static Double jmlBunga;
    private static int lama;
    
    private static double hitungBunga(double bunga, int saldo) {
        jmlBunga = (bunga / 100) * saldo;
        return jmlBunga;
    }
    
    public static void tampilSaldo(double bunga, int saldo, int targetSaldo) {
        lama = 1;
        while(saldo < targetSaldo) {
            saldo += hitungBunga(bunga, saldo);
            System.out.printf("Saldo di bulan ke-"+lama+" Rp. %,d%n", saldo);
            lama++;
        }
    }
   
}