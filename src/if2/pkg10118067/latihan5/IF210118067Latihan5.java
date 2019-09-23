/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10118067.latihan5;

/**
 *
 * @author
 * Nama     : Agus Awaludin
 * Kelas    : IF-2
 * NIM      : 10118067
 * Latihan 5. Kambing Global
 */
public class IF210118067Latihan5 {
    
    int jumlahKambing = 88;
    
    // Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah di tambah: " + 
                            jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IF210118067Latihan5 kambingSusu = new IF210118067Latihan5();
        
        // Menampilkan jumlah kambing yang ada saat program pertama kali berjalan
        kambingSusu.getJumlahKambing();
        
        //menambah satu kambing
        kambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
        
    }
    
}
