/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemen;

/**
 *
 * @author Aukhal
 */
public class Main {
    public static void main(String[] args) {
        // Objek Produk
        Produk produk1 = new Elektronik("Laptop", 15000000, 2);
        Produk produk2 = new Makanan("Snack", 15000, "2023-12-30");

        // Objek Pegawai
        Pegawai pegawai1 = new PegawaiTetap("Aukhal", 5000000, 1000000);
        Pegawai pegawai2 = new PegawaiKontrak("Andi", 3000000, 12);

        // Menampilkan info produk
        System.out.println("=== Informasi Produk ===");
        produk1.tampilkanInfo();
        System.out.println();
        produk2.tampilkanInfo();

        // Menampilkan info pegawai
        System.out.println("\n=== Informasi Pegawai ===");
        pegawai1.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }
}
