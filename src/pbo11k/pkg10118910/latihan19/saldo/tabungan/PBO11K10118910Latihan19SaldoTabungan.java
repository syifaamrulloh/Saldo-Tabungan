/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan19.saldo.tabungan;

/**
 *
 * @author
 * Nama :Muhamad Syifa Amruloh
 * Kelas:IF11K
 * NIM  :10118910
 * 
 * Description : Program Saldo Tabungan dengan Bunga 15%
 */
public class PBO11K10118910Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sld = 2500000;
        double bng;
        for (int i = 1; i <= 6; i++) {
            bng = sld * 0.15;
            sld = (int)( sld + bng );
            
            //Output
            System.out.printf("Saldo di bulan ke-"+i+" Rp. %,10d%n",sld);
        }
    }
    
}
