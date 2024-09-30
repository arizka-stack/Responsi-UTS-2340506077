/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemen;

/**
 *
 * @author Aukhal
 */
public class Elektronik extends Produk {
    private int garansi;

    // Konstruktor
    public Elektronik(String namaProduk, int harga, int garansi) {
        super(namaProduk, harga); // Memanggil konstruktor dari kelas induk
        this.garansi = garansi;
    }

    // Metode tampilkanInfo (override dari kelas induk)
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil metode tampilkanInfo dari Produk
        System.out.println("Garansi: " + garansi + " tahun");
    }
}
